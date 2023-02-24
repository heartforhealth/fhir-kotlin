package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.Annotation
import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.serializers.InstantSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
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



/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
 */
@Serializable
data class RiskAssessment(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.RiskAssessment,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Business identifier assigned to the risk assessment.
     */
    val identifier: List<Identifier>? = null,

    /**
     * A reference to the request that is fulfilled by this risk assessment.
     */
    val basedOn: Reference? = null,

    /**
     * A reference to a resource that this risk assessment is part of, such as a Procedure.
     */
    val parent: Reference? = null,

    /**
     * The status of the RiskAssessment, using the same statuses as an Observation.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-status")
     */
    val status: RiskAssessmentStatus? = null,

    /**
     * The algorithm, process or mechanism used to evaluate the risk.
     */
    val method: CodeableConcept? = null,

    /**
     * The type of the risk assessment performed.
     */
    val code: CodeableConcept? = null,

    /**
     * The patient or group the risk assessment applies to.
     */
    val subject: Reference? = null,

    /**
     * The encounter where the assessment was performed.
     */
    val encounter: Reference? = null,

    /**
     * The date (and possibly time) the risk assessment was performed.
     */
    @Serializable(with= InstantSerializer::class)
    val occurrenceDateTime: Instant? = null,
    val occurrencePeriod: Period? = null,

    /**
     * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
     */
    val condition: Reference? = null,

    /**
     * The provider or software application that performed the assessment.
     */
    val performer: Reference? = null,

    /**
     * The reason the risk assessment was performed.
     */
    val reasonCode: List<CodeableConcept>? = null,

    /**
     * Resources supporting the reason the risk assessment was performed.
     */
    val reasonReference: List<Reference>? = null,

    /**
     * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
     */
    val basis: List<Reference>? = null,

    /**
     * Describes the expected outcome for the subject.
     */
    val prediction: List<RiskAssessmentPredictionComponent>? = null,

    /**
     * A description of the steps that might be taken to reduce the identified risk(s).
     */
    val mitigation: String? = null,

    /**
     * Additional comments about the risk assessment.
     */
    val note: List<Annotation>? = null


) : DomainResource


@Serializable
enum class RiskAssessmentStatus : CodeableEnumeration {

    /**
     * The existence of the observation is registered, but there is no result yet available.
     */
    @SerialName("registered")
    REGISTERED,

    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     */
    @SerialName("preliminary")
    PRELIMINARY,

    /**
     * The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.
     */
    @SerialName("final")
    FINAL,

    /**
     * Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
     */
    @SerialName("amended")
    AMENDED,

    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test result.
     */
    @SerialName("corrected")
    CORRECTED,

    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
     */
    @SerialName("unknown")
    UNKNOWN;


    override val code: String?
        get() = when (this) {
            REGISTERED -> "registered"
            PRELIMINARY -> "preliminary"
            FINAL -> "final"
            AMENDED -> "amended"
            CORRECTED -> "corrected"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }


    override val system: String? = "http://hl7.org/fhir/observation-status"


    override val definition: String?
        get() = when (this) {
            REGISTERED -> "The existence of the observation is registered, but there is no result yet available."
            PRELIMINARY -> "This is an initial or interim observation: data may be incomplete or unverified."
            FINAL -> "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied."
            AMENDED -> "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections."
            CORRECTED -> "Subsequent to being Final, the observation has been modified to correct an error in the test result."
            CANCELLED -> "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\")."
            ENTEREDINERROR -> "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which."
        }


    override val display: String?
        get() = when (this) {
            REGISTERED -> "Registered"
            PRELIMINARY -> "Preliminary"
            FINAL -> "Final"
            AMENDED -> "Amended"
            CORRECTED -> "Corrected"
            CANCELLED -> "Cancelled"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
        }

}


@Serializable
data class RiskAssessmentPredictionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
     */
    val outcome: CodeableConcept? = null,

    /**
     * Indicates how likely the outcome is (in the specified timeframe).
     */
    val probabilityDecimalType: Double? = null,
    val probabilityRange: Range? = null,

    /**
     * Indicates how likely the outcome is (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, or high).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/risk-probability")
     */
    val qualitativeRisk: CodeableConcept? = null,

    /**
     * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
     */
    val relativeRisk: Double? = null,

    /**
     * Indicates the period of time or age range of the subject to which the specified probability applies.
     */
    val whenPeriod: Period? = null,
    val whenRange: Range? = null,

    /**
     * Additional information explaining the basis for the prediction.
     */
    val rationale: String? = null


) : BackboneElement
