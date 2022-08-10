package com.electrodiligent.core.presentation.practice

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.CharacterQuestion
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.RandomColor


@Composable
fun PracticeDisplay(
    modifier: Modifier,
    items: List<CharacterQuestion>
) {

    val randomColorList = RandomColor.list.toMutableList()

    val practiceDisplayViewModel = hiltViewModel<PracticeDisplayViewModel>()
    practiceDisplayViewModel.questions = items

    practiceDisplayViewModel.setup()

    val question = practiceDisplayViewModel.question

    Column(
        modifier = modifier
            .padding(horizontal = 8.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

//        Text(text = "Score: ${practiceDisplayViewModel.score}")

        Row(
            modifier = Modifier
                .padding(horizontal = 0.dp)
                .clickable(onClick = { practiceDisplayViewModel.playQuestion() }),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                modifier = Modifier
                    .size(35.dp, 35.dp),
                painter = painterResource(id = R.drawable.ic_audio),
                colorFilter = ColorFilter.tint(practiceDisplayViewModel.randomColor),
                contentDescription = "Play Sound"
            )

            Text(
                text = question.question,
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = practiceDisplayViewModel.randomColor
            )

            Image(
                modifier = Modifier
                    .size(35.dp, 35.dp),
                painter = painterResource(id = R.drawable.ic_audio),
                colorFilter = ColorFilter.tint(practiceDisplayViewModel.randomColor),
                contentDescription = "Play Sound"
            )
        }

        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth()
                .aspectRatio(1f), contentAlignment = Alignment.Center
        ) {
            LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(3)) {
                items(question.options) {
                    Options(modifier, it, practiceDisplayViewModel, randomColorList)
                }
            }
        }

    }
}

@Composable
fun Options(
    modifier: Modifier,
    item: String,
    practiceDisplayViewModel: PracticeDisplayViewModel,
    randomColorList: MutableList<ColorItem>
) {

    fun getNewColour(): Color {
        val newColor = randomColorList.random()
        randomColorList.remove(newColor)
        return newColor.colorValue
    }

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
                    .fillMaxWidth(0.3f)
                    .aspectRatio(1f)
                    .padding(horizontal = 4.dp),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = item,
                    fontSize = 64.sp,
                    color = getNewColour(),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}