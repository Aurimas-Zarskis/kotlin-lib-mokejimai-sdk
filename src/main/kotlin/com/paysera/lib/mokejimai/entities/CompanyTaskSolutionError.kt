package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompanyTaskSolutionError(
    val id: String,
    @Json(name = "country_code")
    val countryCode: String,
    val type: String,
    @Json(name = "image_data")
    val imageData: String
)