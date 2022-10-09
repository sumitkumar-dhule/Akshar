package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.util.Dimension

@Composable
fun AlphabetIdentificationScreen(displayCharacters: List<DisplayCharacter>) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM)
        ) {
            CharacterDisplay(
                modifier = Modifier.fillMaxSize(),
                displayCharacters = displayCharacters,
                showSubtitle = true
            )
        }

        //TODO:: Display Ad in following box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(Dimension.PADDING_BOTTOM)
        )
    }


}