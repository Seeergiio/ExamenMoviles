package com.example.appsimpson001.data.model

import com.squareup.moshi.Json

data class CharacterDto(
    val _id: String,
    val name: String,
    val description: String,
    val price: Double,
    val category: String,
    val image: String,
    val active: Boolean,
    @Json(name = "portrait_path") val portraitPath: String? = null
)