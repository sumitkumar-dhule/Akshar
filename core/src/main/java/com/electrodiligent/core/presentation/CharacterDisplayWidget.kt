package com.electrodiligent.core.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.domain.model.DisplayCharacter

@Composable
fun CharacterDisplayWidget(
    displayCharacters: List<DisplayCharacter>,
    showSubtitle: Boolean = false,
    ) {
    val characterDisplayViewModel = hiltViewModel<CharacterDisplayViewModel>()
    characterDisplayViewModel.displayCharacters = displayCharacters

    characterDisplayViewModel.setup()

    var alphabate = characterDisplayViewModel.displayCharacterState

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                DisplaySlip(
                    modifier = Modifier
                        .size(80.dp, 80.dp)
                        .alpha(0.4f),
                    letter = alphabate.left,
                    fontSize = 40.sp,
                    onClick = { characterDisplayViewModel.previous() }
                )

                DisplaySlip(
                    modifier = Modifier.size(160.dp, 160.dp),
                    letter = alphabate.display,
                    fontSize = 90.sp,
                    subtitle = alphabate.subtitle,
                    showSubtitle = showSubtitle,
                    onClick = { characterDisplayViewModel.playSound() }
                )

                DisplaySlip(
                    modifier = Modifier
                        .size(80.dp, 80.dp)
                        .alpha(0.4f),
                    letter = alphabate.right,
                    fontSize = 40.sp,
                    onClick = { characterDisplayViewModel.next() }
                )
            }

            Text(
                text = alphabate.displayName,
                fontSize = 50.sp,
                color = Color.Magenta,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier.fillMaxWidth(0.8f)
                    .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = false)
                    .clickable(onClick = { characterDisplayViewModel.playSound() }),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = alphabate.displayImage),
                    contentDescription = "alphabet",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit
                )
            }

        }
    }

}

@Composable
fun DisplaySlip(
    modifier: Modifier,
    letter: String,
    subtitle: String = "",
    fontSize: TextUnit,
    showSubtitle: Boolean = false,
    onClick: () -> Unit = {}
) {

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Brush.verticalGradient(listOf(Color.Blue, Color.DarkGray)))
            .shadow(elevation = 1.dp, shape = RectangleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {

        Text(text = letter, fontSize = fontSize, color = Color.White)

        if (showSubtitle)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                Text(
                    text = subtitle,
                    fontSize = 32.sp,
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
    }

}