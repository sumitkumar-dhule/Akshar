package com.electrodiligent.core.util

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem

object ColorUtil {

    val red = Color.Red
    val green = Color(red = 11, green = 102, blue = 35)
    val blue = Color.Blue
    val black = Color.Black
    val purple = Color(red = 128, green = 0, blue = 128)
    val brown = Color(red = 150, green = 75, blue = 0)
    val pink = Color(red = 255, green = 0, blue = 127)
    val orange = Color(red = 254, green = 80, blue = 0)
    val yellow = Color.Yellow
    val white = Color.White

    val list = listOf(
        ColorItem("RED", red),
        ColorItem("GREEN", green),
        ColorItem("BLUE", blue),
        ColorItem("ORANGE", orange),
        ColorItem("BLACK", black),
        ColorItem("PURPLE", purple),
        ColorItem("BROWN", brown),
        ColorItem("PINK", pink),
        ColorItem("BLUE", blue)
    )

    val textColors = listOf(
        ColorItem("PURPLE", Color(red = 128, green = 0, blue = 128)),
    )


}