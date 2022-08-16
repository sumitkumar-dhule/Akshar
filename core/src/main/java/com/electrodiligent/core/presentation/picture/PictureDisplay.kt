package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

@Composable
fun PictureDisplay(
    modifier: Modifier,
    items: List<PictureItem>,
    title: String,
    titleAudio: Int
) {

    val pictureDisplayViewModel = hiltViewModel<PictureDisplayViewModel>()
    pictureDisplayViewModel.displayPictures = items
    pictureDisplayViewModel.titleAudio = titleAudio
    pictureDisplayViewModel.setup()

    val shapeItem = pictureDisplayViewModel.pictureItem

    Box(modifier = modifier) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.18f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_left),
                    contentDescription = "Left",
                    colorFilter = ColorFilter.tint(color = pictureDisplayViewModel.randomColor),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { pictureDisplayViewModel.previousShape() }
                )

                Text(
                    modifier = Modifier.weight(1f, fill = true),
                    fontSize = 30.sp,
                    text = title,
                    textAlign = TextAlign.Center,
                    color = pictureDisplayViewModel.randomColor,
                    fontWeight = FontWeight.Bold
                )


                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_right),
                    contentDescription = "Right",
                    colorFilter = ColorFilter.tint(color = pictureDisplayViewModel.randomColor),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { pictureDisplayViewModel.nextShape() }
                )
            }



            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = shapeItem.imageId),
                    contentDescription = shapeItem.name,
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Fit

                )

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 50.sp,
                    text = shapeItem.name,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = pictureDisplayViewModel.randomColor
                )
            }

        }
    }
}