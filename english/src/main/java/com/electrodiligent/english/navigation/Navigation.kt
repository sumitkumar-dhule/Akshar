package com.electrodiligent.english.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.alphabate.AlphabetFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.AlphabetIdentificationScreen
import com.electrodiligent.core.presentation.alphabate.NumberFlashcardScreen
import com.electrodiligent.core.presentation.alphabate.NumberIdentificationScreen
import com.electrodiligent.core.presentation.color.ColorsScreen
import com.electrodiligent.core.presentation.picture.AnimalsScreen
import com.electrodiligent.core.presentation.picture.BirdsScreen
import com.electrodiligent.core.presentation.picture.FruitsScreen
import com.electrodiligent.core.presentation.picture.PictureScreen
import com.electrodiligent.core.presentation.picture.VegetablesScreen
import com.electrodiligent.core.presentation.practice.AlphabetsPracticeScreen
import com.electrodiligent.core.presentation.practice.ColorfulPracticeScreen
import com.electrodiligent.core.presentation.practice.NumbersPracticeScreen
import com.electrodiligent.core.presentation.practice.PicturePracticeScreen
import com.electrodiligent.core.presentation.settings.ParentVerificationScreen
import com.electrodiligent.core.presentation.settings.SettingsScreen
import com.electrodiligent.core.presentation.shape.ShapesScreen
import com.electrodiligent.english.data.*
import com.electrodiligent.english.presentation.HomeScreen
import com.electrodiligent.english.presentation.PracticeScreen

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
            PracticeScreen(
                navController = navController,
                screenTitle = "Practice",
                navigationItems = PracticeItems.menu
            )
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
            ColorsScreen(colorItems = ColorRepository.list, title = "Colors")
        }

        composable(route = Screen.ShapesScreen.route) {
            ShapesScreen(items = ShapeRepository.list, title = "Shapes")
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

        composable(route = Screen.ProfessionsScreen.route) {
            PictureScreen(items = ProfessionsRepository.list, title = "Professions")
        }

        composable(route = Screen.AlphabetsPracticeScreen.route) {
            AlphabetsPracticeScreen(items = AlphabetQuestionRepository.list)
        }

        composable(route = Screen.NumbersPracticeScreen.route) {
            NumbersPracticeScreen(items = NumberQuestionRepository.list)
        }

        composable(route = Screen.VegetablePracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.vegetableQuestionList, findSound = R.raw.find
            )
        }

        composable(route = Screen.FruitPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.fruitQuestionList,
                findSound = R.raw.find
            )
        }

        composable(route = Screen.AnimalPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.animalQuestionList, findSound = R.raw.find
            )
        }

        composable(route = Screen.BirdPracticeScreen.route) {
            PicturePracticeScreen(
                items = PictureQuestionRepository.birdQuestionList,
                findSound = R.raw.find
            )
        }
        composable(route = Screen.ColorPracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.colorQuestionList,
                findSound = R.raw.find
            )
        }

        composable(route = Screen.ShapePracticeScreen.route) {
            ColorfulPracticeScreen(
                items = PictureQuestionRepository.shapeQuestionList,
                findSound = R.raw.find
            )
        }

        composable(route = Screen.ParentVerificationScreen.route) {
            ParentVerificationScreen(navController)
        }

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen(
                navController = navController,
                reviewUrl = stringResource(com.electrodiligent.english.R.string.appReviewUrl)
            )
        }

    }
}