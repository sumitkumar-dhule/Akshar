package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.presentation.number.SoundViewModel
import com.electrodiligent.core.util.Dimension

@Composable
fun AlphabetFlashcardScreen(displayCharacters: List<DisplayCharacter>) {

    val soundViewModel = hiltViewModel<SoundViewModel>()


    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM)
        ) {
            AlphabetFlashcard(
                modifier = Modifier.fillMaxSize(),
                displayCharacters = displayCharacters,
                soundViewModel::onAction
            )
        }
    }

}