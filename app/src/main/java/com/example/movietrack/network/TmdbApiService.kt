package com.example.movietrack.network

import com.example.movietrack.data.model.Movie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val BASE_IMG_URL = "https://image.tmdb.org/t/p/"
// truePosterPath "https://image.tmdb.org/t/p/w500${poster_path}"

interface TmdbApiService {

    @GET("/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") api_key: String
    ): List<Movie>

    @GET("/movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movie_id: String,
        @Query("api_key") api_key: String
    ): Movie

    @GET("/w500/{poster_path}")
    suspend fun getPoster(
        @Path("poster_path") poster_path: String
    ): Movie
}