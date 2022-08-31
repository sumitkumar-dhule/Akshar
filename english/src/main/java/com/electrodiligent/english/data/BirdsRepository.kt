package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object BirdsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(
        PictureItem(
            name = "CRANE", imageId = R.drawable.crane,
            audio = com.electrodiligent.english.R.raw.kevin_crane
        ),
        PictureItem(
            "CROW",
            R.drawable.crow,
            audio = com.electrodiligent.english.R.raw.kevin_crow
        ),
        PictureItem(
            name = "EAGLE",
            imageId = R.drawable.eagle,
            audio = com.electrodiligent.english.R.raw.kevin_eagle
        ),
        PictureItem(
            "FLAMINGO",
            R.drawable.flamingo,
            audio = com.electrodiligent.english.R.raw.kevin_flamingo
        ),
        PictureItem(
            "HAWK",
            R.drawable.hawk,
            audio = com.electrodiligent.english.R.raw.kevin_hawk
        ),
        PictureItem(
            "OWL",
            R.drawable.owl,
            audio = com.electrodiligent.english.R.raw.kevin_owl
        ),
        PictureItem(
            "PARROT",
            R.drawable.parrot,
            audio = com.electrodiligent.english.R.raw.kevin_parrot
        ),
        PictureItem(
            "HEN",
            R.drawable.hen,

            audio = com.electrodiligent.english.R.raw.kevin_hen
        ),
        PictureItem(
            "HORN BILL",
            R.drawable.hornbill,
            audio = com.electrodiligent.english.R.raw.kevin_hornbill
        ),
        PictureItem(
            "HUMMING BIRD",
            R.drawable.humming_bird,
            audio = com.electrodiligent.english.R.raw.kevin_hummingbird
        ),
        PictureItem(
            "KINGFISHER",
            R.drawable.kingfisher,
            audio = com.electrodiligent.english.R.raw.kevin_kingfisher
        ),
        PictureItem(
            name = "OSTRICH",
            imageId = R.drawable.ostrich,
            audio = com.electrodiligent.english.R.raw.kevin_ostrich
        ),
        PictureItem(
            name = "PEACOCK", imageId = R.drawable.peacock,
            audio = com.electrodiligent.english.R.raw.kevin_peacock
        ),
        PictureItem(
            name = "PENGUIN", imageId = R.drawable.penguin,
            audio = com.electrodiligent.english.R.raw.kevin_penguin
        ),
        PictureItem(
            name = "SWAN", imageId = R.drawable.swan,
            audio = com.electrodiligent.english.R.raw.kevin_swan
        ),
        PictureItem(
            name = "TURKEY", imageId = R.drawable.turkey,
            audio = com.electrodiligent.english.R.raw.kevin_turkey
        ),
        PictureItem(
            name = "WOODPECKER", imageId = R.drawable.woodpecker,
            audio = com.electrodiligent.english.R.raw.kevin_woodpecker
        ),
        PictureItem(
            name = "KIWI",
            imageId = R.drawable.kiwi_bird,
            audio = com.electrodiligent.english.R.raw.kevin_kiwi
        ),
        PictureItem(
            name = "PIGEON",
            imageId = R.drawable.pigeon,
            audio = com.electrodiligent.english.R.raw.kevin_pigeon
        )

    )
}