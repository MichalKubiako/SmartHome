package com.competence_week.smarthome.data.models

data class ClimateController(
    val id: String,
    var state: Boolean,
    var temperature: Int
)
