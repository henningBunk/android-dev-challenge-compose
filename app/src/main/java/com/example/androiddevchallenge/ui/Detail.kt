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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.DogRepo

@Composable
fun Detail(
    dogId: Long,
    upPress: () -> Unit,
    modifier: Modifier = Modifier
) {
    val dog = remember(dogId) { DogRepo.getDog(dogId) }
    Detail(dog, upPress, modifier)
}

@Composable
fun Detail(
    dog: Dog,
    upPress: () -> Unit,
    modifier: Modifier = Modifier
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
