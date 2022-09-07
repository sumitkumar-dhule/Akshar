package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object AnimalsRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "अस्वल", imageId = R.drawable.bear,
            audio = com.electrodiligent.marathi.R.raw.aswal
        ),
        PictureItem(
            "माकड",
            R.drawable.monkey,
            audio = com.electrodiligent.marathi.R.raw.makad
        ),
        PictureItem(
            name = "म्हैस",
            imageId = R.drawable.buffalo,
            audio = com.electrodiligent.marathi.R.raw.mhais
        ),
        PictureItem(
            "उंट",
            R.drawable.camel,
            audio = com.electrodiligent.marathi.R.raw.unta
        ),
        PictureItem(
            "मांजर",
            R.drawable.cat,
            audio = com.electrodiligent.marathi.R.raw.manjar
        ),
        PictureItem(
            "चिंपांझी",
            R.drawable.chimpanzi,

            audio = com.electrodiligent.marathi.R.raw.chimpazi
        ),
        PictureItem(
            "गाय",
            R.drawable.cow,
            audio = com.electrodiligent.marathi.R.raw.gaay
        ),
        PictureItem(
            "हरीण",
            R.drawable.deer,
            audio = com.electrodiligent.marathi.R.raw.harin
        ),
        PictureItem(
            "कुत्रा",
            R.drawable.dog,
            audio = com.electrodiligent.marathi.R.raw.kutra
        ),
        PictureItem(
            name = "गाढव",
            imageId = R.drawable.donkey,
            audio = com.electrodiligent.marathi.R.raw.gadhaw
        ),
        PictureItem(
            name = "हत्ती", imageId = R.drawable.elephant,
            audio = com.electrodiligent.marathi.R.raw.hatti
        ),
        PictureItem(
            name = "कोल्हा", imageId = R.drawable.fox,
            audio = com.electrodiligent.marathi.R.raw.kolha
        ),
        PictureItem(
            name = "जिराफ", imageId = R.drawable.giraffe,
            audio = com.electrodiligent.marathi.R.raw.jiraf
        ),
        PictureItem(
            name = "शेळी", imageId = R.drawable.goat,
            audio = com.electrodiligent.marathi.R.raw.sheli
        ),
        PictureItem(
            name = "पाणघोडा", imageId = R.drawable.hippopotomous,
            audio = com.electrodiligent.marathi.R.raw.panghoda
        ),
        PictureItem(
            name = "घोडा", imageId = R.drawable.horse,
            audio = com.electrodiligent.marathi.R.raw.ghoda
        ),
        PictureItem(
            name = "कांगारू", imageId = R.drawable.kangaroo,
            audio = com.electrodiligent.marathi.R.raw.kangaroo
        ),
        PictureItem(
            name = "बिबट्या", imageId = R.drawable.leopard,
            audio = com.electrodiligent.marathi.R.raw.bibtya
        ),
        PictureItem(
            name = "सिंह", imageId = R.drawable.lion,
            audio = com.electrodiligent.marathi.R.raw.sinha
        ),
        PictureItem(
            name = "पांडा", imageId = R.drawable.panda_animal,
            audio = com.electrodiligent.marathi.R.raw.panda
        ),
        PictureItem(
            name = "डुक्कर", imageId = R.drawable.pig,
            audio = com.electrodiligent.marathi.R.raw.dukkar
        ),
        PictureItem(
            name = "ससा", imageId = R.drawable.rabbit,
            audio = com.electrodiligent.marathi.R.raw.sasa
        ),
        PictureItem(
            name = "उंदीर", imageId = R.drawable.rat,
            audio = com.electrodiligent.marathi.R.raw.undir
        ),
        PictureItem(
            name = "गेंडा", imageId = R.drawable.rhinoceros,
            audio = com.electrodiligent.marathi.R.raw.genda
        ),
        PictureItem(
            name = "मेंढी", imageId = R.drawable.sheep,
            audio = com.electrodiligent.marathi.R.raw.mendhi
        ),
        PictureItem(
            name = "खार", imageId = R.drawable.squirrel,
            audio = com.electrodiligent.marathi.R.raw.khar
        ),
        PictureItem(
            name = "वाघ", imageId = R.drawable.tiger,
            audio = com.electrodiligent.marathi.R.raw.vagh
        ),
        PictureItem(
            name = "झेब्रा", imageId = R.drawable.zebra,
            audio = com.electrodiligent.marathi.R.raw.zebra
        )

    )
}