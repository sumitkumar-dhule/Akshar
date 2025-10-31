package com.electrodiligent.core.presentation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.electrodiligent.core.R
@Composable
fun AppBar(
    title: String,
    onNavigationIconClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_book),
                    contentDescription = "Toggle drawer"
                )
            }
        }
    )
}