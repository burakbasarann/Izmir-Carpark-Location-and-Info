package com.otopark.izmir_otopark_lokasyon.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.otopark.izmir_otopark_lokasyon.adapter.CarParkListAdapter
import com.otopark.izmir_otopark_lokasyon.databinding.ActivityCarParkListBinding
import com.otopark.izmir_otopark_lokasyon.viewmodel.CarParkListViewModel

class CarParkListActivity() : AppCompatActivity() {
    lateinit var binding : ActivityCarParkListBinding
    private var carParkListViewModel = CarParkListViewModel()
    var carparkAdapter = CarParkListAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarParkListBinding.inflate(layoutInflater)
        setContentView(binding.root)




        carParkListViewModel = ViewModelProvider(this).get(CarParkListViewModel::class.java)

        carParkListViewModel.getCarParkList()

        carParkListViewModel.carParkListLiveData.observe(this, Observer { carpark ->
                carparkAdapter.getData(carpark)

        })


/*
        var carparkList: ArrayList<String> = arrayListOf()
        carparkList.add("Bornova")
        carparkList.add("Konak")
        carparkList.add("Karşıyaka")
        carparkList.add("Alsancak")
        carparkList.add("Buca")
        carparkList.add("AAA")
        carparkList.add("BBB")
        carparkList.add("Bcsadsa")
        carparkList.add("Casdasf")


        carparkList.add("Dsagas")
        */

        binding.recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerview.adapter = carparkAdapter




    }

}