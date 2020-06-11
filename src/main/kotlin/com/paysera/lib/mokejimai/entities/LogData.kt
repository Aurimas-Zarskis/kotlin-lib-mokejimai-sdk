package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LogData(
    val action: String,
    @Json(name = "user_id")
    val userId: String,
    val context: LogContext
) {
    @JsonClass(generateAdapter = true)
    data class LogContext(
        @Json(name = "app_version")
        val appVersion: String
    )
}