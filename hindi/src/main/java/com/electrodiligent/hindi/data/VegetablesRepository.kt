package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VegetablesRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "कद्दू", imageId = R.drawable.pumpkin,
            audio = com.electrodiligent.hindi.R.raw.kaddu
        ),
        PictureItem(
            "टमाटर",
            R.drawable.tomato,
            audio = com.electrodiligent.hindi.R.raw.tamatar
        ),
        PictureItem(
            name = "खीरा",
            imageId = R.drawable.cucumber,
            audio = com.electrodiligent.hindi.R.raw.khira
        ),
        PictureItem(
            "प्याज़",
            R.drawable.onion,
            audio = com.electrodiligent.hindi.R.raw.pyaj
        ),
        PictureItem(
            "लहसुन",
            R.drawable.garlic,
            audio = com.electrodiligent.hindi.R.raw.lehsoon
        ),
        PictureItem(
            "गाजर",
            R.drawable.carrot,
            audio = com.electrodiligent.hindi.R.raw.gajar
        ),
        PictureItem(
            "पालक",
            R.drawable.spinach,
            audio = com.electrodiligent.hindi.R.raw.palak
        ),
        PictureItem(
            "आलू",
            R.drawable.potato,
            audio = com.electrodiligent.hindi.R.raw.aloo
        ),
        PictureItem(
            "पत्ता गोभी",
            R.drawable.cabbage,
            audio = com.electrodiligent.hindi.R.raw.pattagobhi
        ),
        PictureItem(
            name = "मूली",
            imageId = R.drawable.radish,
            audio = com.electrodiligent.hindi.R.raw.muli
        ),
        PictureItem(
            name = "बैंगन", imageId = R.drawable.eggplant,
            audio = com.electrodiligent.hindi.R.raw.baigan
        ),
        PictureItem(
            name = "मशरूम", imageId = R.drawable.mushroom,
            audio = com.electrodiligent.hindi.R.raw.mashroom
        ),
        PictureItem(
            name = "शिमला मिर्च", imageId = R.drawable.green_pepper,
            audio = com.electrodiligent.hindi.R.raw.simla_mirch
        ),
        PictureItem(
            name = "मकई", imageId = R.drawable.corn,
            audio = com.electrodiligent.hindi.R.raw.makai,
        ),
        PictureItem(
            name = "फूलगोभी", imageId = R.drawable.cauliflower,
            audio = com.electrodiligent.hindi.R.raw.fulgobhi
        ),
        PictureItem(
            name = "लाल मिर्च", imageId = R.drawable.red_chilli,
            audio = com.electrodiligent.hindi.R.raw.lal_mirch
        ),
        PictureItem(
            name = "हरी मिर्च", imageId = R.drawable.green_chilli,
            audio = com.electrodiligent.hindi.R.raw.hari_mirch
        ),
        PictureItem(
            name = "हरी मटर", imageId = R.drawable.green_peas,
            audio = com.electrodiligent.hindi.R.raw.hari_matar
        )
    )
}