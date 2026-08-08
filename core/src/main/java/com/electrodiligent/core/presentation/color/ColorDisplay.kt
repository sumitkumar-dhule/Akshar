package com.electrodiligent.core.presentation.color

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.ColorItem
import com.electrodiligent.core.util.ResponsiveText
import kotlinx.coroutines.flow.Flow

@Composable
fun ColorDisplay(
    modifier: Modifier,
    colorItems: List<ColorItem>,
    title: String
) {
    val viewModel = hiltViewModel<ColorDisplayViewModel>()
    val state by viewModel.state.collectAsState()

    LaunchedEffect(colorItems) {
        viewModel.onIntent(ColorDisplayIntent.Initialize(colorItems))
    }
    ColorDisplayEffectHandler(effects = viewModel.effects, onIntent = viewModel::onIntent)

    val colorItem = state.currentColor ?: return

    Box(modifier = modifier) {
        if (colorItem.colorValue == Color.White) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
            )
        }

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.17f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_left),
                    contentDescription = "Left",
                    colorFilter = ColorFilter.tint(color = colorItem.colorValue),
                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { viewModel.onIntent(ColorDisplayIntent.PreviousClicked) }
                )

                ResponsiveText(
                    modifier = Modifier.weight(1f, fill = true),
                    targetTextSizeHeight = 45.sp,
                    text = title,
                    textAlign = TextAlign.Center,
                    color = colorItem.colorValue,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )

                Image(
                    painter = painterResource(R.drawable.ic_arrow_circle_right),
                    contentDescription = "Right",
                    colorFilter = ColorFilter.tint(color = colorItem.colorValue),
                    modifier = Modifier
                        .fillMaxHeight(0.7f)
                        .aspectRatio(1f, matchHeightConstraintsFirst = true)
                        .clickable { viewModel.onIntent(ColorDisplayIntent.NextClicked) }
                )
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(0.9f)
                        .clip(RoundedCornerShape(16.dp))
                        .shadow(elevation = 4.dp, shape = RoundedCornerShape(16.dp))
                        .aspectRatio(ratio = 1f)
                        .background(color = colorItem.colorValue)
                        .clickable {
                            viewModel.onIntent(ColorDisplayIntent.CurrentColorClicked)
                        },
                    contentAlignment = Alignment.Center
                )

                ResponsiveText(
                    targetTextSizeHeight = 70.sp,
                    text = colorItem.name,
                    textAlign = TextAlign.Center,
                    color = colorItem.colorValue,
                    textStyle = TextStyle(fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

@Composable
private fun ColorDisplayEffectHandler(
    effects: Flow<ColorDisplayEffect>,
    onIntent: (ColorDisplayIntent) -> Unit
) {
    val context = LocalContext.current
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }

    DisposableEffect(Unit) {
        onDispose {
            mediaPlayer?.release()
            onIntent(ColorDisplayIntent.SoundPlaybackFinished)
        }
    }

    LaunchedEffect(effects, context) {
        effects.collect { effect ->
            when (effect) {
                is ColorDisplayEffect.PlaySound -> {
                    mediaPlayer?.release()
                    mediaPlayer = MediaPlayer.create(context, effect.audioResId)
                    val player = mediaPlayer
                    if (player == null) {
                        onIntent(ColorDisplayIntent.SoundPlaybackFinished)
                    } else {
                        player.setOnCompletionListener {
                            it.release()
                            mediaPlayer = null
                            onIntent(ColorDisplayIntent.SoundPlaybackFinished)
                        }
                        player.start()
                    }
                }
            }
        }
    }
}
