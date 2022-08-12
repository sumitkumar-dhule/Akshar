package com.electrodiligent.core.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.electrodiligent.core.R

val brownColor = Color(red = 168, green = 42, blue = 42)

@Composable
fun DrawerHeader(header: String = "", headerImageID: Int, version: String = "") {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            /*Image(
                modifier = Modifier.size(180.dp, 180.dp).padding(16.dp),
                painter = painterResource(id = headerImageID),
                contentDescription = "Header Image"
            )*/
            if (header.isNotEmpty()) {
                Text(
                    text = header,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = brownColor
                )


                Text(
                    text = version,
                    fontSize = 10.sp,
                    color = brownColor
                )
            }
        }
    }
}

@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.daycare),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight,
            alpha = 0.09f
        )

        LazyColumn(modifier) {
            items(items) { item ->
                Box {
                    if (item.isSectionHeader) {
                        Text(
                            text = item.title,
                            style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp, start = 16.dp)
                        )
                    } else {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    onItemClick(item)
                                }
                                .padding(16.dp)
                        ) {

                            Image(
                                modifier = Modifier.size(30.dp, 30.dp),
                                painter = painterResource(id = item.icon),
                                contentDescription = item.contentDescription
                            )

                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = item.title,
                                style = itemTextStyle,
                                modifier = Modifier.weight(1f),
                                color = brownColor
                            )
                        }
                    }
                }
            }
        }
    }

}
