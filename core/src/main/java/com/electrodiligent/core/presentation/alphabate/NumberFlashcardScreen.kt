package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.presentation.SoundViewModel
import com.electrodiligent.core.presentation.number.NumberFlashcard
import com.electrodiligent.core.util.Dimension

@Composable
fun NumberFlashcardScreen(numberItems: List<NumberItem>) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM),
            contentAlignment = Alignment.Center
        ) {
            val soundViewModel = hiltViewModel<SoundViewModel>()


            NumberFlashcard(
                modifier = Modifier.fillMaxSize(),
                numberItems = numberItems,
                textSize = 45.sp,
                soundViewModel::onAction
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