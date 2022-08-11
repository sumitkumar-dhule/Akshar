package com.electrodiligent.english.navigation

import com.electrodiligent.core.R

object LearningItems {
    val menu: List<NavigationItem> = listOf(
        
        NavigationItem(
            id = "alphabet",
            title = "Alphabet Identification",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.abc,
            navigationRoute = Screen.AlphabetIdentificationScreen
        ),

        NavigationItem(
            id = "alphabet_flashcards",
            title = "Alphabet Flashcards",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.flashcards_abc,
            navigationRoute = Screen.AlphabetFlashcardScreen
        ),
        

        NavigationItem(
            id = "number_identification",
            title = "Number Identification",
            contentDescription = "Go to Number Identification screen",
            icon = R.drawable.numbers,
            navigationRoute = Screen.NumberIdentificationScreen
        ),

        NavigationItem(
            id = "number_flashcards",
            title = "Number Flashcards",
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
        )
    )
}