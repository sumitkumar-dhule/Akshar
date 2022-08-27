package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ColorUtil

object ColorRepository {
    val list = listOf(
        ColorItem(name = "RED", colorValue = ColorUtil.red),// = R.raw.red),
        ColorItem(name = "YELLOW", colorValue = ColorUtil.yellow),// = R.raw.yellow),
        ColorItem(name = "GREEN", colorValue = ColorUtil.green),// = R.raw.green),
        ColorItem(name = "WHITE", colorValue = ColorUtil.white),// = R.raw.white),
        ColorItem(name = "BLUE", colorValue = ColorUtil.blue),// = R.raw.blue),
        ColorItem(name = "ORANGE", colorValue = ColorUtil.orange),// = R.raw.orange),
        ColorItem(name = "BLACK", colorValue = ColorUtil.black),// = R.raw.black),
        ColorItem(name = "PURPLE", colorValue = ColorUtil.purple),// = R.raw.purple),
        ColorItem(name = "BROWN", colorValue = ColorUtil.brown),// = R.raw.brown),
        ColorItem(name = "PINK", colorValue = ColorUtil.pink),// = R.raw.pink)
    )
}