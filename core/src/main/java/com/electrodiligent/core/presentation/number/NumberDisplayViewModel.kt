package com.electrodiligent.core.presentation.number

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.NumberItem
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class NumberDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var isFirstTime = true

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var displayNumbers: List<NumberItem> = listOf(NumberItem())

    private var currentIndex: Int by mutableStateOf(0)

    var numberItem: NumberItem by mutableStateOf(displayNumbers[currentIndex])

    fun setup() {
        numberItem = displayNumbers[currentIndex]
        if (isFirstTime) {
            playSound()
            isFirstTime = false
        }
    }

    fun next() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayNumbers.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        numberItem = displayNumbers[currentIndex]

        playSound()
    }

    fun previous() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayNumbers.lastIndex
        } else {
            currentIndex--
        }

        numberItem = displayNumbers[currentIndex]

        playSound()
    }

    fun currentNumber() {
        // TODO:: Make it work
        // TODO:: Change var names to correct
        numberItem = displayNumbers[currentIndex]

        playSound()
    }

    private fun playSound() {
        if (isSoundPlaying()) {
            return
        }
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, displayNumbers[currentIndex].audio)
        mediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying
    }
}