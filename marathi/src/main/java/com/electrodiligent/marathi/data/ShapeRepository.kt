package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.ColorUtil

object ShapeRepository {
    private val randomColor = ColorUtil.textColors.random().colorValue
    val list = listOf(
        PictureItem(
            "वर्तुळ",
            R.drawable.circle,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.vartul
        ),
        PictureItem(
            name = "अंडाकृती",
            imageId = R.drawable.oval,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.andakruti
        ),
        PictureItem(
            "त्रिकोण",
            R.drawable.triangle,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.trikon
        ),
        PictureItem(
            "चौरस",
            R.drawable.square,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.churas
        ),
        PictureItem(
            "आयत",
            R.drawable.rectangle,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.ayat
        ),

        PictureItem(
            "पंचकोन",
            R.drawable.pentagon,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.panchakon
        ),
        PictureItem(
            "षटकोन",
            R.drawable.hexagon,
            randomColor,
            audio = com.electrodiligent.marathi.R.raw.shatkon
        ),
        PictureItem(
            name = "तारा",
            imageId = R.drawable.star,
            color = randomColor,
            audio = com.electrodiligent.marathi.R.raw.tara
        )
    )
}