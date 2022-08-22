package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object AnimalsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "भालू", imageId = R.drawable.bear,
            audio = com.electrodiligent.hindi.R.raw.bhalu
        ),
        PictureItem(
            "बंदर",
            R.drawable.monkey,
            audio = com.electrodiligent.hindi.R.raw.bandar
        ),
        PictureItem(
            name = "भेंस",
            imageId = R.drawable.buffalo,
            audio = com.electrodiligent.hindi.R.raw.bhais
        ),
        PictureItem(
            "ऊंट",
            R.drawable.camel,
            audio = com.electrodiligent.hindi.R.raw.oot
        ),
        PictureItem(
            "बिल्ली",
            R.drawable.cat,
            audio = com.electrodiligent.hindi.R.raw.billi
        ),
        PictureItem(
            "चिंपांज़ी",
            R.drawable.chimpanzi,

            audio = com.electrodiligent.hindi.R.raw.chimpanzi
        ),
        PictureItem(
            "गाय",
            R.drawable.cow,
            audio = com.electrodiligent.hindi.R.raw.gaay
        ),
        PictureItem(
            "हिरन",
            R.drawable.deer,
            audio = com.electrodiligent.hindi.R.raw.hiran
        ),
        PictureItem(
            "कुत्ता",
            R.drawable.dog,
            audio = com.electrodiligent.hindi.R.raw.kutta
        ),
        PictureItem(
            name = "गधा",
            imageId = R.drawable.donkey,
            audio = com.electrodiligent.hindi.R.raw.gadha
        ),
        PictureItem(
            name = "हाथी", imageId = R.drawable.elephant,
            audio = com.electrodiligent.hindi.R.raw.hathi
        ),
        PictureItem(
            name = "लोमड़ी", imageId = R.drawable.fox,
            audio = com.electrodiligent.hindi.R.raw.lomadi
        ),
        PictureItem(
            name = "जिराफ़", imageId = R.drawable.giraffe,
            audio = com.electrodiligent.hindi.R.raw.jiraf
        ),
        PictureItem(
            name = "बकरी", imageId = R.drawable.goat,
            audio = com.electrodiligent.hindi.R.raw.bakri
        ),
        PictureItem(
            name = "जलहस्ती", imageId = R.drawable.hippopotomous,
            audio = com.electrodiligent.hindi.R.raw.jalhasti
        ),
        PictureItem(
            name = "घोड़ा", imageId = R.drawable.horse,
            audio = com.electrodiligent.hindi.R.raw.ghoda
        ),
        PictureItem(
            name = "कंगारू", imageId = R.drawable.kangaroo,
            audio = com.electrodiligent.hindi.R.raw.kangaru
        ),
        PictureItem(
            name = "तेंदुआ", imageId = R.drawable.leopard,
            audio = com.electrodiligent.hindi.R.raw.tendua
        ),
        PictureItem(
            name = "शेर", imageId = R.drawable.lion,
            audio = com.electrodiligent.hindi.R.raw.sher
        ),
        PictureItem(
            name = "पांडा", imageId = R.drawable.panda_animal,
            audio = com.electrodiligent.hindi.R.raw.panda
        ),
        PictureItem(
            name = "सुअर", imageId = R.drawable.pig,
            audio = com.electrodiligent.hindi.R.raw.suar
        ),
        PictureItem(
            name = "खरगोश", imageId = R.drawable.rabbit,
            audio = com.electrodiligent.hindi.R.raw.khargosh
        ),
        PictureItem(
            name = "चूहा", imageId = R.drawable.rat,
            audio = com.electrodiligent.hindi.R.raw.chuha
        ),
        PictureItem(
            name = "गैंडा", imageId = R.drawable.rhinoceros,
            audio = com.electrodiligent.hindi.R.raw.genda
        ),
        PictureItem(
            name = "भेड़", imageId = R.drawable.sheep,
            audio = com.electrodiligent.hindi.R.raw.bhed
        ),
        PictureItem(
            name = "गिलहरी", imageId = R.drawable.squirrel,
            audio = com.electrodiligent.hindi.R.raw.gilihari
        ),
        PictureItem(
            name = "बाघ", imageId = R.drawable.tiger,
            audio = com.electrodiligent.hindi.R.raw.bagh
        ),
        PictureItem(
            name = "ज़ेबरा", imageId = R.drawable.zebra,
            audio = com.electrodiligent.hindi.R.raw.jebra
        )

    )
}