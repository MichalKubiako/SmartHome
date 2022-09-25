package com.competence_week.smarthome.data.models

import com.competence_week.smarthome.R

data class Device(
    val id: String,
    val name: String,
    val type: DeviceType,
    var state: Boolean
)

enum class DeviceType(name: String, val drawableId: Int) {
    COMPUTER("COMPUTER", R.drawable.ic_computer),
    ROUTER("ROUTER", R.drawable.ic_router),
    RADIO("RADIO", R.drawable.ic_radio),
    SPEAKER("SPEAKER", R.drawable.ic_speaker),
    TV("TV", R.drawable.ic_tv)
}