package com.example.businesscard.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.components.ContactDetails
import com.example.businesscard.ui.components.Title
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun App(modifier: Modifier = Modifier) {
    Surface (
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
        ) {
            Spacer(modifier = modifier.weight(3f))

            Title()

            Spacer(modifier = modifier.weight(2f))

            ContactDetails()

            Spacer(modifier = modifier.weight(0.5f))
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    BusinessCardTheme {
        App()
    }
}