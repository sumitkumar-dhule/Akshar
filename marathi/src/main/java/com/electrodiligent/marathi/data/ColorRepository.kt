package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ColorUtil

object ColorRepository {
    val list = listOf(
        ColorItem(name = "लाल", colorValue = ColorUtil.red),// = R.raw.red),
        ColorItem(name = "पिवळा", colorValue = ColorUtil.yellow),// = R.raw.yellow),
        ColorItem(name = "हिरवा", colorValue = ColorUtil.green),// = R.raw.green),
        ColorItem(name = "पांढरा", colorValue = ColorUtil.white),// = R.raw.white),
        ColorItem(name = "निळा", colorValue = ColorUtil.blue),// = R.raw.blue),
        ColorItem(name = "नारंगी", colorValue = ColorUtil.orange),// = R.raw.orange),
        ColorItem(name = "काळा", colorValue = ColorUtil.black),// = R.raw.black),
        ColorItem(name = "जांभळा", colorValue = ColorUtil.purple),// = R.raw.purple),
        ColorItem(name = "तपकिरी", colorValue = ColorUtil.brown),// = R.raw.brown),
        ColorItem(name = "गुलाबी", colorValue = ColorUtil.pink),// = R.raw.pink)
    )
}