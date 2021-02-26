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