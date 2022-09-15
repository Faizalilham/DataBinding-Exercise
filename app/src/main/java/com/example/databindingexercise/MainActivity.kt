package com.example.databindingexercise

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingexercise.adapter.NewsAdapter
import com.example.databindingexercise.databinding.ActivityMainBinding
import com.example.databindingexercise.model.News
import com.example.databindingexercise.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var newsAdapter: NewsAdapter
    private val newsViewModel by lazy{
        ViewModelProvider(this)[NewsViewModel::class.java]
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setRecycler()
        newsViewModel.getData()
        newsViewModel.datas.observe(this){
            newsAdapter.setDatas(it)
        }

    }

    private fun setRecycler(){
        binding.newsRecycler.apply {
            newsAdapter = NewsAdapter(mutableListOf())
            adapter = newsAdapter
            layoutManager = if(applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                GridLayoutManager(this@MainActivity,2)
            }else{
                LinearLayoutManager(this@MainActivity)
            }
        }
    }
}