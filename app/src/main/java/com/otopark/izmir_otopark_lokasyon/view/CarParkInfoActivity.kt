package com.otopark.izmir_otopark_lokasyon.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otopark.izmir_otopark_lokasyon.databinding.ActivityCarParkInfoBinding

class CarParkInfoActivity : AppCompatActivity() {

    lateinit var binding : ActivityCarParkInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarParkInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val status = intent.getStringExtra("status")
        val hoursfriday = intent.getStringExtra("hoursfriday")
        val hoursmonday = intent.getStringExtra("hoursmonday")
        val hourssaturday = intent.getStringExtra("hourssaturday")
        val hoursunday = intent.getStringExtra("hoursunday")
        val hoursthursday = intent.getStringExtra("hoursthursday")
        val hourstuesday = intent.getStringExtra("hourstuesday")
        val hourswednesday = intent.getStringExtra("hourswednesday")
        val names = intent.getStringExtra("names")
        val covered = intent.getStringExtra("covered")
        val barrier = intent.getStringExtra("barrier")
        val cctv = intent.getStringExtra("cctv")
        val busStation = intent.getStringExtra("busStation")
        val metroStation = intent.getStringExtra("metroStation")
        val trainStation = intent.getStringExtra("trainStation")
        val tramStation = intent.getStringExtra("tramStation")



        binding.txtnames.text = names.toString()
        binding.txtstatus.text = status.toString()
        binding.txtmonday.text = hoursmonday.toString()
        binding.txtfriday.text = hoursfriday.toString()
        binding.txtsaturday.text = hourssaturday.toString()
        binding.txtsunday.text = hoursunday.toString()
        binding.txtthursday.text = hoursthursday.toString()
        binding.txttuesday.text = hourstuesday.toString()
        binding.txtwednesday.text = hourswednesday.toString()
        binding.txtkapali.text = covered.toString()
        binding.txtbariyer.text = barrier.toString()
        binding.txtkamera.text = cctv.toString()
        binding.txtbus.text = busStation.toString()
        binding.txtmetro.text = metroStation.toString()
        binding.txttren.text = trainStation.toString()
        binding.txttram.text = tramStation.toString()
    }
}