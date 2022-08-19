package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object AnimalsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "भालू", imageId = R.drawable.bear,
           //            audio = com.electrodiligent.english.R.raw.bear
        ),
        PictureItem(
            "बंदर",
            R.drawable.monkey,
           //            audio = com.electrodiligent.english.R.raw.monkey
        ),
        PictureItem(
            name = "भेंस",
            imageId = R.drawable.buffalo,
           //            audio = com.electrodiligent.english.R.raw.buffalo
        ),
        PictureItem(
            "ऊंट",
            R.drawable.camel,
           //            audio = com.electrodiligent.english.R.raw.camel
        ),
        PictureItem(
            "बिल्ली",
            R.drawable.cat,
           //            audio = com.electrodiligent.english.R.raw.cat
        ),
        PictureItem(
            "चिंपांज़ी",
            R.drawable.chimpanzi,

           //            audio = com.electrodiligent.english.R.raw.chimpanzi
        ),
        PictureItem(
            "गाय",
            R.drawable.cow,
           //            audio = com.electrodiligent.english.R.raw.cow
        ),
        PictureItem(
            "हिरन",
            R.drawable.deer,
           //            audio = com.electrodiligent.english.R.raw.deer
        ),
        PictureItem(
            "कुत्ता",
            R.drawable.dog,
           //            audio = com.electrodiligent.english.R.raw.dog
        ),
        PictureItem(
            name = "गधा",
            imageId = R.drawable.donkey,
           //            audio = com.electrodiligent.english.R.raw.donkey
        ),
        PictureItem(
            name = "हाथी", imageId = R.drawable.elephant,
           //            audio = com.electrodiligent.english.R.raw.elephant
        ),
        PictureItem(
            name = "लोमड़ी", imageId = R.drawable.fox,
           //            audio = com.electrodiligent.english.R.raw.fox
        ),
        PictureItem(
            name = "जिराफ़", imageId = R.drawable.giraffe,
           //            audio = com.electrodiligent.english.R.raw.giraffe
        ),
        PictureItem(
            name = "बकरी", imageId = R.drawable.goat,
           //            audio = com.electrodiligent.english.R.raw.goat
        ),
        PictureItem(
            name = "जलहस्ती", imageId = R.drawable.hippopotomous,
           //            audio = com.electrodiligent.english.R.raw.hippopotomous
        ),
        PictureItem(
            name = "घोड़ा", imageId = R.drawable.horse,
           //            audio = com.electrodiligent.english.R.raw.horse
        ),
        PictureItem(
            name = "कंगारू", imageId = R.drawable.kangaroo,
           //            audio = com.electrodiligent.english.R.raw.kangaroo
        ),
        PictureItem(
            name = "तेंदुआ", imageId = R.drawable.leopard,
           //            audio = com.electrodiligent.english.R.raw.leopard
        ),
        PictureItem(
            name = "सिंह", imageId = R.drawable.lion,
           //            audio = com.electrodiligent.english.R.raw.lion
        ),
        PictureItem(
            name = "पांडा", imageId = R.drawable.panda_animal,
           //            audio = com.electrodiligent.english.R.raw.panda
        ),
        PictureItem(
            name = "सुअर", imageId = R.drawable.pig,
           //            audio = com.electrodiligent.english.R.raw.pig
        ),
        PictureItem(
            name = "खरगोश", imageId = R.drawable.rabbit,
           //            audio = com.electrodiligent.english.R.raw.rabbit
        ),
        PictureItem(
            name = "चूहा", imageId = R.drawable.rat,
           //            audio = com.electrodiligent.english.R.raw.rat
        ),
        PictureItem(
            name = "गैंडा", imageId = R.drawable.rhinoceros,
           //            audio = com.electrodiligent.english.R.raw.rhinoceros
        ),
        PictureItem(
            name = "भेड़", imageId = R.drawable.sheep,
           //            audio = com.electrodiligent.english.R.raw.sheep
        ),
        PictureItem(
            name = "गिलहरी", imageId = R.drawable.squirrel,
           //            audio = com.electrodiligent.english.R.raw.squirrel
        ),
        PictureItem(
            name = "बाघ", imageId = R.drawable.tiger,
           //            audio = com.electrodiligent.english.R.raw.tiger
        ),
        PictureItem(
            name = "ज़ेबरा", imageId = R.drawable.zebra,
           //            audio = com.electrodiligent.english.R.raw.zebra
        )

    )
}