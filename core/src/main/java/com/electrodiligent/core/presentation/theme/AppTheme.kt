package com.electrodiligent.core.presentation.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsControllerCompat

// -------------------------------
// Kids-friendly color schemes
// -------------------------------

private val KidsDarkColorScheme = darkColorScheme(
    primary = Color(0xFF7B1FA2),      // Friendly purple
    onPrimary = Color.White,

    secondary = Color(0xFF00BFA5),    // Teal accent
    onSecondary = Color.Black,

    tertiary = Color(0xFFFFD54F),     // Warm yellow (great for text)

    background = Color(0xFF121212),
    onBackground = Color.White,

    surface = Color(0xFF1E1E1E),
    onSurface = Color.White
)

private val KidsLightColorScheme = lightColorScheme(
    primary = Color(0xFF7B1FA2),
    onPrimary = Color.White,

    secondary = Color(0xFF00BFA5),
    onSecondary = Color.Black,

    tertiary = Color(0xFFFFC107),

    background = Color(0xFFFDF7FF),
    onBackground = Color.Black,

    surface = Color.White,
    onSurface = Color.Black
)

// -------------------------------
// App Theme (NO dynamic color)
// -------------------------------

@Composable
fun AppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        KidsDarkColorScheme
    } else {
        KidsLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )

    // Apply system bar style after theme is set
    SystemBarsStyle(darkTheme)
}

@Composable
fun SystemBarsStyle(darkTheme: Boolean) {
    val view = LocalView.current
    val window = (view.context as Activity).window

    SideEffect {
        WindowInsetsControllerCompat(window, view).apply {
            isAppearanceLightStatusBars = !darkTheme
            isAppearanceLightNavigationBars = !darkTheme
        }
    }
}
