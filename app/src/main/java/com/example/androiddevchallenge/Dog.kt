package com.example.androiddevchallenge

import androidx.annotation.DrawableRes
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

data class Dog(
    val name: String,
    val sex: Sex,
    val description: String,
    @DrawableRes val picture: Int
) {
    enum class Sex {
        FEMALE,
        MALE
    }
}

class DogsListsProvider : PreviewParameterProvider<List<Dog>> {
    override val values: Sequence<List<Dog>> = listOf(testDogs).asSequence()
}

val testDogs = listOf(
    Dog(
        "Stalone",
        Dog.Sex.MALE,
        "STALONE! STALONE! WHERE ARE YOU, STALLOOONE???",
        R.drawable.dog_2
    ),
    Dog(
        "Captain Wüff",
        Dog.Sex.MALE,
        "He is one of the best bois in town",
        R.drawable.dog_8
    )
)