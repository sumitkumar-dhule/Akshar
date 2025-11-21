package com.electrodiligent.core.presentation.number

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.presentation.alphabate.UserActions
import com.electrodiligent.core.util.ColorUtil

@Composable
fun NumberFlashcard(
    modifier: Modifier,
    numberItems: List<NumberItem>,
    textSize: TextUnit = 40.sp,
    onAction: (UserActions) -> Unit
) {

    val randomColor = ColorUtil.textColors.random().colorValue

    Box(modifier = modifier.padding(horizontal = 8.dp), contentAlignment = Alignment.Center) {

        LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(2)) {
            items(numberItems) {
                NumberCardBluePrint(modifier, it, randomColor, onAction)
            }
        }
    }
}

@Composable
fun NumberCardBluePrint(
    modifier: Modifier,
    item: NumberItem,
    randomColor: Color,
    onAction: (UserActions) -> Unit,
) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .shadow(8.dp, shape = RoundedCornerShape(4.dp))
            .clip(shape = RoundedCornerShape(4.dp))
            .clickable(onClick = { onAction(UserActions.PlaySound(audioID = item.audio)) })
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
                    numberFontSize = 60.sp
                }

                val countText = item.countString.ifEmpty {
                    item.count.toString()
                }

                Text(
                    text = countText,
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

@Preview(showBackground = true)
@Composable
fun NumberFlashcardPreview() {
    val numberItems = listOf(
        NumberItem(name = "One", count = 1),
        NumberItem(name = "Two", count = 2),
        NumberItem(name = "Three", count = 3),
        NumberItem(name = "Hundred", count = 100)
    )
    NumberFlashcard(
        modifier = Modifier.fillMaxSize(),
        numberItems = numberItems,
        onAction = { }
    )
}
