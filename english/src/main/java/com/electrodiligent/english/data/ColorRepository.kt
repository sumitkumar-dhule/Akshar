package com.electrodiligent.english.data

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem

object ColorRepository {
    val list = listOf(
       ColorItem("RED", Color.Red),
       ColorItem("YELLOW", Color.Yellow),
       ColorItem("GREEN", Color.Green),
       ColorItem("WHITE", Color.White),
       ColorItem("BLUE", Color.Blue),
       ColorItem("ORANGE", Color(red = 255, green = 165, blue = 0)),
       ColorItem("BLACK", Color.Black),
       ColorItem("PURPLE", Color(red = 128, green = 0, blue = 128)),
       ColorItem("BROWN", Color(red = 168, green = 42, blue = 42)),
       ColorItem("PINK", Color(red = 255, green = 192, blue = 203))
    )
}