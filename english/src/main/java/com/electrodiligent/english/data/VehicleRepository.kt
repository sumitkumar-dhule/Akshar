package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VehicleRepository {
    val list by lazy { listItems.shuffled() }
    private val listItems = listOf(
        PictureItem(
            name = "CAR ", imageId = R.drawable.veh_car,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "AIRPLANE ", imageId = R.drawable.veh_airplane,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "AMBULANCE ", imageId = R.drawable.veh_ambulance,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "AUTO RICKSHAW ", imageId = R.drawable.veh_auto_rickshaw,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "BICYCLE ", imageId = R.drawable.veh_bicycle,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "BOAT ", imageId = R.drawable.veh_boat,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "BULLDOZER ", imageId = R.drawable.veh_bulldozer,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "BUS ", imageId = R.drawable.veh_bus,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "FIRE TRUCK ", imageId = R.drawable.veh_fire_truck,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "HELICOPTER ", imageId = R.drawable.veh_helicopter,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "HOT AIR BALLOON ", imageId = R.drawable.veh_hot_air_baloon,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "JEEP ", imageId = R.drawable.veh_jeep,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "MOTORCYCLE ", imageId = R.drawable.veh_motorcycle,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "POLICE CAR ", imageId = R.drawable.veh_police_car,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "ROCKET ", imageId = R.drawable.veh_rocket,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "SCOOTER ", imageId = R.drawable.veh_scooter,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "SHIP ", imageId = R.drawable.veh_ship,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "SUBMARINE ", imageId = R.drawable.veh_sunmarine,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "TRACTOR ", imageId = R.drawable.veh_tractor,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "TRAIN ", imageId = R.drawable.veh_train,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
        PictureItem(
            name = "TRUCK ", imageId = R.drawable.veh_truck,
//            audio = com.electrodiligent.english.R.raw.beep
        ),
    )
}