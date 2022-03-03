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
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 */
@Serializable
data class CommunicationRequest(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.CommunicationRequest,
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
     * Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
     */
    var identifier: List<Identifier>? = null,

    /**
     * A plan or proposal that is fulfilled in whole or in part by this request.
     */
    var basedOn: List<Reference>? = null,

    /**
     * Completed or terminated request(s) whose function is taken by this new request.
     */
    var replaces: List<Reference>? = null,

    /**
     * A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form.
     */
    var groupIdentifier: Identifier? = null,

    /**
     * The status of the proposal or order.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-status")
    var status: CommunicationRequestStatus? = null,

    /**
     * Captures the reason for the current state of the CommunicationRequest.
     */
    var statusReason: CodeableConcept? = null,

    /**
     * The type of message to be sent such as alert, notification, reminder, instruction, etc.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/communication-category")
    var category: List<CodeableConcept>? = null,

    /**
     * Characterizes how quickly the proposed act must be initiated. Includes concepts such as stat, urgent, routine.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/request-priority")
    var priority: CommunicationPriority? = null,

    /**
     * If true indicates that the CommunicationRequest is asking for the specified action to *not* occur.
     */
    var doNotPerform: Boolean? = null,

    /**
     * A channel that was used for this communication (e.g. email, fax).
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ParticipationMode")
    var medium: List<CodeableConcept>? = null,

    /**
     * The patient or group that is the focus of this communication request.
     */
    var subject: Reference? = null,

    /**
     * Other resources that pertain to this communication request and to which this communication request should be associated.
     */
    var about: List<Reference>? = null,


    /**
     * The Encounter during which this CommunicationRequest was created or to which the creation of this record is tightly associated.
     */
    var encounter: Reference? = null,

    /**
     * Text, attachment(s), or resource(s) to be communicated to the recipient.
     */
    var payload: List<CommunicationRequestPayloadComponent>? = null,

    /**
     * The time when this communication is to occur.
     */
    var occurrenceDateTime: String? = null,
    var occurrencePeriod: Period? = null,


    /**
     * For draft requests, indicates the date of initial creation.  For requests with other statuses, indicates the date of activation.
     */
    var authoredOn: String? = null,

    /**
     * The device, individual, or organization who initiated the request and has responsibility for its activation.
     */
    var requester: Reference? = null,


    /**
     * The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.
     */
    var recipient: List<Reference>? = null,

    /**
     * The entity (e.g. person, organization, clinical information system, or device) which is to be the source of the communication.
     */
    var sender: Reference? = null,

    /**
     * Describes why the request is being made in coded or textual form.
     */
    // @Binding(valueSet = "http://terminology.hl7.org/ValueSet/v3-ActReason")
    var reasonCode: List<CodeableConcept>? = null,

    /**
     * Indicates another resource whose existence justifies this request.
     */
    var reasonReference: List<Reference>? = null,

    /**
     * Comments made about the request by the requester, sender, recipient, subject or other participants.
     */
    var note: List<Annotation>? = null

) : DomainResource


@Serializable
data class CommunicationRequestPayloadComponent(

    /**
     * The communicated content (or for multi-part communications, one portion of the communication).
     */
    var contentString: String? = null,
    var contentAttachment: Attachment? = null,
    var contentReference: Reference? = null

)


@Serializable
enum class CommunicationRequestStatus : CodeableEnumeration {

    /**
     * The request has been created but is not yet complete or ready for action.
     */
    DRAFT,

    /**
     * The request is in force and ready to be acted upon.
     */
    ACTIVE,

    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.
     */
    ONHOLD,

    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.
     */
    REVOKED,

    /**
     * The activity described by the request has been fully performed.  No further activity will occur.
     */
    COMPLETED,

    /**
     * This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
     */
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
     */
    UNKNOWN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            DRAFT -> "draft"
            ACTIVE -> "active"
            ONHOLD -> "on-hold"
            REVOKED -> "revoked"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            DRAFT -> "http://hl7.org/fhir/request-status"
            ACTIVE -> "http://hl7.org/fhir/request-status"
            ONHOLD -> "http://hl7.org/fhir/request-status"
            REVOKED -> "http://hl7.org/fhir/request-status"
            COMPLETED -> "http://hl7.org/fhir/request-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/request-status"
            UNKNOWN -> "http://hl7.org/fhir/request-status"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            DRAFT -> "The request has been created but is not yet complete or ready for action."
            ACTIVE -> "The request is in force and ready to be acted upon."
            ONHOLD -> "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future."
            REVOKED -> "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur."
            COMPLETED -> "The activity described by the request has been fully performed.  No further activity will occur."
            ENTEREDINERROR -> "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
            NULL -> null
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
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CommunicationRequestStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("draft" == codeString) return DRAFT
//            if ("active" == codeString) return ACTIVE
//            if ("on-hold" == codeString) return ONHOLD
//            if ("revoked" == codeString) return REVOKED
//            if ("completed" == codeString) return COMPLETED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            if ("unknown" == codeString) return UNKNOWN
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CommunicationRequestStatus code '$codeString'")
//        }
//    }
}

