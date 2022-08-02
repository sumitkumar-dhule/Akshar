package com.electrodiligent.english.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.english.presentation.AlphabetFlashcardScreen
import com.electrodiligent.english.presentation.AlphabetIdentificationScreen
import com.electrodiligent.english.presentation.SettingsScreen

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

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}