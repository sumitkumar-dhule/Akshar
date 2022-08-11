package com.electrodiligent.english.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.data.AlphabetQuestionRepository
import com.electrodiligent.english.navigation.LearningItems
import com.electrodiligent.english.navigation.NavigationItem
import com.electrodiligent.english.navigation.PracticeItems

@Composable
fun HomeScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
        ) {

            val options = AlphabetQuestionRepository.list.random().options

            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .shadow(4.dp, shape = RoundedCornerShape(4.dp))
                        .clip(shape = RoundedCornerShape(4.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp, bottom = 16.dp)

                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            text = "Learning",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center
                        )

                        LazyHorizontalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(280.dp),
                            rows = GridCells.Fixed(2),
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            items(LearningItems.menu) {
                                LearnOptions(it)
                            }
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .shadow(4.dp, shape = RoundedCornerShape(4.dp))
                        .clip(shape = RoundedCornerShape(4.dp))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp, end = 8.dp, bottom = 16.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            text = "Practice",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center
                        )

                        LazyHorizontalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp),
                            rows = GridCells.Fixed(1),
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            items(PracticeItems.menu) {
                                LearnOptions(it)
                            }
                        }
                    }
                }
            }

        }

        //TODO:: Display Ad in following box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(Dimension.PADDING_BANNER_AD)
        )
    }

}

@Composable
fun LearnOptions(
    item: NavigationItem
) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .shadow(4.dp, shape = RoundedCornerShape(4.dp))
            .clip(shape = RoundedCornerShape(4.dp))

    ) {

        Box(
            modifier = Modifier
                .size(120.dp, 120.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, end = 24.dp, bottom = 32.dp),
                contentScale = ContentScale.Fit,
                painter = painterResource(id = item.icon),
                contentDescription = item.title,
                alignment = Alignment.Center
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(onClick = {

                    }),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {

                Text(
                    text = item.title,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}
