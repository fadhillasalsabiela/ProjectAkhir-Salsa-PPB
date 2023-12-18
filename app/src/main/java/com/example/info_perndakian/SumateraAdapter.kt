package com.example.info_perndakian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SumateraAdapter (val dataGunung: List<DataItem?>?) : RecyclerView.Adapter<SumateraAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val judul = view.findViewById<TextView>(R.id.judul)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_mainv, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if (dataGunung != null){
            return dataGunung.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.judul.text =  dataGunung?.get(position)?.namaGunung


//        holder.itemView.setOnClickListener{
//            val Judul = dataDoa?.get(position)?.namaDoa
//            Toast.makeText(holder.itemView.context, "${Judul}", Toast.LENGTH_SHORT).show()
//   }

        }

}