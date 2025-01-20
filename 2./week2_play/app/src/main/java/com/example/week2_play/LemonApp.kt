package com.example.week2_play;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.week2_play.ui.components.Header
import com.example.week2_play.ui.components.LemonButton

@Composable
fun LemonApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),

        color = MaterialTheme.colorScheme.background
    )

    {
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = modifier
                    .background(color = Color.Yellow)
                    .height(120.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Header()
            }
            Row {
                LemonButton()
            }
        }
    }
}