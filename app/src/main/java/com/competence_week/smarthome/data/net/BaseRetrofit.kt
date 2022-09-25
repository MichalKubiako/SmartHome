package com.competence_week.smarthome.data.net

import com.competence_week.smarthome.AppConfig.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// http://androidcode.pl/blog/biblioteki/retrofit/
// https://www.youtube.com/watch?v=t6Sql3WMAnk

class BaseRetrofit constructor(okHttpClient: OkHttpClient) {

    private val _retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val retrofit: Retrofit = _retrofit
}