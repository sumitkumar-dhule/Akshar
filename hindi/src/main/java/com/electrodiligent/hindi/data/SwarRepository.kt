package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter

object SwarRepository {
    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ"
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ"
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
        )
    )
}