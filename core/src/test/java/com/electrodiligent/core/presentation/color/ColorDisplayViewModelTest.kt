package com.electrodiligent.core.presentation.color

import com.electrodiligent.core.domain.model.ColorItem
import org.junit.Assert.assertEquals
import org.junit.Test

class ColorDisplayViewModelTest {

    @Test
    fun `next wraps to the first color after playback finishes`() {
        val viewModel = ColorDisplayViewModel()
        val colors = listOf(ColorItem(name = "Red"), ColorItem(name = "Blue"))

        viewModel.onIntent(ColorDisplayIntent.Initialize(colors))
        viewModel.onIntent(ColorDisplayIntent.SoundPlaybackFinished)
        viewModel.onIntent(ColorDisplayIntent.NextClicked)
        viewModel.onIntent(ColorDisplayIntent.SoundPlaybackFinished)
        viewModel.onIntent(ColorDisplayIntent.NextClicked)

        assertEquals("Red", viewModel.state.value.currentColor?.name)
    }

    @Test
    fun `navigation is ignored while sound is playing`() {
        val viewModel = ColorDisplayViewModel()
        val colors = listOf(ColorItem(name = "Red"), ColorItem(name = "Blue"))

        viewModel.onIntent(ColorDisplayIntent.Initialize(colors))
        viewModel.onIntent(ColorDisplayIntent.NextClicked)

        assertEquals("Red", viewModel.state.value.currentColor?.name)
    }
}
