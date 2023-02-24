package io.h4h.fhir.r4.base

import kotlinx.serialization.Serializable


/*
 Copyright (c) 2011+, HL7, Inc.
 All rights reserved.
 
 Redistribution and use in source and binary forms, with or without modification, 
 are permitted provided that the following conditions are met:
 
  * Redistributions of source code must retain the above copyright notice, this 
    list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright notice, 
    this list of conditions and the following disclaimer in the documentation 
    and/or other materials provided with the distribution.
  * Neither the name of HL7 nor the names of its contributors may be used to 
    endorse or promote products derived from this software without specific 
    prior written permission.
 
 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
 PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 POSSIBILITY OF SUCH DAMAGE.
 
*/
// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1


/**
 * Optional Extension Element - found in all resources.
 */
@Serializable
data class Extension(
    /**
     * Source of the definition for the extension code - a logical name or a URL.
     */
    val url: String? = null,

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     */
    // val valueAge: Age? = null,
    val valueAnnotation: Annotation? = null,
    val valueAddress: Address? = null,
    val valueAttachment: Attachment? = null,
    val valueBase64Binary: String? = null,
    val valueBoolean: Boolean? = null,
    val valueCanonical: String? = null,
    val valueCode: String? = null,
    val valueCodeableConcept: CodeableConcept? = null,
    val valueCoding: Coding? = null,
    val valueContactPoint: ContactPoint? = null,
    // val valueCount: Count? = null,
    val valueContactDetail: ContactDetail? = null,
    // val valueContributor: Contributor? = null,
    val valueDataRequirement: DataRequirement? = null,
    val valueDate: String? = null,
    val valueDateTime: String? = null,
    val valueDecimal: Double? = null,
    // val valueDosage: Dosage? = null,
    // val valueDistance: Distance? = null,
    // val valueDuration: Duration? = null,
    // val valueExpression: Expression? = null,
    val valueHumanName: HumanName? = null,
    val valueId: String? = null,
    val valueIdentifier: Identifier? = null,
    val valueInstant: String? = null,
    val valueInteger: Int? = null,
    val valueMarkdown: String? = null,
    val valueMeta: Meta? = null,
    // val valueMoney: Money? = null,
    val valueOid: String? = null,
    // val valueParameterDefinition: ParameterDefinition? = null,
    val valuePeriod: Period? = null,
    val valuePositiveInt: Int? = null,
    val valueQuantity: Quantity? = null,
    val valueRange: Range? = null,
    val valueRelatedArtifact: RelatedArtifact? = null,
    val valueRatio: Ratio? = null,
    val valueReference: Reference? = null,
    val valueSampledData: SampledData? = null,
    val valueSignature: Signature? = null,
    val valueString: String? = null,
    val valueTiming: Timing? = null,
    val valueTime: String? = null,
    // val valueTriggerDefinition: TriggerDefinition? = null,
    val valueUnsignedInt: Int? = null,
    val valueUri: String? = null,
    val valueUrl: String? = null,
    val valueUsageContext: UsageContext? = null,
    val valueUuid: String? = null


) {

    /// 2 extensions with the same URL are considered equal
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Extension -> {
                (this.url == other.url)
            }
            else -> false
        }
    }

    /// we only care about the url value
    override fun hashCode(): Int {
        var result = url?.hashCode() ?: 0
        result = 31 * result + (url?.hashCode() ?: 0)
        return result
    }

}
