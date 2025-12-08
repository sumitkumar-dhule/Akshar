package com.electrodiligent.core.presentation

interface UserActions {
    data class PlaySound(val audioID: Int) : UserActions

}