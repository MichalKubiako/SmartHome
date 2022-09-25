package com.competence_week.smarthome.data.models

data class Room(
    val id: String,
    val name: String,
    val background: String,
    var sensor: Sensor,
    var climateController: ClimateController,
    var lights: List<Light>,
    var devices: List<Device>
)