package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "MANGO", imageId = R.drawable.mango,
            audio = com.electrodiligent.english.R.raw.kevin_mango
        ),
        PictureItem(
            "BANANA",
            R.drawable.banana,
            audio = com.electrodiligent.english.R.raw.kevin_banana
        ),
        PictureItem(
            name = "CHERRY",
            imageId = R.drawable.cherry,
            audio = com.electrodiligent.english.R.raw.kevin_cherry
        ),
        PictureItem(
            "APPLE",
            R.drawable.apple,
            audio = com.electrodiligent.english.R.raw.kevin_apple
        ),
        PictureItem(
            "COCONUT",
            R.drawable.coconut,
            audio = com.electrodiligent.english.R.raw.kevin_coconut
        ),
        PictureItem(
            "CUSTARD APPLE",
            R.drawable.custard_apple,

            audio = com.electrodiligent.english.R.raw.kevin_custard_apple
        ),
        PictureItem(
            "DRAGON FRUIT",
            R.drawable.dragon_fruit,
            audio = com.electrodiligent.english.R.raw.kevin_dragon_fruit
        ),
        PictureItem(
            "FIG",
            R.drawable.fig,
            audio = com.electrodiligent.english.R.raw.kevin_fig,
        ),
        PictureItem(
            "GRAPES",
            R.drawable.grapes,
            audio = com.electrodiligent.english.R.raw.kevin_grapes
        ),
        PictureItem(
            "JACKFRUIT",
            R.drawable.jackfruit,
            audio = com.electrodiligent.english.R.raw.kevin_jackfruit
        ),
        PictureItem(
            name = "KIWI",
            imageId = R.drawable.kiwi,
            audio = com.electrodiligent.english.R.raw.kevin_kiwi
        ),
        PictureItem(
            name = "ORANGE", imageId = R.drawable.orange,
            audio = com.electrodiligent.english.R.raw.kevin_orange
        ),
        PictureItem(
            name = "PAPAYA", imageId = R.drawable.papaya,
            audio = com.electrodiligent.english.R.raw.kevin_papaya
        ),
        PictureItem(
            name = "PEAR", imageId = R.drawable.pear,
            audio = com.electrodiligent.english.R.raw.kevin_pear
        ),
        PictureItem(
            name = "PINE-APPLE", imageId = R.drawable.pineapple,
            audio = com.electrodiligent.english.R.raw.kevin_pineapple
        ),
        PictureItem(
            name = "POMEGRANATE", imageId = R.drawable.pomegranate,
            audio = com.electrodiligent.english.R.raw.kevin_pomegranate
        ),
        PictureItem(
            name = "STRAWBERRY", imageId = R.drawable.strawberry,
            audio = com.electrodiligent.english.R.raw.kevin_strawberry
        ),
        PictureItem(
            name = "WATERMELON", imageId = R.drawable.watermelon,
            audio = com.electrodiligent.english.R.raw.kevin_watermelon
        ),
        PictureItem(
            name = "AVOCADO", imageId = R.drawable.avacado,
            audio = com.electrodiligent.english.R.raw.kevin_avacado
        )
    )
}