package hoon.lib.part_05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopImage()
        }
    }

    @Composable
    fun TopImage(
        modifier: Modifier = Modifier
    ) {
        val image = painterResource(R.drawable.bg_compose_background)

        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .systemBarsPadding()
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun MyPreView() {
        TopImage()
    }
}
