package com.electrodiligent.core.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.domain.model.DisplayCharacter

@Composable
fun AlphabetFlashcard(
    modifier: Modifier,
    displayCharacters: List<DisplayCharacter>
) {

    Box(modifier = modifier.padding(horizontal = 16.dp), contentAlignment = Alignment.Center) {

        LazyColumn(modifier.fillMaxSize()) {
            items(displayCharacters) { item ->

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(Color.DarkGray)
                        .shadow(1.dp, shape = RoundedCornerShape(4.dp))
                ) {
                    Row(
                        modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = item.display,
                            fontSize = 90.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = item.subtitle,
                            fontSize = 90.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }

        }

    }
}