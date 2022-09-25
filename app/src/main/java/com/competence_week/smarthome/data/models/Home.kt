package com.competence_week.smarthome.data.models

data class Home(
    val id: String,
    val ownerName: String,
    val outsideTemperature: Int,
    val outsideWeather: WeatherType,
    val rooms: List<Room>
)
