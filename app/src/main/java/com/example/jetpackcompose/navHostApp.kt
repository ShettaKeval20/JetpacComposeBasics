package com.example.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navHostApp() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login) {
        composable(Routes.Login) {
            login(navController)
        }

        composable(Routes.Details) {
            details(navController)
        }
    }
}
