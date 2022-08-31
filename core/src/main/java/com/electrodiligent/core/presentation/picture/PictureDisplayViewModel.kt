package com.electrodiligent.core.presentation.picture

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.ColorUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class PictureDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {
    private var isFirstTime = true

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    val randomColor = ColorUtil.textColors.random().colorValue

    var displayPictures: List<PictureItem> = listOf(PictureItem())

    private var currentIndex: Int by mutableStateOf(0)

    var pictureItem: PictureItem by mutableStateOf(displayPictures[currentIndex])

    fun setup() {
        pictureItem = displayPictures[currentIndex]
        if (isFirstTime) {
            playSound()
            isFirstTime = false
        }
    }

    fun nextPicture() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == displayPictures.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        pictureItem = displayPictures[currentIndex]
        playSound()

    }

    fun previousPicture() {
        if (isSoundPlaying()) {
            return
        }

        if (currentIndex == 0) {
            currentIndex = displayPictures.lastIndex
        } else {
            currentIndex--
        }

        pictureItem = displayPictures[currentIndex]
        playSound()

    }

    fun currentPicture() {
        playSound()
    }

    private fun playSound() {
        if (isSoundPlaying()) {
            return
        }
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, displayPictures[currentIndex].audio)
        mediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return mediaPlayer.isPlaying
    }
}