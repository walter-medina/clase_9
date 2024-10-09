package com.example.clase8.model

import com.google.gson.annotations.SerializedName

data class ProductModelResponse(
    @SerializedName("id")
    val id:Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("images")
    val image:String
)
