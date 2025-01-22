package com.example.businesscard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun ContactDetails() {
    Column {
        ContactItem(
            text = R.string.mobile,
            icon = Icons.Filled.Call,
            iconDesc = R.string.icon_mobile,
            iconTint = Color(61, 220, 132)
        )
        ContactItem(
            text = R.string.github,
            icon = Icons.Filled.Share,
            iconDesc = R.string.icon_github,
            iconTint = Color(61, 220, 132)
        )
        ContactItem(
            text = R.string.email,
            icon = Icons.Filled.Email,
            iconDesc = R.string.icon_email,
            iconTint = Color(61, 220, 132)
        )
    }
}

@Preview
@Composable
fun ContactDetailsPreview() {
    BusinessCardTheme {
        ContactDetails()
    }
}
