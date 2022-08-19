package com.electrodiligent.hindi.data

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.hindi.R

object ColorRepository {
    val list = listOf(
       ColorItem(name = "RED", colorValue = Color.Red),//, audio = R.raw.red),
       ColorItem("YELLOW", Color.Yellow),//, audio = R.raw.yellow),
       ColorItem("GREEN", Color.Green),//, audio = R.raw.green),
       ColorItem("WHITE", Color.White),//, audio = R.raw.white),
       ColorItem("BLUE", Color.Blue),//, audio = R.raw.blue),
       ColorItem("ORANGE", Color(red = 255, green = 165, blue = 0)),// audio = R.raw.orange),
       ColorItem("BLACK", Color.Black),//, audio = R.raw.black),
       ColorItem("PURPLE", Color(red = 128, green = 0, blue = 128)),//, audio = R.raw.purple),
       ColorItem("BROWN", Color(red = 168, green = 42, blue = 42)),// audio = R.raw.brown),
       ColorItem("PINK", Color(red = 255, green = 0, blue = 127)),// audio = R.raw.pink)
    )
}