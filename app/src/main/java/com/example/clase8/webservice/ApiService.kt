package com.example.clase8.webservice

import com.example.clase8.model.ProductModelResponse
import com.example.clase8.utils.Constants.END_POINT
import retrofit2.http.GET

interface ApiService {
    @GET(END_POINT)
    suspend fun getProducts(): MutableList<ProductModelResponse>
}