package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.RandomColor

object ShapeRepository {
    private val randomColor = RandomColor.textColors.random().colorValue
    val list = listOf(
        PictureItem(
            "गोल",
            R.drawable.circle,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.circle
        ),
        PictureItem(
            name = "अंडाकार",
            imageId = R.drawable.oval,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.oval
        ),
        PictureItem(
            "त्रिकोण",
            R.drawable.triangle,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.triangle
        ),
        PictureItem(
            "चौकोर",
            R.drawable.square,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.square
        ),
        PictureItem(
            "आयत",
            R.drawable.rectangle,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.rectangle
        ),

        PictureItem(
            "पंचकोण",
            R.drawable.pentagon,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.pentagon
        ),
        PictureItem(
            "षट्भुज",
            R.drawable.hexagon,
            randomColor,
            //audio = com.electrodiligent.english.R.raw.hexagon
        ),
        PictureItem(
            name = "सितारा",
            imageId = R.drawable.star,
            color = randomColor,
            //audio = com.electrodiligent.english.R.raw.star
        ),
        PictureItem(
            name = "दिल", imageId = R.drawable.heart,
            color = randomColor,
            //audio = com.electrodiligent.english.R.raw.heart
        )
    )
}