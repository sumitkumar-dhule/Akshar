package com.electrodiligent.hindi.navigation

import com.electrodiligent.core.R
import com.electrodiligent.core.presentation.MenuItem

object DrawerMenu {
    val menu: List<MenuItem> = listOf(

        MenuItem(
            id = "home",
            title = "सीखना",
            contentDescription = "home",
            icon = R.drawable.teacher,
        ),

        MenuItem(
            id = "home_practice",
            title = "अभ्यास",
            contentDescription = "Practice",
            icon = R.drawable.practice,
        ),


        MenuItem(
            id = "literature",
            title = "वर्णमाला",
            contentDescription = "Literature",
            icon = R.drawable.bee,
            isSectionHeader = true
        ),

        MenuItem(
            id = "alphabet_swar",
            title = "स्वर",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.abc
        ),

        MenuItem(
            id = "alphabet_vyanjan",
            title = "व्यंजन",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.abc
        ),

        MenuItem(
            id = "swar_flashcards",
            title = "स्वर चार्ट",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.flashcards_abc
        ),

        MenuItem(
            id = "vyanjan_flashcards",
            title = "व्यंजन चार्ट",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.flashcards_abc
        ),

        MenuItem(
            id = "Math",
            title = "गणित",
            contentDescription = "Math",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "number_identification",
            title = "गिनती",
            contentDescription = "Go to Number Identification screen",
            icon = R.drawable.numbers
        ),

        MenuItem(
            id = "number_flashcards",
            title = "१ से १००",
            contentDescription = "Go to Number Flashcards screen",
            icon = R.drawable.flashcard_123
        ),

        //GK
        MenuItem(
            id = "GK",
            title = "सामान्य ज्ञान",
            contentDescription = "General Knowledge",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "gk_shapes",
            title = "आकार",
            contentDescription = "Go to Shapes screen",
            icon = R.drawable.shapes
        ),

        MenuItem(
            id = "gk_colors",
            title = "रंग",
            contentDescription = "Go to Colors screen",
            icon = R.drawable.colors
        ),

        MenuItem(
            id = "gk_vegetables",
            title = "सब्जियां",
            contentDescription = "Vegetables",
            icon = R.drawable.vegetable
        ),

        MenuItem(
            id = "gk_fruits",
            title = "फल",
            contentDescription = "Fruits",
            icon = R.drawable.fruits
        ),

        MenuItem(
            id = "gk_animals",
            title = "जानवर",
            contentDescription = "Animals",
            icon = R.drawable.animals
        ),

        MenuItem(
            id = "gk_birds",
            title = "पक्षी",
            contentDescription = "Birds",
            icon = R.drawable.birds
        ),

        //Practice
        MenuItem(
            id = "practice",
            title = "अभ्यास",
            contentDescription = "General Knowledge",
            icon = R.drawable.bookmark,
            isSectionHeader = true
        ),

        MenuItem(
            id = "practice_alphabets",
            title = "वर्णमाला",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_abc
        ),

        MenuItem(
            id = "practice_numbers",
            title = "गिनती",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_numbers
        ),

        MenuItem(
            id = "practice_vegetable",
            title = "सब्जियां",
            contentDescription = "Vegetable",
            icon = R.drawable.practice_vegetable
        ),

        MenuItem(
            id = "practice_fruit",
            title = "फल",
            contentDescription = "Fruit",
            icon = R.drawable.practice_fruits
        ),

        MenuItem(
            id = "practice_animal",
            title = "जानवर",
            contentDescription = "Animal",
            icon = R.drawable.practice_animal
        ),

        MenuItem(
            id = "practice_bird",
            title = "पक्षी",
            contentDescription = "Bird",
            icon = R.drawable.practice_bird
        ),

        MenuItem(
            id = "practice_shapes",
            title = "आकार",
            contentDescription = "Shapes",
            icon = R.drawable.practice_shapes
        ),

        MenuItem(
            id = "practice_colors",
            title = "रंग",
            contentDescription = "रंग",
            icon = R.drawable.practice_colors
        )


//        MenuItem(
//            id = "blank",
//            title = "",
//            contentDescription = "",
//            icon = R.drawable.bookmark,
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
//            icon = R.drawable.bookmark
//        ),
    )
}