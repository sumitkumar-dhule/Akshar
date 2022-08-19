package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "MANGO", imageId = R.drawable.mango,
            // audio = com.electrodiligent.english.R.raw.mango
        ),
        PictureItem(
            "BANANA",
            R.drawable.banana,
            // audio = com.electrodiligent.english.R.raw.banana
        ),
        PictureItem(
            name = "CHERRY",
            imageId = R.drawable.cherry,
            // audio = com.electrodiligent.english.R.raw.cherry
        ),
        PictureItem(
            "APPLE",
            R.drawable.apple,
            // audio = com.electrodiligent.english.R.raw.apple
        ),
        PictureItem(
            "COCONUT",
            R.drawable.coconut,
            // audio = com.electrodiligent.english.R.raw.coconut
        ),
        PictureItem(
            "CUSTARD APPLE",
            R.drawable.custard_apple,

            // audio = com.electrodiligent.english.R.raw.custard_apple
        ),
        PictureItem(
            "DRAGON FRUIT",
            R.drawable.dragon_fruit,
            // audio = com.electrodiligent.english.R.raw.dragon_fruit
        ),
        PictureItem(
            "FIG",
            R.drawable.fig,
            // audio = com.electrodiligent.english.R.raw.fig,
        ),
        PictureItem(
            "GRAPES",
            R.drawable.grapes,
            // audio = com.electrodiligent.english.R.raw.grapes
        ),
        PictureItem(
            "JACKFRUIT",
            R.drawable.jackfruit,
            // audio = com.electrodiligent.english.R.raw.jackfruit
        ),
        PictureItem(
            name = "KIWI",
            imageId = R.drawable.kiwi,
            // audio = com.electrodiligent.english.R.raw.kiwi
        ),
        PictureItem(
            name = "ORANGE", imageId = R.drawable.orange,
            // audio = com.electrodiligent.english.R.raw.orange
        ),
        PictureItem(
            name = "PAPAYA", imageId = R.drawable.papaya,
            // audio = com.electrodiligent.english.R.raw.papaya
        ),
        PictureItem(
            name = "PEAR", imageId = R.drawable.pear,
            // audio = com.electrodiligent.english.R.raw.pear
        ),
        PictureItem(
            name = "PINE-APPLE", imageId = R.drawable.pineapple,
            // audio = com.electrodiligent.english.R.raw.pineapple
        ),
        PictureItem(
            name = "POMEGRANATE", imageId = R.drawable.pomegranate,
            // audio = com.electrodiligent.english.R.raw.pomegranate
        ),
        PictureItem(
            name = "STRAWBERRY", imageId = R.drawable.strawberry,
            // audio = com.electrodiligent.english.R.raw.strawberry
        ),
        PictureItem(
            name = "WATERMELON", imageId = R.drawable.watermelon,
            // audio = com.electrodiligent.english.R.raw.watermelon
        ),
        PictureItem(
            name = "AVOCADO", imageId = R.drawable.avacado,
            // audio = com.electrodiligent.english.R.raw.avacado
        )
    )
}