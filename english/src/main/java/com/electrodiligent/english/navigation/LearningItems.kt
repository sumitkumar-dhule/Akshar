package com.electrodiligent.english.navigation

import com.electrodiligent.core.R


object LearningItems {
    val menu: List<NavigationItem> = listOf(
        
        NavigationItem(
            id = "alphabet",
            title = "Alphabet Identification",
            contentDescription = "Go to Alphabet Identification screen",
            icon = R.drawable.lollipop
        ),

        NavigationItem(
            id = "alphabet_flashcards",
            title = "Alphabet Flashcards",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = R.drawable.lollipop
        ),
        

        NavigationItem(
            id = "number_identification",
            title = "Number Identification",
            contentDescription = "Go to Number Identification screen",
            icon = R.drawable.lollipop
        ),

        NavigationItem(
            id = "number_flashcards",
            title = "Number Flashcards",
            contentDescription = "Go to Number Flashcards screen",
            icon = R.drawable.lollipop
        ),
        
        NavigationItem(
            id = "gk_shapes",
            title = "Shapes",
            contentDescription = "Go to Shapes screen",
            icon = R.drawable.lollipop
        ),

        NavigationItem(
            id = "gk_colors",
            title = "Colors",
            contentDescription = "Go to Colors screen",
            icon = R.drawable.lollipop
        )
    )
}