package com.electrodiligent.core.navigation

import androidx.navigation.NavHostController

object NavigationUtil {
    fun navigateTo(navController: NavHostController, route: String) {
        navController.navigate(route) {
            navController.graph.startDestinationRoute?.let { route ->
                popUpTo(route) {
                    saveState = true
                }
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    fun setAsBase(navController: NavHostController, route: String) {
        navController.popBackStack(route = Screen.HomeScreen.route,
            inclusive = true,
            saveState = false
        )
        navController.navigate(route) {
            launchSingleTop = true
            restoreState = false
        }
    }
}