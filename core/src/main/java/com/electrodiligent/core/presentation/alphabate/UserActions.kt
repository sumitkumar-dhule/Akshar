package com.electrodiligent.core.presentation.alphabate

import com.electrodiligent.core.domain.model.DisplayCharacter

interface UserActions {
    data class PlaySound(val displayCharacter: DisplayCharacter) : UserActions
}