package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object FruitsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "आंबा", imageId = R.drawable.mango,
            audio = com.electrodiligent.marathi.R.raw.amba
        ),
        PictureItem(
            "केळी",
            R.drawable.bananas,
            audio = com.electrodiligent.marathi.R.raw.keli
        ),
        PictureItem(
            name = "चेरी",
            imageId = R.drawable.cherry,
            audio = com.electrodiligent.marathi.R.raw.cheri
        ),
        PictureItem(
            "सफरचंद",
            R.drawable.apple,
            audio = com.electrodiligent.marathi.R.raw.safarchand
        ),
        PictureItem(
            "नारळ",
            R.drawable.coconut,
            audio = com.electrodiligent.marathi.R.raw.naral
        ),
        PictureItem(
            "सीताफळ",
            R.drawable.custard_apple,
            audio = com.electrodiligent.marathi.R.raw.sitafal
        ),
        PictureItem(
            "ड्रॅगन फळ",
            R.drawable.dragon_fruit,
            audio = com.electrodiligent.marathi.R.raw.draganfal
        ),
        PictureItem(
            "अंजीर",
            R.drawable.fig,
            audio = com.electrodiligent.marathi.R.raw.anjir,
        ),
        PictureItem(
            "द्राक्षे",
            R.drawable.grapes,
            audio = com.electrodiligent.marathi.R.raw.drakshe
        ),
        PictureItem(
            "फणस",
            R.drawable.jackfruit,
            audio = com.electrodiligent.marathi.R.raw.fanas
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi,
            audio = com.electrodiligent.marathi.R.raw.kivi
        ),
        PictureItem(
            name = "संत्रा", imageId = R.drawable.orange,
            audio = com.electrodiligent.marathi.R.raw.santra
        ),
        PictureItem(
            name = "पपई", imageId = R.drawable.papaya,
            audio = com.electrodiligent.marathi.R.raw.papai
        ),
        PictureItem(
            name = "नाशपाती", imageId = R.drawable.pear,
            audio = com.electrodiligent.marathi.R.raw.nashapati
        ),
        PictureItem(
            name = "अननस", imageId = R.drawable.pineapple,
            audio = com.electrodiligent.marathi.R.raw.ananas
        ),
        PictureItem(
            name = "डाळिंब", imageId = R.drawable.pomegranate,
            audio = com.electrodiligent.marathi.R.raw.dalimba
        ),
        PictureItem(
            name = "स्ट्रॉबेरी", imageId = R.drawable.strawberry,
            audio = com.electrodiligent.marathi.R.raw.strawberry
        ),
        PictureItem(
            name = "टरबूज", imageId = R.drawable.watermelon,
            audio = com.electrodiligent.marathi.R.raw.tarbuj
        )
    )
}