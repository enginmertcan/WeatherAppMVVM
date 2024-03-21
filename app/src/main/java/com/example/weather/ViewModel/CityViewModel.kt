package com.example.weather.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weather.Repository.CityRepository
import com.example.weather.Server.ApiClient
import com.example.weather.Server.ApiServices


class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)
}