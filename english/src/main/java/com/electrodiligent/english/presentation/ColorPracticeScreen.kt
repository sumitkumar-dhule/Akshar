package com.electrodiligent.english.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.electrodiligent.core.presentation.practice.PracticeColorfulPictures
import com.electrodiligent.core.presentation.practice.PracticePictures
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.english.data.PictureQuestionRepository

@Composable
fun ColorPracticeScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD)
        ) {
            PracticeColorfulPictures(
                modifier = Modifier.fillMaxSize(),
                items = PictureQuestionRepository.colorQuestionList
            )
        }

        //TODO:: Display Ad in following box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(Dimension.PADDING_BANNER_AD)
        )
    }


}