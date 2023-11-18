package com.digi.catsanddogs.data

import androidx.annotation.DrawableRes

enum class AnimalType {
    CAT,
    DOG,
    MIXED,
}

data class Animal(
    @DrawableRes val image: Int,
    val title: String,
    val age: Int,
    val type: AnimalType
)
