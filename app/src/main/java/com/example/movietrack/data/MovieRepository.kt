package com.example.movietrack.data

import com.example.movietrack.BuildConfig.TMDB_API_KEY
import com.example.movietrack.data.model.Movie
import com.example.movietrack.network.NetworkResult
import com.example.movietrack.network.TmdbApiService

interface MovieRepository {
    suspend fun getPopularMovies(): List<Movie>
    suspend fun getMovieDetails(): Movie
}

class DefaultMovieRepository(
    private val tmdbApiService: TmdbApiService
) : MovieRepository {

    override suspend fun getPopularMovies(): List<Movie> =
        tmdbApiService.getPopularMovies(TMDB_API_KEY)


    override suspend fun getMovieDetails(): Movie {
        TODO("Not yet implemented")
    }
}