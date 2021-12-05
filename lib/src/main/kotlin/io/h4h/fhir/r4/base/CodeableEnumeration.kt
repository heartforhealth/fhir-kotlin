package io.h4h.fhir.r4.base


interface CodeableEnumeration {

    val display: String?
    val definition: String?
    val system: String?

    fun toCode(): String?

}