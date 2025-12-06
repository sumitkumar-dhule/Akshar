package com.electrodiligent.core.domain.model

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.R

data class PictureItem(
    val name: String = "",
    val imageId: Int = R.drawable.ic_image_placeholder,
    var color: Color = Color.Blue,
    val audio: Int = R.raw.beep,
    val canDoSomething: Boolean = false,
)
