package com.otopark.izmir_otopark_lokasyon.service

import com.otopark.izmir_otopark_lokasyon.model.CarParkListResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class CarParkAPIService {

    val BASE_URL = "https://openapi.izmir.bel.tr/api/"

    val retrofit_api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(CarParkAPI::class.java)

    fun carParkList() : Single<CarParkListResponse>{
        return retrofit_api.getCarParkType()
    }
}