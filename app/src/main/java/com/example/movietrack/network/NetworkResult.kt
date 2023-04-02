package com.example.movietrack.network

sealed class NetworkResult<T> {
    data class Success<T>(val data: T) : NetworkResult<T>()
    class Error<T> : NetworkResult<T>()
    class Loading<T> : NetworkResult<T>()
}