package com.example.socialhelpmvi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.socialhelpmvi.presentation.screens.login.LoginScreen
import com.example.socialhelpmvi.presentation.screens.main.MainScreen
import com.example.socialhelpmvi.presentation.screens.registration.RegistrationScreen

sealed class Screen(val route: String){
    object LoginScreen: Screen("login_screen")
    object RegistrationScreen: Screen("reg_screen")
    object MainScreen: Screen("main_screen")
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(Screen.LoginScreen.route){
            LoginScreen()
        }
        composable(Screen.RegistrationScreen.route){
            RegistrationScreen()
        }

        composable(Screen.MainScreen.route){
            MainScreen(navController)
        }
    }
}