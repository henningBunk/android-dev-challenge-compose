/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.DogsListsProvider

@Preview(widthDp = 320)
@Composable
fun Overview(
    @PreviewParameter(DogsListsProvider::class) dogs: List<Dog>,
    selectDog: (Long) -> Unit = { _ -> },
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.primarySurface,
        topBar = {
            TopAppBar(
                title = {
                    Text("Wuff Wuff")
                }
            )
        }
    ) {
        LazyColumn(
            contentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(dogs) { dog ->
                OverviewCard(
                    dog = dog,
                    onClick = { selectDog(dog.id) }
                )
            }
        }
    }
}

@Composable
fun OverviewCard(
    dog: Dog,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier
            .requiredHeight(128.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row {
                    Text(
                        text = dog.name,
                        style = MaterialTheme.typography.h5
                    )
                    Text(
                        text = dog.sex.displayText,
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Text(text = dog.description)
            }
            Image(
                painter = painterResource(id = dog.picture),
                contentDescription = "dog",
                modifier = Modifier
                    .padding(8.dp)
                    .clip(CircleShape)
            )
        }
    }
}
