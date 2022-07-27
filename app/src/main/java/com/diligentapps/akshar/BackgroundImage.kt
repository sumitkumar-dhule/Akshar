package com.diligentapps.akshar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(R.drawable.background),
        contentDescription = "null",
        modifier = Modifier
            .fillMaxSize(0.5f),
        contentScale = ContentScale.FillHeight,
        alpha = 0.15f
    )
}