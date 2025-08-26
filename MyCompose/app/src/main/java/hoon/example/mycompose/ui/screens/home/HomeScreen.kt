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
    homeMenuItem: List<HomeMenuItem>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(homeMenuItem) { item ->
            HomeMenuListItem(
                homeMenuItem = item,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(getDummyHomeMenuItem())
}