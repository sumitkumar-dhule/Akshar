package com.diligentapps.core.domain.model

import androidx.compose.ui.graphics.painter.Painter

data class DisplayCharacter(
    var display: String = "B",
    var left: String= "A",
    var right: String="C",
    val subtitle: String="b",
    val displayName: String="Ball",
    val displayImage: Painter? = null
)
