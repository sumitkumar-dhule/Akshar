package com.electrodiligent.core.presentation.practice

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.state.OptionState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class OptionViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var effectMediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var specialEffectMediaPlayer = MediaPlayer.create(context, R.raw.positive)

    var optionState: OptionState by mutableStateOf(OptionState())

    fun setup(state: OptionState) {
        optionState = state
    }


    fun optionSelected() {

        if (optionState.attempted) {
            return
        }
        if (optionState.isCorrectOption) {
            optionState = OptionState(isCorrectOption = true, attempted = true)
            playCorrectChoice()
        } else {
            optionState = OptionState(isCorrectOption = false, attempted = true)
            playIncorrectChoice()
        }

    }

    private fun playIncorrectChoice() {
        playEffects(R.raw.negative)
    }

    private fun playCorrectChoice() {
        playEffects(R.raw.positive)
        specialEffects(R.raw.yay)
    }

    private fun specialEffects(audio: Int) {
        specialEffectMediaPlayer.release()
        specialEffectMediaPlayer = MediaPlayer.create(context, audio)
        specialEffectMediaPlayer.setVolume(0.05f, 0.05f)
        specialEffectMediaPlayer.start()
    }

    private fun playEffects(audio: Int) {
        effectMediaPlayer.release()
        effectMediaPlayer = MediaPlayer.create(context, audio)
        effectMediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return specialEffectMediaPlayer.isPlaying || effectMediaPlayer.isPlaying
    }
}
