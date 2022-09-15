package com.example.databindingexercise.model

import java.io.Serializable

data class News(
    val tittle : String,
    val date : String,
    val image : MutableList<ListImages>,
    val content : String,
    val writer : String
):Serializable

data class ListImages(
    val images :Int
):Serializable


