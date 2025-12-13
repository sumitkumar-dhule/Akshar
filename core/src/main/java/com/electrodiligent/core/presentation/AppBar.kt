package com.electrodiligent.core.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.electrodiligent.core.R
import com.electrodiligent.core.presentation.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    title: String,
    onNavigationIconClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "Toggle drawer",
                    modifier = Modifier.size(38.dp)
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    AppTheme {   // 👈 your Material 3 theme
        AppBar(
            title = "App Title",
            onNavigationIconClick = {}
        )
    }
}
