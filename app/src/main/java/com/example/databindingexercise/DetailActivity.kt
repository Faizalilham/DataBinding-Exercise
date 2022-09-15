package com.example.databindingexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.databindingexercise.databinding.ActivityDetailBinding
import com.example.databindingexercise.model.News

class DetailActivity : AppCompatActivity() {

    companion object{
        private val NEWS = "News"
    }

    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail)
        getData()
    }

    private fun getData(){
        val news = intent.getSerializableExtra(NEWS) as News
        binding.news = news

    }
}