package com.electrodiligent.marathi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.HomeScreen
import com.electrodiligent.core.presentation.PracticeScreen
import com.electrodiligent.core.presentation.alphabate.AlphabetIdentificationScreen
import com.electrodiligent.core.presentation.alphabate.DevnagariFlashcardScreen
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
import com.electrodiligent.core.R
import com.electrodiligent.marathi.data.*

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                screenTitle = "वाचन",
                navigationItems = LearningItems.menu
            )
        }

        composable(route = Screen.PracticeScreen.route) {
            PracticeScreen(
                navController = navController,
                screenTitle = "खेळा",
                navigationItems = PracticeItems.menu
            )
        }

        composable(route = Screen.SwarIdentificationScreen.route) {
            AlphabetIdentificationScreen(displayCharacters = SwarRepository.list)
        }

        composable(route = Screen.VyanjanIdentificationScreen.route) {
            AlphabetIdentificationScreen(displayCharacters = VyanjanRepository.list)
        }

        composable(route = Screen.SwarFlashcardScreen.route) {
            DevnagariFlashcardScreen(displayCharacters = SwarFlashCardRepository.list)
        }

        composable(route = Screen.VyanjanFlashcardScreen.route) {
            DevnagariFlashcardScreen(displayCharacters = VyanjanFlashCardRepository.list)
        }

        composable(route = Screen.NumberFlashcardScreen.route) {
            NumberFlashcardScreen(numberItems = NumberRepository.listUpTo100)
        }

        composable(route = Screen.NumberIdentificationScreen.route) {
            NumberIdentificationScreen(items = NumberRepository.listUpTo20)
        }

        composable(route = Screen.ColorsScreen.route) {
            ColorsScreen(colorItems = ColorRepository.list, title = "रंग")
        }

        composable(route = Screen.ShapesScreen.route) {
            ShapesScreen(items = ShapeRepository.list, title = "आकार")
        }

        composable(route = Screen.VegetablesScreen.route) {
            VegetablesScreen(items = VegetablesRepository.list, title = "सब्जियां")
        }

        composable(route = Screen.FruitsScreen.route) {
            FruitsScreen(items = FruitsRepository.list, title = "फल")
        }

        composable(route = Screen.AnimalsScreen.route) {
            AnimalsScreen(items = AnimalsRepository.list, title = "जानवर")
        }

        composable(route = Screen.BirdsScreen.route) {
            BirdsScreen(items = BirdsRepository.list, title = "पक्षी")
        }

        composable(route = Screen.AlphabetsPracticeScreen.route) {
            AlphabetsPracticeScreen(items = VarnamalaQuestionRepository.list)
        }

        composable(route = Screen.NumbersPracticeScreen.route) {
            NumbersPracticeScreen(items = NumberQuestionRepository.list)
        }

        composable(route = Screen.VegetablePracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.vegetableQuestionList,
                findText = "सब्जी खोजे",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.FruitPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.fruitQuestionList,
                findText = "फल खोजे",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.AnimalPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.animalQuestionList,
                findText = "प्राणी खोजे",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.BirdPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.birdQuestionList,
                findText = "पक्षी खोजे",
                findSound = R.raw.beep
            )
        }
        composable(route = Screen.ColorPracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.colorQuestionList,
                findText = "रंग खोजे",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.ShapePracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.shapeQuestionList,
                findText = "आकार खोजे",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}