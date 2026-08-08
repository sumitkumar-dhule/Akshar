package com.electrodiligent.core.presentation.color

import androidx.lifecycle.ViewModel
import com.electrodiligent.core.domain.model.ColorItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class ColorDisplayViewModel @Inject constructor() : ViewModel() {

    private val mutableState = MutableStateFlow(ColorDisplayState())
    val state: StateFlow<ColorDisplayState> = mutableState.asStateFlow()

    private val effectChannel = Channel<ColorDisplayEffect>(Channel.BUFFERED)
    val effects = effectChannel.receiveAsFlow()

    fun onIntent(intent: ColorDisplayIntent) {
        when (intent) {
            is ColorDisplayIntent.Initialize -> initialize(intent.colors)
            ColorDisplayIntent.PreviousClicked -> moveBy(-1)
            ColorDisplayIntent.NextClicked -> moveBy(1)
            ColorDisplayIntent.CurrentColorClicked -> playCurrentColor()
            ColorDisplayIntent.SoundPlaybackFinished -> {
                mutableState.value = mutableState.value.copy(isSoundPlaying = false)
            }
        }
    }

    private fun initialize(colors: List<ColorItem>) {
        if (colors.isEmpty() || mutableState.value.colors == colors) return

        mutableState.value = ColorDisplayState(colors = colors)
        playCurrentColor()
    }

    private fun moveBy(delta: Int) {
        val currentState = mutableState.value
        if (currentState.isSoundPlaying || currentState.colors.isEmpty()) return

        val nextIndex = (currentState.currentIndex + delta).floorMod(currentState.colors.size)
        mutableState.value = currentState.copy(currentIndex = nextIndex)
        playCurrentColor()
    }

    private fun playCurrentColor() {
        val currentState = mutableState.value
        val color = currentState.currentColor ?: return
        if (currentState.isSoundPlaying) return

        mutableState.value = currentState.copy(isSoundPlaying = true)
        effectChannel.trySend(ColorDisplayEffect.PlaySound(color.audio))
    }

    private fun Int.floorMod(modulus: Int): Int = ((this % modulus) + modulus) % modulus
}
