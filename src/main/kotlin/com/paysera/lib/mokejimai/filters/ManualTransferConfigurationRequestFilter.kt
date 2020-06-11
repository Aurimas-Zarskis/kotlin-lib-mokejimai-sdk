package com.paysera.lib.mokejimai.filters

import com.paysera.lib.common.entities.BaseFilter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class ManualTransferConfigurationRequestFilter(
    offset: Int? = null,
    limit: Int? = null,
    orderBy: String? = null,
    orderDirection: String? = null,
    after: String? = null,
    before: String? = null,
    @Json(name = "from_bank_key")
    val fromBankKey: String? = null,
    @Json(name = "from_country_code")
    val fromCountryCode: String? = null,
    val currency: String? = null,
    @Json(name = "to_bank_key")
    val toBankKey: String? = null,
    @Json(name = "to_country_code")
    val toCountryCode: String? = null,
    @Json(name = "to_iban")
    val toIban: String? = null,
    val locale: String? = null
) : BaseFilter(
    offset = offset,
    limit = limit,
    orderBy = orderBy,
    orderDirection = orderDirection,
    after = after,
    before = before
)