package com.competence_week.smarthome.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    @SuppressLint("SimpleDateFormat") // without locale formatting
    private val dateFormat = SimpleDateFormat("EEE, d MMM yyyy")

    fun getTodayDate(): String {
        return dateFormat.format(Calendar.getInstance().time)
    }
}