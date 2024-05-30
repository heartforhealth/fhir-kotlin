package io.h4h.fhir.r4.resources

import com.fasterxml.jackson.annotation.JsonProperty
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
// Generated on Tue, May 12, 2020 07:26+1000 for FHIR v4.0.1



/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
@Serializable
data class Appointment(

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
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    val identifier: List<Identifier>? = null,

    /**
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status.
     * // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/appointmentstatus")
     */
    val status: AppointmentStatus? = null,

    /**
     * The coded reason for the appointment being cancelled. This is often used in reporting/billing/futher processing to determine if further actions are required, or specific fees apply.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/appointment-cancellation-reason")
     */
    val cancelationReason: CodeableConcept? = null,

    /**
     * A broad categorization of the service that is to be performed during this appointment.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-category")
     */
    val serviceCategory: List<CodeableConcept>? = null,

    /**
     * The specific service that is to be performed during this appointment.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-type")
     */
    val serviceType: List<CodeableConcept>? = null,

    /**
     * The specialty of a practitioner that would be required to perform the service requested in this appointment.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-practice-codes")
     */
    val specialty: List<CodeableConcept>? = null,

    /**
     * The style of appointment or patient that has been booked in the slot (not service type).
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v2-0276")
     */
    val appointmentType: CodeableConcept? = null,

    /**
     * The coded reason that this appointment is being scheduled. This is more clinical than administrative.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-reason")
     */
    val reasonCode: List<CodeableConcept>? = null,

    /**
     * Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
     */
    val reasonReference: List<Reference>? = null,

    /**
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority).
     */
    val priority: Int? = null,

    /**
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field.
     */
    val description: String? = null,

    /**
     * Additional information to support the appointment provided when making the appointment.
     */
    val supportingInformation: List<Reference>? = null,
    
    /**
     * Date/Time that the appointment is to take place.
     */
    @Serializable(with= InstantSerializer::class)
    val start: Instant? = null,

    /**
     * Date/Time that the appointment is to conclude.
     */
    @Serializable(with= InstantSerializer::class)
    val end: Instant? = null,

    /**
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times.  For example, where the actual time of appointment is only an estimate or if a 30 minute appointment is being requested, but any time would work.  Also, if there is, for example, a planned 15 minute break in the middle of a long appointment, the duration may be 15 minutes less than the difference between the start and end.
     */
    val minutesDuration: Int? = null,

    /**
     * The slots from the participants' schedules that will be filled by the appointment.
     */
    val slot: List<Reference>? = null,

    /**
     * The date that this appointment was initially created. This could be different to the meta.lastModified value on the initial entry, as this could have been before the resource was created on the FHIR server, and should remain unchanged over the lifespan of the appointment.
     */
    val created: String? = null,

    /**
     * Additional comments about the appointment.
     */
    val comment: String? = null,

    /**
     * While Appointment.comment contains information for internal use, Appointment.patientInstructions is used to capture patient facing information about the Appointment (e.g. please bring your referral or fast from 8pm night before).
     */
    val patientInstruction: String? = null,

    /**
     * The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).
     */
    val basedOn: List<Reference>? = null,

    /**
     * List of participants involved in the appointment.
     */
    val participant: List<AppointmentParticipantComponent>? = null,

    /**
     * A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.
     *
     * The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.
     */
    val requestedPeriod: List<Period>? = null

) : DomainResource



@Serializable
data class AppointmentParticipantComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Role of participant in the appointment.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-participant-type")
     */
    val type: List<CodeableConcept>? = null,

    /**
     * A Person, Location/HealthcareService or Device that is participating in the appointment.
     */
    val actor: Reference? = null,

    /**
     * Whether this participant is required to be present at the meeting. This covers a use-case where two doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/participantrequired")
     */
    val required: ParticipantRequired? = null,

    /**
     * Participation status of the actor.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/participationstatus")
     */
    val status: ParticipationStatus? = null,

    /**
     * Participation period of the actor.
     */
    val period: Period? = null,

) : BackboneElement


@Serializable
enum class AppointmentStatus {
    
    /**
     * None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time might not be set yet.
     */
    @SerialName("proposed")
    @JsonProperty("proposed")
    PROPOSED,

    /**
     * Some or all of the participant(s) have not finalized their acceptance of the appointment request.
     */
    @SerialName("pending")
    @JsonProperty("pending")
    PENDING,

    /**
     * All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified.
     */
    @SerialName("booked")
    @JsonProperty("booked")
    BOOKED,

    /**
     * The patient/patients has/have arrived and is/are waiting to be seen.
     */
    @SerialName("arrived")
    @JsonProperty("arrived")
    ARRIVED,

    /**
     * The planning stages of the appointment are now complete, the encounter resource will exist and will track further status changes. Note that an encounter may exist before the appointment status is fulfilled for many reasons.
     */
    @SerialName("fulfilled")
    @JsonProperty("fulfilled")
    FULFILLED,

    /**
     * The appointment has been cancelled.
     */
    @SerialName("cancelled")
    @JsonProperty("cancelled")
    CANCELLED,

    /**
     * Some or all of the participant(s) have not/did not appear for the appointment (usually the patient).
     */
    @SerialName("noshow")
    @JsonProperty("noshow")
    NOSHOW,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * When checked in, all pre-encounter administrative work is complete, and the encounter may begin. (where multiple patients are involved, they are all present).
     */
    @SerialName("checked-in")
    @JsonProperty("checked-in")
    CHECKEDIN,

    /**
     * The appointment has been placed on a waitlist, to be scheduled/confirmed in the future when a slot/service is available.
     * A specific time might or might not be pre-allocated.
     */
    @SerialName("waitlist")
    @JsonProperty("waitlist")
    WAITLIST;



    val code: String?
        get() = when (this) {
            PROPOSED -> "proposed"
            PENDING -> "pending"
            BOOKED -> "booked"
            ARRIVED -> "arrived"
            FULFILLED -> "fulfilled"
            CANCELLED -> "cancelled"
            NOSHOW -> "noshow"
            ENTEREDINERROR -> "entered-in-error"
            CHECKEDIN -> "checked-in"
            WAITLIST -> "waitlist"
        }

    val system: String? = "http://hl7.org/fhir/appointmentstatus"


    val definition: String?
        get() = when (this) {
            PROPOSED -> "None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time might not be set yet."
            PENDING -> "Some or all of the participant(s) have not finalized their acceptance of the appointment request."
            BOOKED -> "All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified."
            ARRIVED -> "The patient/patients has/have arrived and is/are waiting to be seen."
            FULFILLED -> "The planning stages of the appointment are now complete, the encounter resource will exist and will track further status changes. Note that an encounter may exist before the appointment status is fulfilled for many reasons."
            CANCELLED -> "The appointment has been cancelled."
            NOSHOW -> "Some or all of the participant(s) have not/did not appear for the appointment (usually the patient)."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            CHECKEDIN -> "When checked in, all pre-encounter administrative work is complete, and the encounter may begin. (where multiple patients are involved, they are all present)."
            WAITLIST -> "The appointment has been placed on a waitlist, to be scheduled/confirmed in the future when a slot/service is available.\nA specific time might or might not be pre-allocated."
        }

    val display: String?
        get() = when (this) {
            PROPOSED -> "Proposed"
            PENDING -> "Pending"
            BOOKED -> "Booked"
            ARRIVED -> "Arrived"
            FULFILLED -> "Fulfilled"
            CANCELLED -> "Cancelled"
            NOSHOW -> "No Show"
            ENTEREDINERROR -> "Entered in error"
            CHECKEDIN -> "Checked In"
            WAITLIST -> "Waitlisted"
        }

}


@Serializable
enum class ParticipantRequired {

    /**
     * The participant is required to attend the appointment.
     */
    @SerialName("required")
    @JsonProperty("required")
    REQUIRED,

    /**
     * The participant may optionally attend the appointment.
     */
    @SerialName("optional")
    @JsonProperty("optional")
    OPTIONAL,

    /**
     * The participant is excluded from the appointment, and might not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
     */
    @SerialName("information-only")
    @JsonProperty("information-only")
    INFORMATIONONLY;



    val code: String?
        get() = when (this) {
            REQUIRED -> "required"
            OPTIONAL -> "optional"
            INFORMATIONONLY -> "information-only"
        }


    val system: String? = "http://hl7.org/fhir/participantrequired"

    val definition: String?
        get() = when (this) {
            REQUIRED -> "The participant is required to attend the appointment."
            OPTIONAL -> "The participant may optionally attend the appointment."
            INFORMATIONONLY -> "The participant is excluded from the appointment, and might not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test)."
        }

    val display: String?
        get() = when (this) {
            REQUIRED -> "Required"
            OPTIONAL -> "Optional"
            INFORMATIONONLY -> "Information Only"
        }

}


@Serializable
enum class ParticipationStatus {

    /**
     * The participant has accepted the appointment.
     */
    @SerialName("accepted")
    @JsonProperty("accepted")
    ACCEPTED,

    /**
     * The participant has declined the appointment and will not participate in the appointment.
     */
    @SerialName("declined")
    @JsonProperty("declined")
    DECLINED,

    /**
     * The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
     */
    @SerialName("tentative")
    @JsonProperty("tentative")
    TENTATIVE,

    /**
     * The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
     */
    @SerialName("needs-action")
    @JsonProperty("needs-action")
    NEEDSACTION;



    val code: String?
        get() = when (this) {
            ACCEPTED -> "accepted"
            DECLINED -> "declined"
            TENTATIVE -> "tentative"
            NEEDSACTION -> "needs-action"
        }

    val system: String? = "http://hl7.org/fhir/participationstatus"

    val definition: String?
        get() = when (this) {
            ACCEPTED -> "The participant has accepted the appointment."
            DECLINED -> "The participant has declined the appointment and will not participate in the appointment."
            TENTATIVE -> "The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur."
            NEEDSACTION -> "The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses."
        }
    
    val display: String?
        get() = when (this) {
            ACCEPTED -> "Accepted"
            DECLINED -> "Declined"
            TENTATIVE -> "Tentative"
            NEEDSACTION -> "Needs Action"
        }

}