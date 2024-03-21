package com.example.weather.Repository

import com.example.weather.Server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "0773ade61d7e97ff9b2d9a906d7670bf")
}