package com.example.tipcalculator.ui.components
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tipcalculator.R

@Composable
fun TipDisplay(tipAmount: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.tip_amount) + tipAmount,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(16.dp)
    )
}
