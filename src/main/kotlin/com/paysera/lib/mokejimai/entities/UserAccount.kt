package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserAccount(
    val id: Int,
    val identifier: String,
    @Json(name = "display_name")
    val displayName: String?,
    val type: String,
    val code: String?
)