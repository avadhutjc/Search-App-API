package com.ajc.search_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ajc.search_app.repository.LocationRepository


class ViewModelFactory(private val repo: LocationRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LocationViewModel(repo) as T
    }
}