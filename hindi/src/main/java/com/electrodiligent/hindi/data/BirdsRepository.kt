package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object BirdsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(
        PictureItem(
            name = "CRANE", imageId = R.drawable.crane,
           //            audio = com.electrodiligent.english.R.raw.crane
        ),
        PictureItem(
            "CROW",
            R.drawable.crow,
           //            audio = com.electrodiligent.english.R.raw.crow
        ),
        PictureItem(
            name = "EAGLE",
            imageId = R.drawable.eagle,
           //            audio = com.electrodiligent.english.R.raw.eagle
        ),
        PictureItem(
            "FLAMINGO",
            R.drawable.flamingo,
           //            audio = com.electrodiligent.english.R.raw.flamingo
        ),
        PictureItem(
            "HAWK",
            R.drawable.hawk,
           //            audio = com.electrodiligent.english.R.raw.hawk
        ),
        PictureItem(
            "OWL",
            R.drawable.owl,
           //            audio = com.electrodiligent.english.R.raw.owl
        ),
        PictureItem(
            "PARROT",
            R.drawable.parrot,
           //            audio = com.electrodiligent.english.R.raw.parrot
        ),
        PictureItem(
            "HEN",
            R.drawable.hen,

           //            audio = com.electrodiligent.english.R.raw.hen
        ),
        PictureItem(
            "HORN BILL",
            R.drawable.hornbill,
           //            audio = com.electrodiligent.english.R.raw.hornbill
        ),
        PictureItem(
            "HUMMING BIRD",
            R.drawable.humming_bird,
           //            audio = com.electrodiligent.english.R.raw.humming_bird
        ),
        PictureItem(
            "KINGFISHER",
            R.drawable.kingfisher,
           //            audio = com.electrodiligent.english.R.raw.kingfisher
        ),
        PictureItem(
            name = "OSTRICH",
            imageId = R.drawable.ostrich,
           //            audio = com.electrodiligent.english.R.raw.ostrich
        ),
        PictureItem(
            name = "PEACOCK", imageId = R.drawable.peacock,
           //            audio = com.electrodiligent.english.R.raw.peacock
        ),
        PictureItem(
            name = "PENGUIN", imageId = R.drawable.penguin,
           //            audio = com.electrodiligent.english.R.raw.penguin
        ),
        PictureItem(
            name = "SWAN", imageId = R.drawable.swan,
           //            audio = com.electrodiligent.english.R.raw.swan
        ),
        PictureItem(
            name = "TURKEY", imageId = R.drawable.turkey,
           //            audio = com.electrodiligent.english.R.raw.turkey
        ),
        PictureItem(
            name = "WOODPECKER", imageId = R.drawable.woodpecker,
           //            audio = com.electrodiligent.english.R.raw.woodpecker
        ),
        PictureItem(
            name = "KIWI",
            imageId = R.drawable.kiwi_bird,
           //            audio = com.electrodiligent.english.R.raw.kiwi_bird
        ),
        PictureItem(
            name = "PIGEON",
            imageId = R.drawable.pigeon,
           //            audio = com.electrodiligent.english.R.raw.pigeon
        )

    )
}