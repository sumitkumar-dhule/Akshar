package com.electrodiligent.core.presentation.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.util.Dimension.PADDING_SMALL

@Composable
fun SettingItem(displayText: String, onClick: () -> Unit) {
    Box(
        Modifier
            .padding(PADDING_SMALL)
            .fillMaxWidth()
    ) {
        Button(onClick = onClick) {
            Text(
                text = displayText,
                Modifier
                    .fillMaxWidth(0.5f)
                    .padding(PADDING_SMALL),
                color = Color.White,
                fontSize = 18.sp,
            )
        }

    }

}