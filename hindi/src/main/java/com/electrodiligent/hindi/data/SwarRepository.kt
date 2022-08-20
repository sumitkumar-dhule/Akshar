package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.R

object SwarRepository {
    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pomegranate,
            displayName = "अनार",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.mango,
            displayName = "आम",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.tamarind,
            displayName = "इमली",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.sugarcane,
            displayName = "ईख",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.owl,
            displayName = "उल्लू",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.camel,
            displayName = "ऊंट",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi,
            displayName = "ऋषि",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ankle,
            displayName = "एड़ी",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.spectacle,
            displayName = "ऐनक",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.okhali,
            displayName = "ओखली",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.ashwini,
            displayName = "औरत",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.grapes,
            displayName = "अंगूर",
            audio = R.raw.beep
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayName = "अ:",
            displayImage = R.drawable.aha,
            audio = R.raw.beep
        )
    )
}