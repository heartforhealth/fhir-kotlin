package io.h4h.fhir.r4.base


import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
enum class ActionConditionKind : CodeableEnumeration {

    /**
     * The condition describes whether or not a given action is applicable.
     */
    @SerialName("applicability")
    @JsonProperty("applicability")
    APPLICABILITY,

    /**
     * The condition is a starting condition for the action.
     */
    @SerialName("start")
    @JsonProperty("start")
    START,

    /**
     * The condition is a stop, or exit condition for the action.
     */
    @SerialName("stop")
    @JsonProperty("stop")
    STOP;


    override val code: String
        get() = when (this) {
            APPLICABILITY -> "applicability"
            START -> "start"
            STOP -> "stop"
        }


    override val system: String
        get() = "http://hl7.org/fhir/action-condition-kind"

    override val definition: String?
        get() {
            return when (this) {
                APPLICABILITY -> "The condition describes whether or not a given action is applicable."
                START -> "The condition is a starting condition for the action."
                STOP -> "The condition is a stop, or exit condition for the action."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                APPLICABILITY -> "Applicability"
                START -> "Start"
                STOP -> "Stop"
            }
        }

}


@Serializable
enum class ActionRelationshipType : CodeableEnumeration {

    /**
     * The action must be performed before the start of the related action.
     */
    @SerialName("before-start")
    @JsonProperty("before-start")
    BEFORESTART,

    /**
     * The action must be performed before the related action.
     */
    @SerialName("before")
    @JsonProperty("before")
    BEFORE,

    /**
     * The action must be performed before the end of the related action.
     */
    @SerialName("before-end")
    @JsonProperty("before-end")
    BEFOREEND,

    /**
     * The action must be performed concurrent with the start of the related action.
     */
    @SerialName("concurrent-with-start")
    @JsonProperty("concurrent-with-start")
    CONCURRENTWITHSTART,

    /**
     * The action must be performed concurrent with the related action.
     */
    @SerialName("concurrent")
    @JsonProperty("concurrent")
    CONCURRENT,

    /**
     * The action must be performed concurrent with the end of the related action.
     */
    @SerialName("concurrent-with-end")
    @JsonProperty("concurrent-with-end")
    CONCURRENTWITHEND,

    /**
     * The action must be performed after the start of the related action.
     */
    @SerialName("after-start")
    @JsonProperty("after-start")
    AFTERSTART,

    /**
     * The action must be performed after the related action.
     */
    @SerialName("after")
    @JsonProperty("after")
    AFTER,

    /**
     * The action must be performed after the end of the related action.
     */
    @SerialName("after-end")
    @JsonProperty("after-end")
    AFTEREND;

    override val code: String
        get() = when (this) {
            BEFORESTART -> "before-start"
            BEFORE -> "before"
            BEFOREEND -> "before-end"
            CONCURRENTWITHSTART -> "concurrent-with-start"
            CONCURRENT -> "concurrent"
            CONCURRENTWITHEND -> "concurrent-with-end"
            AFTERSTART -> "after-start"
            AFTER -> "after"
            AFTEREND -> "after-end"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-relationship-type"

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
            }
        }

}


@Serializable
enum class ActionParticipantType : CodeableEnumeration {

    /**
     * The participant is the patient under evaluation.
     */
    @SerialName("patient")
    @JsonProperty("patient")
    PATIENT,

    /**
     * The participant is a practitioner involved in the patient's care.
     */
    @SerialName("practitioner")
    @JsonProperty("practitioner")
    PRACTITIONER,

    /**
     * The participant is a person related to the patient.
     */
    @SerialName("related-person")
    @JsonProperty("related-person")
    RELATEDPERSON,

    /**
     * The participant is a system or device used in the care of the patient.
     */
    @SerialName("device")
    @JsonProperty("device")
    DEVICE;

    override val code: String
        get() = when (this) {
            PATIENT -> "patient"
            PRACTITIONER -> "practitioner"
            RELATEDPERSON -> "related-person"
            DEVICE -> "device"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-participant-type"

    override val definition: String?
        get() {
            return when (this) {
                PATIENT -> "The participant is the patient under evaluation."
                PRACTITIONER -> "The participant is a practitioner involved in the patient's care."
                RELATEDPERSON -> "The participant is a person related to the patient."
                DEVICE -> "The participant is a system or device used in the care of the patient."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                PATIENT -> "Patient"
                PRACTITIONER -> "Practitioner"
                RELATEDPERSON -> "Related Person"
                DEVICE -> "Device"
            }
        }

}


@Serializable
enum class ActionGroupingBehavior : CodeableEnumeration {

    /**
     * Any group marked with this behavior should be displayed as a visual group to the end user.
     */
    @SerialName("visual-group")
    @JsonProperty("visual-group")
    VISUALGROUP,

    /**
     * A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.
     */
    @SerialName("logical-group")
    @JsonProperty("logical-group")
    LOGICALGROUP,

    /**
     * A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne".
     */
    @SerialName("sentence-group")
    @JsonProperty("sentence-group")
    SENTENCEGROUP;

    override val code: String
        get() = when (this) {
            VISUALGROUP -> "visual-group"
            LOGICALGROUP -> "logical-group"
            SENTENCEGROUP -> "sentence-group"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-grouping-behavior"

    override val definition: String?
        get() {
            return when (this) {
                VISUALGROUP -> "Any group marked with this behavior should be displayed as a visual group to the end user."
                LOGICALGROUP -> "A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so."
                SENTENCEGROUP -> "A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are \"aspirin, 500 mg, 2 times per day\" and \"aspirin, 300 mg, 3 times per day\". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of \"AtMostOne\", unless it's a required action, in which case, it would be \"ExactlyOne\"."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                VISUALGROUP -> "Visual Group"
                LOGICALGROUP -> "Logical Group"
                SENTENCEGROUP -> "Sentence Group"
            }
        }

}


@Serializable
enum class ActionSelectionBehavior : CodeableEnumeration {

    /**
     * Any number of the actions in the group may be chosen, from zero to all.
     */
    @SerialName("any")
    @JsonProperty("any")
    ANY,

    /**
     * All the actions in the group must be selected as a single unit.
     */
    @SerialName("all")
    @JsonProperty("all")
    ALL,

    /**
     * All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.
     */
    @SerialName("all-or-none")
    @JsonProperty("all-or-none")
    ALLORNONE,

    /**
     * The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.
     */
    @SerialName("exactly-one")
    @JsonProperty("exactly-one")
    EXACTLYONE,

    /**
     * The end user may choose zero or at most one of the actions in the group.
     */
    @SerialName("at-most-one")
    @JsonProperty("at-most-one")
    ATMOSTONE,

    /**
     * The end user must choose a minimum of one, and as many additional as desired.
     */
    @SerialName("one-or-more")
    @JsonProperty("one-or-more")
    ONEORMORE;

    override val code: String
        get() = when (this) {
            ANY -> "any"
            ALL -> "all"
            ALLORNONE -> "all-or-none"
            EXACTLYONE -> "exactly-one"
            ATMOSTONE -> "at-most-one"
            ONEORMORE -> "one-or-more"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-selection-behavior"


    override val definition: String?
        get() {
            return when (this) {
                ANY -> "Any number of the actions in the group may be chosen, from zero to all."
                ALL -> "All the actions in the group must be selected as a single unit."
                ALLORNONE -> "All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected."
                EXACTLYONE -> "The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group."
                ATMOSTONE -> "The end user may choose zero or at most one of the actions in the group."
                ONEORMORE -> "The end user must choose a minimum of one, and as many additional as desired."
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
            }
        }

}


@Serializable
enum class ActionRequiredBehavior : CodeableEnumeration {

    /**
     * An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.
     */
    @SerialName("must")
    @JsonProperty("must")
    MUST,

    /**
     * An action with this behavior may be included in the set of actions processed by the end user.
     */
    @SerialName("could")
    @JsonProperty("could")
    COULD,

    /**
     * An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.
     */
    @SerialName("must-unless-documented")
    @JsonProperty("must-unless-documented")
    MUSTUNLESSDOCUMENTED;

    override val code: String
        get() = when (this) {
            MUST -> "must"
            COULD -> "could"
            MUSTUNLESSDOCUMENTED -> "must-unless-documented"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-required-behavior"

    override val definition: String?
        get() {
            return when (this) {
                MUST -> "An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action."
                COULD -> "An action with this behavior may be included in the set of actions processed by the end user."
                MUSTUNLESSDOCUMENTED -> "An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                MUST -> "Must"
                COULD -> "Could"
                MUSTUNLESSDOCUMENTED -> "Must Unless Documented"
            }
        }

}


@Serializable
enum class ActionPrecheckBehavior : CodeableEnumeration {

    /**
     * An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider "pre-checking" such an action as a convenience for the user.
     */
    @SerialName("yes")
    @JsonProperty("yes")
    YES,

    /**
     * An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not "pre-check" such an action.
     */
    @SerialName("no")
    @JsonProperty("no")
    NO;

    override val code: String
        get() = when (this) {
            YES -> "yes"
            NO -> "no"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-precheck-behavior"

    override val definition: String?
        get() {
            return when (this) {
                YES -> "An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider \"pre-checking\" such an action as a convenience for the user."
                NO -> "An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not \"pre-check\" such an action."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                YES -> "Yes"
                NO -> "No"
            }
        }

}


@Serializable
enum class ActionCardinalityBehavior : CodeableEnumeration {

    /**
     * The action may only be selected one time.
     */
    @SerialName("single")
    @JsonProperty("single")
    SINGLE,

    /**
     * The action may be selected multiple times.
     */
    @SerialName("multiple")
    @JsonProperty("multiple")
    MULTIPLE;

    override val code: String
        get() = when (this) {
            SINGLE -> "single"
            MULTIPLE -> "multiple"
        }

    override val system: String
        get() = "http://hl7.org/fhir/action-cardinality-behavior"

    override val definition: String?
        get() {
            return when (this) {
                SINGLE -> "The action may only be selected one time."
                MULTIPLE -> "The action may be selected multiple times."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                SINGLE -> "Single"
                MULTIPLE -> "Multiple"
            }
        }

}


@Serializable
enum class AddressUse : CodeableEnumeration {

    /**
     * A communication address at a home.
     */
    @SerialName("home")
    @JsonProperty("home")
    HOME,

    /**
     * An office address. First choice for business related contacts during business hours.
     */
    @SerialName("work")
    @JsonProperty("work")
    WORK,

    /**
     * A temporary address. The period can provide more detailed information.
     */
    @SerialName("temp")
    @JsonProperty("temp")
    TEMP,

    /**
     * This address is no longer in use (or was never correct but retained for records).
     */
    @SerialName("old")
    @JsonProperty("old")
    OLD,

    /**
     * An address to be used to send bills, invoices, receipts etc.
     */
    @SerialName("billing")
    @JsonProperty("billing")
    BILLING;


    override val code: String
        get() = when (this) {
            HOME -> "home"
            WORK -> "work"
            TEMP -> "temp"
            OLD -> "old"
            BILLING -> "billing"
        }

    override val system: String
        get() = "http://hl7.org/fhir/address-use"

    override val definition: String?
        get() = when (this) {
            HOME -> "A communication address at a home."
            WORK -> "An office address. First choice for business related contacts during business hours."
            TEMP -> "A temporary address. The period can provide more detailed information."
            OLD -> "This address is no longer in use (or was never correct but retained for records)."
            BILLING -> "An address to be used to send bills, invoices, receipts etc."
        }

    override val display: String?
        get() = when (this) {
            HOME -> "Home"
            WORK -> "Work"
            TEMP -> "Temporary"
            OLD -> "Old / Incorrect"
            BILLING -> "Billing"
        }

}


@Serializable
enum class AddressType : CodeableEnumeration {

    /**
     * Mailing addresses - PO Boxes and care-of addresses.
     */
    @SerialName("postal")
    @JsonProperty("postal")
    POSTAL,

    /**
     * A physical address that can be visited.
     */
    @SerialName("physical")
    @JsonProperty("physical")
    PHYSICAL,

    /**
     * An address that is both physical and postal.
     */
    @SerialName("both")
    @JsonProperty("both")
    BOTH;
    
    override val code: String
        get() = when (this) {
            POSTAL -> "postal"
            PHYSICAL -> "physical"
            BOTH -> "both"
        }


    override val system: String
        get() = "http://hl7.org/fhir/address-type"

    override val definition: String?
        get() = when (this) {
            POSTAL -> "Mailing addresses - PO Boxes and care-of addresses."
            PHYSICAL -> "A physical address that can be visited."
            BOTH -> "An address that is both physical and postal."
        }


    override val display: String?
        get() = when (this) {
            POSTAL -> "Postal"
            PHYSICAL -> "Physical"
            BOTH -> "Postal & Physical"
        }

}


@Serializable
enum class ContactPointSystem : CodeableEnumeration {

    /**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    @SerialName("phone")
    @JsonProperty("phone")
    PHONE,

    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    @SerialName("fax")
    @JsonProperty("fax")
    FAX,

    /**
     * The value is an email address.
     */
    @SerialName("email")
    @JsonProperty("email")
    EMAIL,

    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.
     */
    @SerialName("pager")
    @JsonProperty("pager")
    PAGER,

    /**
     * A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses.
     */
    @SerialName("url")
    @JsonProperty("url")
    URL,

    /**
     * A contact that can be used for sending an sms message (e.g. mobile phones, some landlines).
     */
    @SerialName("sms")
    @JsonProperty("sms")
    SMS,

    /**
     * A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish "other" contact types.
     */
    @SerialName("other")
    @JsonProperty("other")
    OTHER;

    override val code: String
        get() = when (this) {
            PHONE -> "phone"
            FAX -> "fax"
            EMAIL -> "email"
            PAGER -> "pager"
            URL -> "url"
            SMS -> "sms"
            OTHER -> "other"
        }

    override val system: String
        get() = "http://hl7.org/fhir/contact-point-system"

    override val definition: String?
        get() = when (this) {
            PHONE -> "The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required."
            FAX -> "The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required."
            EMAIL -> "The value is an email address."
            PAGER -> "The value is a pager number. These may be local pager numbers that are only usable on a particular pager system."
            URL -> "A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various institutional or personal contacts including web sites, blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses."
            SMS -> "A contact that can be used for sending an sms message (e.g. mobile phones, some landlines)."
            OTHER -> "A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish \"other\" contact types."
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
        }

}


@Serializable
enum class ContactPointUse : CodeableEnumeration {

    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    @SerialName("home")
    @JsonProperty("home")
    HOME,

    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    @SerialName("work")
    @JsonProperty("work")
    WORK,

    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    @SerialName("temp")
    @JsonProperty("temp")
    TEMP,

    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    @SerialName("old")
    @JsonProperty("old")
    OLD,

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    @SerialName("mobile")
    @JsonProperty("mobile")
    MOBILE;

    override val code: String
        get() = when (this) {
            HOME -> "home"
            WORK -> "work"
            TEMP -> "temp"
            OLD -> "old"
            MOBILE -> "mobile"
        }


    override val system = "http://hl7.org/fhir/contact-point-use"

    override val definition: String?
        get() = when (this) {
            HOME -> "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available."
            WORK -> "An office contact point. First choice for business related contacts during business hours."
            TEMP -> "A temporary contact point. The period can provide more detailed information."
            OLD -> "This contact point is no longer in use (or was never correct, but retained for records)."
            MOBILE -> "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business."
        }

    override val display: String?
        get() = when (this) {
            HOME -> "Home"
            WORK -> "Work"
            TEMP -> "Temp"
            OLD -> "Old"
            MOBILE -> "Mobile"
        }

}


@Serializable
enum class DayOfWeek : CodeableEnumeration {

    /**
     * Monday.
     */
    @SerialName("mon")
    @JsonProperty("mon")
    MON,

    /**
     * Tuesday.
     */
    @SerialName("tue")
    @JsonProperty("tue")
    TUE,

    /**
     * Wednesday.
     */
    @SerialName("wed")
    @JsonProperty("wed")
    WED,

    /**
     * Thursday.
     */
    @SerialName("thu")
    @JsonProperty("thu")
    THU,

    /**
     * Friday.
     */
    @SerialName("fri")
    @JsonProperty("fri")
    FRI,

    /**
     * Saturday.
     */
    @SerialName("sat")
    @JsonProperty("sat")
    SAT,

    /**
     * Sunday.
     */
    @SerialName("sun")
    @JsonProperty("sun")
    SUN;

    override val code: String
        get() = when (this) {
            MON -> "mon"
            TUE -> "tue"
            WED -> "wed"
            THU -> "thu"
            FRI -> "fri"
            SAT -> "sat"
            SUN -> "sun"
        }


    override val system = "http://hl7.org/fhir/days-of-week"


    override val definition: String?
        get() = when (this) {
            MON -> "Monday."
            TUE -> "Tuesday."
            WED -> "Wednesday."
            THU -> "Thursday."
            FRI -> "Friday."
            SAT -> "Saturday."
            SUN -> "Sunday."
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
        }

}



@Serializable
enum class EventTiming : CodeableEnumeration {

    /**
     * Event occurs during the morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("MORN")
    @JsonProperty("MORN")
    MORN,

    /**
     * Event occurs during the early morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("MORN.early")
    @JsonProperty("MORN.early")
    MORN_EARLY,

    /**
     * Event occurs during the late morning. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("MORN.late")
    @JsonProperty("MORN.late")
    MORN_LATE,

    /**
     * Event occurs around 12:00pm. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("NOON")
    @JsonProperty("NOON")
    NOON,

    /**
     * Event occurs during the afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("AFT")
    @JsonProperty("AFT")
    AFT,

    /**
     * Event occurs during the early afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("AFT.early")
    @JsonProperty("AFT.early")
    AFT_EARLY,

    /**
     * Event occurs during the late afternoon. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("AFT.late")
    @JsonProperty("AFT.late")
    AFT_LATE,

    /**
     * Event occurs during the evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("EVE")
    @JsonProperty("EVE")
    EVE,

    /**
     * Event occurs during the early evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("EVE.early")
    @JsonProperty("EVE.early")
    EVE_EARLY,

    /**
     * Event occurs during the late evening. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("EVE.late")
    @JsonProperty("EVE.late")
    EVE_LATE,

    /**
     * Event occurs during the night. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("NIGHT")
    @JsonProperty("NIGHT")
    NIGHT,

    /**
     * Event occurs [offset] after subject goes to sleep. The exact time is unspecified and established by institution convention or patient interpretation.
     */
    @SerialName("PHS")
    @JsonProperty("PHS")
    PHS,

    /**
     * null
     */
    @SerialName("HS")
    @JsonProperty("HS")
    HS,

    /**
     * null
     */
    @SerialName("WAKE")
    @JsonProperty("WAKE")
    WAKE,

    /**
     * null
     */
    @SerialName("C")
    @JsonProperty("C")
    C,

    /**
     * null
     */
    @SerialName("CM")
    @JsonProperty("CM")
    CM,

    /**
     * null
     */
    @SerialName("CD")
    @JsonProperty("CD")
    CD,

    /**
     * null
     */
    @SerialName("CV")
    @JsonProperty("CV")
    CV,

    /**
     * null
     */
    @SerialName("AC")
    @JsonProperty("AC")
    AC,

    /**
     * null
     */
    @SerialName("ACM")
    @JsonProperty("ACM")
    ACM,

    /**
     * null
     */
    @SerialName("ACD")
    @JsonProperty("ACD")
    ACD,

    /**
     * null
     */
    @SerialName("ACV")
    @JsonProperty("ACV")
    ACV,

    /**
     * null
     */
    @SerialName("PC")
    @JsonProperty("PC")
    PC,

    /**
     * null
     */
    @SerialName("PCM")
    @JsonProperty("PCM")
    PCM,

    /**
     * null
     */
    @SerialName("PCD")
    @JsonProperty("PCD")
    PCD,

    /**
     * null
     */
    @SerialName("PCV")
    @JsonProperty("PCV")
    PCV;

    override val code: String
        get() = when (this) {
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
        }


    override val system: String
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
        }


}


@Serializable
enum class EnableWhenBehavior : CodeableEnumeration {

    /**
     * Enable the question when all the enableWhen criteria are satisfied.
     */
    @SerialName("all")
    @JsonProperty("all")
    ALL,

    /**
     * Enable the question when any of the enableWhen criteria are satisfied.
     */
    @SerialName("any")
    @JsonProperty("any")
    ANY;


    override val code: String
        get() = when (this) {
            ALL -> "all"
            ANY -> "any"
        }


    override val system: String
        get() = "http://hl7.org/fhir/questionnaire-enable-behavior"

    override val definition: String?
        get() = when (this) {
            ALL -> "Enable the question when all the enableWhen criteria are satisfied."
            ANY -> "Enable the question when any of the enableWhen criteria are satisfied."
        }

    override val display: String?
        get() = when (this) {
            ALL -> "All"
            ANY -> "Any"
        }

}


@Serializable
enum class EncounterStatus : CodeableEnumeration {
    /**
     * The Encounter has not yet started.
     */
    @SerialName("planned")
    @JsonProperty("planned")
    PLANNED,

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     */
    @SerialName("arrived")
    @JsonProperty("arrived")
    ARRIVED,

    /**
     * The patient has been assessed for the priority of their treatment based on the severity of their condition.
     */
    @SerialName("triaged")
    @JsonProperty("triaged")
    TRIAGED,

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     */
    @SerialName("in-progress")
    @JsonProperty("in-progress")
    INPROGRESS,

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     */
    @SerialName("onleave")
    @JsonProperty("onleave")
    ONLEAVE,

    /**
     * The Encounter has ended.
     */
    @SerialName("finished")
    @JsonProperty("finished")
    FINISHED,

    /**
     * The Encounter has ended before it has begun.
     */
    @SerialName("cancelled")
    @JsonProperty("cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;

    override val code: String
        get() = when (this) {
            PLANNED -> "planned"
            ARRIVED -> "arrived"
            TRIAGED -> "triaged"
            INPROGRESS -> "in-progress"
            ONLEAVE -> "onleave"
            FINISHED -> "finished"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/encounter-status"


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
        }


}


@Serializable
enum class EncounterLocationStatus : CodeableEnumeration {
    
    /**
     * The patient is planned to be moved to this location at some point in the future.
     */
    @SerialName("planned")
    @JsonProperty("planned")
    PLANNED,

    /**
     * The patient is currently at this location, or was between the period specified.
     *
     * A system may update these records when the patient leaves the location to either reserved, or completed.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * This location is held empty for this patient.
     */
    @SerialName("reserved")
    @JsonProperty("reserved")
    RESERVED,

    /**
     * The patient was at this location during the period specified.
     *
     * Not to be used when the patient is currently at the location.
     */
    @SerialName("completed")
    @JsonProperty("completed")
    COMPLETED;


    override val code: String
        get() = when (this) {
            PLANNED -> "planned"
            ACTIVE -> "active"
            RESERVED -> "reserved"
            COMPLETED -> "completed"
        }



    override val system: String
        get() = "http://hl7.org/fhir/encounter-location-status"


    override val definition: String?
        get() = when (this) {
            PLANNED -> "The patient is planned to be moved to this location at some point in the future."
            ACTIVE -> "The patient is currently at this location, or was between the period specified.\r\rA system may update these records when the patient leaves the location to either reserved, or completed."
            RESERVED -> "This location is held empty for this patient."
            COMPLETED -> "The patient was at this location during the period specified.\r\rNot to be used when the patient is currently at the location."
        }


    override val display: String?
        get() = when (this) {
            PLANNED -> "Planned"
            ACTIVE -> "Active"
            RESERVED -> "Reserved"
            COMPLETED -> "Completed"
        }

}


@Serializable
enum class EndpointStatus : CodeableEnumeration {
    
    /**
     * This endpoint is expected to be active and can be used.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * This endpoint is temporarily unavailable.
     */
    @SerialName("suspended")
    @JsonProperty("suspended")
    SUSPENDED,

    /**
     * This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken.
     */
    @SerialName("error")
    @JsonProperty("error")
    ERROR,

    /**
     * This endpoint is no longer to be used.
     */
    @SerialName("off")
    @JsonProperty("off")
    OFF,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * This endpoint is not intended for production usage.
     */
    @SerialName("test")
    @JsonProperty("test")
    TEST;

    override val code: String
        get() = when (this) {
            ACTIVE -> "active"
            SUSPENDED -> "suspended"
            ERROR -> "error"
            OFF -> "off"
            ENTEREDINERROR -> "entered-in-error"
            TEST -> "test"
        }


    override val system: String
        get() = "http://hl7.org/fhir/endpoint-status"

    override val definition: String?
        get() = when (this) {
            ACTIVE -> "This endpoint is expected to be active and can be used."
            SUSPENDED -> "This endpoint is temporarily unavailable."
            ERROR -> "This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken."
            OFF -> "This endpoint is no longer to be used."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            TEST -> "This endpoint is not intended for production usage."
        }

    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            SUSPENDED -> "Suspended"
            ERROR -> "Error"
            OFF -> "Off"
            ENTEREDINERROR -> "Entered in error"
            TEST -> "Test"
        }

}


@Serializable
enum class EpisodeOfCareStatus : CodeableEnumeration {
    
    /**
     * This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services.
     */
    @SerialName("planned")
    @JsonProperty("planned")
    PLANNED,

    /**
     * This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    @SerialName("waitlist")
    @JsonProperty("waitlist")
    WAITLIST,

    /**
     * This episode of care is current.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * This episode of care is on hold; the organization has limited responsibility for the patient (such as while on respite).
     */
    @SerialName("onhold")
    @JsonProperty("onhold")
    ONHOLD,

    /**
     * This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as "closed", "completed" or other similar terms.
     */
    @SerialName("finished")
    @JsonProperty("finished")
    FINISHED,

    /**
     * The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.
     */
    @SerialName("cancelled")
    @JsonProperty("cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR;

    override val code: String
        get() = when (this) {
            PLANNED -> "planned"
            WAITLIST -> "waitlist"
            ACTIVE -> "active"
            ONHOLD -> "onhold"
            FINISHED -> "finished"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
        }


    override val system: String
        get() = "http://hl7.org/fhir/episode-of-care-status"


    override val definition: String?
        get() = when (this) {
            PLANNED -> "This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services."
            WAITLIST -> "This episode has been placed on a waitlist, pending the episode being made active (or cancelled)."
            ACTIVE -> "This episode of care is current."
            ONHOLD -> "This episode of care is on hold; the organization has limited responsibility for the patient (such as while on respite)."
            FINISHED -> "This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as \"closed\", \"completed\" or other similar terms."
            CANCELLED -> "The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
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
        }


}


@Serializable
enum class ExpressionLanguage : CodeableEnumeration {

    /**
     * Clinical Quality Language.
     */
    @SerialName("test/cql")
    @JsonProperty("test/cql")
    TEXT_CQL,

    /**
     * FHIRPath.
     */
    @SerialName("text/fhirpath")
    @JsonProperty("text/fhirpath")
    TEXT_FHIRPATH,

    /**
     * FHIR's RESTful query syntax - typically independent of base URL.
     */
    @SerialName("application/x-fhir-query")
    @JsonProperty("application/x-fhir-query")
    APPLICATION_XFHIRQUERY;

    override val code: String
        get() = when (this) {
            TEXT_CQL -> "text/cql"
            TEXT_FHIRPATH -> "text/fhirpath"
            APPLICATION_XFHIRQUERY -> "application/x-fhir-query"
        }


    override val system: String
        get() = "http://hl7.org/fhir/expression-language"

    override val definition: String?
        get() = when (this) {
            TEXT_CQL -> "Clinical Quality Language."
            TEXT_FHIRPATH -> "FHIRPath."
            APPLICATION_XFHIRQUERY -> "FHIR's RESTful query syntax - typically independent of base URL."
        }

    override val display: String?
        get() = when (this) {
            TEXT_CQL -> "CQL"
            TEXT_FHIRPATH -> "FHIRPath"
            APPLICATION_XFHIRQUERY -> "FHIR Query"
        }
    
}


@Serializable
enum class FHIRSubstanceStatus : CodeableEnumeration {

    /**
     * The substance is considered for use or reference.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * The substance is considered for reference, but not for use.
     */
    @SerialName("inactive")
    @JsonProperty("inactive")
    INACTIVE,

    /**
     * The substance was entered in error.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR;

    override val code: String
        get() = when (this) {
            ACTIVE -> "active"
            INACTIVE -> "inactive"
            ENTEREDINERROR -> "entered-in-error"
        }


    override val system: String
        get() = "http://hl7.org/fhir/substance-status"


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The substance is considered for use or reference."
            INACTIVE -> "The substance is considered for reference, but not for use."
            ENTEREDINERROR -> "The substance was entered in error."
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            INACTIVE -> "Inactive"
            ENTEREDINERROR -> "Entered in Error"
        }

}


@Serializable
enum class FilterOperator : CodeableEnumeration {

    /**
     * The specified property of the code equals the provided value.
     */
    @SerialName("=")
    @JsonProperty("=")
    EQUAL,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).
     */
    @SerialName("is-a")
    @JsonProperty("is-a")
    ISA,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only).
     */
    @SerialName("descendent-of")
    @JsonProperty("descendent-of")
    DESCENDENTOF,

    /**
     * The specified property of the code does not have an is-a relationship with the provided value.
     */
    @SerialName("is-not-a")
    @JsonProperty("is-not-a")
    ISNOTA,

    /**
     * The specified property of the code  matches the regex specified in the provided value.
     */
    @SerialName("regex")
    @JsonProperty("regex")
    REGEX,

    /**
     * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @SerialName("in")
    @JsonProperty("in")
    IN,

    /**
     * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @SerialName("not-in")
    @JsonProperty("not-in")
    NOTIN,

    /**
     * Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).
     */
    @SerialName("generalizes")
    @JsonProperty("generalizes")
    GENERALIZES,

    /**
     * The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).
     */
    @SerialName("exists")
    @JsonProperty("exists")
    EXISTS;


    override val code: String
        get() = when (this) {
            EQUAL -> "="
            ISA -> "is-a"
            DESCENDENTOF -> "descendent-of"
            ISNOTA -> "is-not-a"
            REGEX -> "regex"
            IN -> "in"
            NOTIN -> "not-in"
            GENERALIZES -> "generalizes"
            EXISTS -> "exists"
        }


    override val system: String
        get() = "http://hl7.org/fhir/filter-operator"


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
        }


}


@Serializable
enum class LocationStatus : CodeableEnumeration {

    /**
     * The location is operational.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * The location is temporarily closed.
     */
    @SerialName("suspended")
    @JsonProperty("suspended")
    SUSPENDED,

    /**
     * The location is no longer used.
     */
    @SerialName("inactive")
    @JsonProperty("inactive")
    INACTIVE;

    override val code: String
        get() = when (this) {
            ACTIVE -> "active"
            SUSPENDED -> "suspended"
            INACTIVE -> "inactive"
        }


    override val system: String
        get() = "http://hl7.org/fhir/location-status"


    override val definition: String?
        get() = when (this) {
            ACTIVE -> "The location is operational."
            SUSPENDED -> "The location is temporarily closed."
            INACTIVE -> "The location is no longer used."
        }


    override val display: String?
        get() = when (this) {
            ACTIVE -> "Active"
            SUSPENDED -> "Suspended"
            INACTIVE -> "Inactive"
        }
    
}


@Serializable
enum class LocationMode : CodeableEnumeration {

    /**
     * The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).
     */
    @SerialName("instance")
    @JsonProperty("instance")
    INSTANCE,

    /**
     * The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).
     */
    @SerialName("kind")
    @JsonProperty("kind")
    KIND;


    override val code: String
        get() = when (this) {
            INSTANCE -> "instance"
            KIND -> "kind"
        }


    override val system: String
        get() = "http://hl7.org/fhir/location-mode"


    override val definition: String?
        get() = when (this) {
            INSTANCE -> "The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A)."
            KIND -> "The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.)."
        }


    override val display: String?
        get() = when (this) {
            INSTANCE -> "Instance"
            KIND -> "Kind"
        }

}


@Serializable
enum class NameUse : CodeableEnumeration {

    /**
     * Known as/conventional/the one you normally use.
     */
    @SerialName("usual")
    @JsonProperty("usual")
    USUAL,

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     */
    @SerialName("official")
    @JsonProperty("official")
    OFFICIAL,

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     */
    @SerialName("temp")
    @JsonProperty("temp")
    TEMP,

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name.
     */
    @SerialName("triaged")
    @JsonProperty("triaged")
    NICKNAME,

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons).
     */
    @SerialName("anonymous")
    @JsonProperty("anonymous")
    ANONYMOUS,

    /**
     * This name is no longer in use (or was never correct, but retained for records).
     */
    @SerialName("old")
    @JsonProperty("old")
    OLD,

    /**
     * A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name.
     */
    @SerialName("maiden")
    @JsonProperty("maiden")
    MAIDEN;

    override val code: String
        get() = when (this) {
            USUAL -> "usual"
            OFFICIAL -> "official"
            TEMP -> "temp"
            NICKNAME -> "nickname"
            ANONYMOUS -> "anonymous"
            OLD -> "old"
            MAIDEN -> "maiden"
        }


    override val system: String
        get() = "http://hl7.org/fhir/name-use"
    
    
    override val definition: String?
        get() = when (this) {
            USUAL -> "Known as/conventional/the one you normally use."
            OFFICIAL -> "The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called \"legal name\"."
            TEMP -> "A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations."
            NICKNAME -> "A name that is used to address the person in an informal manner, but is not part of their formal or usual name."
            ANONYMOUS -> "Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)."
            OLD -> "This name is no longer in use (or was never correct, but retained for records)."
            MAIDEN -> "A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name."
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
        }

}


@Serializable
enum class ObservationDataType : CodeableEnumeration {
    
    /**
     * A measured amount.
     */
    @SerialName("Quantity")
    @JsonProperty("Quantity")
    QUANTITY,

    /**
     * A coded concept from a reference terminology and/or text.
     */
    @SerialName("CodeableConcept")
    @JsonProperty("CodeableConcept")
    CODEABLECONCEPT,

    /**
     * A sequence of Unicode characters.
     */
    @SerialName("string")
    @JsonProperty("string")
    STRING,

    /**
     * true or false.
     */
    @SerialName("boolean")
    @JsonProperty("boolean")
    BOOLEAN,

    /**
     * A signed integer.
     */
    @SerialName("integer")
    @JsonProperty("integer")
    INTEGER,

    /**
     * A set of values bounded by low and high.
     */
    @SerialName("Range")
    @JsonProperty("Range")
    RANGE,

    /**
     * A ratio of two Quantity values - a numerator and a denominator.
     */
    @SerialName("Ratio")
    @JsonProperty("Ratio")
    RATIO,

    /**
     * A series of measurements taken by a device.
     */
    @SerialName("SampledData")
    @JsonProperty("SampledData")
    SAMPLEDDATA,

    /**
     * A time during the day, in the format hh:mm:ss.
     */
    @SerialName("time")
    @JsonProperty("time")
    TIME,

    /**
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication.
     */
    @SerialName("dateTime")
    @JsonProperty("dateTime")
    DATETIME,

    /**
     * A time range defined by start and end date/time.
     */
    @SerialName("Period")
    @JsonProperty("Period")
    PERIOD;


    override val code: String
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
        }



    override val system = "http://hl7.org/fhir/permitted-data-type"


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
        }

}


@Serializable
enum class ObservationRangeCategory : CodeableEnumeration {

    /**
     * Reference (Normal) Range for Ordinal and Continuous Observations.
     */
    @SerialName("reference")
    @JsonProperty("reference")
    REFERENCE,

    /**
     * Critical Range for Ordinal and Continuous Observations.
     */
    @SerialName("critical")
    @JsonProperty("critical")
    CRITICAL,

    /**
     * Absolute Range for Ordinal and Continuous Observations. Results outside this range are not possible.
     */
    @SerialName("absolute")
    @JsonProperty("absolute")
    ABSOLUTE;

    override val code: String
        get() = when (this) {
            REFERENCE -> "reference"
            CRITICAL -> "critical"
            ABSOLUTE -> "absolute"
        }


    override val system = "http://hl7.org/fhir/observation-range-category"

    override val definition: String?
        get() = when (this) {
            REFERENCE -> "Reference (Normal) Range for Ordinal and Continuous Observations."
            CRITICAL -> "Critical Range for Ordinal and Continuous Observations."
            ABSOLUTE -> "Absolute Range for Ordinal and Continuous Observations. Results outside this range are not possible."
        }

    override val display: String?
        get() = when (this) {
            REFERENCE -> "reference range"
            CRITICAL -> "critical range"
            ABSOLUTE -> "absolute range"
        }
    
}


@Serializable
enum class ObservationStatus : CodeableEnumeration {

    /**
     * The existence of the observation is registered, but there is no result yet available.
     */
    @SerialName("registered")
    @JsonProperty("registered")
    REGISTERED,

    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     */
    @SerialName("preliminary")
    @JsonProperty("preliminary")
    PRELIMINARY,

    /**
     * The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.
     */
    @SerialName("final")
    @JsonProperty("final")
    FINAL,

    /**
     * Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
     */
    @SerialName("amended")
    @JsonProperty("amended")
    AMENDED,

    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test result.
     */
    @SerialName("corrected")
    @JsonProperty("corrected")
    CORRECTED,

    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @SerialName("cancelled")
    @JsonProperty("cancelled")
    CANCELLED,

    /**
     * The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;


    override val code: String
        get() = when (this) {
            REGISTERED -> "registered"
            PRELIMINARY -> "preliminary"
            FINAL -> "final"
            AMENDED -> "amended"
            CORRECTED -> "corrected"
            CANCELLED -> "cancelled"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }



    override val system: String
        get() = "http://hl7.org/fhir/observation-status"


    override val definition: String?
        get() = when (this) {
            REGISTERED -> "The existence of the observation is registered, but there is no result yet available."
            PRELIMINARY -> "This is an initial or interim observation: data may be incomplete or unverified."
            FINAL -> "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied."
            AMENDED -> "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections."
            CORRECTED -> "Subsequent to being Final, the observation has been modified to correct an error in the test result."
            CANCELLED -> "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\")."
            ENTEREDINERROR -> "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which."
        }


    override val display: String?
        get() = when (this) {
            REGISTERED -> "Registered"
            PRELIMINARY -> "Preliminary"
            FINAL -> "Final"
            AMENDED -> "Amended"
            CORRECTED -> "Corrected"
            CANCELLED -> "Cancelled"
            ENTEREDINERROR -> "Entered in Error"
            UNKNOWN -> "Unknown"
        }


}


@Serializable
enum class ProvenanceEntityRole : CodeableEnumeration {

    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.
     */
    @SerialName("derivation")
    @JsonProperty("derivation")
    DERIVATION,

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     */
    @SerialName("revision")
    @JsonProperty("revision")
    REVISION,

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who might or might not be its original author.
     */
    @SerialName("quotation")
    @JsonProperty("quotation")
    QUOTATION,

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     */
    @SerialName("source")
    @JsonProperty("source")
    SOURCE,

    /**
     * A derivation for which the entity is removed from accessibility usually through the use of the Delete operation.
     */
    @SerialName("removal")
    @JsonProperty("removal")
    REMOVAL;

    override val code: String
        get() = when (this) {
            DERIVATION -> "derivation"
            REVISION -> "revision"
            QUOTATION -> "quotation"
            SOURCE -> "source"
            REMOVAL -> "removal"
        }


    override val system: String
        get() = "http://hl7.org/fhir/provenance-entity-role"

    override val definition: String?
        get() = when (this) {
            DERIVATION -> "A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
            REVISION -> "A derivation for which the resulting entity is a revised version of some original."
            QUOTATION -> "The repeat of (some or all of) an entity, such as text or image, by someone who might or might not be its original author."
            SOURCE -> "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight."
            REMOVAL -> "A derivation for which the entity is removed from accessibility usually through the use of the Delete operation."
        }

    override val display: String?
        get() = when (this) {
            DERIVATION -> "Derivation"
            REVISION -> "Revision"
            QUOTATION -> "Quotation"
            SOURCE -> "Source"
            REMOVAL -> "Removal"
        }


}


@Serializable
enum class PublicationStatus : CodeableEnumeration {

    /**
     * This resource is still under development and is not yet considered to be ready for normal use.
     */
    @SerialName("draft")
    @JsonProperty("draft")
    DRAFT,

    /**
     * This resource is ready for normal use.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    @SerialName("retired")
    @JsonProperty("retired")
    RETIRED,

    /**
     * The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;


    override val code: String
        get() = when (this) {
            DRAFT -> "draft"
            ACTIVE -> "active"
            RETIRED -> "retired"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/publication-status"


    override val definition: String?
        get() = when (this) {
            DRAFT -> "This resource is still under development and is not yet considered to be ready for normal use."
            ACTIVE -> "This resource is ready for normal use."
            RETIRED -> "This resource has been withdrawn or superseded and should no longer be used."
            UNKNOWN -> "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one."
        }

    override val display: String?
        get() = when (this) {
            DRAFT -> "Draft"
            ACTIVE -> "Active"
            RETIRED -> "Retired"
            UNKNOWN -> "Unknown"
        }
    
}


@Serializable
enum class RelatedArtifactType : CodeableEnumeration {

    /**
     * Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness.
     */
    @SerialName("documentation")
    @JsonProperty("documentation")
    DOCUMENTATION,

    /**
     * A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.
     */
    @SerialName("justification")
    @JsonProperty("justification")
    JUSTIFICATION,

    /**
     * Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource.
     */
    @SerialName("citation")
    @JsonProperty("citation")
    CITATION,

    /**
     * The previous version of the knowledge resource.
     */
    @SerialName("predecessor")
    @JsonProperty("predecessor")
    PREDECESSOR,

    /**
     * The next version of the knowledge resource.
     */
    @SerialName("successor")
    @JsonProperty("successor")
    SUCCESSOR,

    /**
     * The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting.
     */
    @SerialName("derived-from")
    @JsonProperty("derived-from")
    DERIVEDFROM,

    /**
     * The knowledge resource depends on the given related artifact.
     */
    @SerialName("depends-on")
    @JsonProperty("depends-on")
    DEPENDSON,

    /**
     * The knowledge resource is composed of the given related artifact.
     */
    @SerialName("composed-of")
    @JsonProperty("composed-of")
    COMPOSEDOF;

    override val code: String
        get() = when (this) {
            DOCUMENTATION -> "documentation"
            JUSTIFICATION -> "justification"
            CITATION -> "citation"
            PREDECESSOR -> "predecessor"
            SUCCESSOR -> "successor"
            DERIVEDFROM -> "derived-from"
            DEPENDSON -> "depends-on"
            COMPOSEDOF -> "composed-of"
        }


    override val system: String
        get() = "http://hl7.org/fhir/related-artifact-type"

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
        }
    
}


@Serializable
enum class RequestPriority : CodeableEnumeration {

    /**
     * The request has normal priority.
     */
    @SerialName("routine")
    @JsonProperty("routine")
    ROUTINE,

    /**
     * The request should be actioned promptly - higher priority than routine.
     */
    @SerialName("urgent")
    @JsonProperty("urgent")
    URGENT,

    /**
     * The request should be actioned as soon as possible - higher priority than urgent.
     */
    @SerialName("asap")
    @JsonProperty("asap")
    ASAP,

    /**
     * The request should be actioned immediately - highest possible priority.  E.g. an emergency.
     */
    @SerialName("stat")
    @JsonProperty("stat")
    STAT;


    override val code: String
        get() = when (this) {
            ROUTINE -> "routine"
            URGENT -> "urgent"
            ASAP -> "asap"
            STAT -> "stat"
        }


    override val system: String
        get() = "http://hl7.org/fhir/request-priority"

    override val definition: String?
        get() {
            return when (this) {
                ROUTINE -> "The request has normal priority."
                URGENT -> "The request should be actioned promptly - higher priority than routine."
                ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
                STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
            }
        }

    override val display: String?
        get() {
            return when (this) {
                ROUTINE -> "Routine"
                URGENT -> "Urgent"
                ASAP -> "ASAP"
                STAT -> "STAT"
            }
        }

}


@Serializable
enum class ServiceRequestStatus : CodeableEnumeration {

    /**
     * The request has been created but is not yet complete or ready for action.
     */
    @SerialName("draft")
    @JsonProperty("draft")
    DRAFT,

    /**
     * The request is in force and ready to be acted upon.
     */
    @SerialName("active")
    @JsonProperty("active")
    ACTIVE,

    /**
     * The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.
     */
    @SerialName("on-hold")
    @JsonProperty("on-hold")
    ONHOLD,

    /**
     * The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.
     */
    @SerialName("revoked")
    @JsonProperty("revoked")
    REVOKED,

    /**
     * The activity described by the request has been fully performed.  No further activity will occur.
     */
    @SerialName("completed")
    @JsonProperty("completed")
    COMPLETED,

    /**
     * This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
     */
    @SerialName("unknown")
    @JsonProperty("unknown")
    UNKNOWN;

    override val code: String
        get() = when (this) {
            DRAFT -> "draft"
            ACTIVE -> "active"
            ONHOLD -> "on-hold"
            REVOKED -> "revoked"
            COMPLETED -> "completed"
            ENTEREDINERROR -> "entered-in-error"
            UNKNOWN -> "unknown"
        }


    override val system: String
        get() = "http://hl7.org/fhir/request-status"


    override val definition: String?
        get() = when (this) {
            DRAFT -> "The request has been created but is not yet complete or ready for action."
            ACTIVE -> "The request is in force and ready to be acted upon."
            ONHOLD -> "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future."
            REVOKED -> "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur."
            COMPLETED -> "The activity described by the request has been fully performed.  No further activity will occur."
            ENTEREDINERROR -> "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".)."
            UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
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
        }
    
}


@Serializable
enum class ServiceRequestIntent : CodeableEnumeration {

    /**
     * The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.
     */
    @SerialName("proposal")
    @JsonProperty("proposal")
    PROPOSAL,

    /**
     * The request represents an intention to ensure something occurs without providing an authorization for others to act.
     */
    @SerialName("plan")
    @JsonProperty("plan")
    PLAN,

    /**
     * The request represents a legally binding instruction authored by a Patient or RelatedPerson.
     */
    @SerialName("directive")
    @JsonProperty("directive")
    DIRECTIVE,

    /**
     * The request represents a request/demand and authorization for action by a Practitioner.
     */
    @SerialName("order")
    @JsonProperty("order")
    ORDER,

    /**
     * The request represents an original authorization for action.
     */
    @SerialName("original-order")
    @JsonProperty("original-order")
    ORIGINALORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.
     */
    @SerialName("reflex-order")
    @JsonProperty("reflex-order")
    REFLEXORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
     */
    @SerialName("filler-order")
    @JsonProperty("filler-order")
    FILLERORDER,

    /**
     * An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
     */
    @SerialName("instance-order")
    @JsonProperty("instance-order")
    INSTANCEORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used.
     */
    @SerialName("option")
    @JsonProperty("option")
    OPTION;

    override val code: String
        get() = when (this) {
            PROPOSAL -> "proposal"
            PLAN -> "plan"
            DIRECTIVE -> "directive"
            ORDER -> "order"
            ORIGINALORDER -> "original-order"
            REFLEXORDER -> "reflex-order"
            FILLERORDER -> "filler-order"
            INSTANCEORDER -> "instance-order"
            OPTION -> "option"
        }


    override val system: String
        get() = "http://hl7.org/fhir/request-intent"
    

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
        }


}


@Serializable
enum class ServiceRequestPriority : CodeableEnumeration {

    /**
     * The request has normal priority.
     */
    @SerialName("routine")
    @JsonProperty("routine")
    ROUTINE,

    /**
     * The request should be actioned promptly - higher priority than routine.
     */
    @SerialName("urgent")
    @JsonProperty("urgent")
    URGENT,

    /**
     * The request should be actioned as soon as possible - higher priority than urgent.
     */
    @SerialName("asap")
    @JsonProperty("asap")
    ASAP,

    /**
     * The request should be actioned immediately - highest possible priority.  E.g. an emergency.
     */
    @SerialName("stat")
    @JsonProperty("stat")
    STAT;

    override val code: String
        get() = when (this) {
            ROUTINE -> "routine"
            URGENT -> "urgent"
            ASAP -> "asap"
            STAT -> "stat"
        }


    override val system: String
        get() = "http://hl7.org/fhir/request-priority"


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


@Serializable
enum class SortDirection : CodeableEnumeration {

    /**
     * Sort by the value ascending, so that lower values appear first.
     */
    @SerialName("ascending")
    @JsonProperty("ascending")
    ASCENDING,

    /**
     * Sort by the value descending, so that lower values appear last.
     */
    @SerialName("descending")
    @JsonProperty("descending")
    DESCENDING;


    override val code: String
        get() = when (this) {
            ASCENDING -> "ascending"
            DESCENDING -> "descending"
        }


    override val system: String
        get() = "http://hl7.org/fhir/sort-direction"

    override val definition: String?
        get() = when (this) {
            ASCENDING -> "Sort by the value ascending, so that lower values appear first."
            DESCENDING -> "Sort by the value descending, so that lower values appear last."
        }

    override val display: String?
        get() = when (this) {
            ASCENDING -> "Ascending"
            DESCENDING -> "Descending"
        }
    
}


@Serializable
enum class SpecimenStatus : CodeableEnumeration {

    /**
     * The physical specimen is present and in good condition.
     */
    @SerialName("available")
    @JsonProperty("available")
    AVAILABLE,

    /**
     * There is no physical specimen because it is either lost, destroyed or consumed.
     */
    @SerialName("unavailable")
    @JsonProperty("unavailable")
    UNAVAILABLE,

    /**
     * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
     */
    @SerialName("unsatisfactory")
    @JsonProperty("unsatisfactory")
    UNSATISFACTORY,

    /**
     * The specimen was entered in error and therefore nullified.
     */
    @SerialName("entered-in-error")
    @JsonProperty("entered-in-error")
    ENTEREDINERROR;

    override val code: String
        get() = when (this) {
            AVAILABLE -> "available"
            UNAVAILABLE -> "unavailable"
            UNSATISFACTORY -> "unsatisfactory"
            ENTEREDINERROR -> "entered-in-error"
        }


    override val system: String
        get() = "http://hl7.org/fhir/specimen-status"


    override val definition: String?
        get() = when (this) {
            AVAILABLE -> "The physical specimen is present and in good condition."
            UNAVAILABLE -> "There is no physical specimen because it is either lost, destroyed or consumed."
            UNSATISFACTORY -> "The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old."
            ENTEREDINERROR -> "The specimen was entered in error and therefore nullified."
        }

    override val display: String?
        get() = when (this) {
            AVAILABLE -> "Available"
            UNAVAILABLE -> "Unavailable"
            UNSATISFACTORY -> "Unsatisfactory"
            ENTEREDINERROR -> "Entered in Error"
        }
    
}


@Serializable
enum class UnitsOfTime : CodeableEnumeration {

    /**
     * second
     */
    @SerialName("s")
    @JsonProperty("s")
    S,

    /**
     * minute
     */
    @SerialName("min")
    @JsonProperty("min")
    MIN,

    /**
     * hour
     */
    @SerialName("h")
    @JsonProperty("h")
    H,

    /**
     * day
     */
    @SerialName("d")
    @JsonProperty("d")
    D,

    /**
     * week
     */
    @SerialName("wk")
    @JsonProperty("wk")
    WK,

    /**
     * month
     */
    @SerialName("mo")
    @JsonProperty("mo")
    MO,

    /**
     * year
     */
    @SerialName("a")
    @JsonProperty("a")
    A;

    override val code: String
        get() = when (this) {
            S -> "s"
            MIN -> "min"
            H -> "h"
            D -> "d"
            WK -> "wk"
            MO -> "mo"
            A -> "a"
        }


    override val system: String
        get() = "http://unitsofmeasure.org"

    override val definition: String?
        get() = when (this) {
            S -> "second"
            MIN -> "minute"
            H -> "hour"
            D -> "day"
            WK -> "week"
            MO -> "month"
            A -> "year"
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
        }
    
}


@Serializable
enum class TriggerType : CodeableEnumeration {

    /**
     * The trigger occurs in response to a specific named event, and no other information about the trigger is specified. Named events are completely pre-coordinated, and the formal semantics of the trigger are not provided.
     */
    @SerialName("named-event")
    @JsonProperty("named-event")
    NAMEDEVENT,

    /**
     * The trigger occurs at a specific time or periodically as described by a timing or schedule. A periodic event cannot have any data elements, but may have a name assigned as a shorthand for the event.
     */
    @SerialName("periodic")
    @JsonProperty("periodic")
    PERIODIC,

    /**
     * The trigger occurs whenever data of a particular type is changed in any way, either added, modified, or removed.
     */
    @SerialName("data-changed")
    @JsonProperty("data-changed")
    DATACHANGED,

    /**
     * The trigger occurs whenever data of a particular type is added.
     */
    @SerialName("data-added")
    @JsonProperty("data-added")
    DATAADDED,

    /**
     * The trigger occurs whenever data of a particular type is modified.
     */
    @SerialName("data-modified")
    @JsonProperty("data-modified")
    DATAMODIFIED,

    /**
     * The trigger occurs whenever data of a particular type is removed.
     */
    @SerialName("data-removed")
    @JsonProperty("data-removed")
    DATAREMOVED,

    /**
     * The trigger occurs whenever data of a particular type is accessed.
     */
    @SerialName("data-accessed")
    @JsonProperty("data-accessed")
    DATAACCESSED,

    /**
     * The trigger occurs whenever access to data of a particular type is completed.
     */
    @SerialName("data-access-ended")
    @JsonProperty("data-access-ended")
    DATAACCESSENDED;


    override val code: String
        get() = when (this) {
            NAMEDEVENT -> "named-event"
            PERIODIC -> "periodic"
            DATACHANGED -> "data-changed"
            DATAADDED -> "data-added"
            DATAMODIFIED -> "data-modified"
            DATAREMOVED -> "data-removed"
            DATAACCESSED -> "data-accessed"
            DATAACCESSENDED -> "data-access-ended"
        }


    override val system: String
        get() = "http://hl7.org/fhir/trigger-type"

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
        }

}
