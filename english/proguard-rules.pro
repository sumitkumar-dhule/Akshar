# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# ===========================
# Keep all classes from core module
# ===========================
-keep class com.electrodiligent.core.** { *; }
-keepclassmembers class com.electrodiligent.core.** { *; }

# Keep data classes and model classes (used for serialization/navigation)
-keep class com.electrodiligent.core.domain.model.** { *; }
-keepclassmembers class com.electrodiligent.core.domain.model.** { *; }

# Keep navigation classes
-keep class com.electrodiligent.core.navigation.** { *; }
-keepclassmembers class com.electrodiligent.core.navigation.** { *; }

# Keep presentation/UI classes (used by Compose)
-keep class com.electrodiligent.core.presentation.** { *; }
-keepclassmembers class com.electrodiligent.core.presentation.** { *; }

# Keep util classes
-keep class com.electrodiligent.core.util.** { *; }
-keepclassmembers class com.electrodiligent.core.util.** { *; }

# ===========================
# Hilt/Dagger Keep Rules
# ===========================
-keepclassmembers,allowobfuscation class * {
  @javax.inject.* *;
  @dagger.* *;
  <init>();
}

-keep class dagger.hilt.** { *; }
-keep class javax.inject.** { *; }
-keep class * extends dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper { *; }

# Keep Hilt generated components
-keep class **_HiltModules { *; }
-keep class **_HiltModules$** { *; }
-keep class **_Factory { *; }
-keep class **_MembersInjector { *; }
-keep class **_HiltComponents { *; }
-keep class **_HiltComponents$** { *; }

# Keep ViewModel classes
-keep class * extends androidx.lifecycle.ViewModel { *; }
-keep class * extends androidx.lifecycle.AndroidViewModel { *; }

# ===========================
# Jetpack Compose Keep Rules
# ===========================
-keep class androidx.compose.** { *; }
-keepclassmembers class androidx.compose.** { *; }

# Keep @Composable functions
-keep @androidx.compose.runtime.Composable class * { *; }
-keep @androidx.compose.runtime.Composable interface * { *; }
-keepclassmembers class * {
    @androidx.compose.runtime.Composable *;
}

# Keep ComposableSingletons classes
-keep class **$ComposableSingletons$** { *; }
-keepclassmembers class **$ComposableSingletons$** { *; }

# ===========================
# Kotlin Keep Rules
# ===========================
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# Keep Kotlin metadata
-keep class kotlin.Metadata { *; }

# Keep Kotlin coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembers class kotlinx.coroutines.** {
    volatile <fields>;
}

# ===========================
# Google Play Services / AdMob
# ===========================
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**

-keep class com.google.android.gms.ads.** { *; }
-dontwarn com.google.android.gms.ads.**
