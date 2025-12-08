package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object ProfessionsRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(
        PictureItem(
            name = "ARTIST ", imageId = R.drawable.prof_artist,
            audio = com.electrodiligent.english.R.raw.artist
        ),
        PictureItem(
            "ASTRONAUT",
            R.drawable.prof_astronaut,
            audio = com.electrodiligent.english.R.raw.astronaut
        ),
        PictureItem(
            name = "BUILDER",
            imageId = R.drawable.prof_builder,
            audio = com.electrodiligent.english.R.raw.builder
        ),
        PictureItem(
            "CHEF",
            R.drawable.prof_chef,
            audio = com.electrodiligent.english.R.raw.chef
        ),
        PictureItem(
            "DANCER",
            R.drawable.prof_dancer,
            audio = com.electrodiligent.english.R.raw.dancer
        ),
        PictureItem(
            "DOCTOR",
            R.drawable.prof_doctor,
            audio = com.electrodiligent.english.R.raw.doctor
        ),
        PictureItem(
            "FARMER",
            R.drawable.prof_farmer,
            audio = com.electrodiligent.english.R.raw.farmer
        ),
        PictureItem(
            "FIREFIGHTER",
            R.drawable.prof_firefighter,
            audio = com.electrodiligent.english.R.raw.firefighter
        ),
        PictureItem(
            "MECHANIC",
            R.drawable.prof_mechanic,
            audio = com.electrodiligent.english.R.raw.mechanic
        ),
        PictureItem(
            "MUSICIAN",
            R.drawable.prof_musician,
            audio = com.electrodiligent.english.R.raw.musician
        ),
        PictureItem(
            "NURSE",
            R.drawable.prof_nurse,
            audio = com.electrodiligent.english.R.raw.nurse
        ),
        PictureItem(
            name = "PILOT",
            imageId = R.drawable.prof_pilot,
            audio = com.electrodiligent.english.R.raw.pilot
        ),
        PictureItem(
            name = "POLICE OFFICER",
            imageId = R.drawable.prof_police_officer,
            audio = com.electrodiligent.english.R.raw.police_officer
        ),
        PictureItem(
            name = "SCIENTIST",
            imageId = R.drawable.prof_scientist,
            audio = com.electrodiligent.english.R.raw.scientist
        ),
        PictureItem(
            name = "TEACHER",
            imageId = R.drawable.prof_teacher,
            audio = com.electrodiligent.english.R.raw.teacher
        )
    )
}