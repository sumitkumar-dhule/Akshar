package com.electrodiligent.core.domain.model

import com.electrodiligent.core.R

data class CharacterQuestion(
    val question: String = "Find Alphabet",
    val audio: Int = R.raw.beep,
    val correctAnswer: String = "A",
    val options : List<String> =  listOf()
)
