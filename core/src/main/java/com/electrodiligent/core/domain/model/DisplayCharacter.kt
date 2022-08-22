package com.electrodiligent.core.domain.model

import com.electrodiligent.core.R

data class DisplayCharacter(
    val display: String = "",
    val left: String = "",
    var right: String = "",
    val subtitle: String = "",
    val displayName: String = "",
    val audio: Int = R.raw.beep,
    val displayAudio: Int = -1,
    val middleAudio: Int = -1,
    val displayImage: Int = R.drawable.ic_image_placeholder
)
