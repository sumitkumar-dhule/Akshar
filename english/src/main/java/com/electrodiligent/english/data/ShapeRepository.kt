package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ShapeItem

object ShapeRepository {
    val list = listOf(
       ShapeItem("CIRCLE", R.drawable.circle),
       ShapeItem("OVAL", R.drawable.oval),
       ShapeItem("TRIANGLE", R.drawable.triangle),
       ShapeItem("SQUARE", R.drawable.square),
       ShapeItem("RECTANGLE", R.drawable.rectangle),
       ShapeItem("DIAMOND", R.drawable.diamond),
       ShapeItem("PENTAGON", R.drawable.pentagon),
       ShapeItem("HEXAGON", R.drawable.hexagon),
       ShapeItem("STAR", R.drawable.star),
       ShapeItem("HEART", R.drawable.heart)
    )
}