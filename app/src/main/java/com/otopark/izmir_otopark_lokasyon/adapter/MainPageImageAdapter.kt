package com.otopark.izmir_otopark_lokasyon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.otopark.izmir_otopark_lokasyon.R
import com.otopark.izmir_otopark_lokasyon.data.DataImageSource
import com.otopark.izmir_otopark_lokasyon.databinding.MainpageImageBinding

class MainPageImageAdapter(private val list: List<DataImageSource>) :
    RecyclerView.Adapter<MainPageImageAdapter.ResimListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResimListHolder {
        val binding =
            MainpageImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResimListHolder(binding)
    }

    override fun onBindViewHolder(holder: ResimListHolder, position: Int) {
        val resimm: DataImageSource = list[position]
        holder.bind(resimm.image)
    }

    override fun getItemCount(): Int = list.size

    class ResimListHolder(private val binding: MainpageImageBinding) : RecyclerView.ViewHolder(binding.root ) {
        private var mImage: ImageView? = null


        init {
            mImage = itemView.findViewById(R.id.mainpageimageview)
        }

        fun bind(resim: Int) {
            mImage?.setImageResource(resim)
        }

    }
}