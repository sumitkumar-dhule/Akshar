package com.electrodiligent.core.navigation

data class NavigationItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: Int,
    val navigationRoute: Screen
)
