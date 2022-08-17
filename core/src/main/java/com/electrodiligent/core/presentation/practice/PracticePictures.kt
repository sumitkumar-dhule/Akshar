package com.electrodiligent.core.presentation.practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.domain.model.PictureQuestion
import com.electrodiligent.core.util.RandomColor
import com.electrodiligent.core.util.ResponsiveText


@Composable
fun PracticePictures(
    modifier: Modifier,
    items: List<PictureQuestion>
) {

    val practicePicturesViewModel = hiltViewModel<PracticePicturesViewModel>()
    practicePicturesViewModel.questions = items

    practicePicturesViewModel.setup()

    val question = practicePicturesViewModel.question

    Column(
        modifier = modifier
            .padding(horizontal = 8.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 0.dp)
                .clickable(onClick = { practicePicturesViewModel.playQuestion() }),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                modifier = Modifier
                    .size(50.dp, 50.dp),
                painter = painterResource(id = R.drawable.play_button),
                colorFilter = ColorFilter.tint(practicePicturesViewModel.randomColor),
                contentDescription = "Play Sound"
            )

            Text(
                text = "FIND",
                fontSize = 25.sp,
                color = practicePicturesViewModel.randomColor
            )

            ResponsiveText(
                targetTextSizeHeight = 60.sp,
                text = question.question,
                textAlign = TextAlign.Center,
                color = practicePicturesViewModel.randomColor,
                textStyle = TextStyle(fontWeight = FontWeight.Bold)
            )

        }

        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth()
                .aspectRatio(1f), contentAlignment = Alignment.Center
        ) {
            LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(2)) {
                items(question.options) {
                    PictureOption(modifier, it, practicePicturesViewModel)
                }
            }
        }

    }
}

@Composable
fun PictureOption(
    modifier: Modifier,
    item: PictureItem,
    practiceDisplayViewModel: PracticePicturesViewModel
) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .shadow(4.dp, shape = RoundedCornerShape(4.dp))
            .clip(shape = RoundedCornerShape(4.dp))
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(onClick = {
                    practiceDisplayViewModel.optionSelected(item)
                }), contentAlignment = Alignment.Center
        ) {
            Box(
                modifier
                    .fillMaxWidth(0.5f)
                    .aspectRatio(1f)
                    .padding(horizontal = 4.dp),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = item.imageId),
                    contentDescription = item.name,
                    modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Fit
                )

            }
        }
    }

}