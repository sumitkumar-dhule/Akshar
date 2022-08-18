package com.electrodiligent.core.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object AlphabetIdentificationScreen : Screen("alphabet_identification_screen")
    object AlphabetFlashcardScreen : Screen("alphabet_flashcard_screen")
    object NumberFlashcardScreen : Screen("number_flashcard_screen")
    object NumberIdentificationScreen : Screen("number_identification_screen")
    object ColorsScreen : Screen("colors_screen")
    object ShapesScreen : Screen("shapes_screen")
    object VegetablesScreen : Screen("vegetables_screen")
    object FruitsScreen : Screen("fruits_screen")
    object AnimalsScreen : Screen("animals_screen")
    object BirdsScreen : Screen("birds_screen")
    object AlphabetsPracticeScreen : Screen("alphabets_practice_screen")
    object NumbersPracticeScreen : Screen("numbers_practice_screen")
    object VegetablePracticeScreen : Screen("vegetable_practice_screen")
    object FruitPracticeScreen : Screen("fruit_practice_screen")
    object AnimalPracticeScreen : Screen("animal_practice_screen")
    object BirdPracticeScreen : Screen("bird_practice_screen")
    object ShapePracticeScreen : Screen("shape_practice_screen")
    object ColorPracticeScreen : Screen("color_practice_screen")

    object SettingsScreen : Screen("settings_screen")
}