package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.presentation.picture.PictureDisplay
import com.electrodiligent.core.util.Dimension

@Composable
fun AnimalsScreen(items: List<PictureItem>, title: String) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD),
            contentAlignment = Alignment.Center
        ) {

            PictureDisplay(
                modifier = Modifier.fillMaxSize(),
                items = items,
                title = title
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