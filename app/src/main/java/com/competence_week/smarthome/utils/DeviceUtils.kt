package com.competence_week.smarthome.utils

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.competence_week.smarthome.R
import com.competence_week.smarthome.data.models.DeviceType

object DeviceUtils {

    fun getDrawable(device: DeviceType?, context: Context): Drawable {
        return ContextCompat.getDrawable(context, device?.drawableId ?: R.drawable.ic_tv)!!
    }
}