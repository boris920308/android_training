package hoon.example.mycompose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import hoon.example.mycompose.ui.screens.home.HomeScreen
import hoon.example.mycompose.utils.getDummyHomeMenuItem

@Composable
fun MyComposeApp() {
    MyComposeAppContent()
}

@Composable
fun MyComposeAppContent() {
    HomeScreen(getDummyHomeMenuItem())
}


@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}