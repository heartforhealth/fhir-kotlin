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
    var url: String? = null,

    /**
     * Value of extension - must be one of a constrained set of the data types (see [Extensibility](extensibility.html) for a list).
     */
    var valueBase64Binary: String? = null,
    var valueBoolean: Boolean? = null,
    var valueCanonical: String? = null,
    var valueCode: String? = null,
    var valueDate: String? = null,
    var valueDateTime: String? = null,
    var valueDecimal: Double? = null,
    var valueId: String? = null,
    var valueInstant: String? = null,
    var valueInteger: Int? = null,
    var valueMarkdown: String? = null,
    var valueOid: String? = null,
    var valuePositiveInt: Int? = null,
    var valueTime: String? = null,
    var valueUnsignedInt: Int? = null,
    var valueUri: String? = null,
    var valueUrl: String? = null,
    var valueAddress: Address? = null

    // TODO:
    //    "valueAge" : { Age }
    //    "valueAnnotation" : { Annotation }
    //    "valueAttachment" : { Attachment }
    //    "valueCodeableConcept" : { CodeableConcept }
    //    "valueCoding" : { Coding }
    //    "valueContactPoint" : { ContactPoint }
    //    "valueCount" : { Count }
    //    "valueDistance" : { Distance }
    //    "valueDuration" : { Duration }
    //    "valueHumanName" : { HumanName }
    //    "valueIdentifier" : { Identifier }
    //    "valueMoney" : { Money }
    //    "valuePeriod" : { Period }
    //    "valueQuantity" : { Quantity }
    //    "valueRange" : { Range }
    //    "valueRatio" : { Ratio }
    //    "valueReference" : { Reference }
    //    "valueSampledData" : { SampledData }
    //    "valueSignature" : { Signature }
    //    "valueTiming" : { Timing }
    //    "valueContactDetail" : { ContactDetail }
    //    "valueContributor" : { Contributor }
    //    "valueDataRequirement" : { DataRequirement }
    //    "valueExpression" : { Expression }
    //    "valueParameterDefinition" : { ParameterDefinition }
    //    "valueRelatedArtifact" : { RelatedArtifact }
    //    "valueTriggerDefinition" : { TriggerDefinition }
    //    "valueUsageContext" : { UsageContext }
    //    "valueDosage" : { Dosage }
    //    "valueMeta" : { Meta }

)