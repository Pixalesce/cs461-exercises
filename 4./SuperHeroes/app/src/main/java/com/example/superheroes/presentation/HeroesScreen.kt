package com.example.superheroes.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.R
import com.example.superheroes.model.HeroesRepository

@Composable
fun HeroesScreen(modifier: Modifier = Modifier) {
    val heroList = HeroesRepository.heroes
    LazyColumn (
        modifier = modifier
            .fillMaxSize()
    ) {
        for (hero in heroList) {
            item {
                SuperHeroCard(
                    modifier = modifier,
                    heroImage = hero.imageRes,
                    heroName = stringResource(hero.nameRes),
                    heroDesc = stringResource(hero.descriptionRes)
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun SuperHeroCard(
    modifier: Modifier = Modifier,
    heroImage: Int,
    heroName: String,
    heroDesc: String
) {
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
    ) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
                .sizeIn(minHeight = 72.dp)
        ) {
            Column(
                modifier = modifier.weight(1f)
            ) {
                Text(
                    text = heroName,
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = heroDesc,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Box(
                modifier = modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(8.dp))
            ) {
                Image(
                    painter = painterResource(heroImage),
                    contentDescription = "hero image",
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.FillWidth
                )
            }
        }
    }
}

@Preview
@Composable
private fun SuperHeroCardPreview() {
    SuperHeroCard(
        heroImage = R.drawable.android_superhero1,
        heroName = stringResource(id = R.string.hero1),
        heroDesc = stringResource(id = R.string.description1)
    )
}
