package hoon.example.mycompose.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import hoon.example.mycompose.data.HomeMenuItem

fun getDummyHomeMenuItem(): List<HomeMenuItem> {
    val homeMenuItems = listOf(
        HomeMenuItem(Icons.Default.Home, "Home"),
        HomeMenuItem(Icons.Default.Settings, "Settings"),
        HomeMenuItem(Icons.Default.Favorite, "Favorite"),
        HomeMenuItem(Icons.Default.Info, "Info"),
        HomeMenuItem(Icons.Default.Person, "Profile"),
        HomeMenuItem(Icons.Default.Notifications, "Notice"),
        HomeMenuItem(Icons.Default.Add, "Add")
    )
    return homeMenuItems
}