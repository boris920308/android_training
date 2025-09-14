package hoon.example.mycompose.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hoon.example.mycompose.data.HomeMenuItem
import hoon.example.mycompose.ui.components.HomeMenuListItem
import hoon.example.mycompose.utils.getDummyHomeMenuItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    homeMenuItem: List<HomeMenuItem>,
    onMenuClick: (HomeMenuItem) -> Unit = {}
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
            .fillMaxSize()
    ) {
        items(homeMenuItem) { item ->
            HomeMenuListItem(
                homeMenuItem = item,
                modifier = Modifier,
                onClick = { onMenuClick(item) }
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(homeMenuItem = getDummyHomeMenuItem())
}