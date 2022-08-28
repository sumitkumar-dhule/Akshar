package com.electrodiligent.core.presentation.alphabate

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
fun CharacterDisplay(
    modifier: Modifier,
    displayCharacters: List<DisplayCharacter>,
    showSubtitle: Boolean = false,
) {
    val characterDisplayViewModel = hiltViewModel<CharacterDisplayViewModel>()
    characterDisplayViewModel.displayCharacters = displayCharacters

    characterDisplayViewModel.setup()

    val alphabet = characterDisplayViewModel.displayCharacterState

    Box(modifier = modifier) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.2f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                DisplaySlip(
                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .alpha(0.4f),
                    letter = alphabet.left,
                    fontSize = 30.sp,
                    onClick = { characterDisplayViewModel.previous() }
                )

                DisplaySlip(
                    modifier = Modifier
                        .fillMaxSize(0.5f)
                        .aspectRatio(1f),
                    letter = alphabet.display,
                    fontSize = 80.sp,
                    subtitle = alphabet.subtitle,
                    showSubtitle = showSubtitle,
                    onClick = { characterDisplayViewModel.playSound() }
                )

                DisplaySlip(
                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .alpha(0.4f),
                    letter = alphabet.right,
                    fontSize = 30.sp,
                    onClick = { characterDisplayViewModel.next() }
                )
            }

            Text(
                text = alphabet.displayName,
                fontSize = 50.sp,
                color = characterDisplayViewModel.randomColor,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight(0.7f)
                    .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = true)
                    .clickable(onClick = { characterDisplayViewModel.playSound() }),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = alphabet.displayImage),
                    contentDescription = "Image of ${alphabet.displayName}",
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