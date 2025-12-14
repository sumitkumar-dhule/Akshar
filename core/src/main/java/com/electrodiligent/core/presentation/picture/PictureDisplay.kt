package com.electrodiligent.core.presentation.picture

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.presentation.DevicePreviews
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun PictureDisplay(
    modifier: Modifier = Modifier,
    item: PictureItem,
    onAction: (PictureActions) -> Unit,
    screenElementColor: Color,
    windowSizeClass: WindowSizeClass
) {
    val isTablet =
        windowSizeClass.widthSizeClass >= WindowWidthSizeClass.Medium

    val iconSize = if (isTablet) 120.dp else 90.dp

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = item.imageId),
                contentDescription = item.name,
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .aspectRatio(1f)
                    .clickable { onAction(PictureActions.TapCurrent()) },
                contentScale = ContentScale.Fit
            )

            ResponsiveText(
                modifier = Modifier.fillMaxWidth(),
                targetTextSizeHeight = 60.sp,
                text = item.name,
                textAlign = TextAlign.Center,
                color = screenElementColor,
                textStyle = TextStyle(fontWeight = FontWeight.Bold)
            )
        }

        UserActionBar(
            modifier = Modifier.padding(top = 16.dp),
            pictureItem = item,
            iconSize = iconSize,
            elementColor = screenElementColor,
            onPrevious = { onAction(PictureActions.TapPrevious()) },
            onNext = { onAction(PictureActions.TapNext()) },
            onDoSomething = { /* optional */ }
        )
    }
}

@Composable
private fun UserActionBar(
    modifier: Modifier = Modifier,
    pictureItem: PictureItem,
    iconSize: Dp,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onDoSomething: () -> Unit,
    elementColor: Color
) {
    val iconModifier = Modifier.size(iconSize)

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(onClick = onPrevious, modifier = iconModifier) {
            Image(
                painter = painterResource(R.drawable.ic_arrow_circle_left),
                contentDescription = "Previous",
                colorFilter = ColorFilter.tint(elementColor),
                modifier = Modifier.fillMaxSize()
            )
        }

        if (pictureItem.canDoSomething) {
            IconButton(onClick = onDoSomething, modifier = iconModifier) {
                Image(
                    painter = painterResource(R.drawable.do_things),
                    contentDescription = "Do Something",
                    colorFilter = ColorFilter.tint(elementColor),
                    modifier = Modifier.fillMaxSize()
                )
            }
        } else {
            Spacer(modifier = iconModifier)
        }

        IconButton(onClick = onNext, modifier = iconModifier) {
            Image(
                painter = painterResource(R.drawable.ic_arrow_circle_right),
                contentDescription = "Next",
                colorFilter = ColorFilter.tint(elementColor),
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview(
    name = "Phone",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true // This adds the system bars
)
@Composable
private fun PictureDisplayPhonePreview() {
    PictureDisplay(
        item = PictureItem(
            imageId = R.drawable.rabbit,
            name = "Phone",
            canDoSomething = true
        ),
        onAction = {},
        screenElementColor = Color.Blue,
        windowSizeClass = WindowSizeClass.calculateFromSize(
            DpSize(360.dp, 640.dp) // phone
        )
    )
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Preview(
    name = "Tablet Portrait",
    device = Devices.TABLET,
    showBackground = true,
    widthDp = 600,
    heightDp = 800
)
@Composable
private fun PictureDisplayTabletPreview() {
    PictureDisplay(
        item = PictureItem(
            imageId = R.drawable.rabbit,
            name = "Tablet",
            canDoSomething = true
        ),
        onAction = {},
        screenElementColor = Color.Blue,
        windowSizeClass = WindowSizeClass.calculateFromSize(
            DpSize(800.dp, 1280.dp) // tablet
        )
    )
}
