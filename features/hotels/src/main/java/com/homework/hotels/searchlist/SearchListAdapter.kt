package com.homework.hotels.searchlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.homework.entities.uimodel.HotelListUIModel
import com.homework.hotels.databinding.ListItemHotelsBinding

class SearchListAdapter : RecyclerView.Adapter<SearchListViewHolder>() {
    private val differ = AsyncListDiffer(this, diffCallBack)
    fun setData(items : List<HotelListUIModel>){
        differ.submitList(items)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchListViewHolder {
        val inflater =LayoutInflater.from(parent.context)
        val binding = ListItemHotelsBinding.inflate(inflater, parent,false)

        return SearchListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
        differ.currentList.getOrNull(position)?.let {
            holder.bind(it)
        }
    }
}
companion object{
    private var diffCallBack = object : DiffUtil.ItemCallback<HotelListUIModel>(){
        override fun areContentsTheSame(
            oldItem: HotelListUIModel,
            newItem: HotelListUIModel
        ): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(
            oldItem: HotelListUIModel,
            newItem: HotelListUIModel
        ): Boolean {
            return oldItem.enuId == newItem.enuId
        }

    }    }

class SearchListViewHolder(private val binding: ListItemHotelsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(viewModel : HotelListUIModel){
        binding.txt.text = viewModel.name
    }

}
