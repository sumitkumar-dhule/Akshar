package com.electrodiligent.core.presentation.settings

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.electrodiligent.core.util.Dimension.PADDING_MEDIUM
import com.electrodiligent.core.util.Dimension.PADDING_TITLE
import com.electrodiligent.core.util.Dimension.PADDING_TOOLBAR

@Composable
fun SettingsScreen(navController: NavController, reviewUrl: String) {

    val share = "Share"
    val rateUs = "Rate Us"
    val buyAdFree = "Buy Ad free version"

    val settingItems: List<String> =
        listOf(
            rateUs, share
        )


    fun share() {
        Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(
                Intent.EXTRA_TEXT,
                " Hey Check out this Great Preschool learning App: \n\n"
                        + reviewUrl +
                        "\n\nIt's really fun"
            )
            type = "text/plain"
        }.also {
            ContextCompat.startActivity(
                navController.context,
                Intent.createChooser(it, "Share to"),
                null
            )
        }
    }

    fun reviewApp() {

        val playIntent: Intent = Intent().apply {

            action = Intent.ACTION_VIEW

            data =
                Uri.parse(reviewUrl)

        }
        try {
            navController.context.startActivity(playIntent)
        } catch (e: Exception) {
            // handle the exception
        }


    }

    fun setActionFor(element: String) {
        when (element) {
            share -> {
                share()
            }

            rateUs -> {
                reviewApp()
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

                Text(
                    text = "Thank you for downloading \nPRESCHOOL ESSENTIALS" +
                            "\n\nWe wish you great blessings and a good future for your child." +
                            "\n\nTo keep us motivated please consider rating this app and share with the appropriate audience.",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
                for (element in settingItems) {
                    SettingItem(displayText = element) { setActionFor(element) }
                }
            }
        }
    }


}


