package com.electrodiligent.core.presentation.practice

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.CharacterQuestion
import com.electrodiligent.core.util.RandomColor
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PracticeDisplayViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    val score = 0;
    val randomColor = RandomColor.list.random().colorValue


    private var questionMediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var effectMediaPlayer = MediaPlayer.create(context, R.raw.beep)
    private var specialEffectMediaPlayer = MediaPlayer.create(context, R.raw.positive)

    var questions: List<CharacterQuestion> = listOf(CharacterQuestion())

    private var currentIndex: Int by mutableStateOf(0)

    var question: CharacterQuestion by mutableStateOf(questions[currentIndex])

    fun setup() {
        question = questions[currentIndex]
        playQuestion()
    }

    fun next() {
        if (currentIndex == questions.lastIndex) {
            currentIndex = 0
        } else {
            currentIndex++
        }

        question = questions[currentIndex]
        playQuestion()
    }

    fun optionSelected(selected: String) {
        if (isCorrectOptionSelected(selected)) {
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
        specialEffects(R.raw.positive)
        playEffects(R.raw.correct)
    }

    private fun isCorrectOptionSelected(selected: String): Boolean {
        return selected == question.correctAnswer
    }

    fun playQuestion() {
        if (isSoundPlaying()) {
            return
        }
        playSound(questions[currentIndex].audio)
    }

    private fun playSound(audio: Int) {
        questionMediaPlayer.release()
        questionMediaPlayer = MediaPlayer.create(context, audio)
        questionMediaPlayer.start()
    }

    private fun specialEffects(audio: Int) {
        specialEffectMediaPlayer.release()
        specialEffectMediaPlayer = MediaPlayer.create(context, audio)
        specialEffectMediaPlayer.start()
    }

    private fun playEffects(audio: Int) {
        effectMediaPlayer.release()
        effectMediaPlayer = MediaPlayer.create(context, audio)
        effectMediaPlayer.start()
    }

    private fun isSoundPlaying(): Boolean {
        return questionMediaPlayer.isPlaying
    }
}