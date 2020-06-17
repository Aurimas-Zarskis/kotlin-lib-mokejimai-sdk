package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserAddress(
    var type: String,
    @Json(name = "country_code")
    var countryCode: String,
    @Json(name = "county_name")
    var countyName: String?,
    @Json(name = "city_name")
    var cityName: String,
    @Json(name = "transliterated_city_name")
    var transliteratedCityName: String?,
    @Json(name = "postal_code")
    var postalCode: String,
    @Json(name = "legacy_address")
    var legacyAddress: String?,
    @Json(name = "street_name")
    var streetName: String,
    @Json(name = "house_number")
    var houseNumber: String?,
    @Json(name = "apartment_number")
    var apartmentNumber: String?
)