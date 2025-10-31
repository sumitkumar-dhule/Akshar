package com.electrodiligent.hindi.presentation.ads

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView

@Composable
fun BannerAdvertView(
    modifier: Modifier = Modifier,
    showAdUnit: String,
    size: AdSize = AdSize.BANNER
) {

    AndroidView(
        modifier = modifier.fillMaxWidth(),
        factory = { context ->
            AdView(context).apply {
                adUnitId = showAdUnit
                loadAd(AdRequest.Builder().build())
            }
        }
    )
}