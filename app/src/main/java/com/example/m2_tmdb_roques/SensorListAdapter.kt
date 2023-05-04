package com.example.m2_tmdb_roques

import android.hardware.Sensor
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m2_tmdb_roques.databinding.SensorItemBinding

class SensorListAdapter(
    val sensors: ArrayList<Sensor>,
    private val sensorItemClickListener: OnSensorItemClickListener) : RecyclerView.Adapter<SensorListAdapter.SensorItemViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SensorItemViewHolder {
        val binding = SensorItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return SensorItemViewHolder(binding,sensorItemClickListener)
    }

    override fun onBindViewHolder(holder: SensorItemViewHolder, position: Int) {
        holder.binding.sensorItem = sensors[position]
    }

    override fun getItemCount() = sensors.size

    // ------------------ VIEW HOLDER CLASS ----------------------
    class SensorItemViewHolder(
        val binding: SensorItemBinding,
        val sensorItemClickListener: OnSensorItemClickListener) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.sensorItemView.setOnClickListener {
                sensorItemClickListener.onSensorItemClicked(adapterPosition)
            }
        }
    }
}

