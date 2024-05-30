package io.h4h.fhir.r4.resources


import com.fasterxml.jackson.annotation.JsonProperty
import io.h4h.fhir.r4.base.Annotation
import io.h4h.fhir.r4.base.*
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
// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1


/**
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 */

@Serializable
data class CarePlan(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: String = ResourceType.CarePlan.name,
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
     * Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    val identifier: List<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
     */
    val instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
     */
    val instantiatesUri: List<String>? = null,

    /**
     * A care plan that is fulfilled in whole or in part by this care plan.
     */
    val basedOn: List<Reference>? = null,

    /**
     * Completed or terminated care plan whose function is taken by this new care plan.
     */
    val replaces: List<Reference>? = null,

    /**
     * A larger care plan of which this particular care plan is a component or step.
     */
    val partOf: List<Reference>? = null,

    /**
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-status")
     */
    val status: CarePlanStatus? = null,

    /**
     * Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-intent")
     */
    val intent: CarePlanIntent? = null,

    /**
     * Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-category")
     */
    val category: List<CodeableConcept>? = null,

    /**
     * Human-friendly name for the care plan.
     */
    val title: String? = null,

    /**
     * A description of the scope and nature of the plan.
     */
    val description: String? = null,

    /**
     * Identifies the patient or group whose intended care is described by the plan.
     */
    val subject: Reference? = null,

    /**
     * The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.
     */
    val encounter: Reference? = null,

    /**
     * Indicates when the plan did (or is intended to) come into effect and end.
     */
    val period: Period? = null,

    /**
     * Represents when this particular CarePlan record was created in the system, which is often a system-generated date.
     */
    val created: String? = null,

    /**
     * When populated, the author is responsible for the care plan.  The care plan is attributed to the author.
     */
    val author: Reference? = null,

    /**
     * Identifies the individual(s) or organization who provided the contents of the care plan.
     */
    val contributor: List<Reference>? = null,

    /**
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     */
    val careTeam: List<Reference>? = null,

    /**
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
     */
    val addresses: List<Reference>? = null,

    /**
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include comorbidities, recent procedures, limitations, recent assessments, etc.
     */
    val supportingInfo: List<Reference>? = null,

    /**
     * Describes the intended objective(s) of carrying out the care plan.
     */
    val goal: List<Reference>? = null,

    /**
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     */
    val activity: List<CarePlanActivityComponent>? = null,

    /**
     * General notes about the care plan not covered elsewhere.
     */
    val note: List<Annotation>? = null

) : DomainResource



@Serializable
data class CarePlanActivityComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-outcome")
     */
    val outcomeCodeableConcept: List<CodeableConcept>? = null,

    /**
     * Details of the outcome or action resulting from the activity.  The reference to an "event" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource).
     */
    val outcomeReference: List<Reference>? = null,

    /**
     * Notes about the adherence/status/progress of the activity.
     */
    val progress: List<Annotation>? = null,

    /**
     * The details of the proposed activity represented in a specific resource.
     */
    val reference: Reference? = null,


    /**
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     */
    val detail: CarePlanActivityDetailComponent? = null

) : BackboneElement


@Serializable
data class CarePlanActivityDetailComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * A description of the kind of resource the in-line definition of a care plan activity is representing.  The CarePlan.activity.detail is an in-line definition when a resource is not referenced using CarePlan.activity.reference.  For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-kind")
     */
    //
    val kind: CarePlanActivityKind? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     */
    val instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     */
    val instantiatesUri: List<String>? = null,

    /**
     * Detailed description of the type of planned activity; e.g. what lab test, what procedure, what kind of encounter.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-code")
     */
    val code: CodeableConcept? = null,

    /**
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-findings")
     */
    val reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.
     */
    val reasonReference: List<Reference>? = null,

    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     */
    val goal: List<Reference>? = null,

    /**
     * Identifies what progress is being made for the specific activity.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-status")
     */
    val status: CarePlanActivityStatus? = null,

    /**
     * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
     */
    val statusReason: CodeableConcept? = null,

    /**
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, or missing, indicates that the described activity is one that should be engaged in when following the plan.
     */
    val doNotPerform: Boolean? = null,

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     */
    val scheduledTiming: Timing? = null,
    val scheduledPeriod: Period? = null,
    val scheduledString: String? = null,

    /**
     * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
     */
    val location: Reference? = null,

    /**
     * Identifies who's expected to be involved in the activity.
     */
    val performer: List<Reference>? = null,

    /**
     * Identifies the food, drug or other product to be consumed or supplied in the activity.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-codes")
     */
    val productCodeableConcept: CodeableConcept? = null,
    val productReference: Reference? = null,

    /**
     * Identifies the quantity expected to be consumed in a given day.
     */
    val dailyAmount: Quantity? = null,

    /**
     * Identifies the quantity expected to be supplied, administered or consumed by the subject.
     */
    val quantity: Quantity? = null,

    /**
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     */
    val description: String? = null

) : BackboneElement



@Serializable
enum class CarePlanStatus : CodeableEnumeration {
    /**
     * The request has been created but is not yet complete or ready for action.
     */
    @SerialName("draft")
    @JsonProperty("draft")
    DRAFT,

    /**
     * The request is in force and ready to be acted upon.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.
     */
    @SerialName("on-hold")
    @JsonProperty("on-hold")
    ONHOLD,

    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.
     */
    @SerialName("revoked")
    @JsonProperty("revoked")
    REVOKED,

    /**
     * The activity described by the request has been fully performed.  No further activity will occur.
     */
    @SerialName("completed")
    @JsonProperty("completed")
    COMPLETED,

    /**
     * This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;



    override val code: String
        get() = when (this) {
            DRAFT -> "draft"
            ACTIVE -> "active"
            ONHOLD -> "on-hold"
            REVOKED -> "revoked"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }

    override val system: String
        get() = "http://hl7.org/fhir/request-status"

    override val definition: String?
        get() = when (this) {
            DRAFT -> "The request has been created but is not yet complete or ready for action."
            ACTIVE -> "The request is in force and ready to be acted upon."
            ONHOLD -> "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future."
            REVOKED -> "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur."
            COMPLETED -> "The activity described by the request has been fully performed.  No further activity will occur."
            ENTEREDINERROR -> "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
        }

    override val display: String?
        get() = when (this) {
            DRAFT -> "Draft"
            ACTIVE -> "Active"
            ONHOLD -> "On Hold"
            REVOKED -> "Revoked"
            COMPLETED -> "Completed"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
        }

}



@Serializable
enum class CarePlanIntent : CodeableEnumeration {

    /**
     * proposal
     */
    @SerialName("proposal")
    @JsonProperty("proposal")
    PROPOSAL,

    /**
     * plan
     */
    @SerialName("plan")
    @JsonProperty("plan")
    PLAN,

    /**
     * order
     */
    @SerialName("order")
    @JsonProperty("order")
    ORDER,

    /**
     * option
     */
    @SerialName("option")
    @JsonProperty("option")
    OPTION;


    override val code: String
        get() = when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            ORDER -> "order"
            OPTION -> "option"
        }

    override val system: String
        get() = "http://hl7.org/fhir/request-intent"

    override val definition: String? = null

    override val display: String?
        get() = when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            ORDER -> "order"
            OPTION -> "option"
        }

}



@Serializable
enum class CarePlanActivityKind : CodeableEnumeration {

    /**
     * Appointment
     */
    @SerialName("Appointment")
    @JsonProperty("Appointment")
    APPOINTMENT,

    /**
     * CommunicationRequest
     */
    @SerialName("CommunicationRequest")
    @JsonProperty("CommunicationRequest")
    COMMUNICATIONREQUEST,

    /**
     * DeviceRequest
     */
    @SerialName("DeviceRequest")
    @JsonProperty("DeviceRequest")
    DEVICEREQUEST,

    /**
     * MedicationRequest
     */
    @SerialName("MedicationRequest")
    @JsonProperty("MedicationRequest")
    MEDICATIONREQUEST,

    /**
     * NutritionOrder
     */
    @SerialName("NutritionOrder")
    @JsonProperty("NutritionOrder")
    NUTRITIONORDER,

    /**
     * Task
     */
    @SerialName("Task")
    @JsonProperty("Task")
    TASK,

    /**
     * ServiceRequest
     */
    @SerialName("ServiceRequest")
    @JsonProperty("ServiceRequest")
    SERVICEREQUEST,

    /**
     * VisionPrescription
     */
    @SerialName("VisionPrescription")
    @JsonProperty("VisionPrescription")
    VISIONPRESCRIPTION;

    override val code: String
        get() = when (this) {
            APPOINTMENT -> "Appointment"
            COMMUNICATIONREQUEST -> "CommunicationRequest"
            DEVICEREQUEST -> "DeviceRequest"
            MEDICATIONREQUEST -> "MedicationRequest"
            NUTRITIONORDER -> "NutritionOrder"
            TASK -> "Task"
            SERVICEREQUEST -> "ServiceRequest"
            VISIONPRESCRIPTION -> "VisionPrescription"
        }

    override val system: String
        get() = "http://hl7.org/fhir/resource-types"

    override val definition: String? = null

    override val display: String?
        get() = when (this) {
            APPOINTMENT -> "Appointment"
            COMMUNICATIONREQUEST -> "CommunicationRequest"
            DEVICEREQUEST -> "DeviceRequest"
            MEDICATIONREQUEST -> "MedicationRequest"
            NUTRITIONORDER -> "NutritionOrder"
            TASK -> "Task"
            SERVICEREQUEST -> "ServiceRequest"
            VISIONPRESCRIPTION -> "VisionPrescription"
        }

}



@Serializable
enum class CarePlanActivityStatus : CodeableEnumeration {

    /**
     * Care plan activity is planned but no action has yet been taken.
     */
    @SerialName("not-started")
    @JsonProperty("not-started")
    NOTSTARTED,

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    @SerialName("scheduled")
    @JsonProperty("scheduled")
    SCHEDULED,

    /**
     * Care plan activity has been started but is not yet complete.
     */
    @SerialName("in-progress")
    @JsonProperty("in-progress")
    INPROGRESS,

    /**
     * Care plan activity was started but has temporarily ceased with an expectation of resumption at a future time.
     */
    @SerialName("on-hold")
    @JsonProperty("on-hold")
    ONHOLD,

    /**
     * Care plan activity has been completed (more or less) as planned.
     */
    @SerialName("completed")
    @JsonProperty("completed")
    COMPLETED,

    /**
     * The planned care plan activity has been withdrawn.
     */
    @SerialName("cancelled")
    @JsonProperty("cancelled")
    CANCELLED,

    /**
     * The planned care plan activity has been ended prior to completion after the activity was started.
     */
    @SerialName("stopped")
    @JsonProperty("stopped")
    STOPPED,

    /**
     * The current state of the care plan activity is not known.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which one.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN,

    /**
     * Care plan activity was entered in error and voided.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR;


    override val code: String
        get() = when (this) {
            NOTSTARTED -> "not-started"
            SCHEDULED -> "scheduled"
            INPROGRESS -> "in-progress"
            ONHOLD -> "on-hold"
            COMPLETED -> "completed"
            CANCELLED -> "cancelled"
            STOPPED -> "stopped"
            UNKNOWN -> "unknown"
            ENTEREDINERROR -> "entered-in-error"
        }

    override val system: String
        get() = "http://hl7.org/fhir/care-plan-activity-status"

    override val definition: String?
        get() = when (this) {
            NOTSTARTED -> "Care plan activity is planned but no action has yet been taken."
            SCHEDULED -> "Appointment or other booking has occurred but activity has not yet begun."
            INPROGRESS -> "Care plan activity has been started but is not yet complete."
            ONHOLD -> "Care plan activity was started but has temporarily ceased with an expectation of resumption at a future time."
            COMPLETED -> "Care plan activity has been completed (more or less) as planned."
            CANCELLED -> "The planned care plan activity has been withdrawn."
            STOPPED -> "The planned care plan activity has been ended prior to completion after the activity was started."
            UNKNOWN -> "The current state of the care plan activity is not known.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which one."
            ENTEREDINERROR -> "Care plan activity was entered in error and voided."
        }


    override val display: String?
        get() = when (this) {
            NOTSTARTED -> "Not Started"
            SCHEDULED -> "Scheduled"
            INPROGRESS -> "In Progress"
            ONHOLD -> "On Hold"
            COMPLETED -> "Completed"
            CANCELLED -> "Cancelled"
            STOPPED -> "Stopped"
            UNKNOWN -> "Unknown"
            ENTEREDINERROR -> "Entered in Error"
        }

}