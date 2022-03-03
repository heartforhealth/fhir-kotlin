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
 * Measurements and simple assertions made about a patient, device or other subject.
 */
@Serializable
data class Observation(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Observation,
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
     * A unique identifier assigned to this observation.
     */
    var identifier: List<Identifier>? = null,

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
     */
    var basedOn: List<Reference>? = null,

    /**
     * A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.
     */
    var partOf: List<Reference>? = null,

    /**
     * The status of the result value.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-status")
    var status: ObservationStatus? = null,

    /**
     * A code that classifies the general type of observation being made.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-category")
    var category: List<CodeableConcept>? = null,

    /**
     * Describes what was observed. Sometimes this is called the observation "name".
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
    var code: CodeableConcept? = null,

    /**
     * The patient, or group of patients, location, or device this observation is about and into whose record the observation is placed. If the actual focus of the observation is different from the subject (or a sample of, part, or region of the subject), the `focus` element or the `code` itself specifies the actual focus of the observation.
     */
    var subject: Reference? = null,

    /**
     * The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.
     */
    var focus: List<Reference>? = null,

    /**
     * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.
     */
    var encounter: Reference? = null,

    /**
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the "physiologically relevant time". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself.
     */
    var effectiveDateTime: String? = null,
    var effectivePeriod: Period? = null,
    var effectiveTiming: Timing? = null,
    var effectiveInstant: String? = null,


    /**
     * The date and time this version of the observation was made available to providers, typically after the results have been reviewed and verified.
     * InstantType
     */
    var issued: String? = null,

    /**
     * Who was responsible for asserting the observed value as "true".
     */
    var performer: List<Reference>? = null,

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     */
    var valueQuantity: Quantity? = null,
    var valueCodeableConcept: CodeableConcept? = null,
    var valueString: String? = null,
    var valueBoolean: Boolean? = null,
    var valueInteger: Int? = null,
    var valueRange: Range? = null,
    var valueRatio: Ratio? = null,
    var valueSampledData: SampledData? = null,
    var valueTime: String? = null,
    var valueDateTime: String? = null,
    var valuePeriod: Period? = null,



    /**
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/data-absent-reason")
    var dataAbsentReason: CodeableConcept? = null,

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-interpretation")
    var interpretation: List<CodeableConcept>? = null,

    /**
     * Comments about the observation or the results.
     */
    var note: List<Annotation>? = null,

    /**
     * Indicates the site on the subject's body where the observation was made (i.e. the target site).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/body-site")
    var bodySite: CodeableConcept? = null,

    /**
     * Indicates the mechanism used to perform the observation.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-methods")
    var method: CodeableConcept? = null,

    /**
     * The specimen that was used when this observation was made.
     */
    var specimen: Reference? = null,

    /**
     * The device used to generate the observation data.
     */
    var device: Reference? = null,

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an "OR".   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
     */
    var referenceRange: List<ObservationReferenceRangeComponent>? = null,

    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     */
    var hasMember: List<Reference>? = null,

    /**
     * The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.
     */
    var derivedFrom: List<Reference>? = null,

    /**
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     */
    var component: List<ObservationComponent>? = null


) : DomainResource


@Serializable
data class ObservationComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override var id: String? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Describes what was observed. Sometimes this is called the observation "code".
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-codes")
    var code: CodeableConcept? = null,

    /**
     * The information determined as a result of making the observation, if the information has a simple value.
     */
    var valueQuantity: Quantity? = null,
    var valueCodeableConcept: CodeableConcept? = null,
    var valueString: String? = null,
    var valueBoolean: Boolean? = null,
    var valueInteger: Int? = null,
    var valueRange: Range? = null,
    var valueRatio: Ratio? = null,
    var valueSampledData: SampledData? = null,
    var valueTime: String? = null,
    var valueDateTime: String? = null,
    var valuePeriod: Period? = null,

    /**
     * Provides a reason why the expected value in the element Observation.component.value[x] is missing.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/data-absent-reason")
    var dataAbsentReason: CodeableConcept? = null,

    /**
     * A categorical assessment of an observation value.  For example, high, low, normal.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-interpretation")
    var interpretation: List<CodeableConcept>? = null,

    /**
     * Guidance on how to interpret the value by comparison to a normal or recommended range.
     */
    var referenceRange: List<ObservationReferenceRangeComponent>? = null


) : BackboneElement


@Serializable
data class ObservationReferenceRangeComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override var id: String? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3).
     **/
    var low: Quantity? = null,

    /**
     * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9). If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3).
     */
    var high: Quantity? = null,

    /**
     * Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/referencerange-meaning")
    var type: CodeableConcept? = null,

    /**
     * Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race.  Multiple `appliesTo`  are interpreted as an "AND" of the target populations.  For example, to represent a target population of African American females, both a code of female and a code for African American would be used.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/referencerange-appliesto")
    var appliesTo: List<CodeableConcept>? = null,

    /**
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so.
     */
    var age: Range? = null,

    /**
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of "Negative" or a list or table of "normals".
     */
    var text: String? = null


) : BackboneElement

