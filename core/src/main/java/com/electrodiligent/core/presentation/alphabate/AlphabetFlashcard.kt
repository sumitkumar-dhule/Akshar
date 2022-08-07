package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.util.RandomColor

@Composable
fun AlphabetFlashcard(
    modifier: Modifier,
    displayCharacters: List<DisplayCharacter>
) {

    val randomColor = RandomColor.list.random().colorValue
    val alphabetFlashcardViewModel = hiltViewModel<AlphabetFlashcardViewModel>()

    Box(modifier = modifier.padding(horizontal = 16.dp), contentAlignment = Alignment.Center) {

        LazyColumn(modifier.fillMaxSize()) {
            items(displayCharacters) { item ->

                Card(
                    modifier = Modifier
                        .padding(32.dp)
                        .shadow(16.dp, shape = RoundedCornerShape(8.dp))
                        .clip(shape = RoundedCornerShape(8.dp))

                ) {

                    Box {
                        Row(
                            modifier
                                .fillMaxWidth()
                                .clickable(onClick = { alphabetFlashcardViewModel.playSound(item) }),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = item.display,
                                fontSize = 90.sp,
                                color = randomColor,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = item.subtitle,
                                fontSize = 90.sp,
                                color = randomColor,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}