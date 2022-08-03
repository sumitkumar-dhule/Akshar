package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.presentation.alphabate.CharacterDisplay
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.data.AlphabetsRepository

@Composable
fun AlphabetIdentificationScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
        ) {
            CharacterDisplay(
                modifier = Modifier.fillMaxSize(),
                displayCharacters = AlphabetsRepository.list,
                showSubtitle = true
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