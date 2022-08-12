package com.electrodiligent.english.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object AlphabetIdentificationScreen : Screen("alphabet_identification_screen")
    object AlphabetFlashcardScreen : Screen("alphabet_flashcard_screen")
    object NumberFlashcardScreen : Screen("number_flashcard_screen")
    object NumberIdentificationScreen : Screen("number_identification_screen")
    object ColorsScreen : Screen("colors_screen")
    object ShapesScreen : Screen("shapes_screen")
    object VegetablesScreen : Screen("vegetables_screen")
    object AlphabetsPracticeScreen : Screen("alphabets_practice_screen")
    object NumbersPracticeScreen : Screen("numbers_practice_screen")
    object SettingsScreen : Screen("settings_screen")
}