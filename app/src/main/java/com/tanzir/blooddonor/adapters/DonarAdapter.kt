package com.tanzir.blooddonor.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tanzir.blooddonor.databinding.DonarRowBinding
import com.tanzir.blooddonor.modelClass.DonarPerson

class DonarAdapter():ListAdapter<DonarPerson,DonarAdapter.DonarViewHolder>(DonarDiffCallback()) {

    class DonarViewHolder( val binding:DonarRowBinding
    ):RecyclerView.ViewHolder(binding.root)
    {
        fun bind(donarPerson: DonarPerson){
            binding.donar = donarPerson
        }
    }


    class DonarDiffCallback:DiffUtil.ItemCallback<DonarPerson>()
    {
        override fun areItemsTheSame(oldItem: DonarPerson, newItem: DonarPerson): Boolean {
             return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: DonarPerson, newItem: DonarPerson): Boolean {
                return oldItem==newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DonarViewHolder {
        val binding = DonarRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DonarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DonarViewHolder, position: Int) {
        val donarModel = getItem(position)
        holder.bind(donarModel)
    }
}