package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "आम", imageId = R.drawable.mango,
            // audio = com.electrodiligent.hindi.R.raw.aam
        ),
        PictureItem(
            "केला",
            R.drawable.banana,
            // audio = com.electrodiligent.hindi.R.raw.kela
        ),
        PictureItem(
            name = "चेरी",
            imageId = R.drawable.cherry,
            // audio = com.electrodiligent.hindi.R.raw.cherry
        ),
        PictureItem(
            "सेब",
            R.drawable.apple,
            // audio = com.electrodiligent.hindi.R.raw.seb
        ),
        PictureItem(
            "नारियल",
            R.drawable.coconut,
            // audio = com.electrodiligent.hindi.R.raw.nariyal
        ),
        PictureItem(
            "शरीफा",
            R.drawable.custard_apple,
            // audio = com.electrodiligent.hindi.R.raw.sharifa
        ),
        PictureItem(
            "ड्रैगन फल",
            R.drawable.dragon_fruit,
            // audio = com.electrodiligent.hindi.R.raw.dragon_fruit
        ),
        PictureItem(
            "अंजीर",
            R.drawable.fig,
            // audio = com.electrodiligent.hindi.R.raw.anjir,
        ),
        PictureItem(
            "अंगूर",
            R.drawable.grapes,
            // audio = com.electrodiligent.hindi.R.raw.angur
        ),
        PictureItem(
            "कटहल",
            R.drawable.jackfruit,
            // audio = com.electrodiligent.hindi.R.raw.katahal
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi,
            // audio = com.electrodiligent.hindi.R.raw.kiwi
        ),
        PictureItem(
            name = "संतरा", imageId = R.drawable.orange,
            // audio = com.electrodiligent.hindi.R.raw.santra
        ),
        PictureItem(
            name = "पपीता", imageId = R.drawable.papaya,
            // audio = com.electrodiligent.hindi.R.raw.papita
        ),
        PictureItem(
            name = "नाशपाती", imageId = R.drawable.pear,
            // audio = com.electrodiligent.hindi.R.raw.nashpati
        ),
        PictureItem(
            name = "अनानास", imageId = R.drawable.pineapple,
            // audio = com.electrodiligent.hindi.R.raw.ananas
        ),
        PictureItem(
            name = "अनार", imageId = R.drawable.pomegranate,
            // audio = com.electrodiligent.hindi.R.raw.anar
        ),
        PictureItem(
            name = "स्ट्रॉबेरी", imageId = R.drawable.strawberry,
            // audio = com.electrodiligent.hindi.R.raw.strawberry
        ),
        PictureItem(
            name = "तरबूज", imageId = R.drawable.watermelon,
            // audio = com.electrodiligent.hindi.R.raw.tarbuj
        ),
        PictureItem(
            name = "एवोकाडो", imageId = R.drawable.avacado,
            // audio = com.electrodiligent.hindi.R.raw.avacado
        )
    )
}