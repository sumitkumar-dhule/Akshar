package com.electrodiligent.english.data

import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.PictureItem

object VehicleRepository {
    val list by lazy { listItems.shuffled() }

    private val listItems = listOf(
        PictureItem(
            name = "CAR",
            imageId = R.drawable.veh_car,
            audio = com.electrodiligent.english.R.raw.car
        ),
        PictureItem(
            name = "AIRPLANE",
            imageId = R.drawable.veh_airplane,
            audio = com.electrodiligent.english.R.raw.airplane
        ),
        PictureItem(
            name = "AMBULANCE",
            imageId = R.drawable.veh_ambulance,
            audio = com.electrodiligent.english.R.raw.ambulance
        ),
        PictureItem(
            name = "AUTO RICKSHAW",
            imageId = R.drawable.veh_auto_rickshaw,
            audio = com.electrodiligent.english.R.raw.autorickshaw
        ),
        PictureItem(
            name = "BICYCLE",
            imageId = R.drawable.veh_bicycle,
            audio = com.electrodiligent.english.R.raw.bicycle
        ),
        PictureItem(
            name = "BOAT",
            imageId = R.drawable.veh_boat,
            audio = com.electrodiligent.english.R.raw.boat
        ),
        PictureItem(
            name = "BULLDOZER",
            imageId = R.drawable.veh_bulldozer,
            audio = com.electrodiligent.english.R.raw.bulldozer
        ),
        PictureItem(
            name = "BUS",
            imageId = R.drawable.veh_bus,
            audio = com.electrodiligent.english.R.raw.bus
        ),
        PictureItem(
            name = "FIRE TRUCK",
            imageId = R.drawable.veh_fire_truck,
            audio = com.electrodiligent.english.R.raw.firetruck
        ),
        PictureItem(
            name = "HELICOPTER",
            imageId = R.drawable.veh_helicopter,
            audio = com.electrodiligent.english.R.raw.helicopter
        ),
        PictureItem(
            name = "HOT AIR BALLOON",
            imageId = R.drawable.veh_hot_air_baloon,
            audio = com.electrodiligent.english.R.raw.hotairballoon
        ),
        PictureItem(
            name = "JEEP",
            imageId = R.drawable.veh_jeep,
            audio = com.electrodiligent.english.R.raw.jeep
        ),
        PictureItem(
            name = "MOTORCYCLE",
            imageId = R.drawable.veh_motorcycle,
            audio = com.electrodiligent.english.R.raw.motorcycle
        ),
        PictureItem(
            name = "POLICE CAR",
            imageId = R.drawable.veh_police_car,
            audio = com.electrodiligent.english.R.raw.policecar
        ),
        PictureItem(
            name = "ROCKET",
            imageId = R.drawable.veh_rocket,
            audio = com.electrodiligent.english.R.raw.rocket
        ),
        PictureItem(
            name = "SCOOTER",
            imageId = R.drawable.veh_scooter,
            audio = com.electrodiligent.english.R.raw.scooter
        ),
        PictureItem(
            name = "SHIP",
            imageId = R.drawable.veh_ship,
            audio = com.electrodiligent.english.R.raw.ship
        ),
        PictureItem(
            name = "SUBMARINE",
            imageId = R.drawable.veh_sunmarine,
            audio = com.electrodiligent.english.R.raw.submarine
        ),
        PictureItem(
            name = "TRACTOR",
            imageId = R.drawable.veh_tractor,
            audio = com.electrodiligent.english.R.raw.tractor
        ),
        PictureItem(
            name = "TRAIN",
            imageId = R.drawable.veh_train,
            audio = com.electrodiligent.english.R.raw.train
        ),
        PictureItem(
            name = "TRUCK",
            imageId = R.drawable.veh_truck,
            audio = com.electrodiligent.english.R.raw.truck
        ),
    )
}
