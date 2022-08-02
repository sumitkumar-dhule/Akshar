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
        startDestination = Screen.AlphabetIdentificationScreen.route
    ) {
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

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}