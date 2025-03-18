package com.kobe.texteditor.ui.Vue.Uses

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MyBottomAppBar(
    navController: NavHostController
) {
    val currentRoute = currentRoute(navController)

    var selectedIndex by remember{
        mutableStateOf(0)
    }

    selectedIndex = when(currentRoute){
        "homeScreen" -> 0
        "worksScreen" -> 1
        "profileScreen" -> 2
        "settingsScreen" -> 3
        else -> 0
    }

    NavigationBar {
        bottonNavItem.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index

                    //implementation du nav controller
                    navController.navigate(item.route){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    BadgedBox(
                        badge = {
                            if(item.badges != 0){
                                Badge{ Text(text = item.badges.toString()) }
                            }else if (item.hasNews) Badge()
                        }
                    ) {
                        Icon(
                            imageVector =
                                if(index == selectedIndex)
                                    item.selectedIcon
                                else
                                    item.unselectedIcon
                            ,
                            contentDescription = item.title
                        )
                    }
                },
                label = { Text(text = item.title) }
            )
        }
    }
}

val bottonNavItem = listOf(
    BottomNavItem(
        title = "Home",
        route = "homeScreen",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasNews = false,
        badges = 0,
    ),
    BottomNavItem(
        title = "Works",
        route = "worksScreen",
        selectedIcon = Icons.Filled.Star,
        unselectedIcon = Icons.Outlined.Star,
        hasNews = false,
        badges = 0,
    ),
    BottomNavItem(
        title = "Profile",
        route = "profileScreen",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        hasNews = false,
        badges = 0,
    ),
    BottomNavItem(
        title = "Settings",
        route = "SettingsScreen",
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        hasNews = true,
        badges = 0,
    ),
)

data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badges: Int,
)

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}