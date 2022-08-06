package com.electrodiligent.core.domain.model

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.R

data class ColorItem(
    val name: String = "",
    val colorValue: Color = Color.Blue,
    val audio: Int = R.raw.beep
)
