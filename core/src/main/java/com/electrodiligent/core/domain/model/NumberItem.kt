package com.electrodiligent.core.domain.model

import com.electrodiligent.core.R

data class NumberItem(
    val name: String = "",
    val countString: String = "",
    val count: Int = 0,
    val image: Int = R.drawable.ic_image_placeholder,
    val audio: Int = R.raw.beep
)
