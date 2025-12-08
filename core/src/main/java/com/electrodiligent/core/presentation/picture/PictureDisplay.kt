package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun PictureDisplay(
    modifier: Modifier,
    items: List<PictureItem>,
    title: String,
) {

    val pictureDisplayViewModel = hiltViewModel<PictureDisplayViewModel>()
    pictureDisplayViewModel.displayPictures = items
    pictureDisplayViewModel.setup()

    val shapeItem = pictureDisplayViewModel.pictureItem

    Box(modifier = modifier) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.7f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = shapeItem.imageId),
                    contentDescription = shapeItem.name,
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .aspectRatio(1f)
                        .clickable(onClick = { pictureDisplayViewModel.currentPicture() }),
                    contentScale = ContentScale.Fit

                )

                ResponsiveText(
                    modifier = Modifier.fillMaxWidth(),
                    targetTextSizeHeight = 60.sp,
                    text = shapeItem.name,
                    textAlign = TextAlign.Center,
                    color = pictureDisplayViewModel.randomColor,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )

            }

            UserActionBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f),
                pictureDisplayViewModel = pictureDisplayViewModel
            )
        }
    }
}

@Composable
private fun UserActionBar(
    modifier: Modifier,
    pictureDisplayViewModel: PictureDisplayViewModel
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ic_arrow_circle_left),
            contentDescription = "Left",
            colorFilter = ColorFilter.tint(color = pictureDisplayViewModel.randomColor),

            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clickable { pictureDisplayViewModel.previousPicture() }
        )

        if (pictureDisplayViewModel.pictureItem.canDoSomething) {
            Image(
                painter = painterResource(R.drawable.do_things),
                contentDescription = "do_things",
                colorFilter = ColorFilter.tint(color = pictureDisplayViewModel.randomColor),

                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(1f, matchHeightConstraintsFirst = true)
                    .clickable { }
            )
        }


        Image(
            painter = painterResource(R.drawable.ic_arrow_circle_right),
            contentDescription = "Right",
            colorFilter = ColorFilter.tint(color = pictureDisplayViewModel.randomColor),

            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clickable { pictureDisplayViewModel.nextPicture() }
        )
    }
}