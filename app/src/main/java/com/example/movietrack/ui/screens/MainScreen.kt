@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.movietrack.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme
import com.example.movietrack.data.model.Movie


@Composable
fun MainScaffold(modifier: Modifier = Modifier) {
    AppTheme() {
        Surface() {
            Column(
                modifier.fillMaxHeight()
            ) {
                SearchBar(
                    hint = "Search for a movie",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                )
                MovieList(movies = null)
            }
        }
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    hint: String = "",
    onSearch: (String) -> Unit = {}
) {
    var text by remember { mutableStateOf("") }
    var isHintDisplayed by remember { mutableStateOf(hint != "") }

    OutlinedTextField(
        value = text,
        maxLines = 1,
        singleLine = true,
        shape = CircleShape,
        label = {
            Text("Search for a movie")
        },
        onValueChange = {
            text = it
            onSearch(it)
        },
        modifier = modifier
            .fillMaxWidth()
    )
}

@Composable
fun MovieList(
    movies: List<Movie>?,
    modifier: Modifier = Modifier
) {
    val tempList = (1..10).map {
        it.toString()
    }

    LazyVerticalGrid(
        columns = GridCells.Adaptive(128.dp),
        content = {
            items(tempList.size) {
                MovieItem()
            }
        },
        modifier = Modifier
            .fillMaxSize()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieItem() {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        content = {
            Text(text = "Placeholder")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme(useDarkTheme = true) {
        Column() {
            Button(onClick = { /*TODO*/ }) {}
            Button(onClick = { /*TODO*/ }) {}
            Button(onClick = { /*TODO*/ }) {}
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Preview2() {
    AppTheme(useDarkTheme = false) {
        MainScaffold()
    }
}