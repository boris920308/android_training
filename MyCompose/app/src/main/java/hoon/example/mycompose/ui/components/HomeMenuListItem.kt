package hoon.example.mycompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import hoon.example.mycompose.data.HomeMenuItem
import hoon.example.mycompose.utils.getDummyHomeMenuItem

@Composable
fun HomeMenuListItem(
    modifier: Modifier = Modifier,
    homeMenuItem: HomeMenuItem,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .clickable { onClick() }
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = homeMenuItem.icon,
            contentDescription = homeMenuItem.label
        )
        Text(
            text = homeMenuItem.label
        )
    }

}

@Preview(showBackground = true)
@Composable
fun HomeMenuListItemPreview() {
    HomeMenuListItem(
        homeMenuItem = getDummyHomeMenuItem()[0]
    )
}