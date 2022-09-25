package com.competence_week.smarthome.ui.home

import androidx.lifecycle.ViewModel
import com.competence_week.smarthome.data.models.Home
import com.competence_week.smarthome.data.services.SmartHomeServices
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val smartHomeServices: SmartHomeServices
) : ViewModel() {

    fun getHomeData() {
        smartHomeServices.getRooms(
            onSuccess(),
            onFailure()
        )
    }

    private fun onSuccess() : (home: Home) -> Unit = { home ->
        //todo here home
    }

    private fun onFailure(): (message: String) -> Unit = { message ->
        //todo here
    }

}