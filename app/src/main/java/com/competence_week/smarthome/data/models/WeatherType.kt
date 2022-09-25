package com.competence_week.smarthome.data.models

import com.competence_week.smarthome.R

enum class WeatherType(name: String, val drawableId: Int) {
    SUNNY("SUNNY", R.drawable.ic_sunny),
    CLOUDY("CLOUDY", R.drawable.ic_cloudy),
    FOG("FOG", R.drawable.ic_foggy),
    RAINING("RAINING", R.drawable.ic_rainy),
    SNOW("SNOW", R.drawable.ic_snowing),
    WIND("WIND", R.drawable.ic_air)
}