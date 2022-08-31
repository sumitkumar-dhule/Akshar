package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VegetablesRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "PUMPKIN", imageId = R.drawable.pumpkin,
            audio = com.electrodiligent.english.R.raw.kevin_pumpkin
        ),
        PictureItem(
            "TOMATO",
            R.drawable.tomato,
            audio = com.electrodiligent.english.R.raw.kevin_tomato
        ),
        PictureItem(
            name = "CUCUMBER",
            imageId = R.drawable.cucumber,
            audio = com.electrodiligent.english.R.raw.kevin_cucumber
        ),
        PictureItem(
            "ONION",
            R.drawable.onion,
            audio = com.electrodiligent.english.R.raw.kevin_onion
        ),
        PictureItem(
            "GARLIC",
            R.drawable.garlic,
            audio = com.electrodiligent.english.R.raw.kevin_garlic
        ),
        PictureItem(
            "CARROT",
            R.drawable.carrot,
            audio = com.electrodiligent.english.R.raw.kevin_carrot
        ),
        PictureItem(
            "SPINACH",
            R.drawable.spinach,
            audio = com.electrodiligent.english.R.raw.kevin_spinach
        ),
        PictureItem(
            "POTATO",
            R.drawable.potato,
            audio = com.electrodiligent.english.R.raw.kevin_potato
        ),
        PictureItem(
            "CABBAGE",
            R.drawable.cabbage,
            audio = com.electrodiligent.english.R.raw.kevin_cabbage
        ),
        PictureItem(
            name = "RADISH",
            imageId = R.drawable.radish,
            audio = com.electrodiligent.english.R.raw.kevin_radish
        ),
        PictureItem(
            name = "EGGPLANT", imageId = R.drawable.eggplant,
            audio = com.electrodiligent.english.R.raw.kevin_eggplant
        ),
        PictureItem(
            name = "MUSHROOM", imageId = R.drawable.mushroom,
            audio = com.electrodiligent.english.R.raw.kevin_mushroom
        ),
        PictureItem(
            name = "YELLOW PEPPER", imageId = R.drawable.yellow_pepper,
            audio = com.electrodiligent.english.R.raw.kevin_yellow_pepper
        ),
        PictureItem(
            name = "RED PEPPER", imageId = R.drawable.red_pepper,
            audio = com.electrodiligent.english.R.raw.kevin_red_pepper
        ),
        PictureItem(
            name = "GREEN PEPPER", imageId = R.drawable.green_pepper,
            audio = com.electrodiligent.english.R.raw.kevin_green_pepper
        ),
        PictureItem(
            name = "CORN", imageId = R.drawable.corn,
            audio = com.electrodiligent.english.R.raw.kevin_corn,
        ),
        PictureItem(
            name = "CAULIFLOWER", imageId = R.drawable.cauliflower,
            audio = com.electrodiligent.english.R.raw.kevin_cauliflower
        ),
        PictureItem(
            name = "RED CHILLI", imageId = R.drawable.red_chilli,
            audio = com.electrodiligent.english.R.raw.kevin_red_chilli
        ),
        PictureItem(
            name = "GREEN CHILLI", imageId = R.drawable.green_chilli,
            audio = com.electrodiligent.english.R.raw.kevin_green_chilli
        ),
        PictureItem(
            name = "GREEN PEAS", imageId = R.drawable.green_peas,
            audio = com.electrodiligent.english.R.raw.kevin_green_peas
        )
    )
}