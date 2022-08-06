package com.electrodiligent.core.presentation.number.count

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalCount(
    modifier: Modifier = Modifier.fillMaxSize(),
    image: Int,
    contentDescription: String = "image",
    count: Int,
    width: Float = 1f
) {
    Box(
        modifier = modifier
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            repeat(count) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = contentDescription,
                    modifier
                        .weight(1f)
                        .aspectRatio(1f)
                )
            }
        }

    }
}