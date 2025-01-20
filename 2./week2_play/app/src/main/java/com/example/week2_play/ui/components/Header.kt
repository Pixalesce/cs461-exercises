package com.example.week2_play.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2_play.ui.theme.Week2_playTheme

@Composable
fun Header(modifier: Modifier = Modifier) {
    Text(
        text = "Lemonade",
        fontSize = 24.sp,
        fontWeight = FontWeight.Medium,
//        color = Color.Cyan,
        modifier = modifier.padding(16.dp)
    )
}

@Preview
@Composable
fun HeaderPreview() {
    Week2_playTheme {
        Header()
    }
}
