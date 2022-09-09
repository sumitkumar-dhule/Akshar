package com.electrodiligent.english.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import com.electrodiligent.core.R
import com.electrodiligent.core.presentation.MenuItem

object DrawerMenu {
    val menu: List<MenuItem> = listOf(

        MenuItem(
            id = "home",
            title = "Learn",
            contentDescription = "home",
            icon = R.drawable.teacher,
        ),

        MenuItem(
            id = "home_practice",
            title = "Practice",
            contentDescription = "Practice",
            icon = R.drawable.practice,
        ),


        MenuItem(
            id = "literature",
            title = "Literature",
            contentDescription = "Literature",
            icon = R.drawable.bee,
            isSectionHeader = true
        ),

        MenuItem(
            id = "alphabet",
            title = "Alphabets",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.abc
        ),

        MenuItem(
            id = "alphabet_flashcards",
            title = "A to Z",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.flashcards_abc
        ),

        MenuItem(
            id = "Math",
            title = "Math",
            contentDescription = "Math",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "number_identification",
            title = "Numbers",
            contentDescription = "Go to Number Identification screen",
            icon = R.drawable.numbers
        ),

        MenuItem(
            id = "number_flashcards",
            title = "1 to 100",
            contentDescription = "Go to Number Flashcards screen",
            icon = R.drawable.flashcard_123
        ),

        //GK
        MenuItem(
            id = "GK",
            title = "General Knowledge",
            contentDescription = "General Knowledge",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "gk_shapes",
            title = "Shapes",
            contentDescription = "Go to Shapes screen",
            icon = R.drawable.shapes
        ),

        MenuItem(
            id = "gk_colors",
            title = "Colors",
            contentDescription = "Go to Colors screen",
            icon = R.drawable.colors
        ),

        MenuItem(
            id = "gk_vegetables",
            title = "Vegetables",
            contentDescription = "Vegetables",
            icon = R.drawable.vegetable
        ),

        MenuItem(
            id = "gk_fruits",
            title = "Fruits",
            contentDescription = "Fruits",
            icon = R.drawable.fruits
        ),

        MenuItem(
            id = "gk_animals",
            title = "Animals",
            contentDescription = "Animals",
            icon = R.drawable.animals
        ),

        MenuItem(
            id = "gk_birds",
            title = "Birds",
            contentDescription = "Birds",
            icon = R.drawable.birds
        ),

        //Practice
        MenuItem(
            id = "practice",
            title = "Practice",
            contentDescription = "General Knowledge",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "practice_alphabets",
            title = "Alphabets",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_abc
        ),

        MenuItem(
            id = "practice_numbers",
            title = "Numbers",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_numbers
        ),

        MenuItem(
            id = "practice_vegetable",
            title = "Vegetables",
            contentDescription = "Vegetable",
            icon = R.drawable.practice_vegetable
        ),

        MenuItem(
            id = "practice_fruit",
            title = "Fruits",
            contentDescription = "Fruit",
            icon = R.drawable.practice_fruits
        ),

        MenuItem(
            id = "practice_animal",
            title = "Animals",
            contentDescription = "Animal",
            icon = R.drawable.practice_animal
        ),

        MenuItem(
            id = "practice_bird",
            title = "Birds",
            contentDescription = "Bird",
            icon = R.drawable.practice_bird
        ),

        MenuItem(
            id = "practice_shapes",
            title = "Shapes",
            contentDescription = "Shapes",
            icon = R.drawable.practice_shapes
        ),

        MenuItem(
            id = "practice_colors",
            title = "Colors",
            contentDescription = "Colors",
            icon = R.drawable.practice_colors
        ),


        MenuItem(
            id = "blank",
            title = "",
            contentDescription = "",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "settings",
            title = "Settings",
            contentDescription = "Go to settings screen",
            icon = R.drawable.settings_suggest
        ),
//        MenuItem(
//            id = "help",
//            title = "Help",
//            contentDescription = "Get help",
//            icon = R.drawable.bookmark
//        ),
    )
}