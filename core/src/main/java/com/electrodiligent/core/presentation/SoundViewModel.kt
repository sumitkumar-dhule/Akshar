package com.electrodiligent.core.presentation

import android.content.Context
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class SoundViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    fun playSound(audioId: Int) {
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, audioId)
        mediaPlayer.start()
    }

    fun onAction(action: UserActions) {
        when (action) {
            is UserActions.PlaySound -> {
                playSound(audioId = action.audioID)
            }
        }
    }
}