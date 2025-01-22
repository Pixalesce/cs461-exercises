package com.example.businesscard.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.R
import com.example.businesscard.ui.theme.BusinessCardTheme

@Composable
fun TitleImage(modifier: Modifier = Modifier) {
    val fg = painterResource(R.drawable.ic_launcher_foreground)
    val bg = painterResource(R.drawable.ic_launcher_background)
    val qr = painterResource(R.drawable.github)

    val isAltImage = remember { mutableStateOf(false) }
    val isRotating = remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isRotating.value) 180f else 0f,
        animationSpec = tween(durationMillis = 600),
    )

    LaunchedEffect(rotation) {
        if (rotation > 90f && !isAltImage.value) {
            isAltImage.value = true
        } else if (rotation < 90f && isAltImage.value) {
            isAltImage.value = false
        }
    }

    Box(
        modifier = modifier
            .size(200.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                isRotating.value = !isRotating.value
            }
            .graphicsLayer(rotationY = rotation)
    ) {
        if (isAltImage.value) {
            Image(
                painter = qr,
                contentDescription = "QR code",
                modifier = modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(16.dp))
            )
        } else {
            Image(
                painter = bg,
                contentDescription = "Image background",
                modifier = modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(16.dp))
            )
            Image(
                painter = fg,
                contentDescription = "Image foreground",
                modifier = modifier
                    .fillMaxSize()
            )
        }
    }
}


@Preview
@Composable
fun TitleImagePreview() {
    BusinessCardTheme {
        TitleImage()
    }
}