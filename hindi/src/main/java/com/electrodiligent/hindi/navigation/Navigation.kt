package com.electrodiligent.hindi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
import com.electrodiligent.hindi.R
import com.electrodiligent.hindi.data.AnimalsRepository
import com.electrodiligent.hindi.data.BirdsRepository
import com.electrodiligent.hindi.data.ColorRepository
import com.electrodiligent.hindi.data.FruitsRepository
import com.electrodiligent.hindi.data.NumberQuestionRepository
import com.electrodiligent.hindi.data.NumberRepository
import com.electrodiligent.hindi.data.PictureQuestionRepository
import com.electrodiligent.hindi.data.ShapeRepository
import com.electrodiligent.hindi.data.SwarFlashCardRepository
import com.electrodiligent.hindi.data.SwarRepository
import com.electrodiligent.hindi.data.VarnamalaQuestionRepository
import com.electrodiligent.hindi.data.VegetablesRepository
import com.electrodiligent.hindi.data.VyanjanFlashCardRepository
import com.electrodiligent.hindi.data.VyanjanRepository
import com.electrodiligent.hindi.presentation.HomeScreen
import com.electrodiligent.hindi.presentation.PracticeScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(
                navController = navController,
                screenTitle = "पढ़े",
                navigationItems = LearningItems.menu
            )
        }

        composable(route = Screen.PracticeScreen.route) {
            PracticeScreen(
                navController = navController,
                screenTitle = "खेले",
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
            PictureScreen(items = VegetablesRepository.list, title = "सब्जियां")
        }

        composable(route = Screen.FruitsScreen.route) {
            PictureScreen(items = FruitsRepository.list, title = "फल")
        }

        composable(route = Screen.AnimalsScreen.route) {
            PictureScreen(items = AnimalsRepository.list, title = "जानवर")
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
                findText = "सब्जी खोजे",
                findSound = R.raw.khoje
            )
        }

        composable(route = Screen.FruitPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.fruitQuestionList,
                findText = "फल खोजे",
                findSound = R.raw.khoje
            )
        }

        composable(route = Screen.AnimalPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.animalQuestionList,
                findText = "प्राणी खोजे",
                findSound = R.raw.khoje
            )
        }

        composable(route = Screen.BirdPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.birdQuestionList,
                findText = "पक्षी खोजे",
                findSound = R.raw.khoje
            )
        }
        composable(route = Screen.ColorPracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.colorQuestionList,
                findText = "रंग खोजे",
                findSound = R.raw.khoje
            )
        }

        composable(route = Screen.ShapePracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.shapeQuestionList,
                findText = "आकार खोजे",
                findSound = R.raw.khoje
            )
        }

        composable(route = Screen.ParentVerificationScreen.route) {
            ParentVerificationScreen(navController)
        }

    }
}