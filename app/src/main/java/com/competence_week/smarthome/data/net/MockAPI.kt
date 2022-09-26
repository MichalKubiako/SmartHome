package com.competence_week.smarthome.data.net

import android.content.Context
import com.competence_week.smarthome.data.models.Home
import com.squareup.moshi.Moshi
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.*
import javax.inject.Inject

class MockAPI @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private val moshi by lazy {
        Moshi.Builder().add(Date::class.java).build()
    }

    fun getHomeMockAPI(): Home? {
        val jsonAdapter = moshi.adapter(Home::class.java)
        readJsonFile()?.let {
            return jsonAdapter.fromJson(it)
        }
        return null
    }

    private fun readJsonFile(): String? {
        return context.assets
            ?.open("mock.json")
            ?.bufferedReader()
            .use { it?.readText() }
    }
}