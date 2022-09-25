package com.competence_week.smarthome.data.services

import com.competence_week.smarthome.data.models.Home
import com.competence_week.smarthome.data.net.NetHome
import com.competence_week.smarthome.utils.verify
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

// https://developer.android.com/kotlin/coroutines
// https://www.youtube.com/watch?v=bM7PVVL_5GM
// https://www.youtube.com/watch?v=2QInrEaXyMo
// https://www.youtube.com/watch?v=kXSBkAA03Tc
// https://youtu.be/cr5xLjPC4-0

@Singleton
class SmartHomeServices @Inject constructor(
    private val netHome: NetHome
) {

    fun getRooms(
        onSuccess: (home: Home) -> Unit,
        onFailure: (message: String) -> Unit
    ) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                with(netHome.getHome()) {
                    if (verify()) {
                        onSuccess(body()!!)
                    } else {
                        Timber.e(message())
                        onFailure(message())
                    }
                }
            } catch (ex: Exception) {
                Timber.e(ex)
                ex.message?.let(onFailure)
            }
        }
    }
}