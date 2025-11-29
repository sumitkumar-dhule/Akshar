package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object ProfessionsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(
        PictureItem(
            name = "CRANE", imageId = R.drawable.prof_artist,
//            audio = com.electrodiligent.english.R.raw.kevin_crane
        ),
        PictureItem(
            "CROW",
            R.drawable.prof_astronaut,
//            audio = com.electrodiligent.english.R.raw.kevin_crow
        ),
        PictureItem(
            name = "EAGLE",
            imageId = R.drawable.prof_builder,
//            audio = com.electrodiligent.english.R.raw.kevin_eagle
        ),
        PictureItem(
            "FLAMINGO",
            R.drawable.prof_chef,
//            audio = com.electrodiligent.english.R.raw.kevin_flamingo
        ),
        PictureItem(
            "HAWK",
            R.drawable.prof_dancer,
//            audio = com.electrodiligent.english.R.raw.kevin_hawk
        ),
        PictureItem(
            "OWL",
            R.drawable.prof_doctor,
//            audio = com.electrodiligent.english.R.raw.kevin_owl
        ),
        PictureItem(
            "PARROT",
            R.drawable.prof_farmer,
//            audio = com.electrodiligent.english.R.raw.kevin_parrot
        ),
        PictureItem(
            "HEN",
            R.drawable.prof_firefighter,

//            audio = com.electrodiligent.english.R.raw.kevin_hen
        ),
        PictureItem(
            "HORN BILL",
            R.drawable.prof_mechanic,
//            audio = com.electrodiligent.english.R.raw.kevin_hornbill
        ),
        PictureItem(
            "HUMMING BIRD",
            R.drawable.prof_musician,
//            audio = com.electrodiligent.english.R.raw.kevin_hummingbird
        ),
        PictureItem(
            "KINGFISHER",
            R.drawable.prof_nurse,
//            audio = com.electrodiligent.english.R.raw.kevin_kingfisher
        ),
        PictureItem(
            name = "OSTRICH",
            imageId = R.drawable.prof_pilot,
//            audio = com.electrodiligent.english.R.raw.kevin_ostrich
        ),
        PictureItem(
            name = "PEACOCK", imageId = R.drawable.prof_police_officer,
//            audio = com.electrodiligent.english.R.raw.kevin_peacock
        ),
        PictureItem(
            name = "PENGUIN", imageId = R.drawable.prof_scientist,
//            audio = com.electrodiligent.english.R.raw.kevin_penguin
        ),
        PictureItem(
            name = "SWAN", imageId = R.drawable.prof_teacher,
//            audio = com.electrodiligent.english.R.raw.kevin_swan
        )
    )
}