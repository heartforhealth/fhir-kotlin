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
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 */
@Serializable
data class QuestionnaireResponse(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.QuestionnaireResponse,
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
     * A business identifier assigned to a particular completed (or partially completed) questionnaire.
     */
    var identifier: Identifier? = null,

    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     */
    var basedOn: List<Reference>? = null,

    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     */
    var partOf: List<Reference>? = null,

    /**
     * The Questionnaire that defines and organizes the questions for which answers are being provided.
     */
    var questionnaire: String? = null,

    /**
     * The position of the questionnaire response within its overall lifecycle.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers-status")
    var status: QuestionnaireResponseStatus? = null,

    /**
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
     */
    var subject: Reference? = null,


    /**
     * The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.
     */
    var encounter: Reference? = null,


    /**
     * The date and/or time that this set of answers were last changed.
     */
    var authored: String? = null,

    /**
     * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
     */
    var author: Reference? = null,

    /**
     * The person who answered the questions about the subject.
     */
    var source: Reference? = null,


    /**
     * A group or question item from the original questionnaire for which answers are provided.
     */
    var item: List<QuestionnaireResponseItemComponent>? = null


) : DomainResource


@Serializable
data class QuestionnaireResponseItemComponent(

    /**
     * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
     */
    var linkId: String? = null,

    /**
     * A reference to an [[[ElementDefinition]]] that provides the details for the item.
     */
    var definition: String? = null,

    /**
     * Text that is displayed above the contents of the group or as the text of the question being answered.
     */
    var text: String? = null,

    /**
     * The respondent's answer(s) to the question.
     */
    var answer: List<QuestionnaireResponseItemAnswerComponent>? = null,

    /**
     * Questions or sub-groups nested beneath a question or group.
     */
    var item: List<QuestionnaireResponseItemComponent>? = null

)


@Serializable
class QuestionnaireResponseItemAnswerComponent(

    /**
     * The answer (or one of the answers) provided by the respondent to the question.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
    var valueBoolean: Boolean? = null,
    var valueDecimal: Double? = null,
    var valueInteger: Int? = null,
    var valueDate: String? = null,
    var valueDateTime: String? = null,
    var valueTime: String? = null,
    var valueString: String? = null,
    var valueUri: String? = null,
    var valueAttachment: Attachment? = null,
    var valueCoding: Coding? = null,
    var valueQuantity: Quantity? = null,
    var valueReference: Reference? = null,

    /**
     * Nested groups and/or questions found within this particular answer.
     */
    var item: List<QuestionnaireResponseItemComponent>? = null

)


@Serializable
enum class QuestionnaireResponseStatus : CodeableEnumeration {

    /**
     * This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it.
     */
    INPROGRESS,

    /**
     * This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive.
     */
    COMPLETED,

    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     */
    AMENDED,

    /**
     * This QuestionnaireResponse was entered in error and voided.
     */
    ENTEREDINERROR,

    /**
     * This QuestionnaireResponse has been partially filled out with answers but has been abandoned. It is unknown whether changes or additions are expected to be made to it.
     */
    STOPPED,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            INPROGRESS -> "in-progress"
            COMPLETED -> "completed"
            AMENDED -> "amended"
            ENTEREDINERROR -> "entered-in-error"
            STOPPED -> "stopped"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            INPROGRESS -> "http://hl7.org/fhir/questionnaire-answers-status"
            COMPLETED -> "http://hl7.org/fhir/questionnaire-answers-status"
            AMENDED -> "http://hl7.org/fhir/questionnaire-answers-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/questionnaire-answers-status"
            STOPPED -> "http://hl7.org/fhir/questionnaire-answers-status"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            INPROGRESS -> "This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it."
            COMPLETED -> "This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive."
            AMENDED -> "This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards."
            ENTEREDINERROR -> "This QuestionnaireResponse was entered in error and voided."
            STOPPED -> "This QuestionnaireResponse has been partially filled out with answers but has been abandoned. It is unknown whether changes or additions are expected to be made to it."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            INPROGRESS -> "In Progress"
            COMPLETED -> "Completed"
            AMENDED -> "Amended"
            ENTEREDINERROR -> "Entered in Error"
            STOPPED -> "Stopped"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): QuestionnaireResponseStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("in-progress" == codeString) return INPROGRESS
//            if ("completed" == codeString) return COMPLETED
//            if ("amended" == codeString) return AMENDED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            if ("stopped" == codeString) return STOPPED
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown QuestionnaireResponseStatus code '$codeString'")
//        }
//    }
}
