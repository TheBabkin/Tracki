package com.stefanprvanovic.tracki.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.stefanprvanovic.tracki.database.entitys.Personnel

@Composable
fun Employee(personnel: Personnel) {

    val radioOptions = listOf("Prisutan", "Odsutan")

    var selectedOption by remember {
        mutableStateOf(radioOptions[0])
    }

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = personnel.fullName,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(text = personnel.uniqueNumber.toString())
            Text(
                text = personnel.workStation,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.size(8.dp))

            Row(
                modifier = Modifier
                    .selectableGroup()
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                radioOptions.forEach { option ->
                    Row(
                        modifier = Modifier.selectable(
                            selected = (selectedOption == option),
                            onClick = { selectedOption = option },
                            role = Role.RadioButton
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        RadioButton(
                            selected = (selectedOption == option),
                            onClick = { selectedOption = option }
                        )
                        Text(text = option)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun EmployeePreview() {
    Employee(
        Personnel(
            id = 10,
            fullName = "Sophia Thompson",
            uniqueNumber = 1023456789012,
            workStation = "Office A"
        )
    )
}