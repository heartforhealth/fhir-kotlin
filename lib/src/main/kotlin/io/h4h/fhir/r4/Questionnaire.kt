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
    override var id: String? = null,
    override var resourceType: ResourceType? = ResourceType.Questionnaire,
    override var meta: Meta? = null,
    override var implicitRules: String? = null,
    override var language: String? = null,
    override var text: Narrative? = null,
    override var contained: List<Resource>? = null,
    override var extension: List<Extension>? = null,
    override var modifierExtension: List<Extension>? = null,


    /**
     * MetadataResource requirements
     */
    override var url: String? = null,
    override var version: String? = null,
    override var name: String? = null,
    override var title: String? = null,
    override var status: PublicationStatus? = null,
    override var experimental: Boolean? = null,
    override var date: String? = null,
    override var publisher: String? = null,
    override var contact: List<ContactDetail>? = null,
    override var description: String? = null,
    override var useContext: List<UsageContext>? = null,
    override var jurisdiction: List<CodeableConcept>? = null,
    // ============================================================
    // ============================================================


    /**
     * A formal identifier that is used to identify this questionnaire when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    var identifier: List<Identifier>? = null,

    /**
     * The URL of a Questionnaire that this Questionnaire is based on.
     */
    var derivedFrom: List<String>? = null,

    /**
     * The types of subjects that can be the subject of responses created for the questionnaire.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
    var subjectType: List<String>? = null,

    /**
     * Explanation of why this questionnaire is needed and why it has been designed as it has.
     */
    var purpose: String? = null,

    /**
     * A copyright statement relating to the questionnaire and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the questionnaire.
     */
    var copyright: String? = null,

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    var approvalDate: String? = null,

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    var lastReviewDate: String? = null,

    /**
     * The period during which the questionnaire content was or is planned to be in active use.
     */
    var effectivePeriod: Period? = null,

    /**
     * An identifier for this question or group of questions in a particular terminology such as LOINC.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-questions")
    var code: List<Coding>? = null,

    /**
     * A particular question, question grouping or display text that is part of the questionnaire.
     */
    var item: List<QuestionnaireItemComponent>? = null

) : MetadataResource



@Serializable
data class QuestionnaireItemComponent(

    /**
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent item in a QuestionnaireResponse resource.
     */
    var linkId: String? = null,

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
    var definition: String? = null,

    /**
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which defines many questions and answers).
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-questions")
    var code: List<Coding>? = null,

    /**
     * A short label for a particular group, question or set of display text within the questionnaire used for reference by the individual completing the questionnaire.
     */
    var prefix: String? = null,

    /**
     * The name of a section, the text of a question or text content for a display item.
     */
    var text: String? = null,

    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/item-type")
    var type: QuestionnaireItemType? = null,

    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
     */
    var enableWhen: List<QuestionnaireItemEnableWhenComponent>? = null,

    /**
     * Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
     */
    // @Binding(valueSet="http://hl7.org/fhir/ValueSet/questionnaire-enable-behavior")
    var enableBehavior: EnableWhenBehavior? = null,

    /**
     * An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.  If false, the item may be skipped when answering the questionnaire.
     */
    var required: Boolean? = null,

    /**
     * An indication, if true, that the item may occur multiple times in the response, collecting multiple answers for questions or multiple sets of answers for groups.
     */
    var repeats: Boolean? = null,

    /**
     * An indication, when true, that the value cannot be changed by a human respondent to the Questionnaire.
     */
    var readOnly: Boolean? = null,

    /**
     * The maximum number of characters that are permitted in the answer to be considered a "valid" QuestionnaireResponse.
     */
    var maxLength: Int? = null,

    /**
     * A reference to a value set containing a list of codes representing permitted answers for a "choice" or "open-choice" question.
     */
    var answerValueSet: String? = null,

    /**
     * One of the permitted answers for a "choice" or "open-choice" question.
     */
    var answerOption: List<QuestionnaireItemAnswerOptionComponent>? = null,

    /**
     * One or more values that should be pre-populated in the answer when initially rendering the questionnaire for user input.
     */
    var initial: List<QuestionnaireItemInitialComponent>? = null,

    /**
     * Text, questions and other groups to be nested beneath a question or group.
     */
    var item: List<QuestionnaireItemComponent>? = null

)


@Serializable
data class QuestionnaireItemEnableWhenComponent(

    /**
     * The linkId for the question whose answer (or lack of answer) governs whether this item is enabled.
     */
    var question: String? = null,

    /**
     * Specifies the criteria by which the question is enabled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-enable-operator")
    var operator: QuestionnaireItemOperator? = null,

    /**
     * A value that the referenced question is tested using the specified operator in order for the item to be enabled.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
    var answerBoolean: Boolean? = null,
    var answerDecimal: Double? = null,
    var answerInteger: Int? = null,
    var answerDate: String? = null,
    var answerDateTime: String? = null,
    var answerTime: String? = null,
    var answerString: String? = null,
    var answerCoding: Coding? = null,
    var answerQuantity: Quantity? = null,
    var answerReference: Reference? = null

)


@Serializable
data class QuestionnaireItemAnswerOptionComponent(

    /**
     * A potential answer that's allowed as the answer to this question.
     */
    // @Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-answers")
    var valueInteger: Int? = null,
    var valueDate: String? = null,
    var valueTime: String? = null,
    var valueString: String? = null,
    var valueCoding: Coding? = null,
    var valueReference: Reference? = null,

    /**
     * Indicates whether the answer value is selected when the list of possible answers is initially shown.
     */
    var initialSelected: Boolean? = null

)


@Serializable
data class QuestionnaireItemInitialComponent(

    /**
     * The actual value to for an initial answer.
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
    var valueReference: Reference? = null

)



@Serializable
enum class QuestionnaireItemType : CodeableEnumeration {

    /**
     * An item with no direct answer but should have at least one child item.
     */
    GROUP,

    /**
     * Text for display that will not capture an answer or have child items.
     */
    DISPLAY,

    /**
     * An item that defines a specific answer to be captured, and which may have child items. (the answer provided in the QuestionnaireResponse should be of the defined datatype).
     */
    QUESTION,

    /**
     * Question with a yes/no answer (valueBoolean).
     */
    BOOLEAN,

    /**
     * Question with is a real number answer (valueDecimal).
     */
    DECIMAL,

    /**
     * Question with an integer answer (valueInteger).
     */
    INTEGER,

    /**
     * Question with a date answer (valueDate).
     */
    DATE,

    /**
     * Question with a date and time answer (valueDateTime).
     */
    DATETIME,

    /**
     * Question with a time (hour:minute:second) answer independent of date. (valueTime).
     */
    TIME,

    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString).
     */
    STRING,

    /**
     * Question with a long (potentially multi-paragraph) free-text entry answer (valueString).
     */
    TEXT,

    /**
     * Question with a URL (website, FTP site, etc.) answer (valueUri).
     */
    URL,

    /**
     * Question with a Coding drawn from a list of possible answers (specified in either the answerOption property, or via the valueset referenced in the answerValueSet property) as an answer (valueCoding).
     */
    CHOICE,

    /**
     * Answer is a Coding drawn from a list of possible answers (as with the choice type) or a free-text entry in a string (valueCoding or valueString).
     */
    OPENCHOICE,

    /**
     * Question with binary content such as an image, PDF, etc. as an answer (valueAttachment).
     */
    ATTACHMENT,

    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference).
     */
    REFERENCE,

    /**
     * Question with a combination of a numeric value and unit, potentially with a comparator (<, >, etc.) as an answer. (valueQuantity) There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to define what unit should be captured (or the unit that has a ucum conversion from the provided unit).
     */
    QUANTITY,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
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
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            GROUP -> "http://hl7.org/fhir/item-type"
            DISPLAY -> "http://hl7.org/fhir/item-type"
            QUESTION -> "http://hl7.org/fhir/item-type"
            BOOLEAN -> "http://hl7.org/fhir/item-type"
            DECIMAL -> "http://hl7.org/fhir/item-type"
            INTEGER -> "http://hl7.org/fhir/item-type"
            DATE -> "http://hl7.org/fhir/item-type"
            DATETIME -> "http://hl7.org/fhir/item-type"
            TIME -> "http://hl7.org/fhir/item-type"
            STRING -> "http://hl7.org/fhir/item-type"
            TEXT -> "http://hl7.org/fhir/item-type"
            URL -> "http://hl7.org/fhir/item-type"
            CHOICE -> "http://hl7.org/fhir/item-type"
            OPENCHOICE -> "http://hl7.org/fhir/item-type"
            ATTACHMENT -> "http://hl7.org/fhir/item-type"
            REFERENCE -> "http://hl7.org/fhir/item-type"
            QUANTITY -> "http://hl7.org/fhir/item-type"
            NULL -> null
        }

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
            NULL -> null
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
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): QuestionnaireItemType? {
//            if (codeString == null || "" == codeString) return null
//            if ("group" == codeString) return GROUP
//            if ("display" == codeString) return DISPLAY
//            if ("question" == codeString) return QUESTION
//            if ("boolean" == codeString) return BOOLEAN
//            if ("decimal" == codeString) return DECIMAL
//            if ("integer" == codeString) return INTEGER
//            if ("date" == codeString) return DATE
//            if ("dateTime" == codeString) return DATETIME
//            if ("time" == codeString) return TIME
//            if ("string" == codeString) return STRING
//            if ("text" == codeString) return TEXT
//            if ("url" == codeString) return URL
//            if ("choice" == codeString) return CHOICE
//            if ("open-choice" == codeString) return OPENCHOICE
//            if ("attachment" == codeString) return ATTACHMENT
//            if ("reference" == codeString) return REFERENCE
//            if ("quantity" == codeString) return QUANTITY
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown QuestionnaireItemType code '$codeString'")
//        }
//    }
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
    LESS_OR_EQUAL,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            EXISTS -> "exists"
            EQUAL -> "="
            NOT_EQUAL -> "!="
            GREATER_THAN -> ">"
            LESS_THAN -> "<"
            GREATER_OR_EQUAL -> ">="
            LESS_OR_EQUAL -> "<="
            NULL -> null
        }
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
            NULL -> null
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
            NULL -> null
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
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): QuestionnaireItemOperator? {
//            if (codeString == null || "" == codeString) return null
//            if ("exists" == codeString) return EXISTS
//            if ("=" == codeString) return EQUAL
//            if ("!=" == codeString) return NOT_EQUAL
//            if (">" == codeString) return GREATER_THAN
//            if ("<" == codeString) return LESS_THAN
//            if (">=" == codeString) return GREATER_OR_EQUAL
//            if ("<=" == codeString) return LESS_OR_EQUAL
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown QuestionnaireItemOperator code '$codeString'")
//        }
//    }
}

