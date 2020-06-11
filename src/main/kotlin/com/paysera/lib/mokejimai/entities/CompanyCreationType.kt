package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

sealed class CompanyCreationType {

    @JsonClass(generateAdapter = true)
    data class CompanyIdentifier(
        @Json(name = "country_code")
        val countryCode: String,
        @Json(name = "company_code")
        val companyCode: String
    ) : CompanyCreationType()

    @JsonClass(generateAdapter = true)
    data class CompanyTask(
        val id: String,
        @Json(name = "country_code")
        val countryCode: String,
        val solution: String
    ) : CompanyCreationType()

    fun getType(): String {
        return when(this) {
            is CompanyIdentifier -> "company_identifier"
            is CompanyTask -> "company_task"
        }
    }
}