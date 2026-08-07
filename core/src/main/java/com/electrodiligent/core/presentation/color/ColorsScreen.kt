package com.electrodiligent.core.presentation.color

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.domain.model.ColorItem

@Composable
fun ColorsScreen(colorItems: List<ColorItem>, title: String = "Colors") {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            ColorDisplay(
                modifier = Modifier.fillMaxSize(),
                colorItems = colorItems,
                title = title
            )

        }
    }
}
