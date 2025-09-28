package hoon.example.mycompose.ui.navigation

sealed class Screen(val route: String, val isNavigable: Boolean) {
    object Home : Screen("home", true)
    object Settings : Screen("settings", true)
    object Favorite : Screen("favorite", true)
    object Info : Screen("info", true)
    object Profile : Screen("profile", true)
    object Notice : Screen("notice", true)
    object Add : Screen("add", false)
}