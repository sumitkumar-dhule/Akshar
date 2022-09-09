package com.electrodiligent.core.presentation.settings

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.electrodiligent.core.R
import com.electrodiligent.core.navigation.NavigationUtil
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.util.Dimension

@Composable
fun ParentVerificationScreen(navController: NavHostController) {

    val num1 by remember { mutableStateOf((0..99).random()) }
    val num2 by remember { mutableStateOf((0..9).random()) }
    var result by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BANNER_AD),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lock),
                        modifier = Modifier.size(50.dp, 50.dp),
                        contentDescription = "child lock"
                    )
                    Text(text = "CHILD LOCK", fontSize = 38.sp)
                }

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "Enter correct answer to proceed to settings",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "$num1 + $num2 = ", fontSize = 42.sp)

                    TextField(
                        modifier = Modifier.fillMaxWidth(0.4f),
                        singleLine = true,
                        textStyle = TextStyle(fontSize = 42.sp),
                        value = result,
                        onValueChange = {
                            result = it
                        }
                    )

                }

                Button(onClick = {
                    var sum = 0
                    try {
                        sum = result.toInt()
                    } catch (exception: Exception) {

                    }
                    if (num1 + num2 == sum) {
                        NavigationUtil.navigateTo(
                            navController = navController,
                            route = Screen.SettingsScreen.route
                        )
                    } else {
                        Toast.makeText(
                            navController.context,
                            "Please enter correct sum to proceed",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                }) {
                    Text(text = "Validate", fontSize = 24.sp)
                }

            }

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