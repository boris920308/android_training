package hoon.example.mycompose.ui

import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

    Scaffold { innerPadding ->
        HomeScreen(
            modifier = Modifier
                .padding(innerPadding),
            homeMenuItem = getDummyHomeMenuItem(),
        ) { clickedItem ->
            Toast.makeText(context, "Hello Item!", Toast.LENGTH_SHORT).show()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyComposeAppPreview() {
    MyComposeApp()
}