package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.RandomColor

object ShapeRepository {
    private val randomColor = RandomColor.list.random().colorValue
    val list = listOf(
        PictureItem(
            "CIRCLE",
            R.drawable.circle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.circle
        ),
        PictureItem(
            name = "OVAL",
            imageId = R.drawable.oval,
            randomColor,
            audio = com.electrodiligent.english.R.raw.oval
        ),
        PictureItem(
            "TRIANGLE",
            R.drawable.triangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.triangle
        ),
        PictureItem(
            "SQUARE",
            R.drawable.square,
            randomColor,
            audio = com.electrodiligent.english.R.raw.square
        ),
        PictureItem(
            "RECTANGLE",
            R.drawable.rectangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.rectangle
        ),
        PictureItem(
            "DIAMOND",
            R.drawable.diamond,
            randomColor,
            audio = com.electrodiligent.english.R.raw.diamond
        ),
        PictureItem(
            "PENTAGON",
            R.drawable.pentagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.pentagon
        ),
        PictureItem(
            "HEXAGON",
            R.drawable.hexagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.hexagon
        ),
        PictureItem(
            name = "STAR",
            imageId = R.drawable.star,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.star
        ),
        PictureItem(
            name = "HEART", imageId = R.drawable.heart,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.heart
        )
    )
}