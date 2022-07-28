package com.diligentapps.akshar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.diligentapps.core.presentation.CharacterDisplayWidget

@Composable
fun HomeScreen(){

    Box(modifier = Modifier.fillMaxSize()) {
        CharacterDisplayWidget()
    }

}