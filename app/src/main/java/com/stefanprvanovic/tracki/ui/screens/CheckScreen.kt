package com.stefanprvanovic.tracki.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stefanprvanovic.tracki.database.entitys.Personnel
import com.stefanprvanovic.tracki.ui.components.Employee

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckScreen(personnel: List<Personnel>) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Provera radnika") },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            })
    }) { contentPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(contentPadding)
        ) {
            items(personnel) {
                Employee(personnel = it)
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun CheckScreenPreview() {
    CheckScreen(personnel)
}

private val personnel = listOf(
    Personnel(
        id = 1,
        fullName = "John Smith",
        uniqueNumber = 1234567890123,
        workStation = "Office A"
    ),
    Personnel(
        id = 2,
        fullName = "Emily Johnson",
        uniqueNumber = 2345678901234,
        workStation = "Office B"
    ),
    Personnel(
        id = 3,
        fullName = "Michael Davis",
        uniqueNumber = 3456789012345,
        workStation = "Office C"
    ),
    Personnel(
        id = 4,
        fullName = "Sarah Anderson",
        uniqueNumber = 4567890123456,
        workStation = "Office A"
    ),
    Personnel(
        id = 5,
        fullName = "David Wilson",
        uniqueNumber = 5678901234567,
        workStation = "Office B"
    ),
    Personnel(
        id = 6,
        fullName = "Jessica Taylor",
        uniqueNumber = 6789012345678,
        workStation = "Office C"
    ),
    Personnel(
        id = 7,
        fullName = "Christopher Martinez",
        uniqueNumber = 7890123456789,
        workStation = "Office A"
    ),
    Personnel(
        id = 8,
        fullName = "Amanda Johnson",
        uniqueNumber = 8901234567890,
        workStation = "Office B"
    ),
    Personnel(
        id = 9,
        fullName = "Daniel Clark",
        uniqueNumber = 9012345678901,
        workStation = "Office C"
    ),
    Personnel(
        id = 10,
        fullName = "Sophia Thompson",
        uniqueNumber = 1023456789012,
        workStation = "Office A"
    )
)