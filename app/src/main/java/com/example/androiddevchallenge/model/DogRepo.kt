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
package com.example.androiddevchallenge.model

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.androiddevchallenge.R

object DogRepo {

    fun getDog(dogId: Long): Dog = testDogs.find { it.id == dogId }!!

    fun getDogs(): List<Dog> = testDogs
}

class DogsListsProvider : PreviewParameterProvider<List<Dog>> {
    override val values: Sequence<List<Dog>> = listOf(testDogs).asSequence()
}

val testDogs = listOf(
    Dog(
        1,
        "Stalone",
        Dog.Sex.MALE,
        "STALONE! STALONE! WHERE ARE YOU, STALLOOONE???",
        R.drawable.dog_2
    ),
    Dog(
        2,
        "Suzy",
        Dog.Sex.FEMALE,
        "She is a really piece of work. Eats all the snacks all the time.",
        R.drawable.dog_4
    ),
    Dog(
        3,
        "Captain Wüff",
        Dog.Sex.MALE,
        "He is one of the best bois in town",
        R.drawable.dog_8
    ),
)
