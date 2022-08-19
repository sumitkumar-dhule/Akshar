package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object BirdsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(

        PictureItem(
            "कौआ",
            R.drawable.crow,
           //            audio = com.electrodiligent.english.R.raw.crow
        ),
        PictureItem(
            name = "गरुड़",
            imageId = R.drawable.eagle,
           //            audio = com.electrodiligent.english.R.raw.eagle
        ),
        PictureItem(
            "राजहंस",
            R.drawable.flamingo,
           //            audio = com.electrodiligent.english.R.raw.flamingo
        ),
        PictureItem(
            "बाज",
            R.drawable.hawk,
           //            audio = com.electrodiligent.english.R.raw.hawk
        ),
        PictureItem(
            "उल्लू",
            R.drawable.owl,
           //            audio = com.electrodiligent.english.R.raw.owl
        ),
        PictureItem(
            "तोता",
            R.drawable.parrot,
           //            audio = com.electrodiligent.english.R.raw.parrot
        ),
        PictureItem(
            "मुर्गी",
            R.drawable.hen,

           //            audio = com.electrodiligent.english.R.raw.hen
        ),
        PictureItem(
            "हमिंग बर्ड",
            R.drawable.humming_bird,
           //            audio = com.electrodiligent.english.R.raw.humming_bird
        ),
        PictureItem(
            "नीलकंठ",
            R.drawable.kingfisher,
           //            audio = com.electrodiligent.english.R.raw.kingfisher
        ),
        PictureItem(
            name = "शुतुरमुर्ग",
            imageId = R.drawable.ostrich,
           //            audio = com.electrodiligent.english.R.raw.ostrich
        ),
        PictureItem(
            name = "मोर", imageId = R.drawable.peacock,
           //            audio = com.electrodiligent.english.R.raw.peacock
        ),
        PictureItem(
            name = "पेंगुइन", imageId = R.drawable.penguin,
           //            audio = com.electrodiligent.english.R.raw.penguin
        ),
        PictureItem(
            name = "हंस", imageId = R.drawable.swan,
           //            audio = com.electrodiligent.english.R.raw.swan
        ),
        PictureItem(
            name = "टर्की", imageId = R.drawable.turkey,
           //            audio = com.electrodiligent.english.R.raw.turkey
        ),
        PictureItem(
            name = "कठफोड़वा", imageId = R.drawable.woodpecker,
           //            audio = com.electrodiligent.english.R.raw.woodpecker
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi_bird,
           //            audio = com.electrodiligent.english.R.raw.kiwi_bird
        ),
        PictureItem(
            name = "कबूतर",
            imageId = R.drawable.pigeon,
           //            audio = com.electrodiligent.english.R.raw.pigeon
        )

    )
}