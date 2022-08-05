package com.electrodiligent.core.presentation.shape

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ShapeItem
import com.electrodiligent.core.util.RandomColor
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class ShapeDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var displayShapes: List<ShapeItem> = listOf(ShapeItem())

    private var currentIndex: Int by mutableStateOf(0)

    var shapeItem: ShapeItem by mutableStateOf(displayShapes[currentIndex])

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
        shapeItem.color = RandomColor.list.random().colorValue

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
        shapeItem.color = RandomColor.list.random().colorValue

        //  playSound()

    }

    fun same(){
        shapeItem.color = RandomColor.list.random().colorValue
        shapeItem = displayShapes[currentIndex]
        //playSound()
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