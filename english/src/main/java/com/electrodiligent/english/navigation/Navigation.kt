package com.electrodiligent.english.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.electrodiligent.english.HomeScreen
import com.electrodiligent.english.SettingsScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }

        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen()
        }

    }
}