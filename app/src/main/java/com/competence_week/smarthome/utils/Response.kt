package com.competence_week.smarthome.utils

import retrofit2.Response

fun <T> Response<T>.verify(): Boolean = code() == 200 && body() != null