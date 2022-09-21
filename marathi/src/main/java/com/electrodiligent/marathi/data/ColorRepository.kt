package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ColorUtil
import com.electrodiligent.marathi.R

object ColorRepository {
    val list = listOf(
        ColorItem(name = "लाल", colorValue = ColorUtil.red, audio = R.raw.laal),
        ColorItem(name = "पिवळा", colorValue = ColorUtil.yellow, audio = R.raw.piwala),
        ColorItem(name = "हिरवा", colorValue = ColorUtil.green, audio = R.raw.hirwa),
        ColorItem(name = "पांढरा", colorValue = ColorUtil.white, audio = R.raw.pandhara),
        ColorItem(name = "निळा", colorValue = ColorUtil.blue, audio = R.raw.nila),
        ColorItem(name = "नारंगी", colorValue = ColorUtil.orange, audio = R.raw.narangi),
        ColorItem(name = "काळा", colorValue = ColorUtil.black, audio = R.raw.kala),
        ColorItem(name = "जांभळा", colorValue = ColorUtil.purple, audio = R.raw.jambhla),
        ColorItem(name = "तपकिरी", colorValue = ColorUtil.brown, audio = R.raw.taapkiri),
        ColorItem(name = "गुलाबी", colorValue = ColorUtil.pink, audio = R.raw.gulabi)
    )
}