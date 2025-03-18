package com.kobe.texteditor.NavGraph

sealed class Route(
    val route: String
) {
    object OnBoardingScreen: Route(route = "onBoardingScreen")
    object AppStartNavigation: Route(route = "appStartNavigation")

    object NewsNavigation: Route(route = "newsNavigation")

    object HomeScreen: Route(route = "homeScreen")
    object WorksScreen: Route(route = "worksScreen")
    object ProfileScreen: Route(route = "profileScreen")
    object SettingsScreen: Route(route = "settingsScreen")
}
