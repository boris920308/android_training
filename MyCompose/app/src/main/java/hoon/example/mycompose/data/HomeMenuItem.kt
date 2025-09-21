package hoon.example.mycompose.data

import androidx.compose.ui.graphics.vector.ImageVector
import hoon.example.mycompose.ui.navigation.Screen

data class HomeMenuItem(
    val icon: ImageVector,
    val label: String,
    val screen: Screen
)
