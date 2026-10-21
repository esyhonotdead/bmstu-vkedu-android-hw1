package com.example.vkedu_android_hw1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = PurpleLight,
    onPrimary = OnPurpleLight,

    secondary = LavenderLight,
    onSecondary = OnLavenderLight,

    background = BackgroundLight,
    onBackground = OnBackgroundLight,

    surface = SurfaceLight,
    onSurface = OnBackgroundLight
)

private val DarkColorScheme = darkColorScheme(
    primary = PurpleDark,
    onPrimary = OnPurpleDark,

    secondary = LavenderDark,
    onSecondary = OnLavenderDark,

    background = BackgroundDark,
    onBackground = OnBackgroundDark,

    surface = SurfaceDark,
    onSurface = OnBackgroundDark
)

@Composable
fun Vkeduandroidhw1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}