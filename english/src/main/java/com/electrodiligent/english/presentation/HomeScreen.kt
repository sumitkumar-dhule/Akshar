package com.electrodiligent.english.presentation

import androidx.compose.foundation.*
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.navigation.LearningItems
import com.electrodiligent.english.navigation.NavigationItem
import com.electrodiligent.english.navigation.NavigationUtil
import com.electrodiligent.english.navigation.PracticeItems

@Composable
fun HomeScreen(navController: NavHostController) {

    val brownColor = Color(red = 168, green = 42, blue = 42)

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
        ) {

            Column(
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .fillMaxSize()
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
                            textAlign = TextAlign.Center,
                            color = brownColor
                        )

                        LazyHorizontalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1.5f),
                            rows = GridCells.Fixed(2),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            items(LearningItems.menu) {
                                LearnOptions(
                                    modifier = Modifier.fillMaxSize(),
                                    navController = navController,
                                    item = it,
                                    color = brownColor
                                )
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
                            textAlign = TextAlign.Center,
                            color = brownColor
                        )

                        LazyHorizontalGrid(
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(3f),
                            rows = GridCells.Fixed(1),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalArrangement = Arrangement.SpaceEvenly
                        ) {
                            items(PracticeItems.menu) {
                                LearnOptions(
                                    modifier = Modifier.fillMaxSize(),
                                    navController = navController,
                                    item = it,
                                    color = brownColor
                                )
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
    modifier: Modifier,
    navController: NavHostController,
    item: NavigationItem,
    color: Color
) {
    Card(
        modifier = modifier
            .fillMaxHeight(0.5f)
            .aspectRatio(1f)
            .padding(8.dp)
            .shadow(4.dp, shape = RoundedCornerShape(4.dp))
            .clip(shape = RoundedCornerShape(4.dp))

    ) {

        Box(
            modifier = Modifier
                .fillMaxSize(),
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
                    .padding(bottom = 4.dp)
                    .clickable(onClick = {
                        NavigationUtil.navigateTo(navController, item.navigationRoute.route)
                    }),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {

                Text(
                    text = item.title,
                    textAlign = TextAlign.Center,
                    color = color,
                )
            }
        }
    }

}
