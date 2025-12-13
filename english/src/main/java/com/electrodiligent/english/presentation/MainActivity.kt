package com.electrodiligent.english.presentation

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.electrodiligent.core.navigation.NavigationUtil.navigateTo
import com.electrodiligent.core.navigation.NavigationUtil.setAsBase
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.*
import com.electrodiligent.english.BuildConfig.VERSION_NAME
import com.electrodiligent.english.R
import com.electrodiligent.english.navigation.DrawerMenu
import com.electrodiligent.english.navigation.Navigation
import com.electrodiligent.core.presentation.theme.AppTheme
import com.electrodiligent.core.presentation.theme.SystemBarsStyle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        installSplashScreen()

        setContent {
            AppTheme {

                SystemBarsStyle()

                val navController = rememberNavController()
                val scope = rememberCoroutineScope()
                val drawerState = rememberDrawerState(DrawerValue.Closed)

                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        ModalDrawerSheet {
                            DrawerHeader(
                                header = "Preschool Essentials",
                                headerImageID = R.mipmap.ic_launcher,
                                version = "version: $VERSION_NAME"
                            )
                            DrawerBody(
                                items = DrawerMenu.menu,
                                onItemClick = handleClick(
                                    navController,
                                    scope,
                                    drawerState
                                )
                            )
                        }
                    }
                ) {
                    Scaffold(
                        contentWindowInsets = WindowInsets.safeDrawing,
                        topBar = {
                            AppBar(
                                title = "Preschool Essentials",
                                onNavigationIconClick = {
                                    scope.launch { drawerState.open() }
                                }
                            )
                        }
                    ) { innerPadding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            BackgroundImage()
                            Navigation(navController = navController)
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun handleClick(
        navController: NavHostController,
        scope: CoroutineScope,
        drawerState: DrawerState
    ): (MenuItem) -> Unit = {

        when (it.id) {
            "alphabet" -> navigateTo(navController, Screen.AlphabetIdentificationScreen.route)
            "alphabet_flashcards" -> navigateTo(navController, Screen.AlphabetFlashcardScreen.route)
            "number_identification" -> navigateTo(
                navController,
                Screen.NumberIdentificationScreen.route
            )

            "number_flashcards" -> navigateTo(navController, Screen.NumberFlashcardScreen.route)
            "gk_shapes" -> navigateTo(navController, Screen.ShapesScreen.route)
            "gk_colors" -> navigateTo(navController, Screen.ColorsScreen.route)
            "settings" -> navigateTo(navController, Screen.ParentVerificationScreen.route)
            "home" -> setAsBase(navController, Screen.HomeScreen.route)
            "home_practice" -> setAsBase(navController, Screen.PracticeScreen.route)
            "gk_vegetables" -> navigateTo(navController, Screen.VegetablesScreen.route)
            "gk_fruits" -> navigateTo(navController, Screen.FruitsScreen.route)
            "gk_animals" -> navigateTo(navController, Screen.AnimalsScreen.route)
            "gk_birds" -> navigateTo(navController, Screen.BirdsScreen.route)
            "practice_alphabets" -> navigateTo(navController, Screen.AlphabetsPracticeScreen.route)
            "practice_numbers" -> navigateTo(navController, Screen.NumbersPracticeScreen.route)
            "practice_vegetable" -> navigateTo(navController, Screen.VegetablePracticeScreen.route)
            "practice_fruit" -> navigateTo(navController, Screen.FruitPracticeScreen.route)
            "practice_animal" -> navigateTo(navController, Screen.AnimalPracticeScreen.route)
            "practice_bird" -> navigateTo(navController, Screen.BirdPracticeScreen.route)
            "practice_shapes" -> navigateTo(navController, Screen.ShapePracticeScreen.route)
            "practice_colors" -> navigateTo(navController, Screen.ColorPracticeScreen.route)
        }

        scope.launch { drawerState.close() }
    }
}
