package io.h4h.fhir.r4


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
import io.h4h.fhir.r4.base.*
import kotlinx.serialization.Serializable


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
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Communication,
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
     * Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    var identifier: List<Identifier>? = null,

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     */
    var instantiatesCanonical: List<String>? = null,

    /**
     * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Communication.
     */
    var instantiatesUri: List<String>? = null,

    /**
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     */
    var basedOn: List<Reference>? = null,

    /**
     * Part of this action.
     */
    var partOf: List<Reference>? = null,

    /**
     * Prior communication that this communication is in response to.
     */
    var inResponseTo: List<Reference>? = null,

    /**
     * The status of the transmission.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/event-status")
    var status: CommunicationStatus? = null,

    /**
     * Captures the reason for the current state of the Communication.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-not-done-reason")
    var statusReason: CodeableConcept? = null,

    /**
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-category")
    var category: List<CodeableConcept>? = null,

    /**
     * Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
    var priority: CommunicationPriority? = null,

    /**
     * A channel that was used for this communication (e.g. email, fax).
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ParticipationMode")
    var medium: List<CodeableConcept>? = null,

    /**
     * The patient or group that was the focus of this communication.
     */
    var subject: Reference? = null,

    /**
     * Description of the purpose/content, similar to a subject line in an email.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-topic")
    var topic: CodeableConcept? = null,

    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
     */
    var about: List<Reference>? = null,

    /**
     * The Encounter during which this Communication was created or to which the creation of this record is tightly associated.
     */
    var encounter: Reference? = null,

    /**
     * The time when this communication was sent.
     */
    var sent: String? = null,

    /**
     * The time when this communication arrived at the destination.
     */
    var received: String? = null,

    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).
     */
    var recipient: List<Reference>? = null,


    /**
     * The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
     */
    var sender: Reference? = null,

    /**
     * The reason or justification for the communication.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/clinical-findings")
    var reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource whose existence justifies this communication.
     */
    var reasonReference: List<Reference>? = null,

    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     */
    var payload: List<CommunicationPayloadComponent>? = null,

    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
     */
    var note: List<Annotation>? = null

) : DomainResource


@Serializable
data class CommunicationPayloadComponent(

    /**
     * A communicated content (or for multi-part communications, one portion of the communication).
     */
    var contentString: String? = null,
    var contentAttachment: Attachment? = null,
    var contentReference: Reference? = null

)


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
    UNKNOWN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            PREPARATION -> "preparation"
            INPROGRESS -> "in-progress"
            NOTDONE -> "not-done"
            ONHOLD -> "on-hold"
            STOPPED -> "stopped"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
            NULL -> null
        }
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
            NULL -> null
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
            NULL -> null
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
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CommunicationStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("preparation" == codeString) return PREPARATION
//            if ("in-progress" == codeString) return INPROGRESS
//            if ("not-done" == codeString) return NOTDONE
//            if ("on-hold" == codeString) return ONHOLD
//            if ("stopped" == codeString) return STOPPED
//            if ("completed" == codeString) return COMPLETED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            if ("unknown" == codeString) return UNKNOWN
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CommunicationStatus code '$codeString'")
//        }
//    }
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
    STAT,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            ROUTINE -> "routine"
            URGENT -> "urgent"
            ASAP -> "asap"
            STAT -> "stat"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            ROUTINE -> "http://hl7.org/fhir/request-priority"
            URGENT -> "http://hl7.org/fhir/request-priority"
            ASAP -> "http://hl7.org/fhir/request-priority"
            STAT -> "http://hl7.org/fhir/request-priority"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            ROUTINE -> "The request has normal priority."
            URGENT -> "The request should be actioned promptly - higher priority than routine."
            ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
            STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            ROUTINE -> "Routine"
            URGENT -> "Urgent"
            ASAP -> "ASAP"
            STAT -> "STAT"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CommunicationPriority? {
//            if (codeString == null || "" == codeString) return null
//            if ("routine" == codeString) return ROUTINE
//            if ("urgent" == codeString) return URGENT
//            if ("asap" == codeString) return ASAP
//            if ("stat" == codeString) return STAT
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CommunicationPriority code '$codeString'")
//        }
//    }
}
