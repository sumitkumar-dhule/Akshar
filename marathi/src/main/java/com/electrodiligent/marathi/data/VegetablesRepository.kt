package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VegetablesRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "भोपळा", imageId = R.drawable.pumpkin,
            // audio = com.electrodiligent.hindi.R.raw.kaddu
        ),
        PictureItem(
            "टमाटर",
            R.drawable.tomato,
            // audio = com.electrodiligent.hindi.R.raw.tamatar
        ),
        PictureItem(
            name = "काकडी",
            imageId = R.drawable.cucumber,
            // audio = com.electrodiligent.hindi.R.raw.khira
        ),
        PictureItem(
            "कांदा",
            R.drawable.onion,
            // audio = com.electrodiligent.hindi.R.raw.pyaj
        ),
        PictureItem(
            "लसूण",
            R.drawable.garlic,
            // audio = com.electrodiligent.hindi.R.raw.lehsoon
        ),
        PictureItem(
            "गाजर",
            R.drawable.carrot,
            // audio = com.electrodiligent.hindi.R.raw.gajar
        ),
        PictureItem(
            "पालक",
            R.drawable.spinach,
            // audio = com.electrodiligent.hindi.R.raw.palak
        ),
        PictureItem(
            "बटाटा",
            R.drawable.potato,
            // audio = com.electrodiligent.hindi.R.raw.aloo
        ),
        PictureItem(
            "कोबी",
            R.drawable.cabbage,
            // audio = com.electrodiligent.hindi.R.raw.pattagobhi
        ),
        PictureItem(
            name = "मुळा",
            imageId = R.drawable.radish,
            // audio = com.electrodiligent.hindi.R.raw.muli
        ),
        PictureItem(
            name = "वांगं", imageId = R.drawable.eggplant,
            // audio = com.electrodiligent.hindi.R.raw.baigan
        ),
        PictureItem(
            name = "मशरूम", imageId = R.drawable.mushroom,
            // audio = com.electrodiligent.hindi.R.raw.mashroom
        ),
        PictureItem(
            name = "शिमला मिर्ची", imageId = R.drawable.green_pepper,
            // audio = com.electrodiligent.hindi.R.raw.simla_mirch
        ),
        PictureItem(
            name = "मका", imageId = R.drawable.corn,
            // audio = com.electrodiligent.hindi.R.raw.makai,
        ),
        PictureItem(
            name = "फुलकोबी", imageId = R.drawable.cauliflower,
            // audio = com.electrodiligent.hindi.R.raw.fulgobhi
        ),
        PictureItem(
            name = "लाल मिरची", imageId = R.drawable.red_chilli,
            // audio = com.electrodiligent.hindi.R.raw.lal_mirch
        ),
        PictureItem(
            name = "हिरवी मिरची", imageId = R.drawable.green_chilli,
            // audio = com.electrodiligent.hindi.R.raw.hari_mirch
        ),
        PictureItem(
            name = "मटार", imageId = R.drawable.green_peas,
            // audio = com.electrodiligent.hindi.R.raw.hari_matar
        )
    )
}