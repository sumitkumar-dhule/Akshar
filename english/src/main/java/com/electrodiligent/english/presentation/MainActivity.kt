package com.electrodiligent.english.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.WindowManager
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
import androidx.navigation.compose.rememberNavController
import com.electrodiligent.core.presentation.AppBar
import com.electrodiligent.core.presentation.BackgroundImage
import com.electrodiligent.core.presentation.DrawerBody
import com.electrodiligent.core.presentation.DrawerHeader
import com.electrodiligent.english.BuildConfig.VERSION_NAME
import com.electrodiligent.english.R
import com.electrodiligent.english.navigation.DrawerMenu
import com.electrodiligent.english.navigation.Navigation
import com.electrodiligent.core.navigation.NavigationUtil.navigateTo
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.english.ui.theme.AksharTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    //TODO:: Remove lint
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
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
                                headerImageID = R.mipmap.ic_launcher,
                                version = "version: $VERSION_NAME"
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

                                        "home" -> {
                                            navigateTo(
                                                navController,
                                                Screen.HomeScreen.route
                                            )
                                        }

                                        "home_practice" -> {
                                            navigateTo(
                                                navController,
                                                Screen.PracticeScreen.route
                                            )
                                        }

                                        "gk_vegetables" -> {
                                            navigateTo(
                                                navController,
                                                Screen.VegetablesScreen.route
                                            )
                                        }

                                        "gk_fruits" -> {
                                            navigateTo(
                                                navController,
                                                Screen.FruitsScreen.route
                                            )
                                        }

                                        "gk_animals" -> {
                                            navigateTo(
                                                navController,
                                                Screen.AnimalsScreen.route
                                            )
                                        }

                                        "gk_birds" -> {
                                            navigateTo(
                                                navController,
                                                Screen.BirdsScreen.route
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

                                        "practice_vegetable" -> {
                                            navigateTo(
                                                navController,
                                                Screen.VegetablePracticeScreen.route
                                            )
                                        }

                                        "practice_fruit" -> {
                                            navigateTo(
                                                navController,
                                                Screen.FruitPracticeScreen.route
                                            )
                                        }

                                        "practice_animal" -> {
                                            navigateTo(
                                                navController,
                                                Screen.AnimalPracticeScreen.route
                                            )
                                        }

                                        "practice_bird" -> {
                                            navigateTo(
                                                navController,
                                                Screen.BirdPracticeScreen.route
                                            )
                                        }

                                        "practice_shapes" -> {
                                            navigateTo(
                                                navController,
                                                Screen.ShapePracticeScreen.route
                                            )
                                        }

                                        "practice_colors" -> {
                                            navigateTo(
                                                navController,
                                                Screen.ColorPracticeScreen.route
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
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }
}
