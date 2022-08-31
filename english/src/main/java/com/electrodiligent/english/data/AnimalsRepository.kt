package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object AnimalsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "BEAR", imageId = R.drawable.bear,
            audio = com.electrodiligent.english.R.raw.kevin_bear
        ),
        PictureItem(
            "MONKEY",
            R.drawable.monkey,
            audio = com.electrodiligent.english.R.raw.kevin_monkey
        ),
        PictureItem(
            name = "BUFFALO",
            imageId = R.drawable.buffalo,
            audio = com.electrodiligent.english.R.raw.kevin_buffalo
        ),
        PictureItem(
            "CAMEL",
            R.drawable.camel,
            audio = com.electrodiligent.english.R.raw.kevin_camel
        ),
        PictureItem(
            "CAT",
            R.drawable.cat,
            audio = com.electrodiligent.english.R.raw.kevin_cat
        ),
        PictureItem(
            "CHIMPANZEE",
            R.drawable.chimpanzi,

            audio = com.electrodiligent.english.R.raw.kevin_chimpanzi
        ),
        PictureItem(
            "COW",
            R.drawable.cow,
            audio = com.electrodiligent.english.R.raw.kevin_cow
        ),
        PictureItem(
            "DEER",
            R.drawable.deer,
            audio = com.electrodiligent.english.R.raw.kevin_deer
        ),
        PictureItem(
            "DOG",
            R.drawable.dog,
            audio = com.electrodiligent.english.R.raw.kevin_dog
        ),
        PictureItem(
            name = "DONKEY",
            imageId = R.drawable.donkey,
            audio = com.electrodiligent.english.R.raw.kevin_donkey
        ),
        PictureItem(
            name = "ELEPHANT", imageId = R.drawable.elephant,
            audio = com.electrodiligent.english.R.raw.kevin_elephant
        ),
        PictureItem(
            name = "FOX", imageId = R.drawable.fox,
            audio = com.electrodiligent.english.R.raw.kevin_fox
        ),
        PictureItem(
            name = "GIRAFFE", imageId = R.drawable.giraffe,
            audio = com.electrodiligent.english.R.raw.kevin_giraffe
        ),
        PictureItem(
            name = "GOAT", imageId = R.drawable.goat,
            audio = com.electrodiligent.english.R.raw.kevin_goat
        ),
        PictureItem(
            name = "HIPPOPOTAMUS", imageId = R.drawable.hippopotomous,
            audio = com.electrodiligent.english.R.raw.kevin_hippopotomous
        ),
        PictureItem(
            name = "HORSE", imageId = R.drawable.horse,
            audio = com.electrodiligent.english.R.raw.kevin_horse
        ),
        PictureItem(
            name = "KANGAROO", imageId = R.drawable.kangaroo,
            audio = com.electrodiligent.english.R.raw.kevin_kangaroo
        ),
        PictureItem(
            name = "LEOPARD", imageId = R.drawable.leopard,
            audio = com.electrodiligent.english.R.raw.kevin_leopard
        ),
        PictureItem(
            name = "LION", imageId = R.drawable.lion,
            audio = com.electrodiligent.english.R.raw.kevin_lion
        ),
        PictureItem(
            name = "PANDA", imageId = R.drawable.panda_animal,
            audio = com.electrodiligent.english.R.raw.kevin_panda
        ),
        PictureItem(
            name = "PIG", imageId = R.drawable.pig,
            audio = com.electrodiligent.english.R.raw.kevin_pig
        ),
        PictureItem(
            name = "RABBIT", imageId = R.drawable.rabbit,
            audio = com.electrodiligent.english.R.raw.kevin_rabbit
        ),
        PictureItem(
            name = "RAT", imageId = R.drawable.rat,
            audio = com.electrodiligent.english.R.raw.kevin_rat
        ),
        PictureItem(
            name = "RHINOCEROS", imageId = R.drawable.rhinoceros,
            audio = com.electrodiligent.english.R.raw.kevin_rhinoceros
        ),
        PictureItem(
            name = "SHEEP", imageId = R.drawable.sheep,
            audio = com.electrodiligent.english.R.raw.kevin_sheep
        ),
        PictureItem(
            name = "SQUIRREL", imageId = R.drawable.squirrel,
            audio = com.electrodiligent.english.R.raw.kevin_squirrel
        ),
        PictureItem(
            name = "TIGER", imageId = R.drawable.tiger,
            audio = com.electrodiligent.english.R.raw.kevin_tiger
        ),
        PictureItem(
            name = "ZEBRA", imageId = R.drawable.zebra,
            audio = com.electrodiligent.english.R.raw.kevin_zebra
        )

    )
}