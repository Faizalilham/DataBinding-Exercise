package com.example.databindingexercise.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingexercise.databinding.ListItemBinding
import com.example.databindingexercise.model.News
import com.example.databindingexercise.viewmodel.EventHandler

class NewsAdapter(var data : MutableList<News>):RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(val binding : ListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.binding.apply {
            news = data[position]
//            for(i in data[position].image){
//                newsImage.setImageResource(i.images)
//            }
            handler = EventHandler(holder.itemView.context,data[position])
        }
    }

    override fun getItemCount(): Int = data.size

    fun setDatas(x : MutableList<News>){
        this.data = x
    }

//    interface Clicked{
//        fun onClick(news : News)
//    }
}