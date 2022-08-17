package com.electrodiligent.core.domain.model

data class PictureQuestion(
    val question: String = "Find Picture",
    val correctAnswer: PictureItem = PictureItem(),
    val options : List<PictureItem> =  listOf()
)
