package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.ui.theme.SuperHeroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SuperHeroCard(
                        modifier = Modifier.padding(innerPadding),
                        heroImage = R.drawable.android_superhero1,
                        heroName = "Superman",
                        heroDesc = "Superman is a fictional superhero"
                    )
                }
            }
        }
    }
}

@Composable
fun SuperHeroCard(modifier: Modifier = Modifier, heroImage: Int, heroName: String, heroDesc: String) {
    Surface {
        Row {
            Column {
                Text(heroName)
                Text(heroDesc)
            }
            Image(
                painter = painterResource(heroImage),
                contentDescription = "hero image"
            )
        }
    }
}
