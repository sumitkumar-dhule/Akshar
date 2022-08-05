package com.electrodiligent.core.presentation.color

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ColorItem
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ColorDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var displayColors: List<ColorItem> = listOf(ColorItem())

    private var currentIndex: Int by mutableStateOf(0)

    var colorItemState: ColorItem by mutableStateOf(displayColors[currentIndex])

    fun setup() {
        colorItemState = displayColors[currentIndex]
     //   playSound()
    }

    fun next() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayColors.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        colorItemState = displayColors[currentIndex]

      //  playSound()

    }

    fun previous() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayColors.lastIndex
        } else {
            currentIndex--
        }

        colorItemState = displayColors[currentIndex]

      //  playSound()

    }

    fun playSound() {
        if (isSoundPlaying()) {
            return
        }
        mediaPlayer.release()
//        mediaPlayer = MediaPlayer.create(context, displayColors[currentIndex].audio)
        mediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying
    }
}