package com.electrodiligent.english

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
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
                                items = listOf(
                                    MenuItem(
                                        id = "literature",
                                        title = "Literature",
                                        contentDescription = "Literature",
                                        icon = Icons.Default.Info,
                                        isSectionHeader = true
                                    ),

                                    MenuItem(
                                        id = "alphabet",
                                        title = "Alphabet Identification",
                                        contentDescription = "Go to Alphabet Identification screen",
                                        icon = Icons.Default.Star
                                    ),

                                    MenuItem(
                                        id = "alphabet_flashcards",
                                        title = "Alphabet Flashcards",
                                        contentDescription = "Go to Alphabet Flashcards screen",
                                        icon = Icons.Default.Star
                                    ),

//
                                    MenuItem(
                                        id = "Math",
                                        title = "Math",
                                        contentDescription = "Math",
                                        icon = Icons.Default.Info,
                                        isSectionHeader = true
                                    ),

                                    MenuItem(
                                        id = "number",
                                        title = "Number Identification",
                                        contentDescription = "Go to Number Identification screen",
                                        icon = Icons.Default.Star
                                    ),

                                    MenuItem(
                                        id = "number_flashcards",
                                        title = "Number Flashcards",
                                        contentDescription = "Go to Number Flashcards screen",
                                        icon = Icons.Default.Star
                                    ),

//
                                    MenuItem(
                                        id = "GK",
                                        title = "General Knowledge",
                                        contentDescription = "General Knowledge",
                                        icon = Icons.Default.Info,
                                        isSectionHeader = true
                                    ),

                                    MenuItem(
                                        id = "gk_shapes",
                                        title = "Shapes",
                                        contentDescription = "Go to Shapes screen",
                                        icon = Icons.Default.Star
                                    ),

                                    MenuItem(
                                        id = "gk_colors",
                                        title = "Colors",
                                        contentDescription = "Go to Colors screen",
                                        icon = Icons.Default.Star
                                    ),

                                    MenuItem(
                                        id = "GK",
                                        title = "",
                                        contentDescription = "",
                                        icon = Icons.Default.Info,
                                        isSectionHeader = true
                                    ),

                                    MenuItem(
                                        id = "settings",
                                        title = "Settings",
                                        contentDescription = "Go to settings screen",
                                        icon = Icons.Default.Settings
                                    ),
                                    MenuItem(
                                        id = "help",
                                        title = "Help",
                                        contentDescription = "Get help",
                                        icon = Icons.Default.Info
                                    ),
                                ),
                                onItemClick = {
                                    when (it.id) {
                                        "alphabet" -> navigateTo(
                                            navController,
                                            Screen.HomeScreen.route
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
