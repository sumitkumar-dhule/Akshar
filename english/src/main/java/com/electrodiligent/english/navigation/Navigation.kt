package com.electrodiligent.english.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.alphabate.AlphabetFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.AlphabetIdentificationScreen
import com.electrodiligent.core.presentation.alphabate.NumberFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.NumberIdentificationScreen
import com.electrodiligent.core.presentation.color.ColorsScreen
import com.electrodiligent.core.presentation.picture.AnimalsScreen
import com.electrodiligent.core.presentation.picture.BirdsScreen
import com.electrodiligent.core.presentation.picture.FruitsScreen
import com.electrodiligent.core.presentation.picture.VegetablesScreen
import com.electrodiligent.core.presentation.practice.*
import com.electrodiligent.core.presentation.settings.SettingsScreen
import com.electrodiligent.core.presentation.shape.ShapesScreen
import com.electrodiligent.english.data.*
import com.electrodiligent.core.presentation.HomeScreen
import com.electrodiligent.core.presentation.PracticeScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                screenTitle = "Learning",
                navigationItems = LearningItems.menu
            )
        }

        composable(route = Screen.PracticeScreen.route) {
            PracticeScreen(navController = navController,
                screenTitle = "Practice",
                navigationItems = PracticeItems.menu)
        }

        composable(route = Screen.AlphabetIdentificationScreen.route) {
            AlphabetIdentificationScreen(displayCharacters = AlphabetsRepository.list)
        }

        composable(route = Screen.AlphabetFlashcardScreen.route) {
            AlphabetFlashcardScreen(displayCharacters = AlphabetFlashCardRepository.list)
        }

        composable(route = Screen.NumberFlashcardScreen.route) {
            NumberFlashcardScreen(numberItems = NumberFlashCardRepository.list)
        }

        composable(route = Screen.NumberIdentificationScreen.route) {
            NumberIdentificationScreen(items = NumberRepository.list)
        }

        composable(route = Screen.ColorsScreen.route) {
            ColorsScreen(colorItems = ColorRepository.list, title = "रंग")
        }

        composable(route = Screen.ShapesScreen.route) {
            ShapesScreen(items = ShapeRepository.list, title = "आकार")
        }

        composable(route = Screen.VegetablesScreen.route) {
            VegetablesScreen(items = VegetablesRepository.list, title = "Vegetables")
        }

        composable(route = Screen.FruitsScreen.route) {
            FruitsScreen(items = FruitsRepository.list, title = "Fruits")
        }

        composable(route = Screen.AnimalsScreen.route) {
            AnimalsScreen(items = AnimalsRepository.list, title = "Animals")
        }

        composable(route = Screen.BirdsScreen.route) {
            BirdsScreen(items = BirdsRepository.list, title = "Birds")
        }

        composable(route = Screen.AlphabetsPracticeScreen.route) {
            AlphabetsPracticeScreen(items = AlphabetQuestionRepository.list)
        }

        composable(route = Screen.NumbersPracticeScreen.route) {
            NumbersPracticeScreen(items = NumberQuestionRepository.list)
        }

        composable(route = Screen.VegetablePracticeScreen.route) {
            VegetablePracticeScreen(items = PictureQuestionRepository.vegetableQuestionList)
        }

        composable(route = Screen.FruitPracticeScreen.route) {
            FruitPracticeScreen(items = PictureQuestionRepository.fruitQuestionList)
        }

        composable(route = Screen.AnimalPracticeScreen.route) {
            AnimalPracticeScreen(items = PictureQuestionRepository.animalQuestionList)
        }

        composable(route = Screen.BirdPracticeScreen.route) {
            BirdPracticeScreen(items = PictureQuestionRepository.birdQuestionList)
        }
        composable(route = Screen.ColorPracticeScreen.route) {
            ColorPracticeScreen(items = PictureQuestionRepository.colorQuestionList)
        }

        composable(route = Screen.ShapePracticeScreen.route) {
            ShapePracticeScreen(items = PictureQuestionRepository.shapeQuestionList)
        }

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}