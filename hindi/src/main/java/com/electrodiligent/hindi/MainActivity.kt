package com.electrodiligent.hindi

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
import com.electrodiligent.core.navigation.NavigationUtil
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.AppBar
import com.electrodiligent.hindi.ui.theme.AksharTheme
import com.electrodiligent.core.presentation.BackgroundImage
import com.electrodiligent.core.presentation.DrawerBody
import com.electrodiligent.core.presentation.DrawerHeader
import com.electrodiligent.hindi.navigation.Navigation
import com.electrodiligent.hindi.BuildConfig.VERSION_NAME
import com.electrodiligent.hindi.navigation.DrawerMenu
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
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.AlphabetIdentificationScreen.route
                                            )
                                        }
                                        "alphabet_flashcards" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.AlphabetFlashcardScreen.route
                                            )
                                        }
                                        "number_identification" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.NumberIdentificationScreen.route
                                            )
                                        }
                                        "number_flashcards" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.NumberFlashcardScreen.route
                                            )
                                        }
                                        "gk_shapes" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.ShapesScreen.route
                                            )
                                        }
                                        "gk_colors" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.ColorsScreen.route
                                            )
                                        }
                                        "settings" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.SettingsScreen.route
                                            )
                                        }

                                        "home" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.HomeScreen.route
                                            )
                                        }

                                        "home_practice" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.PracticeScreen.route
                                            )
                                        }

                                        "gk_vegetables" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.VegetablesScreen.route
                                            )
                                        }

                                        "gk_fruits" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.FruitsScreen.route
                                            )
                                        }

                                        "gk_animals" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.AnimalsScreen.route
                                            )
                                        }

                                        "gk_birds" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.BirdsScreen.route
                                            )
                                        }

                                        "practice_alphabets" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.AlphabetsPracticeScreen.route
                                            )
                                        }

                                        "practice_numbers" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.NumbersPracticeScreen.route
                                            )
                                        }

                                        "practice_vegetable" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.VegetablePracticeScreen.route
                                            )
                                        }

                                        "practice_fruit" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.FruitPracticeScreen.route
                                            )
                                        }

                                        "practice_animal" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.AnimalPracticeScreen.route
                                            )
                                        }

                                        "practice_bird" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.BirdPracticeScreen.route
                                            )
                                        }

                                        "practice_shapes" -> {
                                            NavigationUtil.navigateTo(
                                                navController,
                                                Screen.ShapePracticeScreen.route
                                            )
                                        }

                                        "practice_colors" -> {
                                            NavigationUtil.navigateTo(
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
