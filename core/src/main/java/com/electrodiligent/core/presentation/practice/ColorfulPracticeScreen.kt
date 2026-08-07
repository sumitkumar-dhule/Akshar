package com.electrodiligent.core.presentation.practice

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.PictureQuestion
import com.electrodiligent.core.util.Dimension

@Composable
fun ColorfulPracticeScreen(items: List<PictureQuestion>, findText: String = "FIND", findSound: Int) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM)
        ) {
            PracticeColorfulPictures(
                modifier = Modifier.fillMaxSize(),
                items = items,
                findText = findText,
                findSound = findSound
            )
        }
    }


}