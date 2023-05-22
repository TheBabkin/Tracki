package com.stefanprvanovic.tracki.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Novi radni dan")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Pregled po danu")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Pregled po korisniku")
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}