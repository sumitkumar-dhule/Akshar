package com.electrodiligent.core.state

data class OptionState(
    var attempted: Boolean = false,
    var isCorrectOption: Boolean = false,
)
