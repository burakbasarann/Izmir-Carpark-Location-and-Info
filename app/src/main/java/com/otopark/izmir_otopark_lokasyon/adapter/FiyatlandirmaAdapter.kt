package com.otopark.izmir_otopark_lokasyon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.otopark.izmir_otopark_lokasyon.R
import com.otopark.izmir_otopark_lokasyon.data.DataImageSource
import com.otopark.izmir_otopark_lokasyon.databinding.ActivityFiyatlandirmaBinding
import com.otopark.izmir_otopark_lokasyon.databinding.FiyatlandirmaImageBinding

class FiyatlandirmaAdapter(private val list: List<DataImageSource>) :
    RecyclerView.Adapter<FiyatlandirmaAdapter.FiyatlandirmaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FiyatlandirmaViewHolder {
        val binding =
            FiyatlandirmaImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FiyatlandirmaViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: FiyatlandirmaViewHolder,
        position: Int
    ) {
        val resimm: DataImageSource = list[position]
        holder.bind(resimm.image)
    }

    override fun getItemCount(): Int  = list.size


    class FiyatlandirmaViewHolder(private val binding: FiyatlandirmaImageBinding) : RecyclerView.ViewHolder(binding.root ) {
        private var mImage: ImageView? = null


        init {
            mImage = itemView.findViewById(R.id.fiyatlandirmaImage)
        }

        fun bind(resim: Int) {
            mImage?.setImageResource(resim)
        }

    }
}