package com.electrodiligent.core.presentation.number

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.presentation.brownColor
import com.electrodiligent.core.presentation.number.count.*
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun NumberDisplay(
    modifier: Modifier,
    items: List<NumberItem>
) {

    val numberDisplayViewModel = hiltViewModel<NumberDisplayViewModel>()
    numberDisplayViewModel.displayNumbers = items

    numberDisplayViewModel.setup()

    val numberItem = numberDisplayViewModel.numberItem

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
                        .clickable { numberDisplayViewModel.previous() }
                )

                ResponsiveText(
                    modifier = Modifier
                        .weight(1f, fill = true),
                    targetTextSizeHeight = 40.sp,
                    text = numberItem.name,
                    textAlign = TextAlign.Center,
                    color = Color.Blue,
                    textStyle = TextStyle(fontWeight = FontWeight.Normal)
                )

                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_right),
                    contentDescription = "Right",
                    colorFilter = ColorFilter.tint(color = Color.Blue),

                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { numberDisplayViewModel.next() }
                )
            }

            Box(
                modifier = Modifier
                    .clickable(onClick = { numberDisplayViewModel.currentNumber() })
                    .fillMaxHeight(0.22f)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Brush.verticalGradient(listOf(Color.Blue, Color.DarkGray)))
                    .shadow(elevation = 1.dp, shape = RectangleShape),
                contentAlignment = Center
            ) {

                val countText = numberItem.countString.ifEmpty {
                    numberItem.count.toString()
                }

                Text(
                    text = countText,
                    fontWeight = FontWeight.Normal,
                    fontSize = 60.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Box(
                modifier = Modifier
                    .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = false),
                contentAlignment = Alignment.Center
            ) {

                when (numberItem.count) {
                    1 -> HorizontalCount(image = numberItem.image, count = 1)
                    2 -> HorizontalCount(image = numberItem.image, count = 2)
                    3 -> HorizontalCount(image = numberItem.image, count = 3)
                    4 -> Four(image = numberItem.image)
                    5 -> Five(image = numberItem.image)
                    6 -> Six(image = numberItem.image)
                    7 -> Seven(image = numberItem.image)
                    8 -> Eight(image = numberItem.image)
                    9 -> Nine(image = numberItem.image)
                    10 -> Ten(image = numberItem.image)
                    11 -> Eleven(image = numberItem.image)
                    12 -> Twelve(image = numberItem.image)
                    13 -> Thirteen(image = numberItem.image)
                    14 -> Fourteen(image = numberItem.image)
                    15 -> Fifteen(image = numberItem.image)
                    16 -> Sixteen(image = numberItem.image)
                    17 -> Seventeen(image = numberItem.image)
                    18 -> Eighteen(image = numberItem.image)
                    19 -> Nineteen(image = numberItem.image)
                    20 -> Twenty(image = numberItem.image)
                }
            }
        }
    }
}