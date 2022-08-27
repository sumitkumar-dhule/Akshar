package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "आंबा", imageId = R.drawable.mango,
            // audio = com.electrodiligent.hindi.R.raw.aam
        ),
        PictureItem(
            "केळ",
            R.drawable.banana,
            // audio = com.electrodiligent.hindi.R.raw.kela
        ),
        PictureItem(
            name = "चेरी",
            imageId = R.drawable.cherry,
            // audio = com.electrodiligent.hindi.R.raw.cherry
        ),
        PictureItem(
            "सफरचंद",
            R.drawable.apple,
            // audio = com.electrodiligent.hindi.R.raw.seb
        ),
        PictureItem(
            "नारळ",
            R.drawable.coconut,
            // audio = com.electrodiligent.hindi.R.raw.nariyal
        ),
        PictureItem(
            "सीताफळ",
            R.drawable.custard_apple,
            // audio = com.electrodiligent.hindi.R.raw.sharifa
        ),
        PictureItem(
            "ड्रॅगन फळ",
            R.drawable.dragon_fruit,
            // audio = com.electrodiligent.hindi.R.raw.dragon_fruit
        ),
        PictureItem(
            "अंजीर",
            R.drawable.fig,
            // audio = com.electrodiligent.hindi.R.raw.anjir,
        ),
        PictureItem(
            "द्राक्षे",
            R.drawable.grapes,
            // audio = com.electrodiligent.hindi.R.raw.angur
        ),
        PictureItem(
            "फणस",
            R.drawable.jackfruit,
            // audio = com.electrodiligent.hindi.R.raw.katahal
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi,
            // audio = com.electrodiligent.hindi.R.raw.kiwi
        ),
        PictureItem(
            name = "संत्रा", imageId = R.drawable.orange,
            // audio = com.electrodiligent.hindi.R.raw.santra
        ),
        PictureItem(
            name = "पपई", imageId = R.drawable.papaya,
            // audio = com.electrodiligent.hindi.R.raw.papita
        ),
        PictureItem(
            name = "नाशपाती", imageId = R.drawable.pear,
            // audio = com.electrodiligent.hindi.R.raw.nashpati
        ),
        PictureItem(
            name = "अननस", imageId = R.drawable.pineapple,
            // audio = com.electrodiligent.hindi.R.raw.ananas
        ),
        PictureItem(
            name = "डाळिंब", imageId = R.drawable.pomegranate,
            // audio = com.electrodiligent.hindi.R.raw.anar
        ),
        PictureItem(
            name = "स्ट्रॉबेरी", imageId = R.drawable.strawberry,
            // audio = com.electrodiligent.hindi.R.raw.strawberry
        ),
        PictureItem(
            name = "टरबूज", imageId = R.drawable.watermelon,
            // audio = com.electrodiligent.hindi.R.raw.tarbuj
        )
    )
}