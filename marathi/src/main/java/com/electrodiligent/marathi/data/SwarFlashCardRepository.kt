package com.electrodiligent.marathi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter

object SwarFlashCardRepository {

    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pineapple,
            displayName = "अननस",
            audio = com.electrodiligent.marathi.R.raw.a
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.icecream,
            displayName = "आईसक्रीम",
            audio = com.electrodiligent.marathi.R.raw.aa
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.building,
            displayName = "इमारत",
            audio = com.electrodiligent.marathi.R.raw.e
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.lemon,
            displayName = "ईडलिंबू ",
            audio = com.electrodiligent.marathi.R.raw.ee
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.pillow,
            displayName = "उशी",
            audio = com.electrodiligent.marathi.R.raw.u
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.sugarcane,
            displayName = "ऊस",
            audio = com.electrodiligent.marathi.R.raw.oo
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi,
            displayName = "ऋषि",
            audio = com.electrodiligent.marathi.R.raw.ru
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ram,
            displayName = "एडका",
            audio = com.electrodiligent.marathi.R.raw.ye
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.anvil,
            displayName = "ऐरण",
            audio = com.electrodiligent.marathi.R.raw.ai
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.lips,
            displayName = "ओठ",
            audio = com.electrodiligent.marathi.R.raw.o
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.medicine,
            displayName = "औषध",
            audio = com.electrodiligent.marathi.R.raw.au
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.ring,
            displayName = "अंगठी",
            audio = com.electrodiligent.marathi.R.raw.unn
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayName = "",
            displayImage = R.drawable.aha,
            audio = com.electrodiligent.marathi.R.raw.aha
        )
    )

}