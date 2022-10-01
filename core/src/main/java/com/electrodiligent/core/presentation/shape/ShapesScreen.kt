package com.electrodiligent.core.presentation.shape

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.Dimension

@Composable
fun ShapesScreen(items: List<PictureItem>, title: String = "Shapes") {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM),
            contentAlignment = Alignment.Center
        ) {

            ShapeDisplay(
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
                .height(Dimension.PADDING_BOTTOM)
        )
    }
}