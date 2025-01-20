package com.example.week1_play

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week1_play.ui.theme.Week1playTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week1playTheme {
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Sam",
                        from = "Emma"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(recipient: String, sender: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(28.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Happy Birthday $recipient!",
            fontSize = 60.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(24.dp),
        )
        Text(
            text = "From $sender!",
            fontSize = 20.sp,
            modifier = modifier
                .padding(16.dp)
                .align(Alignment.End),
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f,
        )
        Greeting(message, from)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week1playTheme {
        Greeting("Sam", "Emma")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingImagePreview() {
    Week1playTheme {
        GreetingImage("Sam", "Emma")
    }
}
