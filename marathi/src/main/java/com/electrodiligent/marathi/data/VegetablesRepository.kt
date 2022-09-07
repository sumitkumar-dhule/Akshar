package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VegetablesRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "भोपळा", imageId = R.drawable.pumpkin,
            audio = com.electrodiligent.marathi.R.raw.bhopla
        ),
        PictureItem(
            "टमाटर",
            R.drawable.tomato,
            audio = com.electrodiligent.marathi.R.raw.tamatar
        ),
        PictureItem(
            name = "काकडी",
            imageId = R.drawable.cucumber,
            audio = com.electrodiligent.marathi.R.raw.kakadi
        ),
        PictureItem(
            "कांदा",
            R.drawable.onion,
            audio = com.electrodiligent.marathi.R.raw.kanda
        ),
        PictureItem(
            "लसूण",
            R.drawable.garlic,
            audio = com.electrodiligent.marathi.R.raw.lasun
        ),
        PictureItem(
            "गाजर",
            R.drawable.carrot,
            audio = com.electrodiligent.marathi.R.raw.gajar
        ),
        PictureItem(
            "पालक",
            R.drawable.spinach,
            audio = com.electrodiligent.marathi.R.raw.palak
        ),
        PictureItem(
            "बटाटा",
            R.drawable.potato,
            audio = com.electrodiligent.marathi.R.raw.batata
        ),
        PictureItem(
            "कोबी",
            R.drawable.cabbage,
            audio = com.electrodiligent.marathi.R.raw.kobi
        ),
        PictureItem(
            name = "मुळा",
            imageId = R.drawable.radish,
            audio = com.electrodiligent.marathi.R.raw.mula
        ),
        PictureItem(
            name = "वांगं", imageId = R.drawable.eggplant,
            audio = com.electrodiligent.marathi.R.raw.vanga
        ),
        PictureItem(
            name = "मशरूम", imageId = R.drawable.mushroom,
            audio = com.electrodiligent.marathi.R.raw.mashroom
        ),
        PictureItem(
            name = "शिमला मिर्ची", imageId = R.drawable.green_pepper,
            audio = com.electrodiligent.marathi.R.raw.shimlamirchi
        ),
        PictureItem(
            name = "मका", imageId = R.drawable.corn,
            audio = com.electrodiligent.marathi.R.raw.maka,
        ),
        PictureItem(
            name = "फुलकोबी", imageId = R.drawable.cauliflower,
            audio = com.electrodiligent.marathi.R.raw.fulkobi
        ),
        PictureItem(
            name = "लाल मिरची", imageId = R.drawable.red_chilli,
            audio = com.electrodiligent.marathi.R.raw.lalmirchi
        ),
        PictureItem(
            name = "हिरवी मिरची", imageId = R.drawable.green_chilli,
            audio = com.electrodiligent.marathi.R.raw.hirvimirchi
        ),
        PictureItem(
            name = "मटार", imageId = R.drawable.green_peas,
            audio = com.electrodiligent.marathi.R.raw.matar
        )
    )
}