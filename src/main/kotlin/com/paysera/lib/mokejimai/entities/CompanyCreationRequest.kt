package com.paysera.lib.mokejimai.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompanyCreationRequest(
    @Json(name = "manager_id")
    var managerId: Int,
    var type: String,
    @Json(name = "company_identifier")
    val companyIdentifier: CompanyCreationType.CompanyIdentifier? = null,
    @Json(name = "company_task")
    val companyTask: CompanyCreationType.CompanyTask? = null
) {
    constructor(
        managerId: Int,
        identifier: CompanyCreationType.CompanyIdentifier
    ) : this(managerId, identifier.getType(), identifier, null)

    constructor(
        managerId: Int,
        task: CompanyCreationType.CompanyTask
    ) : this(managerId, task.getType(), null, task)
}