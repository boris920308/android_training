package hoon.codelab.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        var count = 0
        Text(
            text = "You've had $count glasses.",
        )
        Button(
            onClick = { count++ }, // click event가 발생하더라도 ui를 다시 그리지 않아 화면에 표시되는 count는 변하지 않음
            Modifier.padding(top = 8.dp)
        ) {
            Text("Add one")
        }
    }
}