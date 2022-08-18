package com.electrodiligent.core.presentation.shape

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ShapeDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var displayShapes: List<PictureItem> = listOf(PictureItem())

    private var currentIndex: Int by mutableStateOf(0)

    var pictureItem: PictureItem by mutableStateOf(displayShapes[currentIndex])

    fun setup() {
        pictureItem = displayShapes[currentIndex]
        playSound()
    }

    fun nextShape() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayShapes.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        pictureItem = displayShapes[currentIndex]
        playSound()

    }

    fun previousShape() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayShapes.lastIndex
        } else {
            currentIndex--
        }

        pictureItem = displayShapes[currentIndex]
        playSound()

    }

    fun currentShape() {
        pictureItem = displayShapes[currentIndex]
        playSound()
    }

    private fun playSound() {
        if (isSoundPlaying()) {
            return
        }
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, displayShapes[currentIndex].audio)
        mediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying
    }
}