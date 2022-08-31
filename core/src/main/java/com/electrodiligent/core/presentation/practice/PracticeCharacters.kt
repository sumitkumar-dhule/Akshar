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
import com.electrodiligent.core.util.ColorUtil


@Composable
fun PracticeCharacters(
    modifier: Modifier,
    items: List<CharacterQuestion>
) {

    val randomColorList = ColorUtil.list.toMutableList()

    val practiceCharactersViewModel = hiltViewModel<PracticeCharactersViewModel>()
    practiceCharactersViewModel.questions = items

    practiceCharactersViewModel.setup()

    val question = practiceCharactersViewModel.question

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
                .clickable(onClick = { practiceCharactersViewModel.playQuestion() }),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                modifier = Modifier
                    .size(50.dp, 50.dp),
                painter = painterResource(id = R.drawable.play_button),
                colorFilter = ColorFilter.tint(practiceCharactersViewModel.randomColor),
                contentDescription = "Play Sound"
            )

            Text(
                text = question.question,
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = practiceCharactersViewModel.randomColor
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
                    Options(modifier, it, practiceCharactersViewModel, randomColorList)
                }
            }
        }

    }
}

@Composable
fun Options(
    modifier: Modifier,
    item: String,
    practiceCharactersViewModel: PracticeCharactersViewModel,
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
                    practiceCharactersViewModel.optionSelected(item)
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