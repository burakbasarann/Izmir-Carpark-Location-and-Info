package com.otopark.izmir_otopark_lokasyon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.otopark.izmir_otopark_lokasyon.adapter.MainPageImageAdapter
import com.otopark.izmir_otopark_lokasyon.data.DataImageSource
import com.otopark.izmir_otopark_lokasyon.databinding.ActivityMainBinding
import com.otopark.izmir_otopark_lokasyon.view.CarParkListActivity
import com.otopark.izmir_otopark_lokasyon.view.FiyatlandirmaActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
   // var homepageadapter = HomePageRV()


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Izmir_Otopark_Lokasyon_NoActionBar)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resimList = listOf(
            DataImageSource(R.drawable.image1),
            DataImageSource(R.drawable.image2),
            DataImageSource(R.drawable.image3),
            DataImageSource(R.drawable.image4)
        )

        binding.anasayfaRV.apply {
                layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
                adapter = MainPageImageAdapter(resimList)

        }

        binding.btncarparklist.setOnClickListener{
            val intent= Intent(this,CarParkListActivity::class.java)
            startActivity(intent)
        }

        binding.btnfiyatlandirma.setOnClickListener{
            val intent= Intent(this,FiyatlandirmaActivity::class.java)
            startActivity(intent)
        }


/*
        var resimList : ArrayList<Int> = arrayListOf()
        resimList.add(R.drawable.ben)


       homepageadapter.resimList
        binding.anasayfaRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.anasayfaRV.adapter = homepageadapter


 */
    }
}