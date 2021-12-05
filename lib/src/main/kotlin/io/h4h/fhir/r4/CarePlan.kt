package io.h4h.fhir.r4


import io.h4h.fhir.r4.base.*
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
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.CarePlan,
    override var meta: Meta? = null,
    override var implicitRules: String? = null,
    override var language: String? = null,
    override var text: Narrative? = null,
    override var contained: List<Resource>? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Business identifiers assigned to this care plan by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    var identifier: List<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
     */
    var instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan.
     */
    var instantiatesUri: List<String>? = null,

    /**
     * A care plan that is fulfilled in whole or in part by this care plan.
     */
    var basedOn: List<Reference>? = null,

    /**
     * Completed or terminated care plan whose function is taken by this new care plan.
     */
    var replaces: List<Reference>? = null,

    /**
     * A larger care plan of which this particular care plan is a component or step.
     */
    var partOf: List<Reference>? = null,

    /**
     * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-status")
    var status: CarePlanStatus? = null,

    /**
     * Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-intent")
    var intent: CarePlanIntent? = null,

    /**
     * Identifies what "kind" of plan this is to support differentiation between multiple co-existing plans; e.g. "Home health", "psychiatric", "asthma", "disease management", "wellness plan", etc.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-category")
    var category: List<CodeableConcept>? = null,

    /**
     * Human-friendly name for the care plan.
     */
    var title: String? = null,

    /**
     * A description of the scope and nature of the plan.
     */
    var description: String? = null,

    /**
     * Identifies the patient or group whose intended care is described by the plan.
     */
    var subject: Reference? = null,

    /**
     * The Encounter during which this CarePlan was created or to which the creation of this record is tightly associated.
     */
    var encounter: Reference? = null,

    /**
     * Indicates when the plan did (or is intended to) come into effect and end.
     */
    var period: Period? = null,

    /**
     * Represents when this particular CarePlan record was created in the system, which is often a system-generated date.
     */
    var created: String? = null,

    /**
     * When populated, the author is responsible for the care plan.  The care plan is attributed to the author.
     */
    var author: Reference? = null,

    /**
     * Identifies the individual(s) or organization who provided the contents of the care plan.
     */
    var contributor: List<Reference>? = null,

    /**
     * Identifies all people and organizations who are expected to be involved in the care envisioned by this plan.
     */
    var careTeam: List<Reference>? = null,

    /**
     * Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan.
     */
    var addresses: List<Reference>? = null,

    /**
     * Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include comorbidities, recent procedures, limitations, recent assessments, etc.
     */
    var supportingInfo: List<Reference>? = null,

    /**
     * Describes the intended objective(s) of carrying out the care plan.
     */
    var goal: List<Reference>? = null,

    /**
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
     */
    var activity: List<CarePlanActivityComponent>? = null,

    /**
     * General notes about the care plan not covered elsewhere.
     */
    var note: List<Annotation>? = null

) : DomainResource



@Serializable
data class CarePlanActivityComponent(

    /**
     * Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-outcome")
    var outcomeCodeableConcept: List<CodeableConcept>? = null,

    /**
     * Details of the outcome or action resulting from the activity.  The reference to an "event" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource).
     */
    var outcomeReference: List<Reference>? = null,

    /**
     * Notes about the adherence/status/progress of the activity.
     */
    var progress: List<Annotation>? = null,

    /**
     * The details of the proposed activity represented in a specific resource.
     */
    var reference: Reference? = null,


    /**
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
     */
    var detail: CarePlanActivityDetailComponent? = null

)


@Serializable
data class CarePlanActivityDetailComponent(

    /**
     * A description of the kind of resource the in-line definition of a care plan activity is representing.  The CarePlan.activity.detail is an in-line definition when a resource is not referenced using CarePlan.activity.reference.  For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-kind")
    var kind: CarePlanActivityKind? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     */
    var instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, questionnaire or other definition that is adhered to in whole or in part by this CarePlan activity.
     */
    var instantiatesUri: List<String>? = null,

    /**
     * Detailed description of the type of planned activity; e.g. what lab test, what procedure, what kind of encounter.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/procedure-code")
    var code: CodeableConcept? = null,

    /**
     * Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-findings")
    var reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.
     */
    var reasonReference: List<Reference>? = null,

    /**
     * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
     */
    var goal: List<Reference>? = null,

    /**
     * Identifies what progress is being made for the specific activity.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/care-plan-activity-status")
    var status: CarePlanActivityStatus? = null,

    /**
     * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
     */
    var statusReason: CodeableConcept? = null,

    /**
     * If true, indicates that the described activity is one that must NOT be engaged in when following the plan.  If false, or missing, indicates that the described activity is one that should be engaged in when following the plan.
     */
    var doNotPerform: Boolean? = null,

    /**
     * The period, timing or frequency upon which the described activity is to occur.
     */
    var scheduledTiming: Timing? = null,
    var scheduledPeriod: Period? = null,
    var scheduledString: String? = null,

    /**
     * Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.
     */
    var location: Reference? = null,

    /**
     * Identifies who's expected to be involved in the activity.
     */
    var performer: List<Reference>? = null,

    /**
     * Identifies the food, drug or other product to be consumed or supplied in the activity.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-codes")
    var productCodeableConcept: CodeableConcept? = null,
    var productReference: Reference? = null,

    /**
     * Identifies the quantity expected to be consumed in a given day.
     */
    var dailyAmount: Quantity? = null,

    /**
     * Identifies the quantity expected to be supplied, administered or consumed by the subject.
     */
    var quantity: Quantity? = null,

    /**
     * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
     */
    var description: String? = null

)