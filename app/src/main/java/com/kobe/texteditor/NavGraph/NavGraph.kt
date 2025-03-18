package com.kobe.texteditor.NavGraph


import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.kobe.texteditor.ui.Vue.Home.HomeScreen
import com.kobe.texteditor.ui.Vue.OnBoarding.OnBoardingScreen
import com.kobe.texteditor.ui.Vue.OnBoarding.ViewModel.OnBoardingViewModel
import com.kobe.texteditor.ui.Vue.Profile.ProfileScreen
import com.kobe.texteditor.ui.Vue.Settings.SettingScreen
import com.kobe.texteditor.ui.Vue.Works.WorksScreen

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ){
        //First Entry
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel : OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(event = viewModel::onEvent)
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.HomeScreen.route
        ){
            //Home
            composable(
                route = Route.HomeScreen.route
            ){
                HomeScreen(navController = navController)
            }
            //Works
            composable(
                route = Route.WorksScreen.route
            ){
                WorksScreen(navController = navController)
            }
            //profile
            composable(
                route = Route.ProfileScreen.route
            ){
                ProfileScreen(navController = navController)
            }
            //Setting
            composable(
                route = Route.SettingsScreen.route
            ){
                SettingScreen(navController = navController)
            }


        }



    }

}