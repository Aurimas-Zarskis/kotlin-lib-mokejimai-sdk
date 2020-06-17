package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompanyAccount(
    val name: String?,
    @Json(name = "country_code")
    val countryCode: String,
    @Json(name = "company_code")
    val companyCode: String
)