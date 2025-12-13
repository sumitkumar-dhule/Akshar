package com.electrodiligent.marathi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.alphabate.AlphabetIdentificationScreen
import com.electrodiligent.core.presentation.alphabate.DevnagariFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.NumberFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.NumberIdentificationScreen
import com.electrodiligent.core.presentation.color.ColorsScreen
import com.electrodiligent.core.presentation.picture.PictureScreen
import com.electrodiligent.core.presentation.practice.AlphabetsPracticeScreen
import com.electrodiligent.core.presentation.practice.ColorfulPracticeScreen
import com.electrodiligent.core.presentation.practice.NumbersPracticeScreen
import com.electrodiligent.core.presentation.practice.PicturePracticeScreen
import com.electrodiligent.core.presentation.settings.ParentVerificationScreen
import com.electrodiligent.core.presentation.shape.ShapesScreen
import com.electrodiligent.marathi.data.AnimalsRepository
import com.electrodiligent.marathi.data.BirdsRepository
import com.electrodiligent.marathi.data.ColorRepository
import com.electrodiligent.marathi.data.FruitsRepository
import com.electrodiligent.marathi.data.NumberQuestionRepository
import com.electrodiligent.marathi.data.NumberRepository
import com.electrodiligent.marathi.data.PictureQuestionRepository
import com.electrodiligent.marathi.data.ShapeRepository
import com.electrodiligent.marathi.data.SwarFlashCardRepository
import com.electrodiligent.marathi.data.SwarRepository
import com.electrodiligent.marathi.data.VarnamalaQuestionRepository
import com.electrodiligent.marathi.data.VegetablesRepository
import com.electrodiligent.marathi.data.VyanjanFlashCardRepository
import com.electrodiligent.marathi.data.VyanjanRepository
import com.electrodiligent.marathi.presentation.HomeScreen
import com.electrodiligent.marathi.presentation.PracticeScreen

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
            PictureScreen(items = VegetablesRepository.list, title = "भाज्या")
        }

        composable(route = Screen.FruitsScreen.route) {
            PictureScreen(items = FruitsRepository.list, title = "फळे")
        }

        composable(route = Screen.AnimalsScreen.route) {
            PictureScreen(items = AnimalsRepository.list, title = "प्राणी")
        }

        composable(route = Screen.BirdsScreen.route) {
            PictureScreen(items = BirdsRepository.list, title = "पक्षी")
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
                findText = "भाज्या शोधा",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.FruitPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.fruitQuestionList,
                findText = "फळ शोधा",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.AnimalPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.animalQuestionList,
                findText = "प्राणी शोधा",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.BirdPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.birdQuestionList,
                findText = "पक्षी शोधा",
                findSound = R.raw.beep
            )
        }
        composable(route = Screen.ColorPracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.colorQuestionList,
                findText = "रंग शोधा",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.ShapePracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.shapeQuestionList,
                findText = "आकार शोधा",
                findSound = R.raw.beep
            )
        }

        composable(route = Screen.ParentVerificationScreen.route) {
            ParentVerificationScreen(navController)
        }

    }
}