package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.ColorUtil

object ShapeRepository {
    private val randomColor = ColorUtil.textColors.random().colorValue
    val list = listOf(
        PictureItem(
            "CIRCLE",
            R.drawable.circle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_circle
        ),
        PictureItem(
            name = "OVAL",
            imageId = R.drawable.oval,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_oval
        ),
        PictureItem(
            "TRIANGLE",
            R.drawable.triangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_triangle
        ),
        PictureItem(
            "SQUARE",
            R.drawable.square,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_square
        ),
        PictureItem(
            "RECTANGLE",
            R.drawable.rectangle,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_rectangle
        ),
        PictureItem(
            "DIAMOND",
            R.drawable.diamond,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_diamond
        ),
        PictureItem(
            "PENTAGON",
            R.drawable.pentagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_pentagon
        ),
        PictureItem(
            "HEXAGON",
            R.drawable.hexagon,
            randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_hexagon
        ),
        PictureItem(
            name = "STAR",
            imageId = R.drawable.star,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_star
        ),
        PictureItem(
            name = "HEART", imageId = R.drawable.heart,
            color = randomColor,
            audio = com.electrodiligent.english.R.raw.kevin_heart
        )
    )
}