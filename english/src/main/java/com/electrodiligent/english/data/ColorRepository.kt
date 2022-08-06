package com.electrodiligent.english.data

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.english.R

object ColorRepository {
    val list = listOf(
       ColorItem(name = "RED", colorValue = Color.Red, R.raw.red),
       ColorItem("YELLOW", Color.Yellow, R.raw.yellow),
       ColorItem("GREEN", Color.Green, R.raw.green),
       ColorItem("WHITE", Color.White, R.raw.white),
       ColorItem("BLUE", Color.Blue, R.raw.blue),
       ColorItem("ORANGE", Color(red = 255, green = 165, blue = 0), R.raw.orange),
       ColorItem("BLACK", Color.Black, R.raw.black),
       ColorItem("PURPLE", Color(red = 128, green = 0, blue = 128), R.raw.purple),
       ColorItem("BROWN", Color(red = 168, green = 42, blue = 42), R.raw.brown),
       ColorItem("PINK", Color(red = 255, green = 192, blue = 203), R.raw.pink)
    )
}