package com.electrodiligent.core.presentation.shape

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ShapeItem

@Composable
fun ShapeDisplay(
    modifier: Modifier,
    items: List<ShapeItem>
) {

    val shapeDisplayViewModel = hiltViewModel<ShapeDisplayViewModel>()
    shapeDisplayViewModel.displayShapes = items

    shapeDisplayViewModel.setup()

    val shapeItem = shapeDisplayViewModel.shapeItem

    Box(modifier = modifier) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.18f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_left),
                    contentDescription = "Left",
                    colorFilter = ColorFilter.tint(color = Color.Blue),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { shapeDisplayViewModel.previous() }
                )

                Text(
                    modifier = Modifier.weight(1f, fill = true),
                    fontSize = 30.sp,
                    text = shapeItem.name,
                    textAlign = TextAlign.Center,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold
                )

                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_right),
                    contentDescription = "Right",
                    colorFilter = ColorFilter.tint(color = Color.Blue),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { shapeDisplayViewModel.next() }
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight(0.7f)
                    .padding(bottom = 80.dp)
                    .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = true)
                    .clickable(onClick = { }),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = shapeItem.imageId),
                    contentDescription = shapeItem.name,
                    colorFilter = ColorFilter.tint(color = Color.Blue),
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit

                )
            }

        }
    }
}