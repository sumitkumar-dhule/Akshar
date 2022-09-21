package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object BirdsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(

        PictureItem(
            "कावळा",
            R.drawable.crow,
            audio = com.electrodiligent.marathi.R.raw.kawala
        ),
        PictureItem(
            name = "गरुड",
            imageId = R.drawable.eagle,
            audio = com.electrodiligent.marathi.R.raw.garud
        ),
        PictureItem(
            "राजहंस",
            R.drawable.flamingo,
            audio = com.electrodiligent.marathi.R.raw.rajhans
        ),
        PictureItem(
            "ससाणा",
            R.drawable.hawk,
            audio = com.electrodiligent.marathi.R.raw.sasana
        ),
        PictureItem(
            "घुबड",
            R.drawable.owl,
            audio = com.electrodiligent.marathi.R.raw.ghubal
        ),
        PictureItem(
            "पोपट",
            R.drawable.parrot,
            audio = com.electrodiligent.marathi.R.raw.popat
        ),
        PictureItem(
            "कोंबडी",
            R.drawable.hen,
            audio = com.electrodiligent.marathi.R.raw.kombadi
        ),
        PictureItem(
            "हमिंग बर्ड",
            R.drawable.humming_bird,
            audio = com.electrodiligent.marathi.R.raw.hummingbird
        ),
        PictureItem(
            "किंगफिशर",
            R.drawable.kingfisher,
            audio = com.electrodiligent.marathi.R.raw.kingfisher
        ),
        PictureItem(
            name = "शहामृग",
            imageId = R.drawable.ostrich,
            audio = com.electrodiligent.marathi.R.raw.shamrug
        ),
        PictureItem(
            name = "मोर", imageId = R.drawable.peacock,
            audio = com.electrodiligent.marathi.R.raw.mor
        ),
        PictureItem(
            name = "पेंग्विन", imageId = R.drawable.penguin,
            audio = com.electrodiligent.marathi.R.raw.penguin
        ),
        PictureItem(
            name = "हंस", imageId = R.drawable.swan,
            audio = com.electrodiligent.marathi.R.raw.hans
        ),
        PictureItem(
            name = "टर्की", imageId = R.drawable.turkey,
            audio = com.electrodiligent.marathi.R.raw.tarki
        ),
        PictureItem(
            name = "सुतारपक्षी", imageId = R.drawable.woodpecker,
            audio = com.electrodiligent.marathi.R.raw.sutarpakshi
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi_bird,
            audio = com.electrodiligent.marathi.R.raw.kivi
        ),
        PictureItem(
            name = "कबूतर",
            imageId = R.drawable.pigeon,
            audio = com.electrodiligent.marathi.R.raw.kabutar
        )
    )
}