package com.example.recipeapp.api

import com.example.recipeapp.model.Response
import com.example.recipeapp.utils.Constants
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipesApiService {

    @GET("customsearch/v1")
    suspend fun searchRecipes(
        @Query("q") query: String,
        @Query("key") apiKey: String,
        @Query("cx") customSearchEngineId: String
    ): Response
}

private val json = Json {
    ignoreUnknownKeys = true
}

private val retrofit = Retrofit.Builder()
    .baseUrl(Constants.BASE_URL)
    .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
    .build()

object RecipesApi {
    val retrofitService : RecipesApiService by lazy {
        retrofit.create(RecipesApiService::class.java)
    }
}


