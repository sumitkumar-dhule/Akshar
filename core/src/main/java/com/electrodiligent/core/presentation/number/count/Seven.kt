package com.electrodiligent.core.presentation.number.count

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Seven(
    modifier: Modifier = Modifier.fillMaxSize(),
    image: Int,
    contentDescription: String = "image"
) {
    Box(
        modifier = modifier
            .padding(8.dp)
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HorizontalCount(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                image = image,
                contentDescription = contentDescription,
                count = 3
            )

            HorizontalCount(
                modifier = Modifier
                    .fillMaxWidth(0.35f)
                    .weight(1f),
                image = image,
                contentDescription = contentDescription,
                count = 1
            )

            HorizontalCount(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                image = image,
                contentDescription = contentDescription,
                count = 3
            )

        }

    }
}