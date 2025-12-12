package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.Dimension

@Composable
fun VegetablesScreen(items: List<PictureItem>, title: String) {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM),
            contentAlignment = Alignment.Center
        ) {

            val pictureDisplayViewModel = hiltViewModel<PictureDisplayViewModel>()
            pictureDisplayViewModel.displayPictures = items

            val shapeItem = pictureDisplayViewModel.pictureItem

            PictureDisplay(
                modifier = Modifier.fillMaxSize(),
                item = pictureDisplayViewModel.pictureItem,
                screenElementColor = pictureDisplayViewModel.randomColor,
                onAction = pictureDisplayViewModel::onAction
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