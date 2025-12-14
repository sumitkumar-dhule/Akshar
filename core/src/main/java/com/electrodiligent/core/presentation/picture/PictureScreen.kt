package com.electrodiligent.core.presentation.picture

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.presentation.DevicePreviews
import com.electrodiligent.core.util.Dimension

@SuppressLint("ContextCastToActivity")
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun PictureScreen(items: List<PictureItem>, title: String) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM),
            contentAlignment = Alignment.Center
        ) {

            val pictureDisplayViewModel = hiltViewModel<PictureDisplayViewModel>()
            pictureDisplayViewModel.displayPictures = items

            pictureDisplayViewModel.onAction(PictureActions.Setup())

            val shapeItem = pictureDisplayViewModel.pictureItem

            val activity = LocalContext.current as Activity

            val windowSizeClass = calculateWindowSizeClass(activity)


            PictureDisplay(
                modifier = Modifier.fillMaxSize(),
                item = pictureDisplayViewModel.pictureItem,
                screenElementColor = pictureDisplayViewModel.randomColor,
                onAction = pictureDisplayViewModel::onAction,
                windowSizeClass = windowSizeClass
            )

        }
    }
}

@DevicePreviews
@Composable
fun PictureScreenPreview() {
    PictureScreen(
        items = listOf(
            PictureItem("First"),
            PictureItem("Second"),
        ),
        title = "Preview Title"
    )
}