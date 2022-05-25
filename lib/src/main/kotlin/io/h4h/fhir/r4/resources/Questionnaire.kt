package io.h4h.fhir.r4.resources

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
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 */
@Serializable
data class Questionnaire(


    // ============================================================
    // ============================================================
    /**
     * DomainResource + Resource requirements
     * These are required for all resources
     */
    override val id: String,
    override val resourceType: ResourceType = ResourceType.Questionnaire,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null,
    override val text: Narrative? = null,
    // override val contained: List<Resource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,


    /**
     * MetadataResource requirements
     */
    override val url: String? = null,
    override val version: String? = null,
    override val name: String? = null,
    override val title: String? = null,
    override val status: PublicationStatus? = null,
    override val experimental: Boolean? = null,
    override val date: String? = null,
    override val publisher: String? = null,
    override val contact: List<ContactDetail>? = null,
    override val description: String? = null,
    override val useContext: List<UsageContext>? = null,
    override val jurisdiction: List<CodeableConcept>? = null,
    // ============================================================
    // ============================================================


    /**
     * A formal identifier that is used to identify this questionnaire when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    val identifier: List<Identifier>? = null,

    /**
     * The URL of a Questionnaire that this Questionnaire is based on.
     */
    val derivedFrom: List<String>? = null,

    /**
     * The types of subjects that can be the subject of responses created for the questionnaire.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
    val subjectType: List<String>? = null,

    /**
     * Explanation of why this questionnaire is needed and why it has been designed as it has.
     */
    val purpose: String? = null,

    /**
     * A copyright statement relating to the questionnaire and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the questionnaire.
     */
    val copyright: String? = null,

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    val approvalDate: String? = null,

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    val lastReviewDate: String? = null,

    /**
     * The period during which the questionnaire content was or is planned to be in active use.
     */
    val effectivePeriod: Period? = null,

    /**
     * An identifier for this question or group of questions in a particular terminology such as LOINC.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-questions")
    val code: List<Coding>? = null,

    /**
     * A particular question, question grouping or display text that is part of the questionnaire.
     */
    val item: List<QuestionnaireItemComponent>? = null

) : MetadataResource



@Serializable
data class QuestionnaireItemComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
     */
    val linkId: String? = null,

    /**
     * This element is a URI that refers to an [[[ElementDefinition]]] that provides information about this item, including information that might otherwise be included in the instance of the Questionnaire resource. A detailed description of the construction of the URI is shown in Comments, below. If this element is present then the following element values MAY be derived from the Element Definition if the corresponding elements of this Questionnaire resource instance have no value:
     *
     * code (ElementDefinition.code)
     * type (ElementDefinition.type)
     * required (ElementDefinition.min)
     * repeats (ElementDefinition.max)
     * maxLength (ElementDefinition.maxLength)
     * answerValueSet (ElementDefinition.binding)
     * options (ElementDefinition.binding).
     */
    val definition: String? = null,

    /**
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-questions")
    val code: List<Coding>? = null,

    /**
     * A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire.
     */
    val prefix: String? = null,

    /**
     * The name of a section, the text of a question or text content for a display item.
     */
    val text: String? = null,

    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/item-type")
    val type: QuestionnaireItemType? = null,

    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
     */
    val enableWhen: List<QuestionnaireItemEnableWhenComponent>? = null,

    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-enable-behavior")
    val enableBehavior: EnableWhenBehavior? = null,

    /**
     * An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
     */
    val required: Boolean? = null,

    /**
     * An indication, if true, that the item may occur multiple times in the response, collecting multiple answers for questions or multiple sets of answers for groups.
     */
    val repeats: Boolean? = null,

    /**
     * An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire.
     */
    val readOnly: Boolean? = null,

    /**
     * The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
     */
    val maxLength: Int? = null,

    /**
     * A reference to a value set containing a list of codes representing permitted answers for a "choice" or "open-choice" question.
     */
    val answerValueSet: String? = null,

    /**
     * One of the permitted answers for a "choice" or "open-choice" question.
     */
    val answerOption: List<QuestionnaireItemAnswerOptionComponent>? = null,

    /**
     * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
     */
    val initial: List<QuestionnaireItemInitialComponent>? = null,

    /**
     * Text, questions and other groups to be nested beneath a question or group.
     */
    val item: List<QuestionnaireItemComponent>? = null

) : BackboneElement


@Serializable
data class QuestionnaireItemEnableWhenComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The linkId for the question whose answer (or lack of answer) governs whether this item is enabled.
     */
    val question: String? = null,

    /**
     * Specifies the criteria by which the question is enabled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-enable-operator")
    val operator: QuestionnaireItemOperator? = null,

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
    val answerBoolean: Boolean? = null,
    val answerDecimal: Double? = null,
    val answerInteger: Int? = null,
    val answerDate: String? = null,
    val answerDateTime: String? = null,
    val answerTime: String? = null,
    val answerString: String? = null,
    val answerCoding: Coding? = null,
    val answerQuantity: Quantity? = null,
    val answerReference: Reference? = null

) : BackboneElement


@Serializable
data class QuestionnaireItemAnswerOptionComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * A potential answer that's allowed as the answer to this question.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
    val valueInteger: Int? = null,
    val valueDate: String? = null,
    val valueTime: String? = null,
    val valueString: String? = null,
    val valueCoding: Coding? = null,
    val valueReference: Reference? = null,

    /**
     * Indicates whether the answer value is selected when the list of possible answers is initially shown.
     */
    val initialSelected: Boolean? = null

) : BackboneElement


@Serializable
data class QuestionnaireItemInitialComponent(

    // ============================================================
    // BackboneElement requirements
    // ============================================================
    override val id: String? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * The actual value to for an initial answer.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
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
    val valueReference: Reference? = null

) : BackboneElement



@Serializable
enum class QuestionnaireItemType : CodeableEnumeration {

    /**
     * An item with no direct answer but should have at least one child item.
     */
    @SerialName("group")
    GROUP,

    /**
     * Text for display that will not capture an answer or have child items.
     */
    @SerialName("display")
    DISPLAY,

    /**
     * An item that defines a specific answer to be captured, and which may have child items. (the answer provided in the QuestionnaireResponse should be of the defined datatype).
     */
    @SerialName("question")
    QUESTION,

    /**
     * Question with a yes/no answer (valueBoolean).
     */
    @SerialName("boolean")
    BOOLEAN,

    /**
     * Question with is a real number answer (valueDecimal).
     */
    @SerialName("decimal")
    DECIMAL,

    /**
     * Question with an integer answer (valueInteger).
     */
    @SerialName("integer")
    INTEGER,

    /**
     * Question with a date answer (valueDate).
     */
    @SerialName("date")
    DATE,

    /**
     * Question with a date and time answer (valueDateTime).
     */
    @SerialName("dateTime")
    DATETIME,

    /**
     * Question with a time (hour:minute:second) answer independent of date. (valueTime).
     */
    @SerialName("time")
    TIME,

    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString).
     */
    @SerialName("string")
    STRING,

    /**
     * Question with a long (potentially multi-paragraph) free-text entry answer (valueString).
     */
    @SerialName("text")
    TEXT,

    /**
     * Question with a URL (website, FTP site, etc.) answer (valueUri).
     */
    @SerialName("url")
    URL,

    /**
     * Question with a Coding drawn from a list of possible answers (specified in either the answerOption property, or via the valueset referenced in the answerValueSet property) as an answer (valueCoding).
     */
    @SerialName("choice")
    CHOICE,

    /**
     * Answer is a Coding drawn from a list of possible answers (as with the choice type) or a free-text entry in a string (valueCoding or valueString).
     */
    @SerialName("open-choice")
    OPENCHOICE,

    /**
     * Question with binary content such as an image, PDF, etc. as an answer (valueAttachment).
     */
    @SerialName("attachment")
    ATTACHMENT,

    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference).
     */
    @SerialName("reference")
    REFERENCE,

    /**
     * Question with a combination of a numeric value and unit, potentially with a comparator (<, >, etc.) as an answer. (valueQuantity) There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to define what unit should be captured (or the unit that has a ucum conversion from the provided unit).
     */
    @SerialName("quantity")
    QUANTITY;

    
    
    override val code: String?
        get() = when (this) {
            GROUP -> "group"
            DISPLAY -> "display"
            QUESTION -> "question"
            BOOLEAN -> "boolean"
            DECIMAL -> "decimal"
            INTEGER -> "integer"
            DATE -> "date"
            DATETIME -> "dateTime"
            TIME -> "time"
            STRING -> "string"
            TEXT -> "text"
            URL -> "url"
            CHOICE -> "choice"
            OPENCHOICE -> "open-choice"
            ATTACHMENT -> "attachment"
            REFERENCE -> "reference"
            QUANTITY -> "quantity"
        }


    override val system: String? = "http://hl7.org/fhir/item-type"

    override val definition: String?
        get() = when (this) {
            GROUP -> "An item with no direct answer but should have at least one child item."
            DISPLAY -> "Text for display that will not capture an answer or have child items."
            QUESTION -> "An item that defines a specific answer to be captured, and which may have child items. (the answer provided in the QuestionnaireResponse should be of the defined datatype)."
            BOOLEAN -> "Question with a yes/no answer (valueBoolean)."
            DECIMAL -> "Question with is a real number answer (valueDecimal)."
            INTEGER -> "Question with an integer answer (valueInteger)."
            DATE -> "Question with a date answer (valueDate)."
            DATETIME -> "Question with a date and time answer (valueDateTime)."
            TIME -> "Question with a time (hour:minute:second) answer independent of date. (valueTime)."
            STRING -> "Question with a short (few words to short sentence) free-text entry answer (valueString)."
            TEXT -> "Question with a long (potentially multi-paragraph) free-text entry answer (valueString)."
            URL -> "Question with a URL (website, FTP site, etc.) answer (valueUri)."
            CHOICE -> "Question with a Coding drawn from a list of possible answers (specified in either the answerOption property, or via the valueset referenced in the answerValueSet property) as an answer (valueCoding)."
            OPENCHOICE -> "Answer is a Coding drawn from a list of possible answers (as with the choice type) or a free-text entry in a string (valueCoding or valueString)."
            ATTACHMENT -> "Question with binary content such as an image, PDF, etc. as an answer (valueAttachment)."
            REFERENCE -> "Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference)."
            QUANTITY -> "Question with a combination of a numeric value and unit, potentially with a comparator (<, >, etc.) as an answer. (valueQuantity) There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to define what unit should be captured (or the unit that has a ucum conversion from the provided unit)."
        }

    override val display: String?
        get() = when (this) {
            GROUP -> "Group"
            DISPLAY -> "Display"
            QUESTION -> "Question"
            BOOLEAN -> "Boolean"
            DECIMAL -> "Decimal"
            INTEGER -> "Integer"
            DATE -> "Date"
            DATETIME -> "Date Time"
            TIME -> "Time"
            STRING -> "String"
            TEXT -> "Text"
            URL -> "Url"
            CHOICE -> "Choice"
            OPENCHOICE -> "Open Choice"
            ATTACHMENT -> "Attachment"
            REFERENCE -> "Reference"
            QUANTITY -> "Quantity"
        }
    
}


@Serializable
enum class QuestionnaireItemOperator : CodeableEnumeration {

    /**
     * True if whether an answer exists is equal to the enableWhen answer (which must be a boolean).
     */
    EXISTS,

    /**
     * True if whether at least one answer has a value that is equal to the enableWhen answer.
     */
    EQUAL,

    /**
     * True if whether at least no answer has a value that is equal to the enableWhen answer.
     */
    NOT_EQUAL,

    /**
     * True if whether at least no answer has a value that is greater than the enableWhen answer.
     */
    GREATER_THAN,

    /**
     * True if whether at least no answer has a value that is less than the enableWhen answer.
     */
    LESS_THAN,

    /**
     * True if whether at least no answer has a value that is greater or equal to the enableWhen answer.
     */
    GREATER_OR_EQUAL,

    /**
     * True if whether at least no answer has a value that is less or equal to the enableWhen answer.
     */
    LESS_OR_EQUAL;


    override val code: String?
        get() = when (this) {
            EXISTS -> "exists"
            EQUAL -> "="
            NOT_EQUAL -> "!="
            GREATER_THAN -> ">"
            LESS_THAN -> "<"
            GREATER_OR_EQUAL -> ">="
            LESS_OR_EQUAL -> "<="
        }


    override val system: String?
        get() = when (this) {
            EXISTS -> "http://hl7.org/fhir/questionnaire-enable-operator"
            EQUAL -> "http://hl7.org/fhir/questionnaire-enable-operator"
            NOT_EQUAL -> "http://hl7.org/fhir/questionnaire-enable-operator"
            GREATER_THAN -> "http://hl7.org/fhir/questionnaire-enable-operator"
            LESS_THAN -> "http://hl7.org/fhir/questionnaire-enable-operator"
            GREATER_OR_EQUAL -> "http://hl7.org/fhir/questionnaire-enable-operator"
            LESS_OR_EQUAL -> "http://hl7.org/fhir/questionnaire-enable-operator"
        }

    override val definition: String?
        get() = when (this) {
            EXISTS -> "True if whether an answer exists is equal to the enableWhen answer (which must be a boolean)."
            EQUAL -> "True if whether at least one answer has a value that is equal to the enableWhen answer."
            NOT_EQUAL -> "True if whether at least no answer has a value that is equal to the enableWhen answer."
            GREATER_THAN -> "True if whether at least no answer has a value that is greater than the enableWhen answer."
            LESS_THAN -> "True if whether at least no answer has a value that is less than the enableWhen answer."
            GREATER_OR_EQUAL -> "True if whether at least no answer has a value that is greater or equal to the enableWhen answer."
            LESS_OR_EQUAL -> "True if whether at least no answer has a value that is less or equal to the enableWhen answer."
        }

    override val display: String?
        get() = when (this) {
            EXISTS -> "Exists"
            EQUAL -> "Equals"
            NOT_EQUAL -> "Not Equals"
            GREATER_THAN -> "Greater Than"
            LESS_THAN -> "Less Than"
            GREATER_OR_EQUAL -> "Greater or Equals"
            LESS_OR_EQUAL -> "Less or Equals"
        }

}

