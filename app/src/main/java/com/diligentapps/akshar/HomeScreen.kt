package com.diligentapps.akshar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.diligentapps.core.domain.model.DisplayCharacter
import com.diligentapps.core.presentation.CharacterDisplayWidget

@Composable
fun HomeScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        val list = listOf<DisplayCharacter>(
            DisplayCharacter(
                display = "A", left = "Z", right = "B",
                displayName = "Apple",
                displayImage = painterResource(id = R.drawable.apple)
            ),
            DisplayCharacter(
                display = "B", left = "A", right = "C", displayName = "Ball",
                displayImage = painterResource(id = R.drawable.ball)
            ),
            DisplayCharacter(
                display = "C", left = "B", right = "D", displayName = "Cat",
                displayImage = painterResource(id = R.drawable.cat)
            ),
            DisplayCharacter(
                display = "D", left = "C", right = "E", displayName = "Dog",
                displayImage = painterResource(id = R.drawable.apple)
            )
        )

        CharacterDisplayWidget(
            list
        )
    }

}