package hoon.example.mycompose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeMenuListItem(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Column {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "homeItem"
            )
            Text(
                text = "home"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeMenuListItemPreview() {
    HomeMenuListItem()
}