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
        id = 1,
        name = "Stalone",
        sex = Dog.Sex.MALE,
        race = Dog.Race.FRENCH_BULLDOG,
        age = 3,
        description = "STALONE! STALONE! WHERE ARE YOU, STALLOOONE???",
        picture = R.drawable.dog_1
    ),
    Dog(
        id = 2,
        name = "Suzy",
        sex = Dog.Sex.FEMALE,
        race = Dog.Race.CORGI,
        age = 6,
        description = "She is a really piece of work. Eats all the snacks all the time.",
        picture = R.drawable.dog_2
    ),
    Dog(
        id = 3,
        name = "Captain Wüff",
        sex = Dog.Sex.MALE,
        race = Dog.Race.FRENCH_BULLDOG,
        age = 2,
        description = "He is one of the best bois in town",
        picture = R.drawable.dog_3
    ),
    Dog(
        id = 4,
        name = "Juno",
        sex = Dog.Sex.FEMALE,
        race = Dog.Race.PEKINGESE,
        age = 8,
        description = "La grande dame of dogs. She'll love you if she wants to",
        picture = R.drawable.dog_4
    ),
    Dog(
        id = 5,
        name = "Lady Gogo",
        sex = Dog.Sex.FEMALE,
        race = Dog.Race.PUG,
        age = 3,
        description = "She can run for miles in delight. She likes howling to classical music and snacking on pillows.",
        picture = R.drawable.dog_5
    ),
    Dog(
        id = 6,
        name = "Rose",
        sex = Dog.Sex.FEMALE,
        race = Dog.Race.PUG,
        age = 6,
        description = "She catches mice - but not lice!",
        picture = R.drawable.dog_6
    ),
    Dog(
        id = 7,
        name = "Doge",
        sex = Dog.Sex.MALE,
        race = Dog.Race.SHIBE,
        age = 4,
        description = "Much good boy. Very Dog. Wow. Such handsome friend. To the moon 🚀",
        picture = R.drawable.dog_7
    ),
    Dog(
        id = 8,
        name = "Mr. Pink",
        sex = Dog.Sex.MALE,
        race = Dog.Race.PUG,
        age = 3,
        description = "He is in his rebellios phase, hanging around with the local punks all day and night long. His favorite band are The Ramones.",
        picture = R.drawable.dog_8
    ),
    Dog(
        id = 9,
        name = "Bela",
        sex = Dog.Sex.MALE,
        race = Dog.Race.DANSK_SVENSK_GARDHUND,
        age = 5,
        description = "Bela's hobbies are: Barking, Rolling over the carpet, sighing and cuddling under blankets. He is not for adoption!.",
        picture = R.drawable.bela
    ),
).shuffled()
