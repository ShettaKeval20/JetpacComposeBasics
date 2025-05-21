package com.example.jetpackcompose

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Contact(
    val name: String,
    val number: String
)

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun contact() {
    val contacts = remember {
        listOf(
            Contact(
                name = "John Doe",
                number = "1234567890"
            ),
            Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            ),Contact(
                name = "John Doe",
                number = "1234567890"
            )
        )
    }

    LazyColumn(modifier = Modifier.fillMaxSize()
    ) {
        items(contacts.size) { contact ->

            Card(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                Text(text = "Name: ${contacts[contact].name}")
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Number: ${contacts[contact].number}")
                Spacer(modifier = Modifier.height(95.dp))
            }
        }
    }
}
