package io.h4h.fhir.r4.resources

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.serializers.InstantSerializer
import kotlinx.datetime.Instant
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
    override val id: String,
    override val resourceType: ResourceType = ResourceType.QuestionnaireResponse,
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
     * A business identifier assigned to a particular completed (or partially completed) questionnaire.
     */
    val identifier: Identifier? = null,

    /**
     * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
     */
    val basedOn: List<Reference>? = null,

    /**
     * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
     */
    val partOf: List<Reference>? = null,

    /**
     * The Questionnaire that defines and organizes the questions for which answers are being provided.
     */
    val questionnaire: String? = null,

    /**
     * The position of the questionnaire response within its overall lifecycle.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers-status")
     */
    val status: QuestionnaireResponseStatus? = null,

    /**
     * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
     */
    val subject: Reference? = null,


    /**
     * The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.
     */
    val encounter: Reference? = null,


    /**
     * The date and/or time that this set of answers were last changed.
     */
    @Serializable(with= InstantSerializer::class)
    val authored: Instant? = null,

    /**
     * Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
     */
    val author: Reference? = null,

    /**
     * The person who answered the questions about the subject.
     */
    val source: Reference? = null,

    /**
     * A group or question item from the original questionnaire for which answers are provided.
     */
    val item: List<QuestionnaireResponseItemComponent>? = null


) : DomainResource


@Serializable
data class QuestionnaireResponseItemComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
     */
    val linkId: String? = null,

    /**
     * A reference to an [[[ElementDefinition]]] that provides the details for the item.
     */
    val definition: String? = null,

    /**
     * Text that is displayed above the contents of the group or as the text of the question being answered.
     */
    val text: String? = null,

    /**
     * The respondent's answer(s) to the question.
     */
    val answer: List<QuestionnaireResponseItemAnswerComponent>? = null,

    /**
     * Questions or sub-groups nested beneath a question or group.
     */
    val item: List<QuestionnaireResponseItemComponent>? = null

) : BackboneElement


@Serializable
class QuestionnaireResponseItemAnswerComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The answer (or one of the answers) provided by the respondent to the question.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
     */
    val valueBoolean: Boolean? = null,
    val valueDecimal: Double? = null,
    val valueInteger: Int? = null,
    val valueDate: String? = null,
    val valueDateTime: String? = null,
    val valueTime: String? = null,
    val valueString: String? = null,
    val valueUri: String? = null,
    val valueAttachment: Attachment? = null,
    val valueCoding: Coding? = null,
    val valueQuantity: Quantity? = null,
    val valueReference: Reference? = null,

    /**
     * Nested groups and/or questions found within this particular answer.
     */
    val item: List<QuestionnaireResponseItemComponent>? = null

) : BackboneElement


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
    STOPPED;


    override val code: String?
        get() = when (this) {
            INPROGRESS -> "in-progress"
            COMPLETED -> "completed"
            AMENDED -> "amended"
            ENTEREDINERROR -> "entered-in-error"
            STOPPED -> "stopped"
        }


    override val system: String?
        get() = when (this) {
            INPROGRESS -> "http://hl7.org/fhir/questionnaire-answers-status"
            COMPLETED -> "http://hl7.org/fhir/questionnaire-answers-status"
            AMENDED -> "http://hl7.org/fhir/questionnaire-answers-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/questionnaire-answers-status"
            STOPPED -> "http://hl7.org/fhir/questionnaire-answers-status"
        }

    override val definition: String?
        get() = when (this) {
            INPROGRESS -> "This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it."
            COMPLETED -> "This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive."
            AMENDED -> "This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards."
            ENTEREDINERROR -> "This QuestionnaireResponse was entered in error and voided."
            STOPPED -> "This QuestionnaireResponse has been partially filled out with answers but has been abandoned. It is unknown whether changes or additions are expected to be made to it."
        }

    override val display: String?
        get() = when (this) {
            INPROGRESS -> "In Progress"
            COMPLETED -> "Completed"
            AMENDED -> "Amended"
            ENTEREDINERROR -> "Entered in Error"
            STOPPED -> "Stopped"
        }

}
