package com.diligentapps.core.domain.model

import androidx.compose.ui.graphics.painter.Painter
import com.diligentapps.core.R

data class DisplayCharacter(
    val display: String = "B",
    val left: String = "A",
    var right: String = "C",
    val subtitle: String = "b",
    val displayName: String = "Ball",
    val audio: Int = R.raw.beep,
    val displayImage: Painter? = null
)
