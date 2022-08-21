package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object BirdsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(

        PictureItem(
            "कौआ",
            R.drawable.crow,
            audio = com.electrodiligent.hindi.R.raw.kauaa
        ),
        PictureItem(
            name = "गरुड़",
            imageId = R.drawable.eagle,
            audio = com.electrodiligent.hindi.R.raw.garud
        ),
        PictureItem(
            "राजहंस",
            R.drawable.flamingo,
            audio = com.electrodiligent.hindi.R.raw.rajhans
        ),
        PictureItem(
            "बाज",
            R.drawable.hawk,
            audio = com.electrodiligent.hindi.R.raw.baaz
        ),
        PictureItem(
            "उल्लू",
            R.drawable.owl,
            audio = com.electrodiligent.hindi.R.raw.ullu
        ),
        PictureItem(
            "तोता",
            R.drawable.parrot,
            audio = com.electrodiligent.hindi.R.raw.tota
        ),
        PictureItem(
            "मुर्गी",
            R.drawable.hen,
            audio = com.electrodiligent.hindi.R.raw.murgi
        ),
        PictureItem(
            "हमिंग बर्ड",
            R.drawable.humming_bird,
            audio = com.electrodiligent.hindi.R.raw.hummingbird
        ),
        PictureItem(
            "नीलकंठ",
            R.drawable.kingfisher,
            audio = com.electrodiligent.hindi.R.raw.nilkanth
        ),
        PictureItem(
            name = "शुतुरमुर्ग",
            imageId = R.drawable.ostrich,
            audio = com.electrodiligent.hindi.R.raw.shururmurg
        ),
        PictureItem(
            name = "मोर", imageId = R.drawable.peacock,
            audio = com.electrodiligent.hindi.R.raw.mor
        ),
        PictureItem(
            name = "पेंगुइन", imageId = R.drawable.penguin,
            audio = com.electrodiligent.hindi.R.raw.pengine
        ),
        PictureItem(
            name = "हंस", imageId = R.drawable.swan,
            audio = com.electrodiligent.hindi.R.raw.hans
        ),
        PictureItem(
            name = "टर्की", imageId = R.drawable.turkey,
            audio = com.electrodiligent.hindi.R.raw.turkey
        ),
        PictureItem(
            name = "कठफोड़वा", imageId = R.drawable.woodpecker,
            audio = com.electrodiligent.hindi.R.raw.kathfodwa
        ),
        PictureItem(
            name = "कीवी",
            imageId = R.drawable.kiwi_bird,
            audio = com.electrodiligent.hindi.R.raw.kiwi
        ),
        PictureItem(
            name = "कबूतर",
            imageId = R.drawable.pigeon,
            audio = com.electrodiligent.hindi.R.raw.kabutar
        )
    )
}