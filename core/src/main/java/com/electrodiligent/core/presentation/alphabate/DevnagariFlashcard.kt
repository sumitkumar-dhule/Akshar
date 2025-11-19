package com.electrodiligent.core.presentation.alphabate

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter
import com.electrodiligent.core.util.ColorUtil
import com.electrodiligent.core.util.ResponsiveText

@Composable
fun DevnagariFlashcard(
    modifier: Modifier,
    displayCharacters: List<DisplayCharacter>,
    onAction: (UserActions) -> Unit
) {

    val randomColor = ColorUtil.textColors.random().colorValue

    Box(modifier = modifier.padding(horizontal = 8.dp), contentAlignment = Alignment.Center) {

        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize(),
            columns = GridCells.Fixed(3),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            items(displayCharacters) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .padding(8.dp)
                        .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                        .clip(shape = RoundedCornerShape(8.dp))
                        .clickable(onClick = { onAction(UserActions.PlaySound(it)) })

                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center),
                        contentAlignment = Alignment.Center
                    ) {

                        ResponsiveText(
                            targetTextSizeHeight = 60.sp,
                            text = it.display,
                            textAlign = TextAlign.Center,
                            color = randomColor,
                            textStyle = TextStyle(fontWeight = FontWeight.SemiBold)
                        )

                    }
                }

            }
        }

    }
}

@Preview
@Composable
fun DevnagariFlashcardPeview(){
    val list = listOf(
        DisplayCharacter(
            left = "अ:", display = "अ", right = "आ",
            displayImage = R.drawable.pomegranate,
            displayName = "अनार",
        ),
        DisplayCharacter(
            left = "अ", display = "आ", right = "इ",
            displayImage = R.drawable.mango,
            displayName = "आम",
        ),
        DisplayCharacter(
            left = "आ", display = "इ", right = "ई",
            displayImage = R.drawable.tamarind,
            displayName = "इमली",
        ),
        DisplayCharacter(
            left = "इ", display = "ई", right = "उ",
            displayImage = R.drawable.sugarcane,
            displayName = "ईख",
        ),
        DisplayCharacter(
            left = "ई", display = "उ", right = "ऊ",
            displayImage = R.drawable.owl,
            displayName = "उल्लू",
        ),
        DisplayCharacter(
            left = "उ", display = "ऊ", right = "ऋ",
            displayImage = R.drawable.camel,
            displayName = "ऊंट",
        ),
        DisplayCharacter(
            left = "ऊ", display = "ऋ", right = "ए",
            displayImage = R.drawable.rushi,
            displayName = "ऋषि",
        ),
        DisplayCharacter(
            left = "ऋ", display = "ए", right = "ऐ",
            displayImage = R.drawable.ankle,
            displayName = "एड़ी",
        ),
        DisplayCharacter(
            left = "ए", display = "ऐ", right = "ओ",
            displayImage = R.drawable.spectacle,
            displayName = "ऐनक",
        ),
        DisplayCharacter(
            left = "ऐ", display = "ओ", right = "औ",
            displayImage = R.drawable.okhali,
            displayName = "ओखली",
        ),
        DisplayCharacter(
            left = "ओ", display = "औ", right = "अं",
            displayImage = R.drawable.ashwini,
            displayName = "औरत",
        ),
        DisplayCharacter(
            left = "औ", display = "अं", right = "अ:",
            displayImage = R.drawable.grapes,
            displayName = "अंगूर",
        ),
        DisplayCharacter(
            left = "अं", display = "अ:", right = "अ",
            displayName = "",
            displayImage = R.drawable.aha,
        )
    )

    DevnagariFlashcard(modifier = Modifier.fillMaxSize(), displayCharacters = list, onAction = {})
}
