package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object AnimalsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "अस्वल", imageId = R.drawable.bear,
            // audio = com.electrodiligent.hindi.R.raw.bhalu
        ),
        PictureItem(
            "माकड",
            R.drawable.monkey,
            // audio = com.electrodiligent.hindi.R.raw.bandar
        ),
        PictureItem(
            name = "म्हैस",
            imageId = R.drawable.buffalo,
            // audio = com.electrodiligent.hindi.R.raw.bhais
        ),
        PictureItem(
            "उंट",
            R.drawable.camel,
            // audio = com.electrodiligent.hindi.R.raw.oot
        ),
        PictureItem(
            "मांजर",
            R.drawable.cat,
            // audio = com.electrodiligent.hindi.R.raw.billi
        ),
        PictureItem(
            "चिंपांझी",
            R.drawable.chimpanzi,

            // audio = com.electrodiligent.hindi.R.raw.chimpanzi
        ),
        PictureItem(
            "गाय",
            R.drawable.cow,
            // audio = com.electrodiligent.hindi.R.raw.gaay
        ),
        PictureItem(
            "हरीण",
            R.drawable.deer,
            // audio = com.electrodiligent.hindi.R.raw.hiran
        ),
        PictureItem(
            "कुत्रा",
            R.drawable.dog,
            // audio = com.electrodiligent.hindi.R.raw.kutta
        ),
        PictureItem(
            name = "गाढव",
            imageId = R.drawable.donkey,
            // audio = com.electrodiligent.hindi.R.raw.gadha
        ),
        PictureItem(
            name = "हत्ती", imageId = R.drawable.elephant,
            // audio = com.electrodiligent.hindi.R.raw.hathi
        ),
        PictureItem(
            name = "कोल्हा", imageId = R.drawable.fox,
            // audio = com.electrodiligent.hindi.R.raw.lomadi
        ),
        PictureItem(
            name = "जिराफ", imageId = R.drawable.giraffe,
            // audio = com.electrodiligent.hindi.R.raw.jiraf
        ),
        PictureItem(
            name = "शेळी", imageId = R.drawable.goat,
            // audio = com.electrodiligent.hindi.R.raw.bakri
        ),
        PictureItem(
            name = "पाणघोडा", imageId = R.drawable.hippopotomous,
            // audio = com.electrodiligent.hindi.R.raw.jalhasti
        ),
        PictureItem(
            name = "घोडा", imageId = R.drawable.horse,
            // audio = com.electrodiligent.hindi.R.raw.ghoda
        ),
        PictureItem(
            name = "कांगारू", imageId = R.drawable.kangaroo,
            // audio = com.electrodiligent.hindi.R.raw.kangaru
        ),
        PictureItem(
            name = "बिबट्या", imageId = R.drawable.leopard,
            // audio = com.electrodiligent.hindi.R.raw.tendua
        ),
        PictureItem(
            name = "सिंह", imageId = R.drawable.lion,
            // audio = com.electrodiligent.hindi.R.raw.sher
        ),
        PictureItem(
            name = "पांडा", imageId = R.drawable.panda_animal,
            // audio = com.electrodiligent.hindi.R.raw.panda
        ),
        PictureItem(
            name = "डुक्कर", imageId = R.drawable.pig,
            // audio = com.electrodiligent.hindi.R.raw.suar
        ),
        PictureItem(
            name = "ससा", imageId = R.drawable.rabbit,
            // audio = com.electrodiligent.hindi.R.raw.khargosh
        ),
        PictureItem(
            name = "उंदीर", imageId = R.drawable.rat,
            // audio = com.electrodiligent.hindi.R.raw.chuha
        ),
        PictureItem(
            name = "गेंडा", imageId = R.drawable.rhinoceros,
            // audio = com.electrodiligent.hindi.R.raw.genda
        ),
        PictureItem(
            name = "मेंढ्या", imageId = R.drawable.sheep,
            // audio = com.electrodiligent.hindi.R.raw.bhed
        ),
        PictureItem(
            name = "खार", imageId = R.drawable.squirrel,
            // audio = com.electrodiligent.hindi.R.raw.gilihari
        ),
        PictureItem(
            name = "वाघ", imageId = R.drawable.tiger,
            // audio = com.electrodiligent.hindi.R.raw.bagh
        ),
        PictureItem(
            name = "झेब्रा", imageId = R.drawable.zebra,
            // audio = com.electrodiligent.hindi.R.raw.jebra
        )

    )
}