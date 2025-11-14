# Consumer ProGuard rules for core module
# These rules are automatically applied to modules that depend on this library

# Keep all public API classes from core module
-keep public class com.electrodiligent.core.** { public *; }

# Keep all data model classes
-keep class com.electrodiligent.core.domain.model.** { *; }
-keepclassmembers class com.electrodiligent.core.domain.model.** { *; }

# Keep navigation classes (sealed classes, enums, etc.)
-keep class com.electrodiligent.core.navigation.** { *; }
-keepclassmembers class com.electrodiligent.core.navigation.** { *; }

# Keep presentation/UI classes
-keep class com.electrodiligent.core.presentation.** { *; }

# Keep util classes
-keep class com.electrodiligent.core.util.** { *; }

# Keep ViewModels
-keep class * extends androidx.lifecycle.ViewModel {
    <init>(...);
}

# Keep Hilt modules and generated classes
-keep class **_HiltModules { *; }
-keep class **_HiltModules$** { *; }
-keep class **_Factory { *; }
-keep class **_MembersInjector { *; }

# Keep @Composable functions from this module
-keep @androidx.compose.runtime.Composable class com.electrodiligent.core.** { *; }
-keepclassmembers class com.electrodiligent.core.** {
    @androidx.compose.runtime.Composable *;
}