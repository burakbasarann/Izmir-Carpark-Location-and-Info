package com.otopark.izmir_otopark_lokasyon.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.otopark.izmir_otopark_lokasyon.R
import com.otopark.izmir_otopark_lokasyon.adapter.FiyatlandirmaAdapter
import com.otopark.izmir_otopark_lokasyon.adapter.MainPageImageAdapter
import com.otopark.izmir_otopark_lokasyon.data.DataImageSource
import com.otopark.izmir_otopark_lokasyon.databinding.ActivityFiyatlandirmaBinding

class FiyatlandirmaActivity : AppCompatActivity() {
    lateinit var binding : ActivityFiyatlandirmaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiyatlandirmaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fiyatlandirmaImageList = listOf(
            DataImageSource(R.drawable.ucr1),
            DataImageSource(R.drawable.ucr2),
            DataImageSource(R.drawable.ucr3),
            DataImageSource(R.drawable.ucr4),
            DataImageSource(R.drawable.ucr5),
            DataImageSource(R.drawable.ucr6)
        )

        binding.fiyatlandirmaRV.apply {
            layoutManager = LinearLayoutManager(this@FiyatlandirmaActivity, LinearLayoutManager.VERTICAL, false)
            adapter = FiyatlandirmaAdapter(fiyatlandirmaImageList)

        }
    }
}