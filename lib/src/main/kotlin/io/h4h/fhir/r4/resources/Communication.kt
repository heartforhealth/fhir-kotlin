package io.h4h.fhir.r4.resources


import kotlinx.serialization.Serializable
import io.h4h.fhir.r4.base.*

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
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.
 */
@Serializable
data class Communication(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Communication,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================


    /**
     * Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    val identifier: List<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     */
    val instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     */
    val instantiatesUri: List<String>? = null,

    /**
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     */
    val basedOn: List<Reference>? = null,

    /**
     * Part of this action.
     */
    val partOf: List<Reference>? = null,

    /**
     * Prior communication that this communication is in response to.
     */
    val inResponseTo: List<Reference>? = null,

    /**
     * The status of the transmission.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/event-status")
     */
    val status: CommunicationStatus? = null,

    /**
     * Captures the reason for the current state of the Communication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-not-done-reason")
     */
    val statusReason: CodeableConcept? = null,

    /**
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-category")
     */
    val category: List<CodeableConcept>? = null,

    /**
     * Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
     */
    val priority: CommunicationPriority? = null,

    /**
     * A channel that was used for this communication (e.g. email, fax).
     * @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ParticipationMode")
     */
    val medium: List<CodeableConcept>? = null,

    /**
     * The patient or group that was the focus of this communication.
     */
    val subject: Reference? = null,

    /**
     * Description of the purpose/content, similar to a subject line in an email.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-topic")
     */
    val topic: CodeableConcept? = null,

    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
     */
    val about: List<Reference>? = null,

    /**
     * The Encounter during which this Communication was created or to which the creation of this record is tightly associated.
     */
    val encounter: Reference? = null,

    /**
     * The time when this communication was sent.
     */
    val sent: String? = null,

    /**
     * The time when this communication arrived at the destination.
     */
    val received: String? = null,

    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
     */
    val recipient: List<Reference>? = null,


    /**
     * The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
     */
    val sender: Reference? = null,

    /**
     * The reason or justification for the communication.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-findings")
     */
    val reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource whose existence justifies this communication.
     */
    val reasonReference: List<Reference>? = null,

    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     */
    val payload: List<CommunicationPayloadComponent>? = null,

    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
     */
    val note: List<Annotation>? = null

) : DomainResource


@Serializable
data class CommunicationPayloadComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * A communicated content (or for multi-part communications, one portion of the communication).
     */
    val contentString: String? = null,
    val contentAttachment: Attachment? = null,
    val contentReference: Reference? = null

) : BackboneElement


@Serializable
enum class CommunicationStatus : CodeableEnumeration {

    /**
     * The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.
     */
    PREPARATION,

    /**
     * The event is currently occurring.
     */
    INPROGRESS,

    /**
     * The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.
     */
    NOTDONE,

    /**
     * The event has been temporarily stopped but is expected to resume in the future.
     */
    ONHOLD,

    /**
     * The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred.
     */
    STOPPED,

    /**
     * The event has now concluded.
     */
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "stopped" rather than "entered-in-error".).
     */
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
     */
    UNKNOWN;


    override val code: String?
        get() = when (this) {
            PREPARATION -> "preparation"
            INPROGRESS -> "in-progress"
            NOTDONE -> "not-done"
            ONHOLD -> "on-hold"
            STOPPED -> "stopped"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }

    override val system: String?
        get() = when (this) {
            PREPARATION -> "http://hl7.org/fhir/event-status"
            INPROGRESS -> "http://hl7.org/fhir/event-status"
            NOTDONE -> "http://hl7.org/fhir/event-status"
            ONHOLD -> "http://hl7.org/fhir/event-status"
            STOPPED -> "http://hl7.org/fhir/event-status"
            COMPLETED -> "http://hl7.org/fhir/event-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/event-status"
            UNKNOWN -> "http://hl7.org/fhir/event-status"
        }

    override val definition: String?
        get() = when (this) {
            PREPARATION -> "The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes."
            INPROGRESS -> "The event is currently occurring."
            NOTDONE -> "The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific."
            ONHOLD -> "The event has been temporarily stopped but is expected to resume in the future."
            STOPPED -> "The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred."
            COMPLETED -> "The event has now concluded."
            ENTEREDINERROR -> "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"stopped\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
        }

    override val display: String?
        get() = when (this) {
            PREPARATION -> "Preparation"
            INPROGRESS -> "In Progress"
            NOTDONE -> "Not Done"
            ONHOLD -> "On Hold"
            STOPPED -> "Stopped"
            COMPLETED -> "Completed"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
        }
    
}


@Serializable
enum class CommunicationPriority : CodeableEnumeration {

    /**
     * The request has normal priority.
     */
    ROUTINE,

    /**
     * The request should be actioned promptly - higher priority than routine.
     */
    URGENT,

    /**
     * The request should be actioned as soon as possible - higher priority than urgent.
     */
    ASAP,

    /**
     * The request should be actioned immediately - highest possible priority.  E.g. an emergency.
     */
    STAT;


    override val code: String?
        get() = when (this) {
            ROUTINE -> "routine"
            URGENT -> "urgent"
            ASAP -> "asap"
            STAT -> "stat"
        }

    override val system: String?
        get() = when (this) {
            ROUTINE -> "http://hl7.org/fhir/request-priority"
            URGENT -> "http://hl7.org/fhir/request-priority"
            ASAP -> "http://hl7.org/fhir/request-priority"
            STAT -> "http://hl7.org/fhir/request-priority"
        }

    override val definition: String?
        get() = when (this) {
            ROUTINE -> "The request has normal priority."
            URGENT -> "The request should be actioned promptly - higher priority than routine."
            ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
            STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
        }

    override val display: String?
        get() = when (this) {
            ROUTINE -> "Routine"
            URGENT -> "Urgent"
            ASAP -> "ASAP"
            STAT -> "STAT"
        }

}
