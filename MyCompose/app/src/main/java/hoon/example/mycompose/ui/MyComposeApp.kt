package hoon.example.mycompose.ui

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import hoon.example.mycompose.ui.screens.home.HomeScreen
import hoon.example.mycompose.utils.getDummyHomeMenuItem

@Composable
fun MyComposeApp() {
    MyComposeAppContent()
}

@Composable
fun MyComposeAppContent() {
    val context = LocalContext.current

    HomeScreen(getDummyHomeMenuItem()) { clickedItem ->
        Toast.makeText(context, "Hello Item!", Toast.LENGTH_SHORT).show()
    }
}


@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}