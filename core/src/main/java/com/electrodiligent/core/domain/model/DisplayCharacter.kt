package com.electrodiligent.core.domain.model

import com.electrodiligent.core.R

data class DisplayCharacter(
    val display: String = "",
    val left: String = "",
    var right: String = "",
    val subtitle: String = "",
    val displayName: String = "",
    val audio: Int = R.raw.beep,
    val displayImage: Int = R.drawable.ic_image_placeholder
)
