package com.electrodiligent.marathi.data

import androidx.compose.ui.graphics.Color
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.marathi.R

object ColorRepository {
    val list = listOf(
        ColorItem(name = "लाल", colorValue = Color.Red, ), // audio = R.raw.lal),
        ColorItem("पीला", Color.Yellow, ), // audio = R.raw.pila),
        ColorItem("हरा", Color.Green, ), // audio = R.raw.hara),
        ColorItem("सफेद", Color.White, ), // audio = R.raw.safed),
        ColorItem("नीला", Color.Blue, ), // audio = R.raw.nila),
        ColorItem("नारंगी", Color(red = 255, green = 165, blue = 0), ), // audio = R.raw.narangi),
        ColorItem("काला", Color.Black, ), // audio = R.raw.kala),
        ColorItem("बैंगनी", Color(red = 128, green = 0, blue = 128), ), // audio = R.raw.baigani),
        ColorItem("भूरा", Color(red = 168, green = 42, blue = 42), ), // audio = R.raw.bhura),
        ColorItem("गुलाबी", Color(red = 255, green = 0, blue = 127), ), // audio = R.raw.gulabi)
    )
}