package com.electrodiligent.hindi.navigation

import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.Screen

object LearningItems {
    val menu: List<NavigationItem> = listOf(

        NavigationItem(
            id = "alphabet_swar",
            title = "स्वर",
            contentDescription = "Go to Alphabet Identification screen",
            icon = com.electrodiligent.hindi.R.drawable.a_aa_e,
            navigationRoute = Screen.SwarIdentificationScreen
        ),

        NavigationItem(
            id = "alphabet_vyanjan",
            title = "व्यंजन",
            contentDescription = "Go to Alphabet Identification screen",
            icon = com.electrodiligent.hindi.R.drawable.ka_kha_ga,
            navigationRoute = Screen.VyanjanIdentificationScreen
        ),

        NavigationItem(
            id = "swar_flashcards",
            title = "स्वर चार्ट",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = com.electrodiligent.hindi.R.drawable.swar_flashcard,
            navigationRoute = Screen.SwarFlashcardScreen
        ),
        NavigationItem(
            id = "vyanjan_flashcards",
            title = "व्यंजन चार्ट",
            contentDescription = "Go to Alphabet Flashcards screen",
            icon = com.electrodiligent.hindi.R.drawable.vyanjan_flashcard,
            navigationRoute = Screen.VyanjanFlashcardScreen
        ),

        NavigationItem(
            id = "number_identification",
            title = "गिनती",
            contentDescription = "Go to Number Identification screen",
            icon = com.electrodiligent.hindi.R.drawable.ek_do_teen,
            navigationRoute = Screen.NumberIdentificationScreen
        ),

        NavigationItem(
            id = "number_flashcards",
            title = "१ से १००",
            contentDescription = "Go to Number Flashcards screen",
            icon = R.drawable.flashcard_123,
            navigationRoute = Screen.NumberFlashcardScreen
        ),

        NavigationItem(
            id = "gk_shapes",
            title = "आकार",
            contentDescription = "Go to Shapes screen",
            icon = R.drawable.shapes,
            navigationRoute = Screen.ShapesScreen
        ),

        NavigationItem(
            id = "gk_colors",
            title = "रंग",
            contentDescription = "Go to Colors screen",
            icon = R.drawable.colors,
            navigationRoute = Screen.ColorsScreen
        ),

        NavigationItem(
            id = "gk_vegetables",
            title = "सब्जियां",
            contentDescription = "Go to Vegetables screen",
            icon = R.drawable.vegetable,
            navigationRoute = Screen.VegetablesScreen
        ),

        NavigationItem(
            id = "gk_fruits",
            title = "फल",
            contentDescription = "Go to Fruits screen",
            icon = R.drawable.fruits,
            navigationRoute = Screen.FruitsScreen
        ),

        NavigationItem(
            id = "gk_animals",
            title = "जानवर",
            contentDescription = "Go to Animals screen",
            icon = R.drawable.animals,
            navigationRoute = Screen.AnimalsScreen
        ),

        NavigationItem(
            id = "gk_birds",
            title = "पक्षी",
            contentDescription = "Go to Birds screen",
            icon = R.drawable.birds,
            navigationRoute = Screen.BirdsScreen
        ),

        NavigationItem(
            id = "home_practice",
            title = "खेले",
            contentDescription = "Go to Practice screen",
            icon = R.drawable.practice,
            navigationRoute = Screen.PracticeScreen
        )

    )
}