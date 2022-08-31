package com.electrodiligent.core.presentation.alphabate

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.util.ColorUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {
    private var isFirstTime = true
    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var mediaPlayerMiddle = MediaPlayer.create(context, R.raw.beep)
    private var mediaPlayerEnd = MediaPlayer.create(context, R.raw.beep)
    val randomColor = ColorUtil.textColors.random().colorValue
    var displayCharacters: List<DisplayCharacter> = listOf(DisplayCharacter())
    private var currentIndex: Int by mutableStateOf(0)
    var displayCharacterState: DisplayCharacter by mutableStateOf(displayCharacters[currentIndex])

    fun setup() {
        displayCharacterState = displayCharacters[currentIndex]
        if (isFirstTime) {
            playSound()
            isFirstTime = false
        }
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

        if (displayCharacters[currentIndex].displayAudio != -1) {
            CoroutineScope(Dispatchers.Main).launch() {
                delay(400)
                mediaPlayerMiddle.release()
                mediaPlayerMiddle =
                    MediaPlayer.create(context, displayCharacters[currentIndex].middleAudio)
                mediaPlayerMiddle.start()
            }
            CoroutineScope(Dispatchers.Main).launch() {
                delay(1100)
                mediaPlayerEnd.release()
                mediaPlayerEnd =
                    MediaPlayer.create(context, displayCharacters[currentIndex].displayAudio)
                mediaPlayerEnd.start()
            }
        }
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying || mediaPlayerMiddle.isPlaying || mediaPlayerEnd.isPlaying
    }
}