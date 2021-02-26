package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.androiddevchallenge.R

data class Dog(
    val id: Long,
    val name: String,
    val sex: Sex,
    val description: String,
    @DrawableRes val picture: Int
) {
    enum class Sex(val displayText: String) {
        FEMALE("\u2640"),
        MALE("\u2642")
    }

}
