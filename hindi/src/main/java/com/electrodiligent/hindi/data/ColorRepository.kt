package com.electrodiligent.hindi.data

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.hindi.R

object ColorRepository {
    val list = listOf(
       ColorItem(name = "लाल", colorValue = Color.Red),//, audio = R.raw.red),
       ColorItem("पीला", Color.Yellow),//, audio = R.raw.yellow),
       ColorItem("हरा", Color.Green),//, audio = R.raw.green),
       ColorItem("सफेद", Color.White),//, audio = R.raw.white),
       ColorItem("नीला", Color.Blue),//, audio = R.raw.blue),
       ColorItem("नारंगी", Color(red = 255, green = 165, blue = 0)),// audio = R.raw.orange),
       ColorItem("काला", Color.Black),//, audio = R.raw.black),
       ColorItem("बैंगनी", Color(red = 128, green = 0, blue = 128)),//, audio = R.raw.purple),
       ColorItem("भूरा", Color(red = 168, green = 42, blue = 42)),// audio = R.raw.brown),
       ColorItem("गुलाबी", Color(red = 255, green = 0, blue = 127)),// audio = R.raw.pink)
    )
}