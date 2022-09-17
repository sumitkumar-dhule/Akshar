package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter

object SwarFlashCardRepository {

    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pomegranate,
            displayName = "अनार",
            audio = com.electrodiligent.hindi.R.raw.a_h,
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.mango,
            displayName = "आम",
            audio = com.electrodiligent.hindi.R.raw.aa_h,
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.tamarind,
            displayName = "इमली",
            audio = com.electrodiligent.hindi.R.raw.e_h,
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.sugarcane,
            displayName = "ईख",
            audio = com.electrodiligent.hindi.R.raw.ee_h,
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.owl,
            displayName = "उल्लू",
            audio = com.electrodiligent.hindi.R.raw.u_h,
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.camel,
            displayName = "ऊंट",
            audio = com.electrodiligent.hindi.R.raw.oo_h,
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi,
            displayName = "ऋषि",
            audio = com.electrodiligent.hindi.R.raw.ru_h,
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ankle,
            displayName = "एड़ी",
            audio = com.electrodiligent.hindi.R.raw.ea_h,
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.spectacle,
            displayName = "ऐनक",
            audio = com.electrodiligent.hindi.R.raw.ae_h,
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.okhali,
            displayName = "ओखली",
            audio = com.electrodiligent.hindi.R.raw.o_h,
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.ashwini,
            displayName = "औरत",
            audio = com.electrodiligent.hindi.R.raw.ou_h,
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.grapes,
            displayName = "अंगूर",
            audio = com.electrodiligent.hindi.R.raw.um_h,
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayName = "",
            displayImage = R.drawable.aha,
            audio = com.electrodiligent.hindi.R.raw.aha_h,
        )
    )

}