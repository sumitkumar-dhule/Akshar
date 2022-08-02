package com.electrodiligent.english.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.electrodiligent.english.ui.theme.AksharTheme
import com.electrodiligent.core.presentation.*
import com.electrodiligent.english.R
import com.electrodiligent.english.navigation.Navigation
import com.electrodiligent.english.navigation.Screen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AksharTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    val navController = rememberNavController()

                    Scaffold(
                        scaffoldState = scaffoldState,
                        topBar = {
                            AppBar(
                                title = "Preschool Essentials",
                                onNavigationIconClick = {
                                    scope.launch {
                                        scaffoldState.drawerState.open()
                                    }
                                }
                            )
                        },
                        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
                        drawerContent = {
                            DrawerHeader(
                                headerImageID = R.mipmap.ic_launcher
                            )
                            DrawerBody(
                                items = DrawerMenu.menu,
                                onItemClick = {
                                    when (it.id) {
                                        "alphabet" -> navigateTo(
                                            navController,
                                            Screen.AlphabetIdentificationScreen.route
                                        )
                                        "alphabet_flashcards" -> navigateTo(
                                            navController,
                                            Screen.AlphabetFlashcardScreen.route
                                        )
                                        "settings" -> navigateTo(
                                            navController,
                                            Screen.SettingsScreen.route
                                        )
                                    }

                                    scope.launch {
                                        scaffoldState.drawerState.close()
                                    }
                                }
                            )
                        }
                    ) {
                        BackgroundImage()
                        Navigation(navController = navController)
                    }


                }
            }
        }
    }

    private fun navigateTo(navController: NavHostController, route: String) {
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

}
