package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.R

object SwarRepository {
    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pineapple,
            displayName = "अननस",
            audio = com.electrodiligent.marathi.R.raw.a_ananas
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.icecream,
            displayName = "आईसक्रीम",
            audio = com.electrodiligent.marathi.R.raw.aa_icecream
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.building,
            displayName = "इमारत",
            audio = com.electrodiligent.marathi.R.raw.e_emarat
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.lemon,
            displayName = "ईडलिंबू ",
            audio = com.electrodiligent.marathi.R.raw.ee_edilimbu
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.pillow,
            displayName = "उशी",
            audio = com.electrodiligent.marathi.R.raw.u_ushi
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.sugarcane,
            displayName = "ऊस",
            audio = com.electrodiligent.marathi.R.raw.oo_oos
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi,
            displayName = "ऋषि",
            audio = com.electrodiligent.marathi.R.raw.ru_rushi
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ram,
            displayName = "एडका",
            audio = com.electrodiligent.marathi.R.raw.ae_aedka
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.anvil,
            displayName = "ऐरण",
            audio = com.electrodiligent.marathi.R.raw.ai_airan
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.lips,
            displayName = "ओठ",
            audio = com.electrodiligent.marathi.R.raw.o_oth
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.medicine,
            displayName = "औषध",
            audio = com.electrodiligent.marathi.R.raw.au_aushadh
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.ring,
            displayName = "अंगठी",
            audio = com.electrodiligent.marathi.R.raw.an_angathi
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayName = "",
            displayImage = R.drawable.aha,
            audio = com.electrodiligent.marathi.R.raw.aha
        )
    )
}