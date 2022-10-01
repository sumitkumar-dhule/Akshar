package com.electrodiligent.core.presentation.practice

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.PictureQuestion
import com.electrodiligent.core.util.Dimension

@Composable
fun PicturePracticeScreen(items: List<PictureQuestion>, findText: String = "FIND", findSound: Int) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM)
        ) {
            PracticePictures(
                modifier = Modifier.fillMaxSize(),
                items = items,
                textFind = findText,
                findSound = findSound
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