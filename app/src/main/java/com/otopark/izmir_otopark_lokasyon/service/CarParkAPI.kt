package com.otopark.izmir_otopark_lokasyon.service

import com.otopark.izmir_otopark_lokasyon.model.CarParkListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface CarParkAPI {

    companion object CarParkAPI{
        const val CARPARK_TYPE = "ibb/izum/otoparklar"
    }

    //  / -> Path
    // ?= -> Query

    // {
    // :1      -> Body
    // }
    @GET(CARPARK_TYPE)
    fun getCarParkType() : Single<CarParkListResponse>
}