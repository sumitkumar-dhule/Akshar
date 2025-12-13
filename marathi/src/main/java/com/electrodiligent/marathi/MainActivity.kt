package com.electrodiligent.marathi

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.electrodiligent.core.navigation.NavigationUtil
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.*
import com.electrodiligent.core.presentation.theme.AppTheme
import com.electrodiligent.core.presentation.theme.SystemBarsStyle
import com.electrodiligent.marathi.BuildConfig.VERSION_NAME
import com.electrodiligent.marathi.navigation.DrawerMenu
import com.electrodiligent.marathi.navigation.Navigation
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
                                version = "version: $VERSION_NAME",
                                language = "मराठी"
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

            "alphabet_swar" ->
                NavigationUtil.navigateTo(navController, Screen.SwarIdentificationScreen.route)

            "alphabet_vyanjan" ->
                NavigationUtil.navigateTo(navController, Screen.VyanjanIdentificationScreen.route)

            "swar_flashcards" ->
                NavigationUtil.navigateTo(navController, Screen.SwarFlashcardScreen.route)

            "vyanjan_flashcards" ->
                NavigationUtil.navigateTo(navController, Screen.VyanjanFlashcardScreen.route)

            "number_identification" ->
                NavigationUtil.navigateTo(navController, Screen.NumberIdentificationScreen.route)

            "number_flashcards" ->
                NavigationUtil.navigateTo(navController, Screen.NumberFlashcardScreen.route)

            "gk_shapes" ->
                NavigationUtil.navigateTo(navController, Screen.ShapesScreen.route)

            "gk_colors" ->
                NavigationUtil.navigateTo(navController, Screen.ColorsScreen.route)

            "settings" ->
                NavigationUtil.navigateTo(navController, Screen.ParentVerificationScreen.route)

            "home" ->
                NavigationUtil.setAsBase(navController, Screen.HomeScreen.route)

            "home_practice" ->
                NavigationUtil.setAsBase(navController, Screen.PracticeScreen.route)

            "gk_vegetables" ->
                NavigationUtil.navigateTo(navController, Screen.VegetablesScreen.route)

            "gk_fruits" ->
                NavigationUtil.navigateTo(navController, Screen.FruitsScreen.route)

            "gk_animals" ->
                NavigationUtil.navigateTo(navController, Screen.AnimalsScreen.route)

            "gk_birds" ->
                NavigationUtil.navigateTo(navController, Screen.BirdsScreen.route)

            "practice_alphabets" ->
                NavigationUtil.navigateTo(navController, Screen.AlphabetsPracticeScreen.route)

            "practice_numbers" ->
                NavigationUtil.navigateTo(navController, Screen.NumbersPracticeScreen.route)

            "practice_vegetable" ->
                NavigationUtil.navigateTo(navController, Screen.VegetablePracticeScreen.route)

            "practice_fruit" ->
                NavigationUtil.navigateTo(navController, Screen.FruitPracticeScreen.route)

            "practice_animal" ->
                NavigationUtil.navigateTo(navController, Screen.AnimalPracticeScreen.route)

            "practice_bird" ->
                NavigationUtil.navigateTo(navController, Screen.BirdPracticeScreen.route)

            "practice_shapes" ->
                NavigationUtil.navigateTo(navController, Screen.ShapePracticeScreen.route)

            "practice_colors" ->
                NavigationUtil.navigateTo(navController, Screen.ColorPracticeScreen.route)
        }

        scope.launch { drawerState.close() }
    }
}
