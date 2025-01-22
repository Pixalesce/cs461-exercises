package com.example.businesscard.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun ContactItem(text: Int, icon: ImageVector, iconDesc: Int, iconTint: Color, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier
            .padding(0.dp, 12.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = stringResource(iconDesc),
            tint = iconTint
        )
        Spacer(
            modifier = modifier
                .padding(0.dp, 0.dp, 12.dp, 0.dp)
        )
        Text(
            text = stringResource(text)
        )
    }
}

@Preview
@Composable
fun ContactItemPreview() {
    BusinessCardTheme {
        ContactItem(
            text = R.string.mobile,
            icon = Icons.Filled.Call,
            iconDesc = R.string.icon_mobile,
            iconTint = Color.Cyan
        )
    }
}
