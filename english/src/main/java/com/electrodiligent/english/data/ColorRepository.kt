package com.electrodiligent.english.data

import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ColorUtil
import com.electrodiligent.english.R

object ColorRepository {
    val list = listOf(
       ColorItem(name = "RED", colorValue = ColorUtil.red, audio = R.raw.red),
       ColorItem(name = "YELLOW", colorValue = ColorUtil.yellow, audio = R.raw.yellow),
       ColorItem(name = "GREEN", colorValue = ColorUtil.green, audio = R.raw.green),
       ColorItem(name = "WHITE", colorValue = ColorUtil.white, audio = R.raw.white),
       ColorItem(name = "BLUE", colorValue = ColorUtil.blue, audio = R.raw.blue),
       ColorItem(name = "ORANGE", colorValue =ColorUtil.orange, audio = R.raw.orange),
       ColorItem(name = "BLACK", colorValue = ColorUtil.black, audio = R.raw.black),
       ColorItem(name = "PURPLE", colorValue = ColorUtil.purple, audio = R.raw.purple),
       ColorItem(name = "BROWN", colorValue = ColorUtil.brown, audio = R.raw.brown),
       ColorItem(name = "PINK", colorValue = ColorUtil.pink, audio = R.raw.pink)
    )
}