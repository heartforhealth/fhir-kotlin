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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 */
@Serializable
data class Encounter(

    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Encounter,
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
     * Identifier(s) by which this encounter is known.
     */
    var identifier: List<Identifier>? = null,

    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-status")
    var status: EncounterStatus? = null,

    /**
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.
     */
    var statusHistory: List<StatusHistoryComponent>? = null,

    /**
     * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActEncounterCode")
    var `class`: Coding? = null,

    /**
     * The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
     */
    var classHistory: List<ClassHistoryComponent>? = null,

    /**
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-type")
    var type: List<CodeableConcept>? = null,

    /**
     * Broad categorization of the service that is to be provided (e.g. cardiology).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-type")
    var serviceType: CodeableConcept? = null,

    /**
     * Indicates the urgency of the encounter.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActPriority")
    var priority: CodeableConcept? = null,

    /**
     * The patient or group present at the encounter.
     */
    var subject: Reference? = null,

    /**
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
     */
    var episodeOfCare: List<Reference>? = null,

    /**
     * The request this encounter satisfies (e.g. incoming referral or procedure request).
     */
    var basedOn: List<Reference>? = null,

    /**
     * The list of people responsible for providing the service.
     */
    var participant: List<EncounterParticipantComponent>? = null,

    /**
     * The appointment that scheduled this encounter.
     */
    var appointment: List<Reference>? = null,

    /**
     * The start and end time of the encounter.
     */
    var period: Period? = null,

    /**
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     */
    var length: Quantity? = null,

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-reason")
    var reasonCode: List<CodeableConcept>? = null,

    /**
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
     */
    var reasonReference: List<Reference>? = null,


    /**
     * The list of diagnosis relevant to this encounter.
     */
    var diagnosis: List<DiagnosisComponent>? = null,

    /**
     * The set of accounts that may be used for billing for this Encounter.
     */
    var account: List<Reference>? = null,

    /**
     * Details about the admission to a healthcare service.
     */
    var hospitalization: EncounterHospitalizationComponent? = null,

    /**
     * List of locations where  the patient has been during this encounter.
     */
    var location: List<EncounterLocationComponent>? = null,

    /**
     * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on the Patient record, however it could be different, such as if the actor performing the services was from an external organization (which may be billed seperately) for an external consultation.  Refer to the example bundle showing an abbreviated set of Encounters for a colonoscopy.
     */
    var serviceProvider: Reference? = null,

    /**
     * Another Encounter of which this encounter is a part of (administratively or in time).
     */
    var partOf: Reference? = null

) : DomainResource {



}



@Serializable
data class StatusHistoryComponent(

    /**
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-status")
    var status: EncounterStatus? = null,

    /**
     * The time that the episode was in the specified status.
     */
    var period: Period? = null

)

@Serializable
data class ClassHistoryComponent(
    /**
     * inpatient | outpatient | ambulatory | emergency +.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActEncounterCode")
    var `class`: Coding? = null,

    /**
     * The time that the episode was in the specified class.
     */
    var period: Period? = null

)

@Serializable
data class EncounterParticipantComponent(

    /**
     * Role of participant in encounter.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-participant-type")
    var type: List<CodeableConcept>? = null,

    /**
     * The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of the overall encounter's period.
     */
    var period: Period? = null,

    /**
     * Persons involved in the encounter other than the patient.
     */
    var individual: Reference? = null

)

@Serializable
data class EncounterHospitalizationComponent(

    /**
     * Pre-admission identifier.
     */
    var preAdmissionIdentifier: Identifier? = null,

    /**
     * The location/organization from which the patient came before admission.
     */
    var origin: Reference? = null,

    /**
     * From where patient was admitted (physician referral, transfer).
     */
    //@Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-admit-source")
    var admitSource: CodeableConcept? = null,

    /**
     * Whether this hospitalization is a readmission and why if known.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0092")
    var reAdmission: CodeableConcept? = null,

    /**
     * Diet preferences reported by the patient.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-diet")
    var dietPreference: List<CodeableConcept>? = null,

    /**
     * Special courtesies (VIP, board member).
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-special-courtesy")
    var specialCourtesy: List<CodeableConcept>? = null,

    /**
     * Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-special-arrangements")
    var specialArrangement: List<CodeableConcept>? = null,

    /**
     * Location/organization to which the patient is discharged.
     */
    var destination: Reference? = null,

    /**
     * Category or kind of location after discharge.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-discharge-disposition")
    var dischargeDisposition: CodeableConcept? = null

)

@Serializable
data class EncounterLocationComponent(

    /**
     * The location where the encounter takes place.
     */
    var location: Reference? = null,

    /**
     * The status of the participants' presence at the specified location during the period specified. If the participant is no longer at the location, then the period will have an end date/time.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-location-status")
    var status: EncounterLocationStatus? = null,

    /**
     * This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded to simplify either messaging or query.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-physical-type")
    var physicalType: CodeableConcept? = null,

    /**
     * Time period during which the patient was present at the location.
     */
    var period: Period? = null

)
