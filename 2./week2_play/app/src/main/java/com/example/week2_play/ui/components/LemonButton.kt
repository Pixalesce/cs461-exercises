package com.example.week2_play.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week2_play.R
import com.example.week2_play.ui.theme.Week2_playTheme

val lemonImages = arrayOf(
    R.drawable.lemon_tree,
    R.drawable.lemon_squeeze,
    R.drawable.lemon_drink,
    R.drawable.lemon_restart
)

val lemonAction = arrayOf(
    R.string.tap_tree,
    R.string.tap_squeeze,
    R.string.tap_drink,
    R.string.tap_restart,
)

val lemonDescs = arrayOf(
    R.string.desc_lemon_tree,
    R.string.desc_squeeze,
    R.string.desc_drink,
    R.string.desc_restart,
)

@Composable
fun LemonButton(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(0) }
    var squeezes by remember { mutableStateOf(0) }

    fun setNextImage() {
        if (state == 1) {
            squeezes--
            if (0 == squeezes) {
                state = (state + 1) % 4
            }
            return
        }
        if (state == 0) {
            squeezes = (1..4).random()
        }
        state = (state + 1) % 4
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { setNextImage() },
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(200, 235, 250))
        ) {
            Image(
                painter = painterResource(lemonImages[state]),
                contentDescription = stringResource(lemonDescs[state]),
                modifier = modifier
                    .padding(16.dp)
            )
        }
        Text(
            text = stringResource(lemonAction[state]),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week2_playTheme {
        LemonButton()
    }
}
