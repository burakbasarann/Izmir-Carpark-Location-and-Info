package com.otopark.izmir_otopark_lokasyon.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.otopark.izmir_otopark_lokasyon.databinding.CarparkListItemLayoutBinding
import com.otopark.izmir_otopark_lokasyon.model.CarParkListResponse
import com.otopark.izmir_otopark_lokasyon.view.CarParkInfoActivity
import com.otopark.izmir_otopark_lokasyon.view.MapsActivity

class CarParkListAdapter() : RecyclerView.Adapter<CarParkListAdapter.CarParkListHolder>() {
    lateinit var binding: CarparkListItemLayoutBinding
    var carParkList: ArrayList<CarParkListResponse.CarParkListResponseItem> = arrayListOf()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarParkListHolder {
        binding =
            CarparkListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarParkListHolder(binding)
    }

    override fun onBindViewHolder(holder: CarParkListAdapter.CarParkListHolder, position: Int) {
        val status = carParkList[position].status
        val hoursfriday = carParkList[position].openingHours?.friday
        val hoursmonday = carParkList[position].openingHours?.monday
        val hourssaturday = carParkList[position].openingHours?.saturday
        val hoursunday = carParkList[position].openingHours?.sunday
        val hoursthursday = carParkList[position].openingHours?.thursday
        val hourstuesday = carParkList[position].openingHours?.tuesday
        val hourswednesday = carParkList[position].openingHours?.wednesday
        val names = carParkList[position].name
        val covered = carParkList[position].accessories?.covered.toString()
        val barrier = carParkList[position].accessories?.barrier.toString()
        val cctv = carParkList[position].accessories?.cctv.toString()
        val busStation = carParkList[position].poi?.busStation.toString()
        val metroStation = carParkList[position].poi?.metroStation.toString()
        val trainStation = carParkList[position].poi?.trainStation.toString()
        val tramStation = carParkList[position].poi?.tramStation.toString()
        var lat = carParkList[position].lat.toString()
        var lng = carParkList[position].lng.toString()
        holder.bindName(carParkList[position].name.toString())
        holder.bindFreeAndOccupancy(
            carParkList[position].occupancy?.total?.free.toString(),
            carParkList[position].occupancy?.total?.occupied.toString()
        )
        holder.binding.btnmaps.setOnClickListener { v ->
            val intent = Intent(v.context, MapsActivity::class.java)
            intent.putExtra("lat", lat)
            intent.putExtra("lng", lng)
            intent.putExtra("names", names)
            v.context.startActivity(intent)
        }
        holder.binding.btninfo.setOnClickListener { v ->
            val intent = Intent(v.context, CarParkInfoActivity::class.java)
            intent.putExtra("status", status)
            intent.putExtra("hoursfriday", hoursfriday)
            intent.putExtra("hoursmonday", hoursmonday)
            intent.putExtra("hourssaturday", hourssaturday)
            intent.putExtra("hoursunday", hoursunday)
            intent.putExtra("hoursthursday", hoursthursday)
            intent.putExtra("hourstuesday", hourstuesday)
            intent.putExtra("hourswednesday", hourswednesday)
            intent.putExtra("names", names)
            intent.putExtra("covered", covered)
            intent.putExtra("barrier", barrier)
            intent.putExtra("cctv", cctv)
            intent.putExtra("busStation", busStation)
            intent.putExtra("metroStation", metroStation)
            intent.putExtra("trainStation", trainStation)
            intent.putExtra("tramStation", tramStation)
            v.context.startActivity(intent)
        }
        /*  binding.btnmaps.setOnClickListener {
                  val intent = Intent(getContext(), MapsActivity::class.java)
                  intent.putExtra("Enlem", carParkList[position].lat)
                  intent.putExtra("Boylam", carParkList[position].lng)
                  getContext()?.startActivity(intent)

              }

         */
        /*
        holder.bindtype(carParkList[position].openingHours?.friday.toString())
        */
    }
    override fun getItemCount(): Int = carParkList.size

    inner class CarParkListHolder(val binding: CarparkListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindName(name: String) {
            binding.tvCarparkName.text = name
        }
        fun bindFreeAndOccupancy(free: String, occupancy: String) {
            binding.tvCarparkAdress.text = "Boş yer = $free Dolu Yer = $occupancy"
        }

    /*   fun bindtype(friday : String){

            itemView.tv_carpark_adress.text = friday
        }

   */

    }
    fun getData(carParkResponse: ArrayList<CarParkListResponse.CarParkListResponseItem>) {
        carParkList.addAll(carParkResponse)
        notifyDataSetChanged()
    }
    /*
    protected fun getContext(): Context? {
        return context
    }

     */
}