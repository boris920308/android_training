package hoon.example.mycompose.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Settings : Screen("settings")
    object Favorite : Screen("favorite")
    object Info : Screen("info")
    object Profile : Screen("profile")
    object Notice : Screen("notice")
    object Add : Screen("add")
}