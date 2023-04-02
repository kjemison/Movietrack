package com.example.movietrack.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScaffold() {
    AppTheme() {
        Scaffold(
            topBar = { TopBar() },
            floatingActionButton = { FloatingButton() },
            content = {it
                Text(text = "Placeholder")
            }
        )
    }
}

@Composable
fun TopBar() {
    SmallTopAppBar(
        title = { Text(text = "_'s Movie List") }
    )
}

@Composable
fun FloatingButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        content = {}
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