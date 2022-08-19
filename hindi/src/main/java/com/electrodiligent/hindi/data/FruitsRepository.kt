package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "आम", imageId = R.drawable.mango,
            // audio = com.electrodiligent.english.R.raw.mango
        ),
        PictureItem(
            "केला",
            R.drawable.banana,
            // audio = com.electrodiligent.english.R.raw.banana
        ),
        PictureItem(
            name = "चेरी",
            imageId = R.drawable.cherry,
            // audio = com.electrodiligent.english.R.raw.cherry
        ),
        PictureItem(
            "सेब",
            R.drawable.apple,
            // audio = com.electrodiligent.english.R.raw.apple
        ),
        PictureItem(
            "नारियल",
            R.drawable.coconut,
            // audio = com.electrodiligent.english.R.raw.coconut
        ),
        PictureItem(
            "शरीफा",
            R.drawable.custard_apple,

            // audio = com.electrodiligent.english.R.raw.custard_apple
        ),
        PictureItem(
            "ड्रैगन फल",
            R.drawable.dragon_fruit,
            // audio = com.electrodiligent.english.R.raw.dragon_fruit
        ),
        PictureItem(
            "अंजीर",
            R.drawable.fig,
            // audio = com.electrodiligent.english.R.raw.fig,
        ),
        PictureItem(
            "अंगूर",
            R.drawable.grapes,
            // audio = com.electrodiligent.english.R.raw.grapes
        ),
        PictureItem(
            "कटहल",
            R.drawable.jackfruit,
            // audio = com.electrodiligent.english.R.raw.jackfruit
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi,
            // audio = com.electrodiligent.english.R.raw.kiwi
        ),
        PictureItem(
            name = "संतरा", imageId = R.drawable.orange,
            // audio = com.electrodiligent.english.R.raw.orange
        ),
        PictureItem(
            name = "पपीता", imageId = R.drawable.papaya,
            // audio = com.electrodiligent.english.R.raw.papaya
        ),
        PictureItem(
            name = "नाशपाती", imageId = R.drawable.pear,
            // audio = com.electrodiligent.english.R.raw.pear
        ),
        PictureItem(
            name = "अनानास", imageId = R.drawable.pineapple,
            // audio = com.electrodiligent.english.R.raw.pineapple
        ),
        PictureItem(
            name = "अनार", imageId = R.drawable.pomegranate,
            // audio = com.electrodiligent.english.R.raw.pomegranate
        ),
        PictureItem(
            name = "स्ट्रॉबेरी", imageId = R.drawable.strawberry,
            // audio = com.electrodiligent.english.R.raw.strawberry
        ),
        PictureItem(
            name = "तरबूज", imageId = R.drawable.watermelon,
            // audio = com.electrodiligent.english.R.raw.watermelon
        ),
        PictureItem(
            name = "एवोकाडो", imageId = R.drawable.avacado,
            // audio = com.electrodiligent.english.R.raw.avacado
        )
    )
}