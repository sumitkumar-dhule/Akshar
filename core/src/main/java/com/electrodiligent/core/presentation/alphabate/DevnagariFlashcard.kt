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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
