package com.example.androiddevchallenge.overview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Preview(widthDp = 320)
@Composable
fun Overview(
    modifier: Modifier = Modifier
) {
    val dogs = listOf("Bela", "Stalone")
    LazyColumn(
        contentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            OverviewCard(dog)
        }
    }
}

@Composable
fun OverviewCard(
    dog: String,
    modifier: Modifier = Modifier
) {
    Card(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier
            .requiredHeight(128.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    dog,
                )
                Text("\u2642")
                Text("He is a really good boy.")
            }

            Image(
                // painter = painterResource(id = R.drawable.dog),
                painter = painterResource(id = R.drawable.ic_baseline_local_florist_24),
                contentDescription = "dog",
                modifier = Modifier
                    .clip(CircleShape)

            )
        }
    }
}
