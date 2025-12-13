package com.electrodiligent.core.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.Screen

/**
 * A reusable tile for displaying a navigation item.
 *
 * @param item The data for the tile, including icon and title.
 * @param color The color to use for the title text.
 * @param onClick The action to perform when the tile is clicked.
 * @param modifier The modifier to be applied to the component.
 */
@Composable
fun DisplayTile(
    item: NavigationItem,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ElevatedCard(
        onClick = onClick,
        shape = RoundedCornerShape(4.dp),
        modifier = modifier
            .fillMaxWidth(0.3f)
            .aspectRatio(1f)
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // Apply a conditional background for specific screens
            if (item.navigationRoute in listOf(Screen.HomeScreen, Screen.PracticeScreen)) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Brush.verticalGradient(listOf(Color.Blue, Color.White)))
                        .alpha(0.4f)
                )
            }

            Image(
                painter = painterResource(id = item.icon),
                contentDescription = item.title,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp, end = 24.dp, bottom = 32.dp)
            )

            Text(
                text = item.title,
                textAlign = TextAlign.Center,
                color = color,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 4.dp)
            )
        }
    }
}
