package com.competence_week.smarthome.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.competence_week.smarthome.R

object HumidityUtils {

    fun getDrawable(humidity: Int, context: Context): Drawable {
        val drawableId = when (humidity) {
            in 10..60 -> R.drawable.ic_humidity_mid
            in 60..100 -> R.drawable.ic_humidity_high
            else -> R.drawable.ic_humidity_low
        }
        return ContextCompat.getDrawable(context, drawableId)!!
    }
}