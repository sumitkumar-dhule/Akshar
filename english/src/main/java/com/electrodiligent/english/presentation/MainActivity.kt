package com.electrodiligent.english.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.electrodiligent.core.presentation.AppBar
import com.electrodiligent.core.presentation.BackgroundImage
import com.electrodiligent.core.presentation.DrawerBody
import com.electrodiligent.core.presentation.DrawerHeader
import com.electrodiligent.english.R
import com.electrodiligent.english.navigation.DrawerMenu
import com.electrodiligent.english.navigation.Navigation
import com.electrodiligent.english.navigation.Screen
import com.electrodiligent.english.ui.theme.AksharTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
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
                                header = "Preschool Essentials",
                                headerImageID = R.mipmap.ic_launcher
                            )
                            DrawerBody(
                                items = DrawerMenu.menu,
                                onItemClick = {
                                    when (it.id) {
                                        "alphabet" -> {
                                            navigateTo(
                                                navController,
                                                Screen.AlphabetIdentificationScreen.route
                                            )
                                        }
                                        "alphabet_flashcards" -> {
                                            navigateTo(
                                                navController,
                                                Screen.AlphabetFlashcardScreen.route
                                            )
                                        }
                                        "number_identification" -> {
                                            navigateTo(
                                                navController,
                                                Screen.NumberIdentificationScreen.route
                                            )
                                        }
                                        "number_flashcards" -> {
                                            navigateTo(
                                                navController,
                                                Screen.NumberFlashcardScreen.route
                                            )
                                        }
                                        "gk_shapes" -> {
                                            navigateTo(
                                                navController,
                                                Screen.ShapesScreen.route
                                            )
                                        }
                                        "gk_colors" -> {
                                            navigateTo(
                                                navController,
                                                Screen.ColorsScreen.route
                                            )
                                        }
                                        "settings" -> {
                                            navigateTo(
                                                navController,
                                                Screen.SettingsScreen.route
                                            )
                                        }

                                        "practice_alphabets" -> {
                                            navigateTo(
                                                navController,
                                                Screen.AlphabetsPracticeScreen.route
                                            )
                                        }

                                        "practice_numbers" -> {
                                            navigateTo(
                                                navController,
                                                Screen.NumbersPracticeScreen.route
                                            )
                                        }
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
