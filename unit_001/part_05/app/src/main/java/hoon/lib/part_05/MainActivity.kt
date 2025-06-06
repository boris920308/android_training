package hoon.lib.part_05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorial()
        }
    }

    @Composable
    fun ComposeTutorial(
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier
                .systemBarsPadding()
        ) {
            TopImage()
            TitleText()
            SecondText()
            ThirdText()
        }
    }


    @Composable
    fun TopImage() {
        val image = painterResource(R.drawable.bg_compose_background)

        Image(
            painter = image,
            contentDescription = null,
        )
    }

    @Composable
    fun TitleText() {
        Text(
            text = stringResource(R.string.title_text),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
    }

    @Composable
    fun SecondText() {
        Text(
            text = stringResource(R.string.second_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp
                )
        )
    }

    @Composable
    fun ThirdText() {
        Text(
            text = stringResource(R.string.third_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun MyPreView() {
        ComposeTutorial()
    }
}
