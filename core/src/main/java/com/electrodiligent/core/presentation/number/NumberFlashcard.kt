package com.electrodiligent.core.presentation.number

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.util.RandomColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NumberFlashcard(
    modifier: Modifier,
    numberItems: List<NumberItem>
) {

    val randomColor = RandomColor.list.random().colorValue
    val numberFlashcardViewModel = hiltViewModel<NumberFlashcardViewModel>()

    Box(modifier = modifier.padding(horizontal = 8.dp), contentAlignment = Alignment.Center) {


        LazyVerticalGrid(modifier = modifier, cells = GridCells.Fixed(2), content = {
            items(numberItems) {
                NumberCardBluePrint(modifier, it, randomColor, numberFlashcardViewModel)
            }
        })
    }
}

@Composable
fun NumberCardBluePrint(
    modifier: Modifier,
    item: NumberItem,
    randomColor: Color,
    numberFlashcardViewModel: NumberFlashcardViewModel
) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .shadow(8.dp, shape = RoundedCornerShape(4.dp))
            .clip(shape = RoundedCornerShape(4.dp))
            .clickable(onClick = { numberFlashcardViewModel.playSound(item = item) })
    ) {

        Box {
            Column(
                modifier
                    .fillMaxWidth(0.5f)
                    .aspectRatio(0.7f)
                    .padding(horizontal = 4.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var numberFontSize = 90.sp
                if (item.count > 99) {
                    numberFontSize = 70.sp
                }
                Text(
                    text = item.count.toString(),
                    fontSize = numberFontSize,
                    color = randomColor,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = item.name,
                    fontSize = 24.sp,
                    color = randomColor,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}