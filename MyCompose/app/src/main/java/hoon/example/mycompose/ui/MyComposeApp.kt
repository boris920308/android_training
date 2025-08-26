package hoon.example.mycompose.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyComposeApp() {
    MyComposeAppContent()
}

@Composable
fun MyComposeAppContent() {
    Text(
        text = "Hello MyCompose"
    )
}


@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}