package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.presentation.shape.ShapeDisplay
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.R.*
import com.electrodiligent.english.data.ShapeRepository

@Composable
fun ShapesScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD),
            contentAlignment = Alignment.Center
        ) {

            ShapeDisplay(
                modifier = Modifier.fillMaxSize(),
                items = ShapeRepository.list,
                titleAudio = raw.learn_shape
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