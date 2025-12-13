package com.electrodiligent.hindi.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.electrodiligent.core.navigation.NavigationItem
import com.electrodiligent.core.navigation.NavigationUtil
import com.electrodiligent.core.navigation.Screen
import com.electrodiligent.core.presentation.DisplayTile
import com.electrodiligent.hindi.presentation.ads.BannerAdvertView
import com.electrodiligent.core.util.Dimension
import com.electrodiligent.hindi.R

@Composable
fun HomeScreen(
    navController: NavHostController,
    screenTitle: String,
    navigationItems: List<NavigationItem>
) {

    val brownColor = Color(red = 168, green = 42, blue = 42)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = Dimension.PADDING_TITLE, bottom = Dimension.PADDING_BOTTOM)
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .fillMaxSize()
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                text = screenTitle,
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                color = brownColor
            )

            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize(),
                columns = GridCells.Fixed(3),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                items(navigationItems) {
                    DisplayTile(
                        modifier = Modifier.fillMaxSize(),
                        item = it,
                        color = brownColor,
                        onClick = {
                            if (it.navigationRoute == Screen.HomeScreen || it.navigationRoute == Screen.PracticeScreen) {
                                NavigationUtil.setAsBase(navController, it.navigationRoute.route)
                            } else {
                                NavigationUtil.navigateTo(navController, it.navigationRoute.route)
                            }
                        }
                    )
                }
            }

        }

        // Display Ad in following box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(Dimension.PADDING_BANNER_AD)
        ) {
            BannerAdvertView(
                modifier = Modifier.fillMaxSize(),
                showAdUnit = stringResource(R.string.admob_banner_ad_practice)
            )
        }

    }
}