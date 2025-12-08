package com.electrodiligent.core.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    modifier = Modifier.size(38.dp) ,

                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "Toggle drawer"
                )
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    // It's a good practice to wrap previews in your app's theme
    // to ensure components like colors and fonts are displayed correctly.
    // Using MaterialTheme as a base.
    MaterialTheme {
        AppBar(
            title = "App Title",
            onNavigationIconClick = { /* In preview, this does nothing */ }
        )
    }
}