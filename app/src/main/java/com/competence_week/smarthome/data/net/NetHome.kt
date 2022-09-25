package com.competence_week.smarthome.data.net

import com.competence_week.smarthome.data.models.Home
import retrofit2.Response
import retrofit2.http.GET

interface NetHome {

    @GET("home")
    suspend fun getHome(): Response<Home>
}