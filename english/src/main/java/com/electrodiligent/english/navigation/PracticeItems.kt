package com.electrodiligent.english.navigation

import com.electrodiligent.core.R

object PracticeItems {
    val menu: List<NavigationItem> = listOf(

        NavigationItem(
            id = "practice_alphabets",
            title = "Alphabets",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_abc
        ),

        NavigationItem(
            id = "practice_numbers",
            title = "Numbers",
            contentDescription = "Alphabets",
            icon = R.drawable.practice_number
        )
    )
}