package com.diligentapps.core.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diligentapps.core.R
import com.diligentapps.core.domain.model.DisplayCharacter

@Composable
fun CharacterDisplayWidget(
    displayCharacters: List<DisplayCharacter>,
) {
    val characterDisplayViewModel = hiltViewModel<CharacterDisplayViewModel>()
    characterDisplayViewModel.displayCharacters = displayCharacters

    characterDisplayViewModel.setup()

    var alphabate = characterDisplayViewModel.displayCharacterState

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                DisplaySlip(
                    modifier = Modifier.size(80.dp, 80.dp),
                    letter = alphabate.left,
                    fontSize = 40.sp,
                    onClick = { characterDisplayViewModel.previous() }
                )

                DisplaySlip(
                    modifier = Modifier.size(160.dp, 160.dp),
                    letter = alphabate.display,
                    fontSize = 90.sp,
                    onClick = { characterDisplayViewModel.playSound() }
                )

                DisplaySlip(
                    modifier = Modifier.size(80.dp, 80.dp),
                    letter = alphabate.right,
                    fontSize = 40.sp,
                    onClick = { characterDisplayViewModel.next() }
                )
            }

            Text(text = alphabate.displayName, fontSize = 50.sp, color = Color.DarkGray)
            Box(modifier = Modifier.size(300.dp, 300.dp), contentAlignment = Alignment.Center) {

                Image(
                    painter = alphabate.displayImage
                        ?: painterResource(id = R.drawable.ic_image_placeholder),
                    contentDescription = "alphabet",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit,
                    alpha = 0.95f
                )
            }

        }
    }

}

@Composable
fun DisplaySlip(modifier: Modifier, letter: String, fontSize: TextUnit, onClick: () -> Unit = {}) {

    Box(
        modifier = modifier.clip(RoundedCornerShape(8.dp))
            .background(Brush.verticalGradient(listOf(Color.Blue, Color.DarkGray)))
            .shadow(elevation = 1.dp, shape = RectangleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(text = letter, fontSize = fontSize, color = Color.White)
    }

}