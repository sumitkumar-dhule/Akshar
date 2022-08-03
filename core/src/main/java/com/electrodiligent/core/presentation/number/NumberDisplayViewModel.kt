package com.electrodiligent.core.presentation.number

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.domain.model.ShapeItem
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class NumberDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var displayShapes: List<NumberItem> = listOf(NumberItem())

    private var currentIndex: Int by mutableStateOf(0)

    var shapeItem: NumberItem by mutableStateOf(displayShapes[currentIndex])

    fun setup() {
        shapeItem = displayShapes[currentIndex]
     //   playSound()
    }

    fun next() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayShapes.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        shapeItem = displayShapes[currentIndex]

      //  playSound()

    }

    fun previous() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayShapes.lastIndex
        } else {
            currentIndex--
        }

        shapeItem = displayShapes[currentIndex]

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