package com.example.tipcalculator.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun BillInput(billAmount: String, onBillAmountChanged: (String) -> Unit, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Calculate Tip",
            modifier = modifier
                .align(alignment = Alignment.Start)
        )
        TextField(
            value = billAmount,
            onValueChange =  onBillAmountChanged,
            label = { Text("Bill Amount") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            modifier = modifier
        )
    }
}
