package com.electrodiligent.core.presentation.alphabate

interface UserActions {
    data class PlaySound(val audioID: Int) : UserActions

}