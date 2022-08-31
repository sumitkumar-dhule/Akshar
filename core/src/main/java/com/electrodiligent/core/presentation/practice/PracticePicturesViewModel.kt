package com.electrodiligent.core.presentation.practice

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.domain.model.PictureQuestion
import com.electrodiligent.core.util.ColorUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PracticePicturesViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var isFirstTime = true

    val randomColor = ColorUtil.textColors.random().colorValue
    var validNextState = true

    private var questionMediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var effectMediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var specialEffectMediaPlayer = MediaPlayer.create(context, R.raw.positive)
    private var findMediaPlayer = MediaPlayer.create(context, R.raw.beep)

    var questions: List<PictureQuestion> = listOf(PictureQuestion())
    var findSound: Int = R.raw.beep


    private var currentIndex: Int by mutableStateOf(0)

    var question: PictureQuestion by mutableStateOf(questions[currentIndex])

    fun setup() {
        question = questions[currentIndex]
        if (isFirstTime) {
            playQuestion()
            isFirstTime = false
        }
    }

    fun next() {
        if (currentIndex == questions.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        question = questions[currentIndex]
        playQuestion()

        validNextState = true
    }

    fun optionSelected(selected: PictureItem) {

        if (!validNextState) {
            return
        }

        if (isCorrectOptionSelected(selected)) {
            validNextState = false
            playCelebration()
            CoroutineScope(Dispatchers.Main).launch() {
                delay(3000)
                next()
            }
        } else {
            playIncorrectChoice()
            CoroutineScope(Dispatchers.Main).launch() {
                delay(1000)
                playQuestion()
            }
        }
    }

    private fun playIncorrectChoice() {
        playEffects(R.raw.negative)
    }

    private fun playCelebration() {
        playEffects(R.raw.positive)
        specialEffects(R.raw.yay)
    }

    private fun isCorrectOptionSelected(selected: PictureItem): Boolean {
        return selected.name == question.correctAnswer.name
    }

    fun playQuestion() {
        if (isSoundPlaying()) {
            return
        }
      /*  playFindSound(findSound)
        CoroutineScope(Dispatchers.Main).launch() {
            delay(500)
            playSound(questions[currentIndex].correctAnswer.audio)
        }*/

        playSound(questions[currentIndex].correctAnswer.audio)

    }

    private fun playSound(audio: Int) {
        questionMediaPlayer.release()
        questionMediaPlayer = MediaPlayer.create(context, audio)
        questionMediaPlayer.start()
    }

    private fun playFindSound(audio: Int) {
        findMediaPlayer.release()
        findMediaPlayer = MediaPlayer.create(context, audio)
        findMediaPlayer.start()
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
        return questionMediaPlayer.isPlaying || findMediaPlayer.isPlaying
    }
}