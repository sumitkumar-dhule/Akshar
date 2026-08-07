package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
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
    }
}
