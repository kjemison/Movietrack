package com.example.movietrack.data

import com.example.movietrack.network.TmdbApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val movieRepository: MovieRepository
}

class DefaultAppContainer : AppContainer {

    private val baseUrl = "https://api.themoviedb.org/3"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: TmdbApiService by lazy {
        retrofit.create(TmdbApiService::class.java)
    }

    override val movieRepository: MovieRepository by lazy {
        DefaultMovieRepository(tmdbApiService = retrofitService)
    }
}