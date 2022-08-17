package com.electrodiligent.core.presentation.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun ColorDisplay(
    modifier: Modifier,
    colorItems: List<ColorItem>
) {

    val colorDisplayViewModel = hiltViewModel<ColorDisplayViewModel>()
    colorDisplayViewModel.displayColors = colorItems

    colorDisplayViewModel.setup()

    val colorItem = colorDisplayViewModel.colorItemState

    Box(modifier = modifier) {

        if (colorItem.colorValue == Color.White) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
            )
        }

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.17f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_left),
                    contentDescription = "Left",
                    colorFilter = ColorFilter.tint(color = colorItem.colorValue),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { colorDisplayViewModel.previousColor() }
                )

                ResponsiveText(
                    modifier = Modifier.weight(1f, fill = true),
                    targetTextSizeHeight = 45.sp,
                    text = "Colors",
                    textAlign = TextAlign.Center,
                    color = colorItem.colorValue,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )

                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_right),
                    contentDescription = "Right",
                    colorFilter = ColorFilter.tint(color = colorItem.colorValue),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { colorDisplayViewModel.nextColor() }
                )
            }


            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(0.9f)
                        .clip(RoundedCornerShape(16.dp))
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(16.dp))
                        .aspectRatio(ratio = 1f)
                        .background(color = colorItem.colorValue)
                        .clickable(onClick = { colorDisplayViewModel.currentColor() }),
                    contentAlignment = Alignment.Center
                ) {

                }

                ResponsiveText(
                    targetTextSizeHeight = 70.sp,
                    text = colorItem.name,
                    textAlign = TextAlign.Center,
                    color = colorItem.colorValue,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}