package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.R

object SwarRepository {
    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pomegranate
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.mango
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.tamarind
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.sugarcane
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.owl
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.camel
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ankle
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.spectacle
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.okhali
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.ashwini
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.grapes
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayImage = R.drawable.aha
        )
    )
}