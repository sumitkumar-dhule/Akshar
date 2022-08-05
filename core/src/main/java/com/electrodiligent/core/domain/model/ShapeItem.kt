package com.electrodiligent.core.domain.model

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.R

data class ShapeItem(val name: String = "", val imageId: Int = R.drawable.ic_image_placeholder, var color:Color = Color.Blue)
