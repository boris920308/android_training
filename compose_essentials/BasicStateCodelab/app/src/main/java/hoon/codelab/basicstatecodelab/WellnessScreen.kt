package hoon.codelab.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hoon.codelab.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column {
        StatefulCounter(modifier)
        WellnessTasksList()
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme {
        WellnessScreen()
    }
}