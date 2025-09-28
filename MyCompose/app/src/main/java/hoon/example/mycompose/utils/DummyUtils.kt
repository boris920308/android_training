package hoon.example.mycompose.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.DateRange
import hoon.example.mycompose.data.HomeMenuItem
import hoon.example.mycompose.ui.navigation.Screen

fun getDummyHomeMenuItem(): List<HomeMenuItem> {
    val homeMenuItems = listOf(
        HomeMenuItem(Icons.Default.Home, "Home", Screen.Home),
        HomeMenuItem(Icons.Outlined.DateRange, "Class", Screen.ClassList),
        HomeMenuItem(Icons.Default.Settings, "Settings", Screen.Settings),
        HomeMenuItem(Icons.Default.Favorite, "Favorite", Screen.Favorite),
        HomeMenuItem(Icons.Default.Info, "Info", Screen.Info),
        HomeMenuItem(Icons.Default.Person, "Profile", Screen.Profile),
        HomeMenuItem(Icons.Default.Notifications, "Notice", Screen.Notice),
        HomeMenuItem(Icons.Default.Add, "Add", Screen.Add)
    )
    return homeMenuItems
}