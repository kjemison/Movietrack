package com.example.movietrack

import android.app.Application
import com.example.movietrack.data.AppContainer
import com.example.movietrack.data.DefaultAppContainer

class MoviesApplication : Application() {
	lateinit var container: AppContainer
	override fun onCreate() {
		super.onCreate()
		container = DefaultAppContainer()
	}
}

