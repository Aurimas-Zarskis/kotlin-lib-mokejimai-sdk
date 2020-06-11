package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ManualTransferConfiguration(
    @Json(name = "from_bank_key")
    var fromBankKey: String,
    @Json(name = "from_bank_key_translation")
    var fromBankKeyTranslation: String,
    @Json(name = "to_bank_key")
    var toBankKey: String,
    @Json(name = "to_bank_key_translation")
    var toBankKeyTranslation: String,
    var currency: String,
    @Json(name = "to_country_code")
    var toCountryCode: String,
    @Json(name = "to_iban")
    var toIban: String,
    @Json(name = "to_bic")
    var toBic: String,
    @Json(name = "to_beneficiary_name")
    var toBeneficiaryName: String,
    var commission: Commission,
    @Json(name = "transfer_execution_time")
    var transferExecutionTime: String,
    @Json(name = "transfer_execution_time_key")
    var transferExecutionTimeKey: String,

    @Json(name = "from_country_code")
    var fromCountryCode: String?,
    @Json(name = "to_account_number")
    var toAccountNumber: String?,
    @Json(name = "to_bank_code")
    var toBankCode: String?,
    @Json(name = "sort_order")
    var sortOrder: String?,
    @Json(name = "correspondent_bank_name")
    var correspondentBankName: String?,
    @Json(name = "correspondent_bank_swift")
    var correspondentBankSwift: String?,
    @Json(name = "correspondent_bank_address")
    var correspondentBankAddress: String?,
    @Json(name = "bank_address")
    var bankAddress: String?,
    @Json(name = "commission_percent")
    var commissionPercent: String?,
    @Json(name = "commission_max_amount")
    var commissionMaxAmount: String?,
    @Json(name = "commission_min_amount")
    var commissionMinAmount: String?,
    var name: String?
)
{
    @JsonClass(generateAdapter = true)
    data class Commission(
        var amount: String,
        var currency: String
    )
}