package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ShapeItem
import com.electrodiligent.core.util.RandomColor

object ShapeRepository {
    private val randomColor = RandomColor.list.random().colorValue
    val list = listOf(
        ShapeItem(
            "CIRCLE",
            R.drawable.circle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.circle
        ),
        ShapeItem(
            name = "OVAL",
            imageId = R.drawable.oval,
            randomColor,
            audio = com.electrodiligent.english.R.raw.oval
        ),
        ShapeItem(
            "TRIANGLE",
            R.drawable.triangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.triangle
        ),
        ShapeItem(
            "SQUARE",
            R.drawable.square,
            randomColor,
            audio = com.electrodiligent.english.R.raw.square
        ),
        ShapeItem(
            "RECTANGLE",
            R.drawable.rectangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.rectangle
        ),
        ShapeItem(
            "DIAMOND",
            R.drawable.diamond,
            randomColor,
            audio = com.electrodiligent.english.R.raw.diamond
        ),
        ShapeItem(
            "PENTAGON",
            R.drawable.pentagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.pentagon
        ),
        ShapeItem(
            "HEXAGON",
            R.drawable.hexagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.hexagon
        ),
        ShapeItem(
            name = "STAR",
            imageId = R.drawable.star,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.star
        ),
        ShapeItem(
            name = "HEART", imageId = R.drawable.heart,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.heart
        )
    )
}