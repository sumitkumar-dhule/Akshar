package com.electrodiligent.english.navigation

sealed class Screen(val route: String) {
    object AlphabetIdentificationScreen : Screen("alphabet_identification_screen")
    object AlphabetFlashcardScreen : Screen("alphabet_flashcard_screen")
    object SettingsScreen : Screen("settings_screen")
}