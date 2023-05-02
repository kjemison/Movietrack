package com.example.movietrack.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.movietrack.ui.screens.HomeScreen
import com.example.movietrack.ui.screens.MovieViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(modifier: Modifier = Modifier) {
	Scaffold(
		modifier = modifier.fillMaxSize(),
		topBar = { TopAppBar(title = { Text("Placeholder") }) }
	) {
		Surface(
			modifier = Modifier
				.fillMaxSize()
				.padding(it),
			color = MaterialTheme.colorScheme.background
		) {
			val movieViewModel: MovieViewModel = viewModel(factory = MovieViewModel.Factory)
			HomeScreen(
				movieUiState = movieViewModel.movieUiState,
				retryAction = movieViewModel::getPopularMovies
			)
		}
	}
}