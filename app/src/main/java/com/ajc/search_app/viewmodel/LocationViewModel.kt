package com.ajc.search_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ajc.search_app.models.remote.ResponseDTO
import com.ajc.search_app.repository.LocationRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocationViewModel(private val dataRepository: LocationRepository) : ViewModel() {
    fun getLocationData(stringQuery: String, city: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val result = dataRepository.getData(stringQuery, city)
        }
    }

    val user: LiveData<ResponseDTO>
        get() = dataRepository.user
}