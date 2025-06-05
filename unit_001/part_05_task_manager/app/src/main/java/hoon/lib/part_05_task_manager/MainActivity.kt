package hoon.lib.part_05_task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManager()
        }
    }
}

@Composable
fun TaskManager() {
    CompletedImage()
}

@Composable
fun CompletedImage() {
    val image = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManager()
}