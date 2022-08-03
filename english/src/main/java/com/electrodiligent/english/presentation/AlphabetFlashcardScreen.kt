package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.presentation.alphabate.AlphabetFlashcard
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.data.AlphabetsRepository

@Composable
fun AlphabetFlashcardScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
        ) {
            AlphabetFlashcard(
                modifier = Modifier.fillMaxSize(),
                displayCharacters = AlphabetsRepository.list
            )
        }

        //TODO:: Display Ad in following box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(Dimension.PADDING_BANNER_AD)
        )
    }


}