package com.electrodiligent.english.navigation

import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.Screen

object LearningItems {
    val menu: List<NavigationItem> = listOf(
        
        NavigationItem(
            id = "alphabet",
            title = "Alphabets",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.abc,
            navigationRoute = Screen.AlphabetIdentificationScreen
        ),

        NavigationItem(
            id = "alphabet_flashcards",
            title = "A to Z",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.flashcards_abc,
            navigationRoute = Screen.AlphabetFlashcardScreen
        ),
        

        NavigationItem(
            id = "number_identification",
            title = "Numbers",
            contentDescription = "Go to Number Identification screen",
            icon = R.drawable.numbers,
            navigationRoute = Screen.NumberIdentificationScreen
        ),

        NavigationItem(
            id = "number_flashcards",
            title = "1 to 100",
            contentDescription = "Go to Number Flashcards screen",
            icon = R.drawable.flashcard_123,
            navigationRoute = Screen.NumberFlashcardScreen
        ),
        
        NavigationItem(
            id = "gk_shapes",
            title = "Shapes",
            contentDescription = "Go to Shapes screen",
            icon = R.drawable.shapes,
            navigationRoute = Screen.ShapesScreen
        ),

        NavigationItem(
            id = "gk_colors",
            title = "Colors",
            contentDescription = "Go to Colors screen",
            icon = R.drawable.colors,
            navigationRoute = Screen.ColorsScreen
        ),

        NavigationItem(
            id = "gk_vegetables",
            title = "Vegetables",
            contentDescription = "Go to Vegetables screen",
            icon = R.drawable.vegetable,
            navigationRoute = Screen.VegetablesScreen
        ),

        NavigationItem(
            id = "gk_fruits",
            title = "Fruits",
            contentDescription = "Go to Fruits screen",
            icon = R.drawable.fruits,
            navigationRoute = Screen.FruitsScreen
        ),

        NavigationItem(
            id = "gk_animals",
            title = "Animals",
            contentDescription = "Go to Animals screen",
            icon = R.drawable.animals,
            navigationRoute = Screen.AnimalsScreen
        ),

        NavigationItem(
            id = "gk_birds",
            title = "Birds",
            contentDescription = "Go to Birds screen",
            icon = R.drawable.birds,
            navigationRoute = Screen.BirdsScreen
        )

    )
}