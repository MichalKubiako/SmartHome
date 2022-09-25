package com.competence_week.smarthome.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.competence_week.smarthome.data.models.WeatherType

object WeatherUtils {

    fun getDrawable(weatherType: WeatherType, context: Context): Drawable {
        return ContextCompat.getDrawable(context, weatherType.drawableId)!!
    }
}