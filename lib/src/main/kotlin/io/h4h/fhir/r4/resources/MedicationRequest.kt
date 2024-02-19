package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.serializers.InstantSerializer
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.

  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:

   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to
     endorse or promote products derived from this software without specific
     prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */ 

/**
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
@Serializable
data class MedicationRequest(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: String = ResourceType.Appointment.name,
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
     * Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.
     */
    val identifier: List<Identifier>? = null,


    /**
     * A code specifying the current state of the order.  Generally, this will be active or completed state.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-status")
     */
    val status: MedicationRequestStatus? = null,


    /**
     * Captures the reason for the current state of the MedicationRequest.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-status-reason")
     */
    val statusReason: CodeableConcept? = null,


    /**
     * Whether the request is a proposal, plan, or an original order.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-intent")
     */
    val intent: MedicationRequestIntent? = null,


    /**
     * Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-category")
     */
    val category: List<CodeableConcept>? = null,


    /**
     * Indicates how quickly the Medication Request should be addressed with respect to other requests.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
     */
    val priority: RequestPriority? = null,


    /**
     * If true indicates that the provider is asking for the medication request not to occur.
     */
    val doNotPerform: Boolean? = null,


    /**
     * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record. It may also indicate the source of the report.
     */
    val reportedBoolean: Boolean? = null,
    val reportedReference: Reference? = null,


    /**
     * Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-codes")
     */
    val medicationReference: Reference? = null,
    val medicationCodeableConcept: CodeableConcept? = null,


    /**
     * A link to a resource representing the person or set of individuals to whom the medication will be given.
     */
    val subject: Reference? = null,


    /**
     * The Encounter during which this was created or to which the creation of this record is tightly associated.
     */
    val encounter: Reference? = null,


    /**
     * Include additional information (for example, patient height and weight) that supports the ordering of the medication.
     */
    val supportingInformation: List<Reference>? = null,


    /**
     * The date (and perhaps time) when the prescription was initially written or authored on.
     */
    @Serializable(with= InstantSerializer::class)
    val authoredOn: Instant? = null,


    /**
     * The individual, organization, or device that initiated the request and has responsibility for its activation.
     */
    val requester: Reference? = null,


    /**
     * The specified desired performer of the medication treatment (e.g. the performer of the medication administration).
     */
    val performer: Reference? = null,


    /**
     * Indicates the type of performer of the administration of the medication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/performer-role")
     */
    val performerType: CodeableConcept? = null,


    /**
     * The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.
     */
    val recorder: Reference? = null,


    /**
     * The reason or the indication for ordering or not ordering the medication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-code")
     */
    val reasonCode: List<CodeableConcept>? = null,


    /**
     * Condition or observation that supports why the medication was ordered.
     */
    val reasonReference: List<Reference>? = null,


    /**
     * The URL pointing to a protocol, guideline, orderset, or other definition that is adhered to in whole or in part by this MedicationRequest.
     */
    val instantiatesCanonical: List<String>? = null,


    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationRequest.
     */
    val instantiatesUri: List<String>? = null,


    /**
     * A plan or request that is fulfilled in whole or in part by this medication request.
     */
    val basedOn: List<Reference>? = null,


    /**
     * A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.
     */
    val groupIdentifier: Identifier? = null,


    /**
     * The description of the overall patte3rn of the administration of the medication to the patient.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medicationrequest-course-of-therapy")
     */
    val courseOfTherapyType: CodeableConcept? = null,


    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.
     */
    val insurance: List<Reference>? = null,


    /**
     * Extra information about the prescription that could not be conveyed by the other attributes.
     */
    val note: List<Annotation>? = null,


    /**
     * Indicates how the medication is to be used by the patient.
     */
    val dosageInstruction: List<Dosage>? = null,


    /**
     * Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
     */
    val dispenseRequest: MedicationRequestDispenseRequestComponent? = null,


    /**
     * Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     */
    val substitution: MedicationRequestSubstitutionComponent? = null,


    /**
     * A link to a resource representing an earlier order related order or prescription.
     */
    val priorPrescription: Reference? = null,


    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
     */
    val detectedIssue: List<Reference>? = null,


    /**
     * Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
     */
    val eventHistory: List<Reference>? = null,


): DomainResource



@Serializable
data class MedicationRequestDispenseRequestComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Indicates the quantity or duration for the first dispense of the medication.
     */
    val initialFill: MedicationRequestDispenseRequestInitialFillComponent? = null,


    /**
     * The minimum period of time that must occur between dispenses of the medication.
     */
    val dispenseInterval: Quantity? = null,


    /**
     * This indicates the validity period of a prescription (stale dating the Prescription).
     */
    val validityPeriod: Period? = null,


    /**
     * An integer indicating the number of times, in addition to the original dispense, (aka refills or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer does not include the original order dispense. This means that if an order indicates dispense 30 tablets plus "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.  A prescriber may explicitly say that zero refills are permitted after the initial dispense.
     */
    val numberOfRepeatsAllowed: Int? = null,


    /**
     * The amount that is to be dispensed for one fill.
     */
    val quantity: Quantity? = null,


    /**
     * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
     */
    val expectedSupplyDuration: Quantity? = null,


    /**
     * Indicates the intended dispensing Organization specified by the prescriber.
     */
    val performer: Reference? = null

): BackboneElement


@Serializable
data class MedicationRequestDispenseRequestInitialFillComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * The amount or quantity to provide as part of the first dispense.
     */
    val quantity: Quantity? = null,


    /**
     * The length of time that the first dispense is expected to last.
     */
    val duration: Quantity? = null

): BackboneElement


@Serializable
data class MedicationRequestSubstitutionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * True if the prescriber allows a different drug to be dispensed from what was prescribed.
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActSubstanceAdminSubstitutionCode")
     */
    val allowedBoolean: Boolean? = null,
    val allowedCodeableConcept: CodeableConcept? = null,


    /**
     * Indicates the reason for the substitution, or why substitution must or must not be performed.
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-SubstanceAdminSubstitutionReason")
     */
    val reason: CodeableConcept? = null

): BackboneElement



@Serializable
enum class MedicationRequestIntent : CodeableEnumeration {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @SerialName("proposal")
    PROPOSAL,

    /**
     * The request represents an intention to ensure something occurs without providing an authorization for others to act.
     */
    @SerialName("plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @SerialName("order")
    ORDER,

    /**
     * The request represents the original authorization for the medication request.
     */
    @SerialName("original-order")
    ORIGINALORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization..
     */
    @SerialName("reflex-order")
    REFLEXORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
     */
    @SerialName("filler-order")
    FILLERORDER,

    /**
     * The request represents an instance for the particular order, for example a medication administration record.
     */
    @SerialName("instance-order")
    INSTANCEORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or  other constraints among a set of requests.
     */
    @SerialName("option")
    OPTION;



    override val code: String
        get() = when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            ORDER -> "order"
            ORIGINALORDER -> "original-order"
            REFLEXORDER -> "reflex-order"
            FILLERORDER -> "filler-order"
            INSTANCEORDER -> "instance-order"
            OPTION -> "option"
        }


    override val system: String
        get() = "http://hl7.org/fhir/CodeSystem/medicationrequest-intent"


    override val definition: String?
        get() = when (this) {
            PROPOSAL -> "The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act"
            PLAN -> "The request represents an intention to ensure something occurs without providing an authorization for others to act."
            ORDER -> "The request represents a request/demand and authorization for action"
            ORIGINALORDER -> "The request represents the original authorization for the medication request."
            REFLEXORDER -> "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.."
            FILLERORDER -> "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order."
            INSTANCEORDER -> "The request represents an instance for the particular order, for example a medication administration record."
            OPTION -> "The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or  other constraints among a set of requests."
        }


    override val display: String?
        get() = when (this) {
            PROPOSAL -> "Proposal"
            PLAN -> "Plan"
            ORDER -> "Order"
            ORIGINALORDER -> "Original Order"
            REFLEXORDER -> "Reflex Order"
            FILLERORDER -> "Filler Order"
            INSTANCEORDER -> "Instance Order"
            OPTION -> "Option"
        }

}


@Serializable
enum class MedicationRequestStatus : CodeableEnumeration {

    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called 'suspended'.
     */
    @SerialName("on-hold")
    ONHOLD,

    /**
     * The prescription has been withdrawn before any administrations have occurred
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * All actions that are implied by the prescription have occurred.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * Some of the actions that are implied by the medication request may have occurred.  For example, the medication may have been dispensed and the patient may have taken some of the medication.  Clinical decision support systems should take this status into account
     */
    @SerialName("entered-in-error")
    ENTEREDINERROR,

    /**
     * Actions implied by the prescription are to be permanently halted, before all of the administrations occurred. This should not be used if the original order was entered in error
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The prescription is not yet 'actionable', e.g. it is a work in progress, requires sign-off, verification or needs to be run through decision support process.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
     */
    @SerialName("unknown")
    UNKNOWN;



    override val code: String
        get() = when (this) {
            ACTIVE -> "active"
            ONHOLD -> "on-hold"
            CANCELLED -> "cancelled"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            STOPPED -> "stopped"
            DRAFT -> "draft"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/CodeSystem/medicationrequest-status"


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The prescription is 'actionable', but not all actions that are implied by it have occurred yet."
            ONHOLD -> "Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called 'suspended'."
            CANCELLED -> "The prescription has been withdrawn before any administrations have occurred"
            COMPLETED -> "All actions that are implied by the prescription have occurred."
            ENTEREDINERROR -> "Some of the actions that are implied by the medication request may have occurred.  For example, the medication may have been dispensed and the patient may have taken some of the medication.  Clinical decision support systems should take this status into account"
            STOPPED -> "Actions implied by the prescription are to be permanently halted, before all of the administrations occurred. This should not be used if the original order was entered in error"
            DRAFT -> "The prescription is not yet 'actionable', e.g. it is a work in progress, requires sign-off, verification or needs to be run through decision support process."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, but the authoring/source system does not know which."
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            ONHOLD -> "On Hold"
            CANCELLED -> "Cancelled"
            COMPLETED -> "Completed"
            ENTEREDINERROR -> "Entered in Error"
            STOPPED -> "Stopped"
            DRAFT -> "Draft"
            UNKNOWN -> "Unknown"
        }
    
}


