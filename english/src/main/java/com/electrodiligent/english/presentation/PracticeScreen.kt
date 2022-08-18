package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.navigation.PracticeItems

@Composable
fun PracticeScreen(navController: NavHostController) {

    val brownColor = Color(red = 168, green = 42, blue = 42)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .fillMaxSize()
        ) {

            Text(
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                text = "Practice",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                color = brownColor
            )

            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize(),
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                items(PracticeItems.menu) {
                    DisplayTile(
                        modifier = Modifier.fillMaxSize(),
                        navController = navController,
                        item = it,
                        color = brownColor
                    )
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
