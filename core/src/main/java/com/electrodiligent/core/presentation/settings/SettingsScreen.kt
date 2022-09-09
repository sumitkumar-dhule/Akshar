package com.electrodiligent.core.presentation.settings

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.electrodiligent.core.util.Dimension.PADDING_MEDIUM
import com.electrodiligent.core.util.Dimension.PADDING_TITLE
import com.electrodiligent.core.util.Dimension.PADDING_TOOLBAR

@Composable
fun SettingsScreen(navController: NavController) {

    val share = "Share"
    val feedback = "Feedback"
    val rateUs = "Rate Us"


    val settingItems: List<String> =
        listOf(
            feedback, rateUs, share
        )

    fun setActionFor(element: String) {
        when (element) {
            share -> {

            }
            feedback -> {

            }
            rateUs -> {

            }
            else -> {
                Toast.makeText(
                    navController.context,
                    "This feature will be added soon!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = PADDING_TITLE, bottom = PADDING_TOOLBAR)
                .padding(horizontal = PADDING_MEDIUM)
        ) {
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                for (element in settingItems) {
                    SettingItem(displayText = element) { setActionFor(element) }
                }
            }
        }
    }

}


