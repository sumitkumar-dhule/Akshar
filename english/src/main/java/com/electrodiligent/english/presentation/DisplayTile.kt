package com.electrodiligent.english.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.NavigationUtil


@Composable
fun DisplayTile(
    modifier: Modifier,
    navController: NavHostController,
    item: NavigationItem,
    color: Color
) {
    Card(
        modifier = modifier
            .fillMaxWidth(0.3f)
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
                    .clickable(onClick = {
                        NavigationUtil.push(navController, item.navigationRoute.route)
                    })
                    .padding(bottom = 4.dp),
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
