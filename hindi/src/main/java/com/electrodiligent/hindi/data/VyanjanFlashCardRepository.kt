package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter

object VyanjanFlashCardRepository {

    val list = listOf(
        DisplayCharacter(
            left = "श्र", display = "क", right = "ख",
            displayImage = R.drawable.pigeon,
            displayName = "कबूतर",
            audio = com.electrodiligent.hindi.R.raw.ka_h,
        ),
        DisplayCharacter(
            left = "क", display = "ख", right = "ग",
            displayImage = R.drawable.rabbit,
            displayName = "खरगोश",
            audio = com.electrodiligent.hindi.R.raw.kha_h,
        ),
        DisplayCharacter(
            left = "ख", display = "ग", right = "घ",
            displayImage = R.drawable.donkey,
            displayName = "गधा",
            audio = com.electrodiligent.hindi.R.raw.ga_h,
        ),
        DisplayCharacter(
            left = "ग", display = "घ", right = "ङ",
            displayImage = R.drawable.horse,
            displayName = "घोडा",
            audio = com.electrodiligent.hindi.R.raw.gha_h,
        ),
        DisplayCharacter(
            left = "घ", display = "ङ", right = "च",
            displayImage = R.drawable.daa,
            displayName = "",
            audio = com.electrodiligent.hindi.R.raw.umm_h,
        ),
        DisplayCharacter(
            left = "ङ", display = "च", right = "छ",
            displayImage = R.drawable.spoon,
            displayName = "चम्मच",
            audio = com.electrodiligent.hindi.R.raw.cha_h,
        ),
        DisplayCharacter(
            left = "च", display = "छ", right = "ज",
            displayImage = R.drawable.umrella,
            displayName = "छाता",
            audio = com.electrodiligent.hindi.R.raw.chha_h,
        ),
        DisplayCharacter(
            left = "छ", display = "ज", right = "झ",
            displayImage = R.drawable.jug,
            displayName = "जग",
            audio = com.electrodiligent.hindi.R.raw.ja_h,
        ),
        DisplayCharacter(
            left = "ज", display = "झ", right = "ञ",
            displayImage = R.drawable.indian_flag,
            displayName = "झंडा",
            audio = com.electrodiligent.hindi.R.raw.zha_h,
        ),
        DisplayCharacter(
            left = "झ", display = "ञ", right = "ट",
            displayImage = R.drawable.tra,
            displayName = "",
            audio = com.electrodiligent.hindi.R.raw.eya_h,
        ),
        DisplayCharacter(
            left = "ञ", display = "ट", right = "ठ",
            displayImage = R.drawable.tomato,
            displayName = "टमाटर",
            audio = com.electrodiligent.hindi.R.raw.ta_h,
        ),
        DisplayCharacter(
            left = "ट", display = "ठ", right = "ड",
            displayImage = R.drawable.thela,
            displayName = "ठेला",
            audio = com.electrodiligent.hindi.R.raw.tha_h,
        ),
        DisplayCharacter(
            left = "ठ", display = "ड", right = "ढ",
            displayImage = R.drawable.damaru,
            displayName = "डमरू",
            audio = com.electrodiligent.hindi.R.raw.da_h,
        ),
        DisplayCharacter(
            left = "ड", display = "ढ", right = "ण",
            displayImage = R.drawable.dhol,
            displayName = "ढोल",
            audio = com.electrodiligent.hindi.R.raw.dha_h,
        ),
        DisplayCharacter(
            left = "ढ", display = "ण", right = "त",
            displayImage = R.drawable.arrow,
            displayName = "बाण",
            audio = com.electrodiligent.hindi.R.raw.kna_h,
        ),
        DisplayCharacter(
            left = "ण", display = "त", right = "थ",
            displayImage = R.drawable.watermelon,
            displayName = "तरबूज",
            audio = com.electrodiligent.hindi.R.raw.taa_h,
        ),
        DisplayCharacter(
            left = "त", display = "थ", right = "द",
            displayImage = R.drawable.thermos,
            displayName = "थर्मस",
            audio = com.electrodiligent.hindi.R.raw.thha_h,
        ),
        DisplayCharacter(
            left = "थ", display = "द", right = "ध",
            displayImage = R.drawable.medicine,
            displayName = "दवाई",
            audio = com.electrodiligent.hindi.R.raw.daa_h,
        ),
        DisplayCharacter(
            left = "द", display = "ध", right = "न",
            displayImage = R.drawable.bow,
            displayName = "धनुष",
            audio = com.electrodiligent.hindi.R.raw.dhaa_h,
        ),
        DisplayCharacter(
            left = "ध", display = "न", right = "प",
            displayImage = R.drawable.lemon,
            displayName = "नींबू",
            audio = com.electrodiligent.hindi.R.raw.na_h,
        ),
        DisplayCharacter(
            left = "न", display = "प", right = "फ",
            displayImage = R.drawable.kite,
            displayName = "पतंग",
            audio = com.electrodiligent.hindi.R.raw.pa_h,
        ),
        DisplayCharacter(
            left = "प", display = "फ", right = "ब",
            displayImage = R.drawable.football,
            displayName = "फुटबॉल",
            audio = com.electrodiligent.hindi.R.raw.fa_h,
        ),
        DisplayCharacter(
            left = "फ", display = "ब", right = "भ",
            displayImage = R.drawable.duck,
            displayName = "बतख",
            audio = com.electrodiligent.hindi.R.raw.ba_h,
        ),
        DisplayCharacter(
            left = "ब", display = "भ", right = "म",
            displayImage = R.drawable.bear,
            displayName = "भालू",
            audio = com.electrodiligent.hindi.R.raw.bha_h,
        ),
        DisplayCharacter(
            left = "भ", display = "म", right = "य",
            displayImage = R.drawable.fish,
            displayName = "मछली",
            audio = com.electrodiligent.hindi.R.raw.ma_h,
        ),
        DisplayCharacter(
            left = "म", display = "य", right = "र",
            displayImage = R.drawable.yadnya,
            displayName = "यज्ञ",
            audio = com.electrodiligent.hindi.R.raw.ya_h,
        ),
        DisplayCharacter(
            left = "य", display = "र", right = "ल",
            displayImage = R.drawable.queen_ashwini,
            displayName = "रानी",
            audio = com.electrodiligent.hindi.R.raw.ra_h,
        ),
        DisplayCharacter(
            left = "र", display = "ल", right = "व",
            displayImage = R.drawable.garlic,
            displayName = "लहसुन",
            audio = com.electrodiligent.hindi.R.raw.la_h,
        ),
        DisplayCharacter(
            left = "ल", display = "व", right = "श",
            displayImage = R.drawable.forest,
            displayName = "वन",
            audio = com.electrodiligent.hindi.R.raw.va_h,
        ),
        DisplayCharacter(
            left = "व", display = "श", right = "ष",
            displayImage = R.drawable.ostrich,
            displayName = "शुतुरमुर्ग",
            audio = com.electrodiligent.hindi.R.raw.sha_h,
        ),
        DisplayCharacter(
            left = "श", display = "ष", right = "स",
            displayImage = R.drawable.hexagon,
            displayName = "षट्कोण",
            audio = com.electrodiligent.hindi.R.raw.sha_h,
        ),
        DisplayCharacter(
            left = "ष", display = "स", right = "ह",
            displayImage = R.drawable.apple,
            displayName = "सेब",
            audio = com.electrodiligent.hindi.R.raw.sa_h,
        ),
        DisplayCharacter(
            left = "स", display = "ह", right = "क्ष",
            displayImage = R.drawable.deer,
            displayName = "हिरन",
            audio = com.electrodiligent.hindi.R.raw.ha_h,
        ),
        DisplayCharacter(
            left = "ह", display = "क्ष", right = "त्र",
            displayImage = R.drawable.kshatriya,
            displayName = "क्षत्रिय",
            audio = com.electrodiligent.hindi.R.raw.ksha_h,
        ),
        DisplayCharacter(
            left = "क्ष", display = "त्र", right = "ज्ञ",
            displayImage = R.drawable.trishul,
            displayName = "त्रिशूल",
            audio = com.electrodiligent.hindi.R.raw.tra_h,
        ),
        DisplayCharacter(
            left = "त्र", display = "ज्ञ", right = "श्र",
            displayImage = R.drawable.dnyaneshwar,
            displayName = "ज्ञानी",
            audio = com.electrodiligent.hindi.R.raw.gya_h,
        ),
        DisplayCharacter(
            left = "ज्ञ", display = "श्र", right = "क",
            displayImage = R.drawable.shramik,
            displayName = "श्रमिक",
            audio = com.electrodiligent.hindi.R.raw.shra_h,
        )
    )

}