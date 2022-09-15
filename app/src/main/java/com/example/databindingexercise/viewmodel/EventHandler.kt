package com.example.databindingexercise.viewmodel

import android.content.Context
import android.content.Intent
import com.example.databindingexercise.DetailActivity
import com.example.databindingexercise.model.News

class EventHandler(val context : Context,val news : News) {

    companion object{
        private val NEWS = "News"
    }

    fun onMove(){
        this.context.startActivity(Intent(context,DetailActivity::class.java).also{
            it.putExtra(NEWS,news)
        })
    }


}