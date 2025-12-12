package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.presentation.DevicePreviews
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun PictureDisplay(
    modifier: Modifier,
    item: PictureItem,
    onAction: (PictureActions) -> Unit,
    screenElementColor: Color,
) {

    Box(modifier = modifier) {

        Column(
            Modifier
                .fillMaxSize()
                .background(color = Color.Red),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                Modifier
                    .fillMaxWidth()
                    .background(color = Color.Green)
                    .fillMaxHeight(0.7f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = item.imageId),
                    contentDescription = item.name,
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .background(color = Color.Yellow)

                        .aspectRatio(1f)
                        .clickable(onClick = { onAction(PictureActions.TapCurrent()) }),
                    contentScale = ContentScale.Fit

                )

                ResponsiveText(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.Cyan),
                    targetTextSizeHeight = 60.sp,
                    text = item.name,
                    textAlign = TextAlign.Center,
                    color = screenElementColor,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )

            }

            UserActionBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.DarkGray)

                    .fillMaxHeight(0.3f),
                pictureItem = item,
                elementColor = screenElementColor,
                onAction = onAction
            )
        }
    }
}

@Composable
private fun UserActionBar(
    modifier: Modifier,
    pictureItem: PictureItem,
    onAction: (PictureActions) -> Unit,
    elementColor: Color,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ic_arrow_circle_left),
            contentDescription = "Left",
            colorFilter = ColorFilter.tint(color = elementColor),

            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clickable { onAction(PictureActions.TapPrevious()) }
        )

        if (pictureItem.canDoSomething) {
            Image(
                painter = painterResource(R.drawable.do_things),
                contentDescription = "do_things",
                colorFilter = ColorFilter.tint(color = elementColor),

                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(1f, matchHeightConstraintsFirst = true)
                    .clickable { }
            )
        }


        Image(
            painter = painterResource(R.drawable.ic_arrow_circle_right),
            contentDescription = "Right",
            colorFilter = ColorFilter.tint(color = elementColor),

            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f, matchHeightConstraintsFirst = true)
                .clickable { onAction(PictureActions.TapNext()) }
        )
    }
}

@DevicePreviews
@Composable
private fun PictureDisplayPreview() {
    PictureDisplay(
        modifier = Modifier,
        item = PictureItem(
            imageId = R.drawable.rabbit,
            name = "Shape Name",
            canDoSomething = true
        ),
        onAction = {},
        screenElementColor = Color.Blue
    )
}