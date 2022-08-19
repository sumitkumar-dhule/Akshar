package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VegetablesRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "कद्दू", imageId = R.drawable.pumpkin,
            //audio = com.electrodiligent.english.R.raw.pumpkin
        ),
        PictureItem(
            "टमाटर",
            R.drawable.tomato,
            //audio = com.electrodiligent.english.R.raw.tomato
        ),
        PictureItem(
            name = "खीरा",
            imageId = R.drawable.cucumber,
            //audio = com.electrodiligent.english.R.raw.cucumber
        ),
        PictureItem(
            "प्याज़",
            R.drawable.onion,
            //audio = com.electrodiligent.english.R.raw.onion
        ),
        PictureItem(
            "लहसुन",
            R.drawable.garlic,
            //audio = com.electrodiligent.english.R.raw.garlic
        ),
        PictureItem(
            "गाजर",
            R.drawable.carrot,
            //audio = com.electrodiligent.english.R.raw.carrot
        ),
        PictureItem(
            "पालक",
            R.drawable.spinach,
            //audio = com.electrodiligent.english.R.raw.spinach
        ),
        PictureItem(
            "आलू",
            R.drawable.potato,
            //audio = com.electrodiligent.english.R.raw.potato
        ),
        PictureItem(
            "पत्ता गोभी",
            R.drawable.cabbage,
            //audio = com.electrodiligent.english.R.raw.cabbage
        ),
        PictureItem(
            name = "मूली",
            imageId = R.drawable.radish,
            //audio = com.electrodiligent.english.R.raw.radish
        ),
        PictureItem(
            name = "बैंगन", imageId = R.drawable.eggplant,
            //audio = com.electrodiligent.english.R.raw.eggplant
        ),
        PictureItem(
            name = "मशरूम", imageId = R.drawable.mushroom,
            //audio = com.electrodiligent.english.R.raw.mushroom
        ),
        PictureItem(
            name = "शिमला मिर्च", imageId = R.drawable.green_pepper,
            //audio = com.electrodiligent.english.R.raw.green_pepper
        ),
        PictureItem(
            name = "मकई", imageId = R.drawable.corn,
            //audio = com.electrodiligent.english.R.raw.corn,
        ),
        PictureItem(
            name = "फूलगोभी", imageId = R.drawable.cauliflower,
            //audio = com.electrodiligent.english.R.raw.cauliflower
        ),
        PictureItem(
            name = "लाल मिर्च", imageId = R.drawable.red_chilli,
            //audio = com.electrodiligent.english.R.raw.red_chilli
        ),
        PictureItem(
            name = "हरी मिर्च", imageId = R.drawable.green_chilli,
            //audio = com.electrodiligent.english.R.raw.green_chilli
        ),
        PictureItem(
            name = "हरी मटर", imageId = R.drawable.green_peas,
            //audio = com.electrodiligent.english.R.raw.green_peas
        )
    )
}