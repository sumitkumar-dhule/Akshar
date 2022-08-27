package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.ColorUtil

object ShapeRepository {
    private val randomColor = ColorUtil.textColors.random().colorValue
    val list = listOf(
        PictureItem(
            "गोल",
            R.drawable.circle,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.gol
        ),
        PictureItem(
            name = "अंडाकार",
            imageId = R.drawable.oval,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.andakar
        ),
        PictureItem(
            "त्रिकोण",
            R.drawable.triangle,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.trikon
        ),
        PictureItem(
            "चौकोर",
            R.drawable.square,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.chaukor
        ),
        PictureItem(
            "आयत",
            R.drawable.rectangle,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.ayat
        ),

        PictureItem(
            "पंचकोण",
            R.drawable.pentagon,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.panchakon
        ),
        PictureItem(
            "षट्कोण",
            R.drawable.hexagon,
            randomColor,
            // audio = com.electrodiligent.hindi.R.raw.shatkon
        ),
        PictureItem(
            name = "सितारा",
            imageId = R.drawable.star,
            color = randomColor,
            // audio = com.electrodiligent.hindi.R.raw.sitara
        ),
        PictureItem(
            name = "दिल", imageId = R.drawable.heart,
            color = randomColor,
            // audio = com.electrodiligent.hindi.R.raw.dil
        )
    )
}