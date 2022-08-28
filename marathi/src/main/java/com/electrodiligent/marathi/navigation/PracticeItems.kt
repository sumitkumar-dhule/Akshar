package com.electrodiligent.marathi.navigation

import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.MenuItem

object PracticeItems {
    val menu: List<NavigationItem> = listOf(

        NavigationItem(
            id = "practice_alphabets",
            title = "वर्णमाला",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_abc,
            navigationRoute = Screen.AlphabetsPracticeScreen
        ),

        NavigationItem(
            id = "practice_numbers",
            title = "अंकवाचन",
            contentDescription = "Numbers",
            icon = R.drawable.practice_numbers,
            navigationRoute = Screen.NumbersPracticeScreen
        ),

        NavigationItem(
            id = "practice_vegetable",
            title = "भाज्या",
            contentDescription = "Vegetable",
            icon = R.drawable.practice_vegetable,
            navigationRoute = Screen.VegetablePracticeScreen
        ),

        NavigationItem(
            id = "practice_fruit",
            title = "फळे",
            contentDescription = "Fruit",
            icon = R.drawable.practice_fruits,
            navigationRoute = Screen.FruitPracticeScreen
        ),

        NavigationItem(
            id = "practice_animal",
            title = "प्राणी",
            contentDescription = "Animal",
            icon = R.drawable.practice_animal,
            navigationRoute = Screen.AnimalPracticeScreen
        ),

        NavigationItem(
            id = "practice_bird",
            title = "पक्षी",
            contentDescription = "Bird",
            icon = R.drawable.practice_bird,
            navigationRoute = Screen.BirdPracticeScreen
        ),

        NavigationItem(
            id = "practice_shapes",
            title = "आकार",
            contentDescription = "Shapes",
            icon = R.drawable.practice_shapes,
            navigationRoute = Screen.ShapePracticeScreen
        ),

        NavigationItem(
            id = "practice_colors",
            title = "रंग",
            contentDescription = "Colors",
            icon = R.drawable.practice_colors,
            navigationRoute = Screen.ColorPracticeScreen
        ),

        NavigationItem(
            id = "home",
            title = "वाचन",
            contentDescription = "home",
            icon = R.drawable.teacher,
            navigationRoute = Screen.HomeScreen
        )
    )
}