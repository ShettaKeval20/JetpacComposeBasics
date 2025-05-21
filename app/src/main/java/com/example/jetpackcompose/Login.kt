package com.example.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
 fun login(navController: NavController) {

    var userName by remember { mutableStateOf("")}
    var userEmail by remember { mutableStateOf("")}
    var userPassword by remember { mutableStateOf("")}

    val context = LocalContext.current

    Card(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Welcome to FinApp",
                fontSize = 30.sp,
                style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = userName,
                onValueChange = {
                    userName = it
                },
                singleLine = true,
                label = { Text(text = "Name") },
                placeholder = { Text(text = "Enter your name") },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Person, contentDescription = "Name")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            OutlinedTextField(
                value = userEmail,
                onValueChange = {
                    userEmail = it
                },
                singleLine = true,
                label = { Text(text = "email") },
                placeholder = { Text(text = "Enter your email") },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.MailOutline, contentDescription = "Mail")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            OutlinedTextField(
                value = userPassword,
                onValueChange = {
                    userPassword = it
                },
                singleLine = true,
                label = { Text(text = "Password") },
                placeholder = { Text(text = "Enter your password") },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(25.dp))

            Button(onClick = { /*TODO*/
                if (userName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty()) {
                    Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
                    return@Button
                }
                Toast.makeText(context, "$userName \n $userEmail \n $userPassword", Toast.LENGTH_LONG).show()
                navController.navigate(Routes.Details)
            },
                modifier = Modifier.width(300.dp)) {
                Text(text = "Login", fontSize = 32.sp)
            }
        }
    }
}