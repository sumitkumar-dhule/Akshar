package com.electrodiligent.core.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.electrodiligent.core.R

@Composable
fun BackgroundImage(alpha:Float = 0.05f) {
    Image(
        painter = painterResource(R.drawable.background),
        contentDescription = "null",
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillHeight,
        alpha = alpha
    )
}