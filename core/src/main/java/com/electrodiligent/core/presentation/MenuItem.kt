package com.electrodiligent.core.presentation

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector,
    val isSectionHeader:Boolean = false
)
