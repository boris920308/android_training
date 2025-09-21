package hoon.example.mycompose.ui

import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import hoon.example.mycompose.ui.navigation.Screen
import hoon.example.mycompose.ui.screens.home.HomeScreen
import hoon.example.mycompose.ui.screens.settings.SettingsScreen
import hoon.example.mycompose.utils.getDummyHomeMenuItem

@Composable
fun MyComposeApp() {
    MyComposeAppContent()
}

@Composable
fun MyComposeAppContent() {
    val context = LocalContext.current
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            Text(
                "MyCompose",
                modifier = Modifier.statusBarsPadding()
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier
                .padding(innerPadding),
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    homeMenuItem = getDummyHomeMenuItem(),
                ) { clickedItem ->
                    if (clickedItem.screen == Screen.Home || clickedItem.screen == Screen.Settings) {
                        // 구현된 화면에서만 이동
                        navController.navigate(clickedItem.screen.route)
                    }
                    Toast.makeText(context, "Hello ${clickedItem.label}!", Toast.LENGTH_SHORT).show()
                }
            }
            composable(Screen.Settings.route) {
                SettingsScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}