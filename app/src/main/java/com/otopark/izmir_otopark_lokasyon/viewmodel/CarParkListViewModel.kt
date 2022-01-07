package com.otopark.izmir_otopark_lokasyon.viewmodel


import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.otopark.izmir_otopark_lokasyon.model.CarParkListResponse
import com.otopark.izmir_otopark_lokasyon.service.CarParkAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class CarParkListViewModel : ViewModel() {

    private var carParkAPIService = CarParkAPIService()

    val carParkListLiveData: MutableLiveData<CarParkListResponse> =
        MutableLiveData<CarParkListResponse>()


    @SuppressLint("CheckResult")
    fun getCarParkList() {
        carParkAPIService.carParkList()
            .subscribeOn(Schedulers.newThread())                     // Sorgu başarılı mı diye kullanılan Kod, çıktısı 200, 404 vb. oluyor.
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<CarParkListResponse>() {
                override fun onSuccess(response: CarParkListResponse) {
                    carParkListLiveData.value = response

                }


                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })

    }

}


