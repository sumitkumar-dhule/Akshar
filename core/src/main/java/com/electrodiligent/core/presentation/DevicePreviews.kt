package com.electrodiligent.core.presentation

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

/**
 * A custom multipreview annotation to show a composable on a standard phone,
 * and a tablet in both explicit portrait and landscape orientations, including system UI.
 */
@Preview(
    name = "Phone",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true // This adds the system bars
)
@Preview(
    name = "Tablet Portrait",
    device = Devices.TABLET,
    showBackground = true,
    widthDp = 600,
    heightDp = 800
)
//@Preview(
//    name = "Tablet Landscape",
//    device = Devices.PIXEL_C,
//    showBackground = true,
//    showSystemUi = true, // This adds the system bars
//    widthDp = 1280,
//    heightDp = 800
//)
annotation class DevicePreviews
