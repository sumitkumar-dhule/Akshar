package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ColorUtil
import com.electrodiligent.hindi.R

object ColorRepository {

    val list = listOf(
        ColorItem(name = "लाल", colorValue = ColorUtil.red, audio = R.raw.lal),
        ColorItem(name = "पीला", colorValue = ColorUtil.yellow, audio = R.raw.pila),
        ColorItem(name = "हरा", colorValue = ColorUtil.green, audio = R.raw.hara),
        ColorItem(name = "सफेद", colorValue = ColorUtil.white, audio = R.raw.safed),
        ColorItem(name = "नीला", colorValue = ColorUtil.blue, audio = R.raw.nila),
        ColorItem(name = "नारंगी", colorValue = ColorUtil.orange, audio = R.raw.narangi),
        ColorItem(name = "काला", colorValue = ColorUtil.black, audio = R.raw.kala),
        ColorItem(name = "बैंगनी", colorValue = ColorUtil.purple, audio = R.raw.baigani),
        ColorItem(name = "भूरा", colorValue = ColorUtil.brown, audio = R.raw.bhura),
        ColorItem(name = "गुलाबी", colorValue = ColorUtil.pink, audio = R.raw.gulabi)
    )

}