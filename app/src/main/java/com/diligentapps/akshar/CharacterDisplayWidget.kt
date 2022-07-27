package com.diligentapps.akshar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CharacterDisplayWidget() {

    Box(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(80.dp, 80.dp),
                painter = painterResource(R.drawable.ic_arrow_circle_left),
                contentDescription = "left icon"
            )

            Text(text = "A", fontSize = 60.sp)

            Image(
                modifier = Modifier.size(80.dp, 80.dp),
                painter = painterResource(id = R.drawable.ic_arrow_circle_right),
                contentDescription = "right icon"
            )
        }
    }


}