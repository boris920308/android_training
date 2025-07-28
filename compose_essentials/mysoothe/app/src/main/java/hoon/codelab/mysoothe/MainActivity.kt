package hoon.codelab.mysoothe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import hoon.codelab.mysoothe.ui.theme.MySootheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MySootheTheme {
            }
        }
    }
}


@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF5F0EE
)
@Composable
fun SearchBarPreview() {
    MySootheTheme {
        SearchBar(
            Modifier.padding(
                8.dp
            )
        )
    }
}