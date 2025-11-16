# ProGuard/R8 Build Fix for English Module

## Problem
The release build was failing with R8 minification errors:
```
Missing class com.electrodiligent.core.domain.model.CharacterQuestion
Missing class com.electrodiligent.core.navigation.NavigationItem
Missing class com.electrodiligent.core.presentation.alphabate.AlphabetFlashcardViewModel
... (and many more missing classes from the core module)
```

## Root Causes

### 1. Library Module Minification (CRITICAL)
The `core` module had `minifyEnabled true` in its release build type. **This is incorrect for Android library modules.**

**Why?**
- Library modules should NOT minify their own code
- Only the final application module (`:english`) should handle minification
- When a library minifies itself, it can strip out classes that the app module needs
- The app module's ProGuard/R8 process can't "see" what was removed

### 2. Missing ProGuard Keep Rules
The `english` module didn't have proper keep rules for classes from the `:core` module dependency.

## Solution Applied

### ✅ 1. Fixed core/build.gradle
Changed `minifyEnabled` from `true` to `false` in the core module:

```gradle
buildTypes {
    release {
        minifyEnabled false  // Changed from true
        proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
    }
}
```

### ✅ 2. Added Comprehensive ProGuard Rules to english/proguard-rules.pro
Added keep rules for:
- All core module classes
- Domain models (data classes)
- Navigation components
- Presentation/UI classes (ViewModels, Composables)
- Utility classes
- Hilt/Dagger generated classes
- Jetpack Compose components
- Kotlin coroutines

### ✅ 3. Added Consumer Rules to core/consumer-rules.pro
These rules are automatically applied to any module that depends on `core`:
- Public API classes
- Data models
- Navigation classes
- ViewModels
- Composable functions
- Hilt generated classes

## Best Practices

### For Multi-Module Android Projects:

1. **Library Modules**: Always set `minifyEnabled false`
2. **App Module**: Set `minifyEnabled true` (handles all minification)
3. **Consumer Rules**: Library modules should provide `consumer-rules.pro` with keep rules for their public API
4. **App ProGuard Rules**: App module should have specific keep rules for critical classes from dependencies

### ProGuard Rule Hierarchy:
```
App Module (english)
├── proguard-rules.pro (app-specific rules)
└── Dependencies
    └── core module
        └── consumer-rules.pro (auto-applied to app)
```

## Testing the Fix

After these changes, the build should succeed:

```bash
./gradlew :english:clean :english:bundleRelease
```

Or test in CI by pushing a tag:
```bash
git tag english-v3.5
git push origin english-v3.5
```

## Related Files Modified
- ✅ `core/build.gradle` - Disabled minification
- ✅ `english/proguard-rules.pro` - Added comprehensive keep rules
- ✅ `core/consumer-rules.pro` - Added consumer keep rules

## References
- [Android ProGuard Documentation](https://developer.android.com/build/shrink-code)
- [ProGuard Manual - Keep Options](https://www.guardsquare.com/manual/configuration/usage#keepoptions)
- [Jetpack Compose ProGuard Rules](https://developer.android.com/jetpack/compose/tooling#proguard)
