package io.h4h.fhir.r4.base


import kotlinx.serialization.Serializable


@Serializable
enum class ActionConditionKind : CodeableEnumeration {

    /**
     * The condition describes whether or not a given action is applicable.
     */
    APPLICABILITY,

    /**
     * The condition is a starting condition for the action.
     */
    START,

    /**
     * The condition is a stop, or exit condition for the action.
     */
    STOP,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            APPLICABILITY -> "applicability"
            START -> "start"
            STOP -> "stop"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            APPLICABILITY -> "http://hl7.org/fhir/action-condition-kind"
            START -> "http://hl7.org/fhir/action-condition-kind"
            STOP -> "http://hl7.org/fhir/action-condition-kind"
            NULL -> null
        }

    override val definition: String?
        get() {
            return when (this) {
                APPLICABILITY -> "The condition describes whether or not a given action is applicable."
                START -> "The condition is a starting condition for the action."
                STOP -> "The condition is a stop, or exit condition for the action."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                APPLICABILITY -> "Applicability"
                START -> "Start"
                STOP -> "Stop"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionConditionKind? {
//            if (codeString == null || "" == codeString) return null
//            if ("applicability" == codeString) return APPLICABILITY
//            if ("start" == codeString) return START
//            if ("stop" == codeString) return STOP
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionConditionKind code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionRelationshipType : CodeableEnumeration {

    /**
     * The action must be performed before the start of the related action.
     */
    BEFORESTART,

    /**
     * The action must be performed before the related action.
     */
    BEFORE,

    /**
     * The action must be performed before the end of the related action.
     */
    BEFOREEND,

    /**
     * The action must be performed concurrent with the start of the related action.
     */
    CONCURRENTWITHSTART,

    /**
     * The action must be performed concurrent with the related action.
     */
    CONCURRENT,

    /**
     * The action must be performed concurrent with the end of the related action.
     */
    CONCURRENTWITHEND,

    /**
     * The action must be performed after the start of the related action.
     */
    AFTERSTART,

    /**
     * The action must be performed after the related action.
     */
    AFTER,

    /**
     * The action must be performed after the end of the related action.
     */
    AFTEREND,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            BEFORESTART -> "before-start"
            BEFORE -> "before"
            BEFOREEND -> "before-end"
            CONCURRENTWITHSTART -> "concurrent-with-start"
            CONCURRENT -> "concurrent"
            CONCURRENTWITHEND -> "concurrent-with-end"
            AFTERSTART -> "after-start"
            AFTER -> "after"
            AFTEREND -> "after-end"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                BEFORESTART -> "http://hl7.org/fhir/action-relationship-type"
                BEFORE -> "http://hl7.org/fhir/action-relationship-type"
                BEFOREEND -> "http://hl7.org/fhir/action-relationship-type"
                CONCURRENTWITHSTART -> "http://hl7.org/fhir/action-relationship-type"
                CONCURRENT -> "http://hl7.org/fhir/action-relationship-type"
                CONCURRENTWITHEND -> "http://hl7.org/fhir/action-relationship-type"
                AFTERSTART -> "http://hl7.org/fhir/action-relationship-type"
                AFTER -> "http://hl7.org/fhir/action-relationship-type"
                AFTEREND -> "http://hl7.org/fhir/action-relationship-type"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                BEFORESTART -> "The action must be performed before the start of the related action."
                BEFORE -> "The action must be performed before the related action."
                BEFOREEND -> "The action must be performed before the end of the related action."
                CONCURRENTWITHSTART -> "The action must be performed concurrent with the start of the related action."
                CONCURRENT -> "The action must be performed concurrent with the related action."
                CONCURRENTWITHEND -> "The action must be performed concurrent with the end of the related action."
                AFTERSTART -> "The action must be performed after the start of the related action."
                AFTER -> "The action must be performed after the related action."
                AFTEREND -> "The action must be performed after the end of the related action."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                BEFORESTART -> "Before Start"
                BEFORE -> "Before"
                BEFOREEND -> "Before End"
                CONCURRENTWITHSTART -> "Concurrent With Start"
                CONCURRENT -> "Concurrent"
                CONCURRENTWITHEND -> "Concurrent With End"
                AFTERSTART -> "After Start"
                AFTER -> "After"
                AFTEREND -> "After End"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionRelationshipType? {
//            if (codeString == null || "" == codeString) return null
//            if ("before-start" == codeString) return BEFORESTART
//            if ("before" == codeString) return BEFORE
//            if ("before-end" == codeString) return BEFOREEND
//            if ("concurrent-with-start" == codeString) return CONCURRENTWITHSTART
//            if ("concurrent" == codeString) return CONCURRENT
//            if ("concurrent-with-end" == codeString) return CONCURRENTWITHEND
//            if ("after-start" == codeString) return AFTERSTART
//            if ("after" == codeString) return AFTER
//            if ("after-end" == codeString) return AFTEREND
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionRelationshipType code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionParticipantType : CodeableEnumeration {

    /**
     * The participant is the patient under evaluation.
     */
    PATIENT,

    /**
     * The participant is a practitioner involved in the patient's care.
     */
    PRACTITIONER,

    /**
     * The participant is a person related to the patient.
     */
    RELATEDPERSON,

    /**
     * The participant is a system or device used in the care of the patient.
     */
    DEVICE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PATIENT -> "patient"
            PRACTITIONER -> "practitioner"
            RELATEDPERSON -> "related-person"
            DEVICE -> "device"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                PATIENT -> "http://hl7.org/fhir/action-participant-type"
                PRACTITIONER -> "http://hl7.org/fhir/action-participant-type"
                RELATEDPERSON -> "http://hl7.org/fhir/action-participant-type"
                DEVICE -> "http://hl7.org/fhir/action-participant-type"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                PATIENT -> "The participant is the patient under evaluation."
                PRACTITIONER -> "The participant is a practitioner involved in the patient's care."
                RELATEDPERSON -> "The participant is a person related to the patient."
                DEVICE -> "The participant is a system or device used in the care of the patient."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                PATIENT -> "Patient"
                PRACTITIONER -> "Practitioner"
                RELATEDPERSON -> "Related Person"
                DEVICE -> "Device"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionParticipantType? {
//            if (codeString == null || "" == codeString) return null
//            if ("patient" == codeString) return PATIENT
//            if ("practitioner" == codeString) return PRACTITIONER
//            if ("related-person" == codeString) return RELATEDPERSON
//            if ("device" == codeString) return DEVICE
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionParticipantType code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionGroupingBehavior : CodeableEnumeration {

    /**
     * Any group marked with this behavior should be displayed as a visual group to the end user.
     */
    VISUALGROUP,

    /**
     * A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.
     */
    LOGICALGROUP,

    /**
     * A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne".
     */
    SENTENCEGROUP,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            VISUALGROUP -> "visual-group"
            LOGICALGROUP -> "logical-group"
            SENTENCEGROUP -> "sentence-group"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                VISUALGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
                LOGICALGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
                SENTENCEGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                VISUALGROUP -> "Any group marked with this behavior should be displayed as a visual group to the end user."
                LOGICALGROUP -> "A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so."
                SENTENCEGROUP -> "A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are \"aspirin, 500 mg, 2 times per day\" and \"aspirin, 300 mg, 3 times per day\". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of \"AtMostOne\", unless it's a required action, in which case, it would be \"ExactlyOne\"."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                VISUALGROUP -> "Visual Group"
                LOGICALGROUP -> "Logical Group"
                SENTENCEGROUP -> "Sentence Group"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionGroupingBehavior? {
//            if (codeString == null || "" == codeString) return null
//            if ("visual-group" == codeString) return VISUALGROUP
//            if ("logical-group" == codeString) return LOGICALGROUP
//            if ("sentence-group" == codeString) return SENTENCEGROUP
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionGroupingBehavior code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionSelectionBehavior : CodeableEnumeration {

    /**
     * Any number of the actions in the group may be chosen, from zero to all.
     */
    ANY,

    /**
     * All the actions in the group must be selected as a single unit.
     */
    ALL,

    /**
     * All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.
     */
    ALLORNONE,

    /**
     * The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.
     */
    EXACTLYONE,

    /**
     * The end user may choose zero or at most one of the actions in the group.
     */
    ATMOSTONE,

    /**
     * The end user must choose a minimum of one, and as many additional as desired.
     */
    ONEORMORE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            ANY -> "any"
            ALL -> "all"
            ALLORNONE -> "all-or-none"
            EXACTLYONE -> "exactly-one"
            ATMOSTONE -> "at-most-one"
            ONEORMORE -> "one-or-more"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                ANY -> "http://hl7.org/fhir/action-selection-behavior"
                ALL -> "http://hl7.org/fhir/action-selection-behavior"
                ALLORNONE -> "http://hl7.org/fhir/action-selection-behavior"
                EXACTLYONE -> "http://hl7.org/fhir/action-selection-behavior"
                ATMOSTONE -> "http://hl7.org/fhir/action-selection-behavior"
                ONEORMORE -> "http://hl7.org/fhir/action-selection-behavior"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                ANY -> "Any number of the actions in the group may be chosen, from zero to all."
                ALL -> "All the actions in the group must be selected as a single unit."
                ALLORNONE -> "All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected."
                EXACTLYONE -> "The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group."
                ATMOSTONE -> "The end user may choose zero or at most one of the actions in the group."
                ONEORMORE -> "The end user must choose a minimum of one, and as many additional as desired."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                ANY -> "Any"
                ALL -> "All"
                ALLORNONE -> "All Or None"
                EXACTLYONE -> "Exactly One"
                ATMOSTONE -> "At Most One"
                ONEORMORE -> "One Or More"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionSelectionBehavior? {
//            if (codeString == null || "" == codeString) return null
//            if ("any" == codeString) return ANY
//            if ("all" == codeString) return ALL
//            if ("all-or-none" == codeString) return ALLORNONE
//            if ("exactly-one" == codeString) return EXACTLYONE
//            if ("at-most-one" == codeString) return ATMOSTONE
//            if ("one-or-more" == codeString) return ONEORMORE
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionSelectionBehavior code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionRequiredBehavior : CodeableEnumeration {

    /**
     * An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.
     */
    MUST,

    /**
     * An action with this behavior may be included in the set of actions processed by the end user.
     */
    COULD,

    /**
     * An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.
     */
    MUSTUNLESSDOCUMENTED,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            MUST -> "must"
            COULD -> "could"
            MUSTUNLESSDOCUMENTED -> "must-unless-documented"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                MUST -> "http://hl7.org/fhir/action-required-behavior"
                COULD -> "http://hl7.org/fhir/action-required-behavior"
                MUSTUNLESSDOCUMENTED -> "http://hl7.org/fhir/action-required-behavior"
                NULL -> null
            }
        }
    override val definition: String?
        get() {
            return when (this) {
                MUST -> "An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action."
                COULD -> "An action with this behavior may be included in the set of actions processed by the end user."
                MUSTUNLESSDOCUMENTED -> "An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                MUST -> "Must"
                COULD -> "Could"
                MUSTUNLESSDOCUMENTED -> "Must Unless Documented"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionRequiredBehavior? {
//            if (codeString == null || "" == codeString) return null
//            if ("must" == codeString) return MUST
//            if ("could" == codeString) return COULD
//            if ("must-unless-documented" == codeString) return MUSTUNLESSDOCUMENTED
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionRequiredBehavior code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionPrecheckBehavior : CodeableEnumeration {

    /**
     * An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider "pre-checking" such an action as a convenience for the user.
     */
    YES,

    /**
     * An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not "pre-check" such an action.
     */
    NO,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            YES -> "yes"
            NO -> "no"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                YES -> "http://hl7.org/fhir/action-precheck-behavior"
                NO -> "http://hl7.org/fhir/action-precheck-behavior"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                YES -> "An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider \"pre-checking\" such an action as a convenience for the user."
                NO -> "An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not \"pre-check\" such an action."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                YES -> "Yes"
                NO -> "No"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionPrecheckBehavior? {
//            if (codeString == null || "" == codeString) return null
//            if ("yes" == codeString) return YES
//            if ("no" == codeString) return NO
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionPrecheckBehavior code '$codeString'")
//        }
//    }
}


@Serializable
enum class ActionCardinalityBehavior : CodeableEnumeration {

    /**
     * The action may only be selected one time.
     */
    SINGLE,

    /**
     * The action may be selected multiple times.
     */
    MULTIPLE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            SINGLE -> "single"
            MULTIPLE -> "multiple"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                SINGLE -> "http://hl7.org/fhir/action-cardinality-behavior"
                MULTIPLE -> "http://hl7.org/fhir/action-cardinality-behavior"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                SINGLE -> "The action may only be selected one time."
                MULTIPLE -> "The action may be selected multiple times."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                SINGLE -> "Single"
                MULTIPLE -> "Multiple"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ActionCardinalityBehavior? {
//            if (codeString == null || "" == codeString) return null
//            if ("single" == codeString) return SINGLE
//            if ("multiple" == codeString) return MULTIPLE
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ActionCardinalityBehavior code '$codeString'")
//        }
//    }
}


@Serializable
enum class AddressUse : CodeableEnumeration {

    /**
     * A communication address at a home.
     */
    home,

    /**
     * An office address. First choice for business related contacts during business hours.
     */
    work,

    /**
     * A temporary address. The period can provide more detailed information.
     */
    temp,

    /**
     * This address is no longer in use (or was never correct but retained for records).
     */
    old,

    /**
     * An address to be used to send bills, invoices, receipts etc.
     */
    billing;


    override fun toCode() = this.name

    override val system: String? = "http://hl7.org/fhir/address-use"

    override val definition: String?
        get() = when (this) {
            home -> "A communication address at a home."
            work -> "An office address. First choice for business related contacts during business hours."
            temp -> "A temporary address. The period can provide more detailed information."
            old -> "This address is no longer in use (or was never correct but retained for records)."
            billing -> "An address to be used to send bills, invoices, receipts etc."
        }

    override val display: String?
        get() = when (this) {
            home -> "Home"
            work -> "Work"
            temp -> "Temporary"
            old -> "Old / Incorrect"
            billing -> "Billing"
        }

}


@Serializable
enum class AddressType : CodeableEnumeration {
    /**
     * Mailing addresses - PO Boxes and care-of addresses.
     */
    POSTAL,

    /**
     * A physical address that can be visited.
     */
    PHYSICAL,

    /**
     * An address that is both physical and postal.
     */
    BOTH,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            POSTAL -> "postal"
            PHYSICAL -> "physical"
            BOTH -> "both"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            POSTAL -> "http://hl7.org/fhir/address-type"
            PHYSICAL -> "http://hl7.org/fhir/address-type"
            BOTH -> "http://hl7.org/fhir/address-type"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            POSTAL -> "Mailing addresses - PO Boxes and care-of addresses."
            PHYSICAL -> "A physical address that can be visited."
            BOTH -> "An address that is both physical and postal."
            NULL -> null
        }
    override val display: String?
        get() = when (this) {
            POSTAL -> "Postal"
            PHYSICAL -> "Physical"
            BOTH -> "Postal & Physical"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): AddressType? {
//                if (codeString == null || "" == codeString) return null
//                if ("postal" == codeString) return POSTAL
//                if ("physical" == codeString) return PHYSICAL
//                if ("both" == codeString) return BOTH
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown AddressType code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class CarePlanStatus : CodeableEnumeration {
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
        get() {
            return when (this) {
                DRAFT -> "The request has been created but is not yet complete or ready for action."
                ACTIVE -> "The request is in force and ready to be acted upon."
                ONHOLD -> "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future."
                REVOKED -> "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur."
                COMPLETED -> "The activity described by the request has been fully performed.  No further activity will occur."
                ENTEREDINERROR -> "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".)."
                UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                DRAFT -> "Draft"
                ACTIVE -> "Active"
                ONHOLD -> "On Hold"
                REVOKED -> "Revoked"
                COMPLETED -> "Completed"
                ENTEREDINERROR -> "Entered in Error"
                UNKNOWN -> "Unknown"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CarePlanStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("draft" == codeString) return DRAFT
//            if ("active" == codeString) return ACTIVE
//            if ("on-hold" == codeString) return ONHOLD
//            if ("revoked" == codeString) return REVOKED
//            if ("completed" == codeString) return COMPLETED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            if ("unknown" == codeString) return UNKNOWN
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CarePlanStatus code '$codeString'")
//        }
//    }
}


@Serializable
enum class CarePlanIntent : CodeableEnumeration {

    /**
     * null
     */
    PROPOSAL,

    /**
     * null
     */
    PLAN,

    /**
     * null
     */
    ORDER,

    /**
     * null
     */
    OPTION,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            ORDER -> "order"
            OPTION -> "option"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                PROPOSAL -> "http://hl7.org/fhir/request-intent"
                PLAN -> "http://hl7.org/fhir/request-intent"
                ORDER -> "http://hl7.org/fhir/request-intent"
                OPTION -> "http://hl7.org/fhir/request-intent"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                PROPOSAL -> ""
                PLAN -> ""
                ORDER -> ""
                OPTION -> ""
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                PROPOSAL -> "proposal"
                PLAN -> "plan"
                ORDER -> "order"
                OPTION -> "option"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CarePlanIntent? {
//            if (codeString == null || "" == codeString) return null
//            if ("proposal" == codeString) return PROPOSAL
//            if ("plan" == codeString) return PLAN
//            if ("order" == codeString) return ORDER
//            if ("option" == codeString) return OPTION
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CarePlanIntent code '$codeString'")
//        }
//    }
}


@Serializable
enum class CarePlanActivityKind : CodeableEnumeration {

    /**
     * null
     */
    APPOINTMENT,

    /**
     * null
     */
    COMMUNICATIONREQUEST,

    /**
     * null
     */
    DEVICEREQUEST,

    /**
     * null
     */
    MEDICATIONREQUEST,

    /**
     * null
     */
    NUTRITIONORDER,

    /**
     * null
     */
    TASK,

    /**
     * null
     */
    SERVICEREQUEST,

    /**
     * null
     */
    VISIONPRESCRIPTION,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            APPOINTMENT -> "Appointment"
            COMMUNICATIONREQUEST -> "CommunicationRequest"
            DEVICEREQUEST -> "DeviceRequest"
            MEDICATIONREQUEST -> "MedicationRequest"
            NUTRITIONORDER -> "NutritionOrder"
            TASK -> "Task"
            SERVICEREQUEST -> "ServiceRequest"
            VISIONPRESCRIPTION -> "VisionPrescription"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                APPOINTMENT -> "http://hl7.org/fhir/resource-types"
                COMMUNICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
                DEVICEREQUEST -> "http://hl7.org/fhir/resource-types"
                MEDICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
                NUTRITIONORDER -> "http://hl7.org/fhir/resource-types"
                TASK -> "http://hl7.org/fhir/resource-types"
                SERVICEREQUEST -> "http://hl7.org/fhir/resource-types"
                VISIONPRESCRIPTION -> "http://hl7.org/fhir/resource-types"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                APPOINTMENT -> ""
                COMMUNICATIONREQUEST -> ""
                DEVICEREQUEST -> ""
                MEDICATIONREQUEST -> ""
                NUTRITIONORDER -> ""
                TASK -> ""
                SERVICEREQUEST -> ""
                VISIONPRESCRIPTION -> ""
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                APPOINTMENT -> "Appointment"
                COMMUNICATIONREQUEST -> "CommunicationRequest"
                DEVICEREQUEST -> "DeviceRequest"
                MEDICATIONREQUEST -> "MedicationRequest"
                NUTRITIONORDER -> "NutritionOrder"
                TASK -> "Task"
                SERVICEREQUEST -> "ServiceRequest"
                VISIONPRESCRIPTION -> "VisionPrescription"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CarePlanActivityKind? {
//            if (codeString == null || "" == codeString) return null
//            if ("Appointment" == codeString) return APPOINTMENT
//            if ("CommunicationRequest" == codeString) return COMMUNICATIONREQUEST
//            if ("DeviceRequest" == codeString) return DEVICEREQUEST
//            if ("MedicationRequest" == codeString) return MEDICATIONREQUEST
//            if ("NutritionOrder" == codeString) return NUTRITIONORDER
//            if ("Task" == codeString) return TASK
//            if ("ServiceRequest" == codeString) return SERVICEREQUEST
//            if ("VisionPrescription" == codeString) return VISIONPRESCRIPTION
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CarePlanActivityKind code '$codeString'")
//        }
//    }
}


@Serializable
enum class CarePlanActivityStatus : CodeableEnumeration {

    /**
     * Care plan activity is planned but no action has yet been taken.
     */
    NOTSTARTED,

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    SCHEDULED,

    /**
     * Care plan activity has been started but is not yet complete.
     */
    INPROGRESS,

    /**
     * Care plan activity was started but has temporarily ceased with an expectation of resumption at a future time.
     */
    ONHOLD,

    /**
     * Care plan activity has been completed (more or less) as planned.
     */
    COMPLETED,

    /**
     * The planned care plan activity has been withdrawn.
     */
    CANCELLED,

    /**
     * The planned care plan activity has been ended prior to completion after the activity was started.
     */
    STOPPED,

    /**
     * The current state of the care plan activity is not known.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which one.
     */
    UNKNOWN,

    /**
     * Care plan activity was entered in error and voided.
     */
    ENTEREDINERROR,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            NOTSTARTED -> "not-started"
            SCHEDULED -> "scheduled"
            INPROGRESS -> "in-progress"
            ONHOLD -> "on-hold"
            COMPLETED -> "completed"
            CANCELLED -> "cancelled"
            STOPPED -> "stopped"
            UNKNOWN -> "unknown"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    override val system: String?
        get() {
            return when (this) {
                NOTSTARTED -> "http://hl7.org/fhir/care-plan-activity-status"
                SCHEDULED -> "http://hl7.org/fhir/care-plan-activity-status"
                INPROGRESS -> "http://hl7.org/fhir/care-plan-activity-status"
                ONHOLD -> "http://hl7.org/fhir/care-plan-activity-status"
                COMPLETED -> "http://hl7.org/fhir/care-plan-activity-status"
                CANCELLED -> "http://hl7.org/fhir/care-plan-activity-status"
                STOPPED -> "http://hl7.org/fhir/care-plan-activity-status"
                UNKNOWN -> "http://hl7.org/fhir/care-plan-activity-status"
                ENTEREDINERROR -> "http://hl7.org/fhir/care-plan-activity-status"
                NULL -> null
            }
        }

    override val definition: String?
        get() {
            return when (this) {
                NOTSTARTED -> "Care plan activity is planned but no action has yet been taken."
                SCHEDULED -> "Appointment or other booking has occurred but activity has not yet begun."
                INPROGRESS -> "Care plan activity has been started but is not yet complete."
                ONHOLD -> "Care plan activity was started but has temporarily ceased with an expectation of resumption at a future time."
                COMPLETED -> "Care plan activity has been completed (more or less) as planned."
                CANCELLED -> "The planned care plan activity has been withdrawn."
                STOPPED -> "The planned care plan activity has been ended prior to completion after the activity was started."
                UNKNOWN -> "The current state of the care plan activity is not known.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which one."
                ENTEREDINERROR -> "Care plan activity was entered in error and voided."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                NOTSTARTED -> "Not Started"
                SCHEDULED -> "Scheduled"
                INPROGRESS -> "In Progress"
                ONHOLD -> "On Hold"
                COMPLETED -> "Completed"
                CANCELLED -> "Cancelled"
                STOPPED -> "Stopped"
                UNKNOWN -> "Unknown"
                ENTEREDINERROR -> "Entered in Error"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): CarePlanActivityStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("not-started" == codeString) return NOTSTARTED
//            if ("scheduled" == codeString) return SCHEDULED
//            if ("in-progress" == codeString) return INPROGRESS
//            if ("on-hold" == codeString) return ONHOLD
//            if ("completed" == codeString) return COMPLETED
//            if ("cancelled" == codeString) return CANCELLED
//            if ("stopped" == codeString) return STOPPED
//            if ("unknown" == codeString) return UNKNOWN
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown CarePlanActivityStatus code '$codeString'")
//        }
//    }
}


@Serializable
enum class ContactPointSystem : CodeableEnumeration {

    /**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    PHONE,

    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    FAX,

    /**
     * The value is an email address.
     */
    EMAIL,

    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.
     */
    PAGER,

    /**
     * A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses.
     */
    URL,

    /**
     * A contact that can be used for sending an sms message (e.g. mobile phones, some landlines).
     */
    SMS,

    /**
     * A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish "other" contact types.
     */
    OTHER,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PHONE -> "phone"
            FAX -> "fax"
            EMAIL -> "email"
            PAGER -> "pager"
            URL -> "url"
            SMS -> "sms"
            OTHER -> "other"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            PHONE -> "http://hl7.org/fhir/contact-point-system"
            FAX -> "http://hl7.org/fhir/contact-point-system"
            EMAIL -> "http://hl7.org/fhir/contact-point-system"
            PAGER -> "http://hl7.org/fhir/contact-point-system"
            URL -> "http://hl7.org/fhir/contact-point-system"
            SMS -> "http://hl7.org/fhir/contact-point-system"
            OTHER -> "http://hl7.org/fhir/contact-point-system"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            PHONE -> "The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required."
            FAX -> "The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required."
            EMAIL -> "The value is an email address."
            PAGER -> "The value is a pager number. These may be local pager numbers that are only usable on a particular pager system."
            URL -> "A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses."
            SMS -> "A contact that can be used for sending an sms message (e.g. mobile phones, some landlines)."
            OTHER -> "A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish \"other\" contact types."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            PHONE -> "Phone"
            FAX -> "Fax"
            EMAIL -> "Email"
            PAGER -> "Pager"
            URL -> "URL"
            SMS -> "SMS"
            OTHER -> "Other"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): ContactPointSystem? {
//                if (codeString == null || "" == codeString) return null
//                if ("phone" == codeString) return PHONE
//                if ("fax" == codeString) return FAX
//                if ("email" == codeString) return EMAIL
//                if ("pager" == codeString) return PAGER
//                if ("url" == codeString) return URL
//                if ("sms" == codeString) return SMS
//                if ("other" == codeString) return OTHER
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown ContactPointSystem code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class ContactPointUse : CodeableEnumeration {

    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    HOME,

    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    WORK,

    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    TEMP,

    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    OLD,

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    MOBILE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            HOME -> "home"
            WORK -> "work"
            TEMP -> "temp"
            OLD -> "old"
            MOBILE -> "mobile"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            HOME -> "http://hl7.org/fhir/contact-point-use"
            WORK -> "http://hl7.org/fhir/contact-point-use"
            TEMP -> "http://hl7.org/fhir/contact-point-use"
            OLD -> "http://hl7.org/fhir/contact-point-use"
            MOBILE -> "http://hl7.org/fhir/contact-point-use"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            HOME -> "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available."
            WORK -> "An office contact point. First choice for business related contacts during business hours."
            TEMP -> "A temporary contact point. The period can provide more detailed information."
            OLD -> "This contact point is no longer in use (or was never correct, but retained for records)."
            MOBILE -> "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            HOME -> "Home"
            WORK -> "Work"
            TEMP -> "Temp"
            OLD -> "Old"
            MOBILE -> "Mobile"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): ContactPointUse? {
//                if (codeString == null || "" == codeString) return null
//                if ("home" == codeString) return HOME
//                if ("work" == codeString) return WORK
//                if ("temp" == codeString) return TEMP
//                if ("old" == codeString) return OLD
//                if ("mobile" == codeString) return MOBILE
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown ContactPointUse code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class DayOfWeek : CodeableEnumeration {
    /**
     * Monday.
     */
    MON,

    /**
     * Tuesday.
     */
    TUE,

    /**
     * Wednesday.
     */
    WED,

    /**
     * Thursday.
     */
    THU,

    /**
     * Friday.
     */
    FRI,

    /**
     * Saturday.
     */
    SAT,

    /**
     * Sunday.
     */
    SUN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            MON -> "mon"
            TUE -> "tue"
            WED -> "wed"
            THU -> "thu"
            FRI -> "fri"
            SAT -> "sat"
            SUN -> "sun"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            MON -> "http://hl7.org/fhir/days-of-week"
            TUE -> "http://hl7.org/fhir/days-of-week"
            WED -> "http://hl7.org/fhir/days-of-week"
            THU -> "http://hl7.org/fhir/days-of-week"
            FRI -> "http://hl7.org/fhir/days-of-week"
            SAT -> "http://hl7.org/fhir/days-of-week"
            SUN -> "http://hl7.org/fhir/days-of-week"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            MON -> "Monday."
            TUE -> "Tuesday."
            WED -> "Wednesday."
            THU -> "Thursday."
            FRI -> "Friday."
            SAT -> "Saturday."
            SUN -> "Sunday."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            MON -> "Monday"
            TUE -> "Tuesday"
            WED -> "Wednesday"
            THU -> "Thursday"
            FRI -> "Friday"
            SAT -> "Saturday"
            SUN -> "Sunday"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): DayOfWeek? {
//                if (codeString == null || "" == codeString) return null
//                if ("mon" == codeString) return MON
//                if ("tue" == codeString) return TUE
//                if ("wed" == codeString) return WED
//                if ("thu" == codeString) return THU
//                if ("fri" == codeString) return FRI
//                if ("sat" == codeString) return SAT
//                if ("sun" == codeString) return SUN
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown DayOfWeek code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class DaysOfWeek : CodeableEnumeration {
    /**
     * Monday.
     */
    MON,

    /**
     * Tuesday.
     */
    TUE,

    /**
     * Wednesday.
     */
    WED,

    /**
     * Thursday.
     */
    THU,

    /**
     * Friday.
     */
    FRI,

    /**
     * Saturday.
     */
    SAT,

    /**
     * Sunday.
     */
    SUN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            MON -> "mon"
            TUE -> "tue"
            WED -> "wed"
            THU -> "thu"
            FRI -> "fri"
            SAT -> "sat"
            SUN -> "sun"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            MON -> "http://hl7.org/fhir/days-of-week"
            TUE -> "http://hl7.org/fhir/days-of-week"
            WED -> "http://hl7.org/fhir/days-of-week"
            THU -> "http://hl7.org/fhir/days-of-week"
            FRI -> "http://hl7.org/fhir/days-of-week"
            SAT -> "http://hl7.org/fhir/days-of-week"
            SUN -> "http://hl7.org/fhir/days-of-week"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            MON -> "Monday."
            TUE -> "Tuesday."
            WED -> "Wednesday."
            THU -> "Thursday."
            FRI -> "Friday."
            SAT -> "Saturday."
            SUN -> "Sunday."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            MON -> "Monday"
            TUE -> "Tuesday"
            WED -> "Wednesday"
            THU -> "Thursday"
            FRI -> "Friday"
            SAT -> "Saturday"
            SUN -> "Sunday"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): DaysOfWeek? {
//            if (codeString == null || "" == codeString) return null
//            if ("mon" == codeString) return MON
//            if ("tue" == codeString) return TUE
//            if ("wed" == codeString) return WED
//            if ("thu" == codeString) return THU
//            if ("fri" == codeString) return FRI
//            if ("sat" == codeString) return SAT
//            if ("sun" == codeString) return SUN
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown DaysOfWeek code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class EventTiming : CodeableEnumeration {
    /**
     * Event occurs during the morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    MORN,

    /**
     * Event occurs during the early morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    MORN_EARLY,

    /**
     * Event occurs during the late morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    MORN_LATE,

    /**
     * Event occurs around 12:00pm. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    NOON,

    /**
     * Event occurs during the afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    AFT,

    /**
     * Event occurs during the early afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    AFT_EARLY,

    /**
     * Event occurs during the late afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    AFT_LATE,

    /**
     * Event occurs during the evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    EVE,

    /**
     * Event occurs during the early evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    EVE_EARLY,

    /**
     * Event occurs during the late evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    EVE_LATE,

    /**
     * Event occurs during the night. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    NIGHT,

    /**
     * Event occurs [offset] after subject goes to sleep. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    PHS,

    /**
     * null
     */
    HS,

    /**
     * null
     */
    WAKE,

    /**
     * null
     */
    C,

    /**
     * null
     */
    CM,

    /**
     * null
     */
    CD,

    /**
     * null
     */
    CV,

    /**
     * null
     */
    AC,

    /**
     * null
     */
    ACM,

    /**
     * null
     */
    ACD,

    /**
     * null
     */
    ACV,

    /**
     * null
     */
    PC,

    /**
     * null
     */
    PCM,

    /**
     * null
     */
    PCD,

    /**
     * null
     */
    PCV,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            MORN -> "MORN"
            MORN_EARLY -> "MORN.early"
            MORN_LATE -> "MORN.late"
            NOON -> "NOON"
            AFT -> "AFT"
            AFT_EARLY -> "AFT.early"
            AFT_LATE -> "AFT.late"
            EVE -> "EVE"
            EVE_EARLY -> "EVE.early"
            EVE_LATE -> "EVE.late"
            NIGHT -> "NIGHT"
            PHS -> "PHS"
            HS -> "HS"
            WAKE -> "WAKE"
            C -> "C"
            CM -> "CM"
            CD -> "CD"
            CV -> "CV"
            AC -> "AC"
            ACM -> "ACM"
            ACD -> "ACD"
            ACV -> "ACV"
            PC -> "PC"
            PCM -> "PCM"
            PCD -> "PCD"
            PCV -> "PCV"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            MORN -> "http://hl7.org/fhir/event-timing"
            MORN_EARLY -> "http://hl7.org/fhir/event-timing"
            MORN_LATE -> "http://hl7.org/fhir/event-timing"
            NOON -> "http://hl7.org/fhir/event-timing"
            AFT -> "http://hl7.org/fhir/event-timing"
            AFT_EARLY -> "http://hl7.org/fhir/event-timing"
            AFT_LATE -> "http://hl7.org/fhir/event-timing"
            EVE -> "http://hl7.org/fhir/event-timing"
            EVE_EARLY -> "http://hl7.org/fhir/event-timing"
            EVE_LATE -> "http://hl7.org/fhir/event-timing"
            NIGHT -> "http://hl7.org/fhir/event-timing"
            PHS -> "http://hl7.org/fhir/event-timing"
            HS -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            WAKE -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            C -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            CM -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            CD -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            CV -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            AC -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            ACM -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            ACD -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            ACV -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            PC -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            PCM -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            PCD -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            PCV -> "http://terminology.hl7.org/CodeSystem/v3-TimingEvent"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            MORN -> "Event occurs during the morning. The exact time is unspecified and established by institution convention or patient interpretation."
            MORN_EARLY -> "Event occurs during the early morning. The exact time is unspecified and established by institution convention or patient interpretation."
            MORN_LATE -> "Event occurs during the late morning. The exact time is unspecified and established by institution convention or patient interpretation."
            NOON -> "Event occurs around 12:00pm. The exact time is unspecified and established by institution convention or patient interpretation."
            AFT -> "Event occurs during the afternoon. The exact time is unspecified and established by institution convention or patient interpretation."
            AFT_EARLY -> "Event occurs during the early afternoon. The exact time is unspecified and established by institution convention or patient interpretation."
            AFT_LATE -> "Event occurs during the late afternoon. The exact time is unspecified and established by institution convention or patient interpretation."
            EVE -> "Event occurs during the evening. The exact time is unspecified and established by institution convention or patient interpretation."
            EVE_EARLY -> "Event occurs during the early evening. The exact time is unspecified and established by institution convention or patient interpretation."
            EVE_LATE -> "Event occurs during the late evening. The exact time is unspecified and established by institution convention or patient interpretation."
            NIGHT -> "Event occurs during the night. The exact time is unspecified and established by institution convention or patient interpretation."
            PHS -> "Event occurs [offset] after subject goes to sleep. The exact time is unspecified and established by institution convention or patient interpretation."
            HS -> ""
            WAKE -> ""
            C -> ""
            CM -> ""
            CD -> ""
            CV -> ""
            AC -> ""
            ACM -> ""
            ACD -> ""
            ACV -> ""
            PC -> ""
            PCM -> ""
            PCD -> ""
            PCV -> ""
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            MORN -> "Morning"
            MORN_EARLY -> "Early Morning"
            MORN_LATE -> "Late Morning"
            NOON -> "Noon"
            AFT -> "Afternoon"
            AFT_EARLY -> "Early Afternoon"
            AFT_LATE -> "Late Afternoon"
            EVE -> "Evening"
            EVE_EARLY -> "Early Evening"
            EVE_LATE -> "Late Evening"
            NIGHT -> "Night"
            PHS -> "After Sleep"
            HS -> "HS"
            WAKE -> "WAKE"
            C -> "C"
            CM -> "CM"
            CD -> "CD"
            CV -> "CV"
            AC -> "AC"
            ACM -> "ACM"
            ACD -> "ACD"
            ACV -> "ACV"
            PC -> "PC"
            PCM -> "PCM"
            PCD -> "PCD"
            PCV -> "PCV"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): EventTiming? {
//                if (codeString == null || "" == codeString) return null
//                if ("MORN" == codeString) return MORN
//                if ("MORN.early" == codeString) return MORN_EARLY
//                if ("MORN.late" == codeString) return MORN_LATE
//                if ("NOON" == codeString) return NOON
//                if ("AFT" == codeString) return AFT
//                if ("AFT.early" == codeString) return AFT_EARLY
//                if ("AFT.late" == codeString) return AFT_LATE
//                if ("EVE" == codeString) return EVE
//                if ("EVE.early" == codeString) return EVE_EARLY
//                if ("EVE.late" == codeString) return EVE_LATE
//                if ("NIGHT" == codeString) return NIGHT
//                if ("PHS" == codeString) return PHS
//                if ("HS" == codeString) return HS
//                if ("WAKE" == codeString) return WAKE
//                if ("C" == codeString) return C
//                if ("CM" == codeString) return CM
//                if ("CD" == codeString) return CD
//                if ("CV" == codeString) return CV
//                if ("AC" == codeString) return AC
//                if ("ACM" == codeString) return ACM
//                if ("ACD" == codeString) return ACD
//                if ("ACV" == codeString) return ACV
//                if ("PC" == codeString) return PC
//                if ("PCM" == codeString) return PCM
//                if ("PCD" == codeString) return PCD
//                if ("PCV" == codeString) return PCV
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown EventTiming code '$codeString'"
//                )
//            }
//        }
}

@Serializable
enum class EncounterStatus : CodeableEnumeration {
    /**
     * The Encounter has not yet started.
     */
    PLANNED,

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     */
    ARRIVED,

    /**
     * The patient has been assessed for the priority of their treatment based on the severity of their condition.
     */
    TRIAGED,

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     */
    INPROGRESS,

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     */
    ONLEAVE,

    /**
     * The Encounter has ended.
     */
    FINISHED,

    /**
     * The Encounter has ended before it has begun.
     */
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    ENTEREDINERROR,

    /**
     * The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    UNKNOWN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PLANNED -> "planned"
            ARRIVED -> "arrived"
            TRIAGED -> "triaged"
            INPROGRESS -> "in-progress"
            ONLEAVE -> "onleave"
            FINISHED -> "finished"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            PLANNED -> "http://hl7.org/fhir/encounter-status"
            ARRIVED -> "http://hl7.org/fhir/encounter-status"
            TRIAGED -> "http://hl7.org/fhir/encounter-status"
            INPROGRESS -> "http://hl7.org/fhir/encounter-status"
            ONLEAVE -> "http://hl7.org/fhir/encounter-status"
            FINISHED -> "http://hl7.org/fhir/encounter-status"
            CANCELLED -> "http://hl7.org/fhir/encounter-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/encounter-status"
            UNKNOWN -> "http://hl7.org/fhir/encounter-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            PLANNED -> "The Encounter has not yet started."
            ARRIVED -> "The Patient is present for the encounter, however is not currently meeting with a practitioner."
            TRIAGED -> "The patient has been assessed for the priority of their treatment based on the severity of their condition."
            INPROGRESS -> "The Encounter has begun and the patient is present / the practitioner and the patient are meeting."
            ONLEAVE -> "The Encounter has begun, but the patient is temporarily on leave."
            FINISHED -> "The Encounter has ended."
            CANCELLED -> "The Encounter has ended before it has begun."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            UNKNOWN -> "The encounter status is unknown. Note that \"unknown\" is a value of last resort and every attempt should be made to provide a meaningful value other than \"unknown\"."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            PLANNED -> "Planned"
            ARRIVED -> "Arrived"
            TRIAGED -> "Triaged"
            INPROGRESS -> "In Progress"
            ONLEAVE -> "On Leave"
            FINISHED -> "Finished"
            CANCELLED -> "Cancelled"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): EncounterStatus? {
//                if (codeString == null || "" == codeString) return null
//                if ("planned" == codeString) return PLANNED
//                if ("arrived" == codeString) return ARRIVED
//                if ("triaged" == codeString) return TRIAGED
//                if ("in-progress" == codeString) return INPROGRESS
//                if ("onleave" == codeString) return ONLEAVE
//                if ("finished" == codeString) return FINISHED
//                if ("cancelled" == codeString) return CANCELLED
//                if ("entered-in-error" == codeString) return ENTEREDINERROR
//                if ("unknown" == codeString) return UNKNOWN
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown EncounterStatus code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class EncounterLocationStatus : CodeableEnumeration {
    /**
     * The patient is planned to be moved to this location at some point in the future.
     */
    PLANNED,

    /**
     * The patient is currently at this location, or was between the period specified.
     *
     * A system may update these records when the patient leaves the location to either reserved, or completed.
     */
    ACTIVE,

    /**
     * This location is held empty for this patient.
     */
    RESERVED,

    /**
     * The patient was at this location during the period specified.
     *
     * Not to be used when the patient is currently at the location.
     */
    COMPLETED,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            PLANNED -> "planned"
            ACTIVE -> "active"
            RESERVED -> "reserved"
            COMPLETED -> "completed"
            NULL -> null
        }
    }


    override val system: String?
        get() = when (this) {
            PLANNED -> "http://hl7.org/fhir/encounter-location-status"
            ACTIVE -> "http://hl7.org/fhir/encounter-location-status"
            RESERVED -> "http://hl7.org/fhir/encounter-location-status"
            COMPLETED -> "http://hl7.org/fhir/encounter-location-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            PLANNED -> "The patient is planned to be moved to this location at some point in the future."
            ACTIVE -> "The patient is currently at this location, or was between the period specified.\r\rA system may update these records when the patient leaves the location to either reserved, or completed."
            RESERVED -> "This location is held empty for this patient."
            COMPLETED -> "The patient was at this location during the period specified.\r\rNot to be used when the patient is currently at the location."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            PLANNED -> "Planned"
            ACTIVE -> "Active"
            RESERVED -> "Reserved"
            COMPLETED -> "Completed"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): EncounterLocationStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("planned" == codeString) return PLANNED
//            if ("active" == codeString) return ACTIVE
//            if ("reserved" == codeString) return RESERVED
//            if ("completed" == codeString) return COMPLETED
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown EncounterLocationStatus code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class EndpointStatus : CodeableEnumeration {
    /**
     * This endpoint is expected to be active and can be used.
     */
    ACTIVE,

    /**
     * This endpoint is temporarily unavailable.
     */
    SUSPENDED,

    /**
     * This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken.
     */
    ERROR,

    /**
     * This endpoint is no longer to be used.
     */
    OFF,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    ENTEREDINERROR,

    /**
     * This endpoint is not intended for production usage.
     */
    TEST,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            ACTIVE -> "active"
            SUSPENDED -> "suspended"
            ERROR -> "error"
            OFF -> "off"
            ENTEREDINERROR -> "entered-in-error"
            TEST -> "test"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/endpoint-status"
            SUSPENDED -> "http://hl7.org/fhir/endpoint-status"
            ERROR -> "http://hl7.org/fhir/endpoint-status"
            OFF -> "http://hl7.org/fhir/endpoint-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/endpoint-status"
            TEST -> "http://hl7.org/fhir/endpoint-status"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            ACTIVE -> "This endpoint is expected to be active and can be used."
            SUSPENDED -> "This endpoint is temporarily unavailable."
            ERROR -> "This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken."
            OFF -> "This endpoint is no longer to be used."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            TEST -> "This endpoint is not intended for production usage."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            SUSPENDED -> "Suspended"
            ERROR -> "Error"
            OFF -> "Off"
            ENTEREDINERROR -> "Entered in error"
            TEST -> "Test"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): EndpointStatus? {
//                if (codeString == null || "" == codeString) return null
//                if ("active" == codeString) return ACTIVE
//                if ("suspended" == codeString) return SUSPENDED
//                if ("error" == codeString) return ERROR
//                if ("off" == codeString) return OFF
//                if ("entered-in-error" == codeString) return ENTEREDINERROR
//                if ("test" == codeString) return TEST
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown EndpointStatus code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class EpisodeOfCareStatus : CodeableEnumeration {
    /**
     * This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services.
     */
    PLANNED,

    /**
     * This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    WAITLIST,

    /**
     * This episode of care is current.
     */
    ACTIVE,

    /**
     * This episode of care is on hold; the organization has limited responsibility for the patient (such as while on respite).
     */
    ONHOLD,

    /**
     * This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as "closed", "completed" or other similar terms.
     */
    FINISHED,

    /**
     * The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.
     */
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    ENTEREDINERROR,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PLANNED -> "planned"
            WAITLIST -> "waitlist"
            ACTIVE -> "active"
            ONHOLD -> "onhold"
            FINISHED -> "finished"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            PLANNED -> "http://hl7.org/fhir/episode-of-care-status"
            WAITLIST -> "http://hl7.org/fhir/episode-of-care-status"
            ACTIVE -> "http://hl7.org/fhir/episode-of-care-status"
            ONHOLD -> "http://hl7.org/fhir/episode-of-care-status"
            FINISHED -> "http://hl7.org/fhir/episode-of-care-status"
            CANCELLED -> "http://hl7.org/fhir/episode-of-care-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/episode-of-care-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            PLANNED -> "This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services."
            WAITLIST -> "This episode has been placed on a waitlist, pending the episode being made active (or cancelled)."
            ACTIVE -> "This episode of care is current."
            ONHOLD -> "This episode of care is on hold; the organization has limited responsibility for the patient (such as while on respite)."
            FINISHED -> "This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as \"closed\", \"completed\" or other similar terms."
            CANCELLED -> "The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            PLANNED -> "Planned"
            WAITLIST -> "Waitlist"
            ACTIVE -> "Active"
            ONHOLD -> "On Hold"
            FINISHED -> "Finished"
            CANCELLED -> "Cancelled"
            ENTEREDINERROR -> "Entered in Error"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): EpisodeOfCareStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("planned" == codeString) return PLANNED
//            if ("waitlist" == codeString) return WAITLIST
//            if ("active" == codeString) return ACTIVE
//            if ("onhold" == codeString) return ONHOLD
//            if ("finished" == codeString) return FINISHED
//            if ("cancelled" == codeString) return CANCELLED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown EpisodeOfCareStatus code '$codeString'"
//            )
//        }s
//    }
}


@Serializable
enum class ExpressionLanguage : CodeableEnumeration {

    /**
     * Clinical Quality Language.
     */
    TEXT_CQL,

    /**
     * FHIRPath.
     */
    TEXT_FHIRPATH,

    /**
     * FHIR's RESTful query syntax - typically independent of base URL.
     */
    APPLICATION_XFHIRQUERY,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            TEXT_CQL -> "text/cql"
            TEXT_FHIRPATH -> "text/fhirpath"
            APPLICATION_XFHIRQUERY -> "application/x-fhir-query"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            TEXT_CQL -> "http://hl7.org/fhir/expression-language"
            TEXT_FHIRPATH -> "http://hl7.org/fhir/expression-language"
            APPLICATION_XFHIRQUERY -> "http://hl7.org/fhir/expression-language"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            TEXT_CQL -> "Clinical Quality Language."
            TEXT_FHIRPATH -> "FHIRPath."
            APPLICATION_XFHIRQUERY -> "FHIR's RESTful query syntax - typically independent of base URL."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            TEXT_CQL -> "CQL"
            TEXT_FHIRPATH -> "FHIRPath"
            APPLICATION_XFHIRQUERY -> "FHIR Query"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): ExpressionLanguage? {
//                if (codeString == null || "" == codeString) return null
//                if ("text/cql" == codeString) return TEXT_CQL
//                if ("text/fhirpath" == codeString) return TEXT_FHIRPATH
//                if ("application/x-fhir-query" == codeString) return APPLICATION_XFHIRQUERY
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ExpressionLanguage code '$codeString'")
//            }
//        }
}


@Serializable
enum class FHIRSubstanceStatus : CodeableEnumeration {
    /**
     * The substance is considered for use or reference.
     */
    ACTIVE,

    /**
     * The substance is considered for reference, but not for use.
     */
    INACTIVE,

    /**
     * The substance was entered in error.
     */
    ENTEREDINERROR,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            ACTIVE -> "active"
            INACTIVE -> "inactive"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/substance-status"
            INACTIVE -> "http://hl7.org/fhir/substance-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/substance-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The substance is considered for use or reference."
            INACTIVE -> "The substance is considered for reference, but not for use."
            ENTEREDINERROR -> "The substance was entered in error."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            INACTIVE -> "Inactive"
            ENTEREDINERROR -> "Entered in Error"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): FHIRSubstanceStatus? {
//                if (codeString == null || "" == codeString) return null
//                if ("active" == codeString) return ACTIVE
//                if ("inactive" == codeString) return INACTIVE
//                if ("entered-in-error" == codeString) return ENTEREDINERROR
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown FHIRSubstanceStatus code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class FilterOperator : CodeableEnumeration {
    /**
     * The specified property of the code equals the provided value.
     */
    EQUAL,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).
     */
    ISA,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only).
     */
    DESCENDENTOF,

    /**
     * The specified property of the code does not have an is-a relationship with the provided value.
     */
    ISNOTA,

    /**
     * The specified property of the code  matches the regex specified in the provided value.
     */
    REGEX,

    /**
     * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
     */
    IN,

    /**
     * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
     */
    NOTIN,

    /**
     * Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).
     */
    GENERALIZES,

    /**
     * The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).
     */
    EXISTS,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            EQUAL -> "="
            ISA -> "is-a"
            DESCENDENTOF -> "descendent-of"
            ISNOTA -> "is-not-a"
            REGEX -> "regex"
            IN -> "in"
            NOTIN -> "not-in"
            GENERALIZES -> "generalizes"
            EXISTS -> "exists"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            EQUAL -> "http://hl7.org/fhir/filter-operator"
            ISA -> "http://hl7.org/fhir/filter-operator"
            DESCENDENTOF -> "http://hl7.org/fhir/filter-operator"
            ISNOTA -> "http://hl7.org/fhir/filter-operator"
            REGEX -> "http://hl7.org/fhir/filter-operator"
            IN -> "http://hl7.org/fhir/filter-operator"
            NOTIN -> "http://hl7.org/fhir/filter-operator"
            GENERALIZES -> "http://hl7.org/fhir/filter-operator"
            EXISTS -> "http://hl7.org/fhir/filter-operator"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            EQUAL -> "The specified property of the code equals the provided value."
            ISA -> "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self)."
            DESCENDENTOF -> "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only)."
            ISNOTA -> "The specified property of the code does not have an is-a relationship with the provided value."
            REGEX -> "The specified property of the code  matches the regex specified in the provided value."
            IN -> "The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list)."
            NOTIN -> "The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list)."
            GENERALIZES -> "Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self)."
            EXISTS -> "The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values)."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            EQUAL -> "Equals"
            ISA -> "Is A (by subsumption)"
            DESCENDENTOF -> "Descendent Of (by subsumption)"
            ISNOTA -> "Not (Is A) (by subsumption)"
            REGEX -> "Regular Expression"
            IN -> "In Set"
            NOTIN -> "Not in Set"
            GENERALIZES -> "Generalizes (by Subsumption)"
            EXISTS -> "Exists"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): FilterOperator? {
//            if (codeString == null || "" == codeString) return null
//            if ("=" == codeString) return EQUAL
//            if ("is-a" == codeString) return ISA
//            if ("descendent-of" == codeString) return DESCENDENTOF
//            if ("is-not-a" == codeString) return ISNOTA
//            if ("regex" == codeString) return REGEX
//            if ("in" == codeString) return IN
//            if ("not-in" == codeString) return NOTIN
//            if ("generalizes" == codeString) return GENERALIZES
//            if ("exists" == codeString) return EXISTS
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown FilterOperator code '$codeString'")
//        }
//    }
}


@Serializable
enum class IdentifierUse : CodeableEnumeration {

    /**
     * The identifier recommended for display and use in real-world interactions.
     */
    USUAL,

    /**
     * The identifier considered to be most trusted for the identification of this item. Sometimes also known as "primary" and "main". The determination of "official" is subjective and implementation guides often provide additional guidelines for use.
     */
    OFFICIAL,

    /**
     * A temporary identifier.
     */
    TEMP,

    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     */
    SECONDARY,

    /**
     * The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc.
     */
    OLD,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            USUAL -> "usual"
            OFFICIAL -> "official"
            TEMP -> "temp"
            SECONDARY -> "secondary"
            OLD -> "old"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            USUAL -> "http://hl7.org/fhir/identifier-use"
            OFFICIAL -> "http://hl7.org/fhir/identifier-use"
            TEMP -> "http://hl7.org/fhir/identifier-use"
            SECONDARY -> "http://hl7.org/fhir/identifier-use"
            OLD -> "http://hl7.org/fhir/identifier-use"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            USUAL -> "The identifier recommended for display and use in real-world interactions."
            OFFICIAL -> "The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use."
            TEMP -> "A temporary identifier."
            SECONDARY -> "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context."
            OLD -> "The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc."
            NULL -> null
        }
    override val display: String?
        get() = when (this) {
            USUAL -> "Usual"
            OFFICIAL -> "Official"
            TEMP -> "Temp"
            SECONDARY -> "Secondary"
            OLD -> "Old"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): IdentifierUse? {
//                if (codeString == null || "" == codeString) return null
//                if ("usual" == codeString) return USUAL
//                if ("official" == codeString) return OFFICIAL
//                if ("temp" == codeString) return TEMP
//                if ("secondary" == codeString) return SECONDARY
//                if ("old" == codeString) return OLD
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown IdentifierUse code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class LocationStatus : CodeableEnumeration {
    /**
     * The location is operational.
     */
    ACTIVE,

    /**
     * The location is temporarily closed.
     */
    SUSPENDED,

    /**
     * The location is no longer used.
     */
    INACTIVE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            ACTIVE -> "active"
            SUSPENDED -> "suspended"
            INACTIVE -> "inactive"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/location-status"
            SUSPENDED -> "http://hl7.org/fhir/location-status"
            INACTIVE -> "http://hl7.org/fhir/location-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The location is operational."
            SUSPENDED -> "The location is temporarily closed."
            INACTIVE -> "The location is no longer used."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            SUSPENDED -> "Suspended"
            INACTIVE -> "Inactive"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): LocationStatus? {
//                if (codeString == null || "" == codeString) return null
//                if ("active" == codeString) return ACTIVE
//                if ("suspended" == codeString) return SUSPENDED
//                if ("inactive" == codeString) return INACTIVE
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown LocationStatus code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class LocationMode : CodeableEnumeration {
    /**
     * The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).
     */
    INSTANCE,

    /**
     * The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).
     */
    KIND,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            INSTANCE -> "instance"
            KIND -> "kind"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            INSTANCE -> "http://hl7.org/fhir/location-mode"
            KIND -> "http://hl7.org/fhir/location-mode"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            INSTANCE -> "The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A)."
            KIND -> "The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.)."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            INSTANCE -> "Instance"
            KIND -> "Kind"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): LocationMode? {
//            if (codeString == null || "" == codeString) return null
//            if ("instance" == codeString) return INSTANCE
//            if ("kind" == codeString) return KIND
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown LocationMode code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class NameUse : CodeableEnumeration {
    /**
     * Known as/conventional/the one you normally use.
     */
    USUAL,

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     */
    OFFICIAL,

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     */
    TEMP,

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name.
     */
    NICKNAME,

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons).
     */
    ANONYMOUS,

    /**
     * This name is no longer in use (or was never correct, but retained for records).
     */
    OLD,

    /**
     * A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name.
     */
    MAIDEN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            USUAL -> "usual"
            OFFICIAL -> "official"
            TEMP -> "temp"
            NICKNAME -> "nickname"
            ANONYMOUS -> "anonymous"
            OLD -> "old"
            MAIDEN -> "maiden"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            USUAL -> "http://hl7.org/fhir/name-use"
            OFFICIAL -> "http://hl7.org/fhir/name-use"
            TEMP -> "http://hl7.org/fhir/name-use"
            NICKNAME -> "http://hl7.org/fhir/name-use"
            ANONYMOUS -> "http://hl7.org/fhir/name-use"
            OLD -> "http://hl7.org/fhir/name-use"
            MAIDEN -> "http://hl7.org/fhir/name-use"
            NULL -> null
        }
    override val definition: String?
        get() = when (this) {
            USUAL -> "Known as/conventional/the one you normally use."
            OFFICIAL -> "The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called \"legal name\"."
            TEMP -> "A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations."
            NICKNAME -> "A name that is used to address the person in an informal manner, but is not part of their formal or usual name."
            ANONYMOUS -> "Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)."
            OLD -> "This name is no longer in use (or was never correct, but retained for records)."
            MAIDEN -> "A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name."
            NULL -> null
        }
    override val display: String?
        get() = when (this) {
            USUAL -> "Usual"
            OFFICIAL -> "Official"
            TEMP -> "Temp"
            NICKNAME -> "Nickname"
            ANONYMOUS -> "Anonymous"
            OLD -> "Old"
            MAIDEN -> "Name changed for Marriage"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): NameUse? {
//                if (codeString == null || "" == codeString) return null
//                if ("usual" == codeString) return USUAL
//                if ("official" == codeString) return OFFICIAL
//                if ("temp" == codeString) return TEMP
//                if ("nickname" == codeString) return NICKNAME
//                if ("anonymous" == codeString) return ANONYMOUS
//                if ("old" == codeString) return OLD
//                if ("maiden" == codeString) return MAIDEN
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown NameUse code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class NarrativeStatus : CodeableEnumeration {
    /**
     * The contents of the narrative are entirely generated from the core elements in the content.
     */
    GENERATED,

    /**
     * The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions.
     */
    EXTENSIONS,

    /**
     * The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection.
     */
    ADDITIONAL,

    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case".
     */
    EMPTY,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            GENERATED -> "generated"
            EXTENSIONS -> "extensions"
            ADDITIONAL -> "additional"
            EMPTY -> "empty"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            GENERATED -> "http://hl7.org/fhir/narrative-status"
            EXTENSIONS -> "http://hl7.org/fhir/narrative-status"
            ADDITIONAL -> "http://hl7.org/fhir/narrative-status"
            EMPTY -> "http://hl7.org/fhir/narrative-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            GENERATED -> "The contents of the narrative are entirely generated from the core elements in the content."
            EXTENSIONS -> "The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions."
            ADDITIONAL -> "The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection."
            EMPTY -> "The contents of the narrative are some equivalent of \"No human-readable text provided in this case\"."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            GENERATED -> "Generated"
            EXTENSIONS -> "Extensions"
            ADDITIONAL -> "Additional"
            EMPTY -> "Empty"
            NULL -> null
        }

}


@Serializable
enum class ObservationDataType : CodeableEnumeration {
    /**
     * A measured amount.
     */
    QUANTITY,

    /**
     * A coded concept from a reference terminology and/or text.
     */
    CODEABLECONCEPT,

    /**
     * A sequence of Unicode characters.
     */
    STRING,

    /**
     * true or false.
     */
    BOOLEAN,

    /**
     * A signed integer.
     */
    INTEGER,

    /**
     * A set of values bounded by low and high.
     */
    RANGE,

    /**
     * A ratio of two Quantity values - a numerator and a denominator.
     */
    RATIO,

    /**
     * A series of measurements taken by a device.
     */
    SAMPLEDDATA,

    /**
     * A time during the day, in the format hh:mm:ss.
     */
    TIME,

    /**
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication.
     */
    DATETIME,

    /**
     * A time range defined by start and end date/time.
     */
    PERIOD,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            QUANTITY -> "Quantity"
            CODEABLECONCEPT -> "CodeableConcept"
            STRING -> "string"
            BOOLEAN -> "boolean"
            INTEGER -> "integer"
            RANGE -> "Range"
            RATIO -> "Ratio"
            SAMPLEDDATA -> "SampledData"
            TIME -> "time"
            DATETIME -> "dateTime"
            PERIOD -> "Period"
            NULL -> null
        }
    }


    override val system: String?
        get() = when (this) {
            QUANTITY -> "http://hl7.org/fhir/permitted-data-type"
            CODEABLECONCEPT -> "http://hl7.org/fhir/permitted-data-type"
            STRING -> "http://hl7.org/fhir/permitted-data-type"
            BOOLEAN -> "http://hl7.org/fhir/permitted-data-type"
            INTEGER -> "http://hl7.org/fhir/permitted-data-type"
            RANGE -> "http://hl7.org/fhir/permitted-data-type"
            RATIO -> "http://hl7.org/fhir/permitted-data-type"
            SAMPLEDDATA -> "http://hl7.org/fhir/permitted-data-type"
            TIME -> "http://hl7.org/fhir/permitted-data-type"
            DATETIME -> "http://hl7.org/fhir/permitted-data-type"
            PERIOD -> "http://hl7.org/fhir/permitted-data-type"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            QUANTITY -> "A measured amount."
            CODEABLECONCEPT -> "A coded concept from a reference terminology and/or text."
            STRING -> "A sequence of Unicode characters."
            BOOLEAN -> "true or false."
            INTEGER -> "A signed integer."
            RANGE -> "A set of values bounded by low and high."
            RATIO -> "A ratio of two Quantity values - a numerator and a denominator."
            SAMPLEDDATA -> "A series of measurements taken by a device."
            TIME -> "A time during the day, in the format hh:mm:ss."
            DATETIME -> "A date, date-time or partial date (e.g. just year or year + month) as used in human communication."
            PERIOD -> "A time range defined by start and end date/time."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            QUANTITY -> "Quantity"
            CODEABLECONCEPT -> "CodeableConcept"
            STRING -> "string"
            BOOLEAN -> "boolean"
            INTEGER -> "integer"
            RANGE -> "Range"
            RATIO -> "Ratio"
            SAMPLEDDATA -> "SampledData"
            TIME -> "time"
            DATETIME -> "dateTime"
            PERIOD -> "Period"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ObservationDataType? {
//            if (codeString == null || "" == codeString) return null
//            if ("Quantity" == codeString) return QUANTITY
//            if ("CodeableConcept" == codeString) return CODEABLECONCEPT
//            if ("string" == codeString) return STRING
//            if ("boolean" == codeString) return BOOLEAN
//            if ("integer" == codeString) return INTEGER
//            if ("Range" == codeString) return RANGE
//            if ("Ratio" == codeString) return RATIO
//            if ("SampledData" == codeString) return SAMPLEDDATA
//            if ("time" == codeString) return TIME
//            if ("dateTime" == codeString) return DATETIME
//            if ("Period" == codeString) return PERIOD
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ObservationDataType code '$codeString'")
//        }
//    }
}


@Serializable
enum class ObservationRangeCategory : CodeableEnumeration {
    /**
     * Reference (Normal) Range for Ordinal and Continuous Observations.
     */
    REFERENCE,

    /**
     * Critical Range for Ordinal and Continuous Observations.
     */
    CRITICAL,

    /**
     * Absolute Range for Ordinal and Continuous Observations. Results outside this range are not possible.
     */
    ABSOLUTE,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            REFERENCE -> "reference"
            CRITICAL -> "critical"
            ABSOLUTE -> "absolute"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            REFERENCE -> "http://hl7.org/fhir/observation-range-category"
            CRITICAL -> "http://hl7.org/fhir/observation-range-category"
            ABSOLUTE -> "http://hl7.org/fhir/observation-range-category"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            REFERENCE -> "Reference (Normal) Range for Ordinal and Continuous Observations."
            CRITICAL -> "Critical Range for Ordinal and Continuous Observations."
            ABSOLUTE -> "Absolute Range for Ordinal and Continuous Observations. Results outside this range are not possible."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            REFERENCE -> "reference range"
            CRITICAL -> "critical range"
            ABSOLUTE -> "absolute range"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ObservationRangeCategory? {
//            if (codeString == null || "" == codeString) return null
//            if ("reference" == codeString) return REFERENCE
//            if ("critical" == codeString) return CRITICAL
//            if ("absolute" == codeString) return ABSOLUTE
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown ObservationRangeCategory code '$codeString'")
//        }
//    }
}


@Serializable
enum class ObservationStatus : CodeableEnumeration {

    /**
     * The existence of the observation is registered, but there is no result yet available.
     */
    registered,

    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     */
    preliminary,

    /**
     * The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.
     */
    final,

    /**
     * Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
     */
    amended,

    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test result.
     */
    corrected,

    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    cancelled,

    /**
     * The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
     */
    `entered-in-error`,

    /**
     * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
     */
    unknown;


    override fun toCode(): String? {
        return when (this) {
            registered -> "registered"
            preliminary -> "preliminary"
            final -> "final"
            amended -> "amended"
            corrected -> "corrected"
            cancelled -> "cancelled"
            `entered-in-error` -> "entered-in-error"
            unknown -> "unknown"
        }
    }


    override val system: String? = "http://hl7.org/fhir/observation-status"


    override val definition: String?
        get() = when (this) {
            registered -> "The existence of the observation is registered, but there is no result yet available."
            preliminary -> "This is an initial or interim observation: data may be incomplete or unverified."
            final -> "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied."
            amended -> "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections."
            corrected -> "Subsequent to being Final, the observation has been modified to correct an error in the test result."
            cancelled -> "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\")."
            `entered-in-error` -> "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".)."
            unknown -> "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which."
        }


    override val display: String?
        get() = when (this) {
            registered -> "Registered"
            preliminary -> "Preliminary"
            final -> "Final"
            amended -> "Amended"
            corrected -> "Corrected"
            cancelled -> "Cancelled"
            `entered-in-error` -> "Entered in Error"
            unknown -> "Unknown"
        }

//
//    companion object {
//        fun fromCode(codeString: String?): ObservationStatus? {
//            return when (codeString) {
//                "registered" -> REGISTERED
//                "preliminary" -> PRELIMINARY
//                "final" -> FINAL
//                "amended" -> AMENDED
//                "corrected" -> CORRECTED
//                "cancelled" -> CANCELLED
//                "entered-in-error" -> ENTEREDINERROR
//                "unknown" -> UNKNOWN
//    //            }
//
//        }
//    }
}


@Serializable
enum class ProvenanceEntityRole : CodeableEnumeration {

    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.
     */
    DERIVATION,

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     */
    REVISION,

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who might or might not be its original author.
     */
    QUOTATION,

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     */
    SOURCE,

    /**
     * A derivation for which the entity is removed from accessibility usually through the use of the Delete operation.
     */
    REMOVAL,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            DERIVATION -> "derivation"
            REVISION -> "revision"
            QUOTATION -> "quotation"
            SOURCE -> "source"
            REMOVAL -> "removal"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            DERIVATION -> "http://hl7.org/fhir/provenance-entity-role"
            REVISION -> "http://hl7.org/fhir/provenance-entity-role"
            QUOTATION -> "http://hl7.org/fhir/provenance-entity-role"
            SOURCE -> "http://hl7.org/fhir/provenance-entity-role"
            REMOVAL -> "http://hl7.org/fhir/provenance-entity-role"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            DERIVATION -> "A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
            REVISION -> "A derivation for which the resulting entity is a revised version of some original."
            QUOTATION -> "The repeat of (some or all of) an entity, such as text or image, by someone who might or might not be its original author."
            SOURCE -> "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight."
            REMOVAL -> "A derivation for which the entity is removed from accessibility usually through the use of the Delete operation."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            DERIVATION -> "Derivation"
            REVISION -> "Revision"
            QUOTATION -> "Quotation"
            SOURCE -> "Source"
            REMOVAL -> "Removal"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ProvenanceEntityRole? {
//            if (codeString == null || "" == codeString) return null
//            if ("derivation" == codeString) return DERIVATION
//            if ("revision" == codeString) return REVISION
//            if ("quotation" == codeString) return QUOTATION
//            if ("source" == codeString) return SOURCE
//            if ("removal" == codeString) return REMOVAL
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown ProvenanceEntityRole code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class PublicationStatus : CodeableEnumeration {
    /**
     * This resource is still under development and is not yet considered to be ready for normal use.
     */
    DRAFT,

    /**
     * This resource is ready for normal use.
     */
    ACTIVE,

    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    RETIRED,

    /**
     * The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    UNKNOWN,

    /**
     * added to help the parsers
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            DRAFT -> "draft"
            ACTIVE -> "active"
            RETIRED -> "retired"
            UNKNOWN -> "unknown"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            DRAFT -> "http://hl7.org/fhir/publication-status"
            ACTIVE -> "http://hl7.org/fhir/publication-status"
            RETIRED -> "http://hl7.org/fhir/publication-status"
            UNKNOWN -> "http://hl7.org/fhir/publication-status"
            NULL -> null
        }

    override val definition: String?
        get() {
            return when (this) {
                DRAFT -> "This resource is still under development and is not yet considered to be ready for normal use."
                ACTIVE -> "This resource is ready for normal use."
                RETIRED -> "This resource has been withdrawn or superseded and should no longer be used."
                UNKNOWN -> "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                DRAFT -> "Draft"
                ACTIVE -> "Active"
                RETIRED -> "Retired"
                UNKNOWN -> "Unknown"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): PublicationStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("draft" == codeString) return DRAFT
//            if ("active" == codeString) return ACTIVE
//            if ("retired" == codeString) return RETIRED
//            if ("unknown" == codeString) return UNKNOWN
//            throw FHIRException("Unknown PublicationStatus code '$codeString'")
//        }
//    }
}


@Serializable
enum class QuantityComparator : CodeableEnumeration {

    /**
     * The actual value is less than the given value.
     */
    LESS_THAN,

    /**
     * The actual value is less than or equal to the given value.
     */
    LESS_OR_EQUAL,

    /**
     * The actual value is greater than or equal to the given value.
     */
    GREATER_OR_EQUAL,

    /**
     * The actual value is greater than the given value.
     */
    GREATER_THAN,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            LESS_THAN -> "<"
            LESS_OR_EQUAL -> "<="
            GREATER_OR_EQUAL -> ">="
            GREATER_THAN -> ">"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            LESS_THAN -> "http://hl7.org/fhir/quantity-comparator"
            LESS_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
            GREATER_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
            GREATER_THAN -> "http://hl7.org/fhir/quantity-comparator"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            LESS_THAN -> "The actual value is less than the given value."
            LESS_OR_EQUAL -> "The actual value is less than or equal to the given value."
            GREATER_OR_EQUAL -> "The actual value is greater than or equal to the given value."
            GREATER_THAN -> "The actual value is greater than the given value."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            LESS_THAN -> "Less than"
            LESS_OR_EQUAL -> "Less or Equal to"
            GREATER_OR_EQUAL -> "Greater or Equal to"
            GREATER_THAN -> "Greater than"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): QuantityComparator? {
//                if (codeString == null || "" == codeString) return null
//                if ("<" == codeString) return LESS_THAN
//                if ("<=" == codeString) return LESS_OR_EQUAL
//                if (">=" == codeString) return GREATER_OR_EQUAL
//                if (">" == codeString) return GREATER_THAN
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown QuantityComparator code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class RelatedArtifactType : CodeableEnumeration {
    /**
     * Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness.
     */
    DOCUMENTATION,

    /**
     * A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.
     */
    JUSTIFICATION,

    /**
     * Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource.
     */
    CITATION,

    /**
     * The previous version of the knowledge resource.
     */
    PREDECESSOR,

    /**
     * The next version of the knowledge resource.
     */
    SUCCESSOR,

    /**
     * The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting.
     */
    DERIVEDFROM,

    /**
     * The knowledge resource depends on the given related artifact.
     */
    DEPENDSON,

    /**
     * The knowledge resource is composed of the given related artifact.
     */
    COMPOSEDOF,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            DOCUMENTATION -> "documentation"
            JUSTIFICATION -> "justification"
            CITATION -> "citation"
            PREDECESSOR -> "predecessor"
            SUCCESSOR -> "successor"
            DERIVEDFROM -> "derived-from"
            DEPENDSON -> "depends-on"
            COMPOSEDOF -> "composed-of"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            DOCUMENTATION -> "http://hl7.org/fhir/related-artifact-type"
            JUSTIFICATION -> "http://hl7.org/fhir/related-artifact-type"
            CITATION -> "http://hl7.org/fhir/related-artifact-type"
            PREDECESSOR -> "http://hl7.org/fhir/related-artifact-type"
            SUCCESSOR -> "http://hl7.org/fhir/related-artifact-type"
            DERIVEDFROM -> "http://hl7.org/fhir/related-artifact-type"
            DEPENDSON -> "http://hl7.org/fhir/related-artifact-type"
            COMPOSEDOF -> "http://hl7.org/fhir/related-artifact-type"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            DOCUMENTATION -> "Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness."
            JUSTIFICATION -> "A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource."
            CITATION -> "Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource."
            PREDECESSOR -> "The previous version of the knowledge resource."
            SUCCESSOR -> "The next version of the knowledge resource."
            DERIVEDFROM -> "The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting."
            DEPENDSON -> "The knowledge resource depends on the given related artifact."
            COMPOSEDOF -> "The knowledge resource is composed of the given related artifact."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            DOCUMENTATION -> "Documentation"
            JUSTIFICATION -> "Justification"
            CITATION -> "Citation"
            PREDECESSOR -> "Predecessor"
            SUCCESSOR -> "Successor"
            DERIVEDFROM -> "Derived From"
            DEPENDSON -> "Depends On"
            COMPOSEDOF -> "Composed Of"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): RelatedArtifactType? {
//            if (codeString == null || "" == codeString) return null
//            if ("documentation" == codeString) return DOCUMENTATION
//            if ("justification" == codeString) return JUSTIFICATION
//            if ("citation" == codeString) return CITATION
//            if ("predecessor" == codeString) return PREDECESSOR
//            if ("successor" == codeString) return SUCCESSOR
//            if ("derived-from" == codeString) return DERIVEDFROM
//            if ("depends-on" == codeString) return DEPENDSON
//            if ("composed-of" == codeString) return COMPOSEDOF
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown RelatedArtifactType code '$codeString'")
//        }
//    }
}


@Serializable
enum class ResourceType {

    Account,
    ActivityDefinition,
    AdverseEvent,
    AllergyIntolerance,
    Appointment,
    AppointmentResponse,
    AuditEvent,
    Basic,
    Binary,
    BiologicallyDerivedProduct,
    BodyStructure,
    Bundle,
    CapabilityStatement,
    CarePlan,
    CareTeam,
    CatalogEntry,
    ChargeItem,
    ChargeItemDefinition,
    Claim,
    ClaimResponse,
    ClinicalImpression,
    CodeSystem,
    Communication,
    CommunicationRequest,
    CompartmentDefinition,
    Composition,
    ConceptMap,
    Condition,
    Consent,
    Contract,
    Coverage,
    CoverageEligibilityRequest,
    CoverageEligibilityResponse,
    DetectedIssue,
    Device,
    DeviceDefinition,
    DeviceMetric,
    DeviceRequest,
    DeviceUseStatement,
    DiagnosticReport,
    DocumentManifest,
    DocumentReference,
    EffectEvidenceSynthesis,
    Encounter,
    Endpoint,
    EnrollmentRequest,
    EnrollmentResponse,
    EpisodeOfCare,
    EventDefinition,
    Evidence,
    EvidenceVariable,
    ExampleScenario,
    ExplanationOfBenefit,
    FamilyMemberHistory,
    Flag,
    Goal,
    GraphDefinition,
    Group,
    GuidanceResponse,
    HealthcareService,
    ImagingStudy,
    Immunization,
    ImmunizationEvaluation,
    ImmunizationRecommendation,
    ImplementationGuide,
    InsurancePlan,
    Invoice,
    Library,
    Linkage,
    List,
    Location,
    Measure,
    MeasureReport,
    Media,
    Medication,
    MedicationAdministration,
    MedicationDispense,
    MedicationKnowledge,
    MedicationRequest,
    MedicationStatement,
    MedicinalProduct,
    MedicinalProductAuthorization,
    MedicinalProductContraindication,
    MedicinalProductIndication,
    MedicinalProductIngredient,
    MedicinalProductInteraction,
    MedicinalProductManufactured,
    MedicinalProductPackaged,
    MedicinalProductPharmaceutical,
    MedicinalProductUndesirableEffect,
    MessageDefinition,
    MessageHeader,
    MolecularSequence,
    NamingSystem,
    NutritionOrder,
    Observation,
    ObservationDefinition,
    OperationDefinition,
    OperationOutcome,
    Organization,
    OrganizationAffiliation,
    Parameters,
    Patient,
    PaymentNotice,
    PaymentReconciliation,
    Person,
    PlanDefinition,
    Practitioner,
    PractitionerRole,
    Procedure,
    Provenance,
    Questionnaire,
    QuestionnaireResponse,
    RelatedPerson,
    RequestGroup,
    ResearchDefinition,
    ResearchElementDefinition,
    ResearchStudy,
    ResearchSubject,
    RiskAssessment,
    RiskEvidenceSynthesis,
    Schedule,
    SearchParameter,
    ServiceRequest,
    Slot,
    Specimen,
    SpecimenDefinition,
    StructureDefinition,
    StructureMap,
    Subscription,
    Substance,
    SubstanceNucleicAcid,
    SubstancePolymer,
    SubstanceProtein,
    SubstanceReferenceInformation,
    SubstanceSourceMaterial,
    SubstanceSpecification,
    SupplyDelivery,
    SupplyRequest,
    Task,
    TerminologyCapabilities,
    TestReport,
    TestScript,
    ValueSet,
    VerificationResult,
    VisionPrescription;



    val path: String
        get() {
            return when (this) {
                Account -> "account"
                ActivityDefinition -> "activitydefinition"
                AdverseEvent -> "adverseevent"
                AllergyIntolerance -> "allergyintolerance"
                Appointment -> "appointment"
                AppointmentResponse -> "appointmentresponse"
                AuditEvent -> "auditevent"
                Basic -> "basic"
                Binary -> "binary"
                BiologicallyDerivedProduct -> "biologicallyderivedproduct"
                BodyStructure -> "bodystructure"
                Bundle -> "bundle"
                CapabilityStatement -> "capabilitystatement"
                CarePlan -> "careplan"
                CareTeam -> "careteam"
                CatalogEntry -> "catalogentry"
                ChargeItem -> "chargeitem"
                ChargeItemDefinition -> "chargeitemdefinition"
                Claim -> "claim"
                ClaimResponse -> "claimresponse"
                ClinicalImpression -> "clinicalimpression"
                CodeSystem -> "codesystem"
                Communication -> "communication"
                CommunicationRequest -> "communicationrequest"
                CompartmentDefinition -> "compartmentdefinition"
                Composition -> "composition"
                ConceptMap -> "conceptmap"
                Condition -> "condition"
                Consent -> "consent"
                Contract -> "contract"
                Coverage -> "coverage"
                CoverageEligibilityRequest -> "coverageeligibilityrequest"
                CoverageEligibilityResponse -> "coverageeligibilityresponse"
                DetectedIssue -> "detectedissue"
                Device -> "device"
                DeviceDefinition -> "devicedefinition"
                DeviceMetric -> "devicemetric"
                DeviceRequest -> "devicerequest"
                DeviceUseStatement -> "deviceusestatement"
                DiagnosticReport -> "diagnosticreport"
                DocumentManifest -> "documentmanifest"
                DocumentReference -> "documentreference"
                EffectEvidenceSynthesis -> "effectevidencesynthesis"
                Encounter -> "encounter"
                Endpoint -> "endpoint"
                EnrollmentRequest -> "enrollmentrequest"
                EnrollmentResponse -> "enrollmentresponse"
                EpisodeOfCare -> "episodeofcare"
                EventDefinition -> "eventdefinition"
                Evidence -> "evidence"
                EvidenceVariable -> "evidencevariable"
                ExampleScenario -> "examplescenario"
                ExplanationOfBenefit -> "explanationofbenefit"
                FamilyMemberHistory -> "familymemberhistory"
                Flag -> "flag"
                Goal -> "goal"
                GraphDefinition -> "graphdefinition"
                Group -> "group"
                GuidanceResponse -> "guidanceresponse"
                HealthcareService -> "healthcareservice"
                ImagingStudy -> "imagingstudy"
                Immunization -> "immunization"
                ImmunizationEvaluation -> "immunizationevaluation"
                ImmunizationRecommendation -> "immunizationrecommendation"
                ImplementationGuide -> "implementationguide"
                InsurancePlan -> "insuranceplan"
                Invoice -> "invoice"
                Library -> "library"
                Linkage -> "linkage"
                List -> "list"
                Location -> "location"
                Measure -> "measure"
                MeasureReport -> "measurereport"
                Media -> "media"
                Medication -> "medication"
                MedicationAdministration -> "medicationadministration"
                MedicationDispense -> "medicationdispense"
                MedicationKnowledge -> "medicationknowledge"
                MedicationRequest -> "medicationrequest"
                MedicationStatement -> "medicationstatement"
                MedicinalProduct -> "medicinalproduct"
                MedicinalProductAuthorization -> "medicinalproductauthorization"
                MedicinalProductContraindication -> "medicinalproductcontraindication"
                MedicinalProductIndication -> "medicinalproductindication"
                MedicinalProductIngredient -> "medicinalproductingredient"
                MedicinalProductInteraction -> "medicinalproductinteraction"
                MedicinalProductManufactured -> "medicinalproductmanufactured"
                MedicinalProductPackaged -> "medicinalproductpackaged"
                MedicinalProductPharmaceutical -> "medicinalproductpharmaceutical"
                MedicinalProductUndesirableEffect -> "medicinalproductundesirableeffect"
                MessageDefinition -> "messagedefinition"
                MessageHeader -> "messageheader"
                MolecularSequence -> "molecularsequence"
                NamingSystem -> "namingsystem"
                NutritionOrder -> "nutritionorder"
                Observation -> "observation"
                ObservationDefinition -> "observationdefinition"
                OperationDefinition -> "operationdefinition"
                OperationOutcome -> "operationoutcome"
                Organization -> "organization"
                OrganizationAffiliation -> "organizationaffiliation"
                Parameters -> "parameters"
                Patient -> "patient"
                PaymentNotice -> "paymentnotice"
                PaymentReconciliation -> "paymentreconciliation"
                Person -> "person"
                PlanDefinition -> "plandefinition"
                Practitioner -> "practitioner"
                PractitionerRole -> "practitionerrole"
                Procedure -> "procedure"
                Provenance -> "provenance"
                Questionnaire -> "questionnaire"
                QuestionnaireResponse -> "questionnaireresponse"
                RelatedPerson -> "relatedperson"
                RequestGroup -> "requestgroup"
                ResearchDefinition -> "researchdefinition"
                ResearchElementDefinition -> "researchelementdefinition"
                ResearchStudy -> "researchstudy"
                ResearchSubject -> "researchsubject"
                RiskAssessment -> "riskassessment"
                RiskEvidenceSynthesis -> "riskevidencesynthesis"
                Schedule -> "schedule"
                SearchParameter -> "searchparameter"
                ServiceRequest -> "servicerequest"
                Slot -> "slot"
                Specimen -> "specimen"
                SpecimenDefinition -> "specimendefinition"
                StructureDefinition -> "structuredefinition"
                StructureMap -> "structuremap"
                Subscription -> "subscription"
                Substance -> "substance"
                SubstanceNucleicAcid -> "substancenucleicacid"
                SubstancePolymer -> "substancepolymer"
                SubstanceProtein -> "substanceprotein"
                SubstanceReferenceInformation -> "substancereferenceinformation"
                SubstanceSourceMaterial -> "substancesourcematerial"
                SubstanceSpecification -> "substancespecification"
                SupplyDelivery -> "supplydelivery"
                SupplyRequest -> "supplyrequest"
                Task -> "task"
                TerminologyCapabilities -> "terminologycapabilities"
                TestReport -> "testreport"
                TestScript -> "testscript"
                ValueSet -> "valueset"
                VerificationResult -> "verificationresult"
                VisionPrescription -> "visionprescription"
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(code: String): ResourceType {
//            if ("Account" == code) return Account
//            if ("ActivityDefinition" == code) return ActivityDefinition
//            if ("AdverseEvent" == code) return AdverseEvent
//            if ("AllergyIntolerance" == code) return AllergyIntolerance
//            if ("Appointment" == code) return Appointment
//            if ("AppointmentResponse" == code) return AppointmentResponse
//            if ("AuditEvent" == code) return AuditEvent
//            if ("Basic" == code) return Basic
//            if ("Binary" == code) return Binary
//            if ("BiologicallyDerivedProduct" == code) return BiologicallyDerivedProduct
//            if ("BodyStructure" == code) return BodyStructure
//            if ("Bundle" == code) return Bundle
//            if ("CapabilityStatement" == code) return CapabilityStatement
//            if ("CarePlan" == code) return CarePlan
//            if ("CareTeam" == code) return CareTeam
//            if ("CatalogEntry" == code) return CatalogEntry
//            if ("ChargeItem" == code) return ChargeItem
//            if ("ChargeItemDefinition" == code) return ChargeItemDefinition
//            if ("Claim" == code) return Claim
//            if ("ClaimResponse" == code) return ClaimResponse
//            if ("ClinicalImpression" == code) return ClinicalImpression
//            if ("CodeSystem" == code) return CodeSystem
//            if ("Communication" == code) return Communication
//            if ("CommunicationRequest" == code) return CommunicationRequest
//            if ("CompartmentDefinition" == code) return CompartmentDefinition
//            if ("Composition" == code) return Composition
//            if ("ConceptMap" == code) return ConceptMap
//            if ("Condition" == code) return Condition
//            if ("Consent" == code) return Consent
//            if ("Contract" == code) return Contract
//            if ("Coverage" == code) return Coverage
//            if ("CoverageEligibilityRequest" == code) return CoverageEligibilityRequest
//            if ("CoverageEligibilityResponse" == code) return CoverageEligibilityResponse
//            if ("DetectedIssue" == code) return DetectedIssue
//            if ("Device" == code) return Device
//            if ("DeviceDefinition" == code) return DeviceDefinition
//            if ("DeviceMetric" == code) return DeviceMetric
//            if ("DeviceRequest" == code) return DeviceRequest
//            if ("DeviceUseStatement" == code) return DeviceUseStatement
//            if ("DiagnosticReport" == code) return DiagnosticReport
//            if ("DocumentManifest" == code) return DocumentManifest
//            if ("DocumentReference" == code) return DocumentReference
//            if ("EffectEvidenceSynthesis" == code) return EffectEvidenceSynthesis
//            if ("Encounter" == code) return Encounter
//            if ("Endpoint" == code) return Endpoint
//            if ("EnrollmentRequest" == code) return EnrollmentRequest
//            if ("EnrollmentResponse" == code) return EnrollmentResponse
//            if ("EpisodeOfCare" == code) return EpisodeOfCare
//            if ("EventDefinition" == code) return EventDefinition
//            if ("Evidence" == code) return Evidence
//            if ("EvidenceVariable" == code) return EvidenceVariable
//            if ("ExampleScenario" == code) return ExampleScenario
//            if ("ExplanationOfBenefit" == code) return ExplanationOfBenefit
//            if ("FamilyMemberHistory" == code) return FamilyMemberHistory
//            if ("Flag" == code) return Flag
//            if ("Goal" == code) return Goal
//            if ("GraphDefinition" == code) return GraphDefinition
//            if ("Group" == code) return Group
//            if ("GuidanceResponse" == code) return GuidanceResponse
//            if ("HealthcareService" == code) return HealthcareService
//            if ("ImagingStudy" == code) return ImagingStudy
//            if ("Immunization" == code) return Immunization
//            if ("ImmunizationEvaluation" == code) return ImmunizationEvaluation
//            if ("ImmunizationRecommendation" == code) return ImmunizationRecommendation
//            if ("ImplementationGuide" == code) return ImplementationGuide
//            if ("InsurancePlan" == code) return InsurancePlan
//            if ("Invoice" == code) return Invoice
//            if ("Library" == code) return Library
//            if ("Linkage" == code) return Linkage
//            if ("List" == code) return List
//            if ("Location" == code) return Location
//            if ("Measure" == code) return Measure
//            if ("MeasureReport" == code) return MeasureReport
//            if ("Media" == code) return Media
//            if ("Medication" == code) return Medication
//            if ("MedicationAdministration" == code) return MedicationAdministration
//            if ("MedicationDispense" == code) return MedicationDispense
//            if ("MedicationKnowledge" == code) return MedicationKnowledge
//            if ("MedicationRequest" == code) return MedicationRequest
//            if ("MedicationStatement" == code) return MedicationStatement
//            if ("MedicinalProduct" == code) return MedicinalProduct
//            if ("MedicinalProductAuthorization" == code) return MedicinalProductAuthorization
//            if ("MedicinalProductContraindication" == code) return MedicinalProductContraindication
//            if ("MedicinalProductIndication" == code) return MedicinalProductIndication
//            if ("MedicinalProductIngredient" == code) return MedicinalProductIngredient
//            if ("MedicinalProductInteraction" == code) return MedicinalProductInteraction
//            if ("MedicinalProductManufactured" == code) return MedicinalProductManufactured
//            if ("MedicinalProductPackaged" == code) return MedicinalProductPackaged
//            if ("MedicinalProductPharmaceutical" == code) return MedicinalProductPharmaceutical
//            if ("MedicinalProductUndesirableEffect" == code) return MedicinalProductUndesirableEffect
//            if ("MessageDefinition" == code) return MessageDefinition
//            if ("MessageHeader" == code) return MessageHeader
//            if ("MolecularSequence" == code) return MolecularSequence
//            if ("NamingSystem" == code) return NamingSystem
//            if ("NutritionOrder" == code) return NutritionOrder
//            if ("Observation" == code) return Observation
//            if ("ObservationDefinition" == code) return ObservationDefinition
//            if ("OperationDefinition" == code) return OperationDefinition
//            if ("OperationOutcome" == code) return OperationOutcome
//            if ("Organization" == code) return Organization
//            if ("OrganizationAffiliation" == code) return OrganizationAffiliation
//            if ("Parameters" == code) return Parameters
//            if ("Patient" == code) return Patient
//            if ("PaymentNotice" == code) return PaymentNotice
//            if ("PaymentReconciliation" == code) return PaymentReconciliation
//            if ("Person" == code) return Person
//            if ("PlanDefinition" == code) return PlanDefinition
//            if ("Practitioner" == code) return Practitioner
//            if ("PractitionerRole" == code) return PractitionerRole
//            if ("Procedure" == code) return Procedure
//            if ("Provenance" == code) return Provenance
//            if ("Questionnaire" == code) return Questionnaire
//            if ("QuestionnaireResponse" == code) return QuestionnaireResponse
//            if ("RelatedPerson" == code) return RelatedPerson
//            if ("RequestGroup" == code) return RequestGroup
//            if ("ResearchDefinition" == code) return ResearchDefinition
//            if ("ResearchElementDefinition" == code) return ResearchElementDefinition
//            if ("ResearchStudy" == code) return ResearchStudy
//            if ("ResearchSubject" == code) return ResearchSubject
//            if ("RiskAssessment" == code) return RiskAssessment
//            if ("RiskEvidenceSynthesis" == code) return RiskEvidenceSynthesis
//            if ("Schedule" == code) return Schedule
//            if ("SearchParameter" == code) return SearchParameter
//            if ("ServiceRequest" == code) return ServiceRequest
//            if ("Slot" == code) return Slot
//            if ("Specimen" == code) return Specimen
//            if ("SpecimenDefinition" == code) return SpecimenDefinition
//            if ("StructureDefinition" == code) return StructureDefinition
//            if ("StructureMap" == code) return StructureMap
//            if ("Subscription" == code) return Subscription
//            if ("Substance" == code) return Substance
//            if ("SubstanceNucleicAcid" == code) return SubstanceNucleicAcid
//            if ("SubstancePolymer" == code) return SubstancePolymer
//            if ("SubstanceProtein" == code) return SubstanceProtein
//            if ("SubstanceReferenceInformation" == code) return SubstanceReferenceInformation
//            if ("SubstanceSourceMaterial" == code) return SubstanceSourceMaterial
//            if ("SubstanceSpecification" == code) return SubstanceSpecification
//            if ("SupplyDelivery" == code) return SupplyDelivery
//            if ("SupplyRequest" == code) return SupplyRequest
//            if ("Task" == code) return Task
//            if ("TerminologyCapabilities" == code) return TerminologyCapabilities
//            if ("TestReport" == code) return TestReport
//            if ("TestScript" == code) return TestScript
//            if ("ValueSet" == code) return ValueSet
//            if ("VerificationResult" == code) return VerificationResult
//            if ("VisionPrescription" == code) return VisionPrescription
//            throw org.hl7.fhir.exceptions.FHIRException("Unknown resource type$code")
//        }
//    }
}


@Serializable
enum class RequestPriority : CodeableEnumeration {

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
        get() {
            return when (this) {
                ROUTINE -> "The request has normal priority."
                URGENT -> "The request should be actioned promptly - higher priority than routine."
                ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
                STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
                NULL -> null
            }
        }

    override val display: String?
        get() {
            return when (this) {
                ROUTINE -> "Routine"
                URGENT -> "Urgent"
                ASAP -> "ASAP"
                STAT -> "STAT"
                NULL -> null
            }
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): RequestPriority? {
//            if (codeString == null || "" == codeString) return null
//            if ("routine" == codeString) return ROUTINE
//            if ("urgent" == codeString) return URGENT
//            if ("asap" == codeString) return ASAP
//            if ("stat" == codeString) return STAT
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown RequestPriority code '$codeString'")
//        }
//    }
}


@Serializable
enum class ServiceRequestStatus : CodeableEnumeration {
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
//        fun fromCode(codeString: String?): ServiceRequestStatus? {
//            if (codeString == null || "" == codeString) return null
//            if ("draft" == codeString) return DRAFT
//            if ("active" == codeString) return ACTIVE
//            if ("on-hold" == codeString) return ONHOLD
//            if ("revoked" == codeString) return REVOKED
//            if ("completed" == codeString) return COMPLETED
//            if ("entered-in-error" == codeString) return ENTEREDINERROR
//            if ("unknown" == codeString) return UNKNOWN
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown ServiceRequestStatus code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class ServiceRequestIntent : CodeableEnumeration {
    /**
     * The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.
     */
    PROPOSAL,

    /**
     * The request represents an intention to ensure something occurs without providing an authorization for others to act.
     */
    PLAN,

    /**
     * The request represents a legally binding instruction authored by a Patient or RelatedPerson.
     */
    DIRECTIVE,

    /**
     * The request represents a request/demand and authorization for action by a Practitioner.
     */
    ORDER,

    /**
     * The request represents an original authorization for action.
     */
    ORIGINALORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.
     */
    REFLEXORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
     */
    FILLERORDER,

    /**
     * An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
     */
    INSTANCEORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used.
     */
    OPTION,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            DIRECTIVE -> "directive"
            ORDER -> "order"
            ORIGINALORDER -> "original-order"
            REFLEXORDER -> "reflex-order"
            FILLERORDER -> "filler-order"
            INSTANCEORDER -> "instance-order"
            OPTION -> "option"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            PROPOSAL -> "http://hl7.org/fhir/request-intent"
            PLAN -> "http://hl7.org/fhir/request-intent"
            DIRECTIVE -> "http://hl7.org/fhir/request-intent"
            ORDER -> "http://hl7.org/fhir/request-intent"
            ORIGINALORDER -> "http://hl7.org/fhir/request-intent"
            REFLEXORDER -> "http://hl7.org/fhir/request-intent"
            FILLERORDER -> "http://hl7.org/fhir/request-intent"
            INSTANCEORDER -> "http://hl7.org/fhir/request-intent"
            OPTION -> "http://hl7.org/fhir/request-intent"
            NULL -> null
        }
    override val definition: String?
        get() = when (this) {
            PROPOSAL -> "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act."
            PLAN -> "The request represents an intention to ensure something occurs without providing an authorization for others to act."
            DIRECTIVE -> "The request represents a legally binding instruction authored by a Patient or RelatedPerson."
            ORDER -> "The request represents a request/demand and authorization for action by a Practitioner."
            ORIGINALORDER -> "The request represents an original authorization for action."
            REFLEXORDER -> "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization."
            FILLERORDER -> "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order."
            INSTANCEORDER -> "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug."
            OPTION -> "The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used."
            NULL -> null
        }


    override val display: String?
        get() = when (this) {
            PROPOSAL -> "Proposal"
            PLAN -> "Plan"
            DIRECTIVE -> "Directive"
            ORDER -> "Order"
            ORIGINALORDER -> "Original Order"
            REFLEXORDER -> "Reflex Order"
            FILLERORDER -> "Filler Order"
            INSTANCEORDER -> "Instance Order"
            OPTION -> "Option"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): ServiceRequestIntent? {
//            if (codeString == null || "" == codeString) return null
//            if ("proposal" == codeString) return PROPOSAL
//            if ("plan" == codeString) return PLAN
//            if ("directive" == codeString) return DIRECTIVE
//            if ("order" == codeString) return ORDER
//            if ("original-order" == codeString) return ORIGINALORDER
//            if ("reflex-order" == codeString) return REFLEXORDER
//            if ("filler-order" == codeString) return FILLERORDER
//            if ("instance-order" == codeString) return INSTANCEORDER
//            if ("option" == codeString) return OPTION
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown ServiceRequestIntent code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class ServiceRequestPriority : CodeableEnumeration {
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
//        fun fromCode(codeString: String?): ServiceRequestPriority? {
//            if (codeString == null || "" == codeString) return null
//            if ("routine" == codeString) return ROUTINE
//            if ("urgent" == codeString) return URGENT
//            if ("asap" == codeString) return ASAP
//            if ("stat" == codeString) return STAT
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                "Unknown ServiceRequestPriority code '$codeString'"
//            )
//        }
//    }
}


@Serializable
enum class SortDirection : CodeableEnumeration {

    /**
     * Sort by the value ascending, so that lower values appear first.
     */
    ASCENDING,

    /**
     * Sort by the value descending, so that lower values appear last.
     */
    DESCENDING,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            ASCENDING -> "ascending"
            DESCENDING -> "descending"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            ASCENDING -> "http://hl7.org/fhir/sort-direction"
            DESCENDING -> "http://hl7.org/fhir/sort-direction"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            ASCENDING -> "Sort by the value ascending, so that lower values appear first."
            DESCENDING -> "Sort by the value descending, so that lower values appear last."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            ASCENDING -> "Ascending"
            DESCENDING -> "Descending"
            NULL -> null
        }


//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): SortDirection? {
//            if (codeString == null || "" == codeString) return null
//            if ("ascending" == codeString) return ASCENDING
//            if ("descending" == codeString) return DESCENDING
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown SortDirection code '$codeString'")
//        }
//    }
}


@Serializable
enum class SpecimenStatus : CodeableEnumeration {
    /**
     * The physical specimen is present and in good condition.
     */
    AVAILABLE,

    /**
     * There is no physical specimen because it is either lost, destroyed or consumed.
     */
    UNAVAILABLE,

    /**
     * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
     */
    UNSATISFACTORY,

    /**
     * The specimen was entered in error and therefore nullified.
     */
    ENTEREDINERROR,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            AVAILABLE -> "available"
            UNAVAILABLE -> "unavailable"
            UNSATISFACTORY -> "unsatisfactory"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            AVAILABLE -> "http://hl7.org/fhir/specimen-status"
            UNAVAILABLE -> "http://hl7.org/fhir/specimen-status"
            UNSATISFACTORY -> "http://hl7.org/fhir/specimen-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/specimen-status"
            NULL -> null
        }


    override val definition: String?
        get() = when (this) {
            AVAILABLE -> "The physical specimen is present and in good condition."
            UNAVAILABLE -> "There is no physical specimen because it is either lost, destroyed or consumed."
            UNSATISFACTORY -> "The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old."
            ENTEREDINERROR -> "The specimen was entered in error and therefore nullified."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            AVAILABLE -> "Available"
            UNAVAILABLE -> "Unavailable"
            UNSATISFACTORY -> "Unsatisfactory"
            ENTEREDINERROR -> "Entered in Error"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): SpecimenStatus? {
//                if (codeString == null || "" == codeString) return null
//                if ("available" == codeString) return AVAILABLE
//                if ("unavailable" == codeString) return UNAVAILABLE
//                if ("unsatisfactory" == codeString) return UNSATISFACTORY
//                if ("entered-in-error" == codeString) return ENTEREDINERROR
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown SpecimenStatus code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class UnitsOfTime : CodeableEnumeration {
    /**
     * null
     */
    S,

    /**
     * null
     */
    MIN,

    /**
     * null
     */
    H,

    /**
     * null
     */
    D,

    /**
     * null
     */
    WK,

    /**
     * null
     */
    MO,

    /**
     * null
     */
    A,

    /**
     * added to help the parsers with the generic types
     */
    NULL;

    override fun toCode(): String? {
        return when (this) {
            S -> "s"
            MIN -> "min"
            H -> "h"
            D -> "d"
            WK -> "wk"
            MO -> "mo"
            A -> "a"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            S -> "http://unitsofmeasure.org"
            MIN -> "http://unitsofmeasure.org"
            H -> "http://unitsofmeasure.org"
            D -> "http://unitsofmeasure.org"
            WK -> "http://unitsofmeasure.org"
            MO -> "http://unitsofmeasure.org"
            A -> "http://unitsofmeasure.org"
            NULL -> null
        }
    override val definition: String?
        get() = when (this) {
            S -> ""
            MIN -> ""
            H -> ""
            D -> ""
            WK -> ""
            MO -> ""
            A -> ""
            NULL -> null
        }
    override val display: String?
        get() = when (this) {
            S -> "second"
            MIN -> "minute"
            H -> "hour"
            D -> "day"
            WK -> "week"
            MO -> "month"
            A -> "year"
            NULL -> null
        }

//        companion object {
//            @Throws(FHIRException::class)
//            fun fromCode(codeString: String?): UnitsOfTime? {
//                if (codeString == null || "" == codeString) return null
//                if ("s" == codeString) return S
//                if ("min" == codeString) return MIN
//                if ("h" == codeString) return H
//                if ("d" == codeString) return D
//                if ("wk" == codeString) return WK
//                if ("mo" == codeString) return MO
//                if ("a" == codeString) return A
//                return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException(
//                    "Unknown UnitsOfTime code '$codeString'"
//                )
//            }
//        }
}


@Serializable
enum class TriggerType : CodeableEnumeration {

    /**
     * The trigger occurs in response to a specific named event, and no other information about the trigger is specified. Named events are completely pre-coordinated, and the formal semantics of the trigger are not provided.
     */
    NAMEDEVENT,

    /**
     * The trigger occurs at a specific time or periodically as described by a timing or schedule. A periodic event cannot have any data elements, but may have a name assigned as a shorthand for the event.
     */
    PERIODIC,

    /**
     * The trigger occurs whenever data of a particular type is changed in any way, either added, modified, or removed.
     */
    DATACHANGED,

    /**
     * The trigger occurs whenever data of a particular type is added.
     */
    DATAADDED,

    /**
     * The trigger occurs whenever data of a particular type is modified.
     */
    DATAMODIFIED,

    /**
     * The trigger occurs whenever data of a particular type is removed.
     */
    DATAREMOVED,

    /**
     * The trigger occurs whenever data of a particular type is accessed.
     */
    DATAACCESSED,

    /**
     * The trigger occurs whenever access to data of a particular type is completed.
     */
    DATAACCESSENDED,

    /**
     * added to help the parsers with the generic types
     */
    NULL;


    override fun toCode(): String? {
        return when (this) {
            NAMEDEVENT -> "named-event"
            PERIODIC -> "periodic"
            DATACHANGED -> "data-changed"
            DATAADDED -> "data-added"
            DATAMODIFIED -> "data-modified"
            DATAREMOVED -> "data-removed"
            DATAACCESSED -> "data-accessed"
            DATAACCESSENDED -> "data-access-ended"
            NULL -> null
        }
    }

    override val system: String?
        get() = when (this) {
            NAMEDEVENT -> "http://hl7.org/fhir/trigger-type"
            PERIODIC -> "http://hl7.org/fhir/trigger-type"
            DATACHANGED -> "http://hl7.org/fhir/trigger-type"
            DATAADDED -> "http://hl7.org/fhir/trigger-type"
            DATAMODIFIED -> "http://hl7.org/fhir/trigger-type"
            DATAREMOVED -> "http://hl7.org/fhir/trigger-type"
            DATAACCESSED -> "http://hl7.org/fhir/trigger-type"
            DATAACCESSENDED -> "http://hl7.org/fhir/trigger-type"
            NULL -> null
        }

    override val definition: String?
        get() = when (this) {
            NAMEDEVENT -> "The trigger occurs in response to a specific named event, and no other information about the trigger is specified. Named events are completely pre-coordinated, and the formal semantics of the trigger are not provided."
            PERIODIC -> "The trigger occurs at a specific time or periodically as described by a timing or schedule. A periodic event cannot have any data elements, but may have a name assigned as a shorthand for the event."
            DATACHANGED -> "The trigger occurs whenever data of a particular type is changed in any way, either added, modified, or removed."
            DATAADDED -> "The trigger occurs whenever data of a particular type is added."
            DATAMODIFIED -> "The trigger occurs whenever data of a particular type is modified."
            DATAREMOVED -> "The trigger occurs whenever data of a particular type is removed."
            DATAACCESSED -> "The trigger occurs whenever data of a particular type is accessed."
            DATAACCESSENDED -> "The trigger occurs whenever access to data of a particular type is completed."
            NULL -> null
        }

    override val display: String?
        get() = when (this) {
            NAMEDEVENT -> "Named Event"
            PERIODIC -> "Periodic"
            DATACHANGED -> "Data Changed"
            DATAADDED -> "Data Added"
            DATAMODIFIED -> "Data Updated"
            DATAREMOVED -> "Data Removed"
            DATAACCESSED -> "Data Accessed"
            DATAACCESSENDED -> "Data Access Ended"
            NULL -> null
        }

//    companion object {
//        @Throws(FHIRException::class)
//        fun fromCode(codeString: String?): TriggerType? {
//            if (codeString == null || "" == codeString) return null
//            if ("named-event" == codeString) return NAMEDEVENT
//            if ("periodic" == codeString) return PERIODIC
//            if ("data-changed" == codeString) return DATACHANGED
//            if ("data-added" == codeString) return DATAADDED
//            if ("data-modified" == codeString) return DATAMODIFIED
//            if ("data-removed" == codeString) return DATAREMOVED
//            if ("data-accessed" == codeString) return DATAACCESSED
//            if ("data-access-ended" == codeString) return DATAACCESSENDED
//            return if (Configuration.isAcceptInvalidEnums()) null else throw FHIRException("Unknown TriggerType code '$codeString'")
//        }
//    }
}
