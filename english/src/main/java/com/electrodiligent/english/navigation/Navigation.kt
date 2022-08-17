package com.electrodiligent.english.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.english.presentation.*

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(route = Screen.AlphabetIdentificationScreen.route) {
            AlphabetIdentificationScreen()
        }

        composable(route = Screen.AlphabetFlashcardScreen.route) {
            AlphabetFlashcardScreen()
        }

        composable(route = Screen.NumberFlashcardScreen.route) {
            NumberFlashcardScreen()
        }

        composable(route = Screen.NumberIdentificationScreen.route) {
            NumberIdentificationScreen()
        }

        composable(route = Screen.ColorsScreen.route) {
            ColorsScreen()
        }

        composable(route = Screen.ShapesScreen.route) {
            ShapesScreen()
        }

        composable(route = Screen.VegetablesScreen.route) {
            VegetablesScreen()
        }

        composable(route = Screen.FruitsScreen.route) {
            FruitsScreen()
        }

        composable(route = Screen.AnimalsScreen.route) {
            AnimalsScreen()
        }

        composable(route = Screen.BirdsScreen.route) {
            BirdsScreen()
        }

        composable(route = Screen.AlphabetsPracticeScreen.route) {
            AlphabetsPracticeScreen()
        }

        composable(route = Screen.NumbersPracticeScreen.route) {
            NumbersPracticeScreen()
        }

        composable(route = Screen.VegetablePracticeScreen.route) {
            VegetablePracticeScreen()
        }

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}