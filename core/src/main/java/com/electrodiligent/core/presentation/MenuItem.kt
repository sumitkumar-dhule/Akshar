package com.electrodiligent.core.presentation

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: Int,
    val isSectionHeader:Boolean = false
)
