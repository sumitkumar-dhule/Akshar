package com.electrodiligent.english.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import com.electrodiligent.core.presentation.MenuItem

object DrawerMenu {
    val menu: List<MenuItem> = listOf(
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

        MenuItem(
            id = "Math",
            title = "Math",
            contentDescription = "Math",
            icon = Icons.Default.Info,
            isSectionHeader = true
        ),

        MenuItem(
            id = "number_identification",
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
            id = "practice",
            title = "Practice",
            contentDescription = "General Knowledge",
            icon = Icons.Default.Info,
            isSectionHeader = true
        ),

        MenuItem(
            id = "practice_alphabets",
            title = "Alphabets",
            contentDescription = "Alphabets",
            icon = Icons.Default.Star
        ),

        MenuItem(
            id = "practice_numbers",
            title = "Numbers",
            contentDescription = "Alphabets",
            icon = Icons.Default.Star
        ),

//        MenuItem(
//            id = "blank",
//            title = "",
//            contentDescription = "",
//            icon = Icons.Default.Info,
//            isSectionHeader = true
//        ),
//
//        MenuItem(
//            id = "settings",
//            title = "Settings",
//            contentDescription = "Go to settings screen",
//            icon = Icons.Default.Settings
//        ),
//        MenuItem(
//            id = "help",
//            title = "Help",
//            contentDescription = "Get help",
//            icon = Icons.Default.Info
//        ),
    )
}