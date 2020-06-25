package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IdentityDocuments(
    @Json(name = "document_type")
    var documentType: String,
    var country: String,
    var type: String,
    var src: String
)