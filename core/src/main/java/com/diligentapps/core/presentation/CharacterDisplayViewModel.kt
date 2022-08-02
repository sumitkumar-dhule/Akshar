package com.diligentapps.core.presentation

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.diligentapps.core.R
import com.diligentapps.core.domain.model.DisplayCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class CharacterDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {


    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)


    var displayCharacters: List<DisplayCharacter> = listOf(DisplayCharacter())

    private var currentIndex: Int by mutableStateOf(0)

    var displayCharacterState: DisplayCharacter by mutableStateOf(displayCharacters[currentIndex])

    fun setup() {
        displayCharacterState = displayCharacters[currentIndex]
        playSound()
    }

    fun next() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayCharacters.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        displayCharacterState = displayCharacters[currentIndex]

        playSound()

    }

    fun previous() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayCharacters.lastIndex
        } else {
            currentIndex--
        }

        displayCharacterState = displayCharacters[currentIndex]

        playSound()

    }

    fun playSound() {
        if (isSoundPlaying()) {
            return
        }
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, displayCharacters[currentIndex].audio)
        mediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying
    }
}