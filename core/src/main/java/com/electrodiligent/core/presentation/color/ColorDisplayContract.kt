package com.electrodiligent.core.presentation.color

import com.electrodiligent.core.domain.model.ColorItem

/** Immutable UI state for the color-display feature. */
data class ColorDisplayState(
    val colors: List<ColorItem> = emptyList(),
    val currentIndex: Int = 0,
    val isSoundPlaying: Boolean = false
) {
    val currentColor: ColorItem?
        get() = colors.getOrNull(currentIndex)
}

sealed interface ColorDisplayIntent {
    data class Initialize(val colors: List<ColorItem>) : ColorDisplayIntent
    data object PreviousClicked : ColorDisplayIntent
    data object NextClicked : ColorDisplayIntent
    data object CurrentColorClicked : ColorDisplayIntent
    data object SoundPlaybackFinished : ColorDisplayIntent
}

sealed interface ColorDisplayEffect {
    data class PlaySound(val audioResId: Int) : ColorDisplayEffect
}
