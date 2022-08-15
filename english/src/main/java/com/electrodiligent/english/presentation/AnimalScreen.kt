package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.presentation.picture.PictureDisplay
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.R.raw
import com.electrodiligent.english.data.AnimalsRepository

@Composable
fun AnimalsScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD),
            contentAlignment = Alignment.Center
        ) {

            PictureDisplay(
                modifier = Modifier.fillMaxSize(),
                items = AnimalsRepository.list,
                titleAudio = raw.learn_shape,
                title = "Vegetables"
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