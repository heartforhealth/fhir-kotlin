package io.h4h.fhir.r4.base


import kotlinx.serialization.Serializable




@Serializable
enum class AddressUse {
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


    fun toCode() = this.name

    val system: String = "http://hl7.org/fhir/address-use"

    val definition: String
        get() = when (this) {
            home -> "A communication address at a home."
            work -> "An office address. First choice for business related contacts during business hours."
            temp -> "A temporary address. The period can provide more detailed information."
            old -> "This address is no longer in use (or was never correct but retained for records)."
            billing -> "An address to be used to send bills, invoices, receipts etc."
        }

    val display: String?
        get() = when (this) {
            home -> "Home"
            work -> "Work"
            temp -> "Temporary"
            old -> "Old / Incorrect"
            billing -> "Billing"
        }

}




@Serializable
enum class AddressType {
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

    fun toCode(): String? {
        return when (this) {
            POSTAL -> "postal"
            PHYSICAL -> "physical"
            BOTH -> "both"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            POSTAL -> "http://hl7.org/fhir/address-type"
            PHYSICAL -> "http://hl7.org/fhir/address-type"
            BOTH -> "http://hl7.org/fhir/address-type"
            NULL -> null
        }

    val definition: String?
        get() = when (this) {
            POSTAL -> "Mailing addresses - PO Boxes and care-of addresses."
            PHYSICAL -> "A physical address that can be visited."
            BOTH -> "An address that is both physical and postal."
            NULL -> null
        }
    val display: String?
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
enum class ContactPointSystem {
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

    fun toCode(): String? {
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

    fun getSystem(): String? {
        return when (this) {
            PHONE -> "http://hl7.org/fhir/contact-point-system"
            FAX -> "http://hl7.org/fhir/contact-point-system"
            EMAIL -> "http://hl7.org/fhir/contact-point-system"
            PAGER -> "http://hl7.org/fhir/contact-point-system"
            URL -> "http://hl7.org/fhir/contact-point-system"
            SMS -> "http://hl7.org/fhir/contact-point-system"
            OTHER -> "http://hl7.org/fhir/contact-point-system"
            NULL -> null
        }
    }

    val definition: String?
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

    val display: String?
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
enum class ContactPointUse {
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

    fun toCode(): String? {
        return when (this) {
            HOME -> "home"
            WORK -> "work"
            TEMP -> "temp"
            OLD -> "old"
            MOBILE -> "mobile"
            NULL -> null
        }
    }

    fun getSystem(): String? {
        return when (this) {
            HOME -> "http://hl7.org/fhir/contact-point-use"
            WORK -> "http://hl7.org/fhir/contact-point-use"
            TEMP -> "http://hl7.org/fhir/contact-point-use"
            OLD -> "http://hl7.org/fhir/contact-point-use"
            MOBILE -> "http://hl7.org/fhir/contact-point-use"
            NULL -> null
        }
    }

    val definition: String?
        get() = when (this) {
            HOME -> "A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available."
            WORK -> "An office contact point. First choice for business related contacts during business hours."
            TEMP -> "A temporary contact point. The period can provide more detailed information."
            OLD -> "This contact point is no longer in use (or was never correct, but retained for records)."
            MOBILE -> "A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business."
            NULL -> null
        }

    val display: String?
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
enum class DayOfWeek {
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

    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class DaysOfWeek {
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


    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class EventTiming {
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

    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class EncounterStatus {
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

    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class EncounterLocationStatus {
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


    fun toCode(): String? {
        return when (this) {
            PLANNED -> "planned"
            ACTIVE -> "active"
            RESERVED -> "reserved"
            COMPLETED -> "completed"
            NULL -> null
        }
    }


    val system: String?
        get() = when (this) {
            PLANNED -> "http://hl7.org/fhir/encounter-location-status"
            ACTIVE -> "http://hl7.org/fhir/encounter-location-status"
            RESERVED -> "http://hl7.org/fhir/encounter-location-status"
            COMPLETED -> "http://hl7.org/fhir/encounter-location-status"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            PLANNED -> "The patient is planned to be moved to this location at some point in the future."
            ACTIVE -> "The patient is currently at this location, or was between the period specified.\r\rA system may update these records when the patient leaves the location to either reserved, or completed."
            RESERVED -> "This location is held empty for this patient."
            COMPLETED -> "The patient was at this location during the period specified.\r\rNot to be used when the patient is currently at the location."
            NULL -> null
        }


    val display: String?
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
enum class EndpointStatus {
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

    fun toCode(): String? {
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

    val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/endpoint-status"
            SUSPENDED -> "http://hl7.org/fhir/endpoint-status"
            ERROR -> "http://hl7.org/fhir/endpoint-status"
            OFF -> "http://hl7.org/fhir/endpoint-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/endpoint-status"
            TEST -> "http://hl7.org/fhir/endpoint-status"
            NULL -> null
        }

    val definition: String?
        get() = when (this) {
            ACTIVE -> "This endpoint is expected to be active and can be used."
            SUSPENDED -> "This endpoint is temporarily unavailable."
            ERROR -> "This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken."
            OFF -> "This endpoint is no longer to be used."
            ENTEREDINERROR -> "This instance should not have been part of this patient's medical record."
            TEST -> "This endpoint is not intended for production usage."
            NULL -> null
        }

    val display: String?
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
enum class EpisodeOfCareStatus {
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

    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class FHIRSubstanceStatus {
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

    fun toCode(): String? {
        return when (this) {
            ACTIVE -> "active"
            INACTIVE -> "inactive"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/substance-status"
            INACTIVE -> "http://hl7.org/fhir/substance-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/substance-status"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            ACTIVE -> "The substance is considered for use or reference."
            INACTIVE -> "The substance is considered for reference, but not for use."
            ENTEREDINERROR -> "The substance was entered in error."
            NULL -> null
        }


    val display: String?
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
enum class IdentifierUse {
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

    fun toCode(): String? {
        return when (this) {
            USUAL -> "usual"
            OFFICIAL -> "official"
            TEMP -> "temp"
            SECONDARY -> "secondary"
            OLD -> "old"
            NULL -> null
        }
    }

    fun getSystem(): String? {
        return when (this) {
            USUAL -> "http://hl7.org/fhir/identifier-use"
            OFFICIAL -> "http://hl7.org/fhir/identifier-use"
            TEMP -> "http://hl7.org/fhir/identifier-use"
            SECONDARY -> "http://hl7.org/fhir/identifier-use"
            OLD -> "http://hl7.org/fhir/identifier-use"
            NULL -> null
        }
    }

    val definition: String?
        get() = when (this) {
            USUAL -> "The identifier recommended for display and use in real-world interactions."
            OFFICIAL -> "The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use."
            TEMP -> "A temporary identifier."
            SECONDARY -> "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context."
            OLD -> "The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc."
            NULL -> null
        }
    val display: String?
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
enum class LocationStatus {
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

    fun toCode(): String? {
        return when (this) {
            ACTIVE -> "active"
            SUSPENDED -> "suspended"
            INACTIVE -> "inactive"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            ACTIVE -> "http://hl7.org/fhir/location-status"
            SUSPENDED -> "http://hl7.org/fhir/location-status"
            INACTIVE -> "http://hl7.org/fhir/location-status"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            ACTIVE -> "The location is operational."
            SUSPENDED -> "The location is temporarily closed."
            INACTIVE -> "The location is no longer used."
            NULL -> null
        }


    val display: String?
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
enum class LocationMode {
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


    fun toCode(): String? {
        return when (this) {
            INSTANCE -> "instance"
            KIND -> "kind"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            INSTANCE -> "http://hl7.org/fhir/location-mode"
            KIND -> "http://hl7.org/fhir/location-mode"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            INSTANCE -> "The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A)."
            KIND -> "The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.)."
            NULL -> null
        }


    val display: String?
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
enum class NameUse {
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

    fun toCode(): String? {
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

    val system: String?
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
    val definition: String?
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
    val display: String?
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
enum class NarrativeStatus {
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

    fun toCode(): String? {
        return when (this) {
            GENERATED -> "generated"
            EXTENSIONS -> "extensions"
            ADDITIONAL -> "additional"
            EMPTY -> "empty"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            GENERATED -> "http://hl7.org/fhir/narrative-status"
            EXTENSIONS -> "http://hl7.org/fhir/narrative-status"
            ADDITIONAL -> "http://hl7.org/fhir/narrative-status"
            EMPTY -> "http://hl7.org/fhir/narrative-status"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            GENERATED -> "The contents of the narrative are entirely generated from the core elements in the content."
            EXTENSIONS -> "The contents of the narrative are entirely generated from the core elements in the content and some of the content is generated from extensions. The narrative SHALL reflect the impact of all modifier extensions."
            ADDITIONAL -> "The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection."
            EMPTY -> "The contents of the narrative are some equivalent of \"No human-readable text provided in this case\"."
            NULL -> null
        }


    val display: String?
        get() = when (this) {
            GENERATED -> "Generated"
            EXTENSIONS -> "Extensions"
            ADDITIONAL -> "Additional"
            EMPTY -> "Empty"
            NULL -> null
        }

}

@Serializable
enum class ObservationStatus {
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




    val system: String? = "http://hl7.org/fhir/observation-status"


    val definition: String?
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


    val display: String?
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
enum class ProvenanceEntityRole {
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

    fun toCode(): String? {
        return when (this) {
            DERIVATION -> "derivation"
            REVISION -> "revision"
            QUOTATION -> "quotation"
            SOURCE -> "source"
            REMOVAL -> "removal"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            DERIVATION -> "http://hl7.org/fhir/provenance-entity-role"
            REVISION -> "http://hl7.org/fhir/provenance-entity-role"
            QUOTATION -> "http://hl7.org/fhir/provenance-entity-role"
            SOURCE -> "http://hl7.org/fhir/provenance-entity-role"
            REMOVAL -> "http://hl7.org/fhir/provenance-entity-role"
            NULL -> null
        }

    val definition: String?
        get() = when (this) {
            DERIVATION -> "A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
            REVISION -> "A derivation for which the resulting entity is a revised version of some original."
            QUOTATION -> "The repeat of (some or all of) an entity, such as text or image, by someone who might or might not be its original author."
            SOURCE -> "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight."
            REMOVAL -> "A derivation for which the entity is removed from accessibility usually through the use of the Delete operation."
            NULL -> null
        }

    val display: String?
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
enum class QuantityComparator {
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

    fun toCode(): String? {
        return when (this) {
            LESS_THAN -> "<"
            LESS_OR_EQUAL -> "<="
            GREATER_OR_EQUAL -> ">="
            GREATER_THAN -> ">"
            NULL -> null
        }
    }

    fun getSystem(): String? {
        return when (this) {
            LESS_THAN -> "http://hl7.org/fhir/quantity-comparator"
            LESS_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
            GREATER_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
            GREATER_THAN -> "http://hl7.org/fhir/quantity-comparator"
            NULL -> null
        }
    }

    val definition: String?
        get() = when (this) {
            LESS_THAN -> "The actual value is less than the given value."
            LESS_OR_EQUAL -> "The actual value is less than or equal to the given value."
            GREATER_OR_EQUAL -> "The actual value is greater than or equal to the given value."
            GREATER_THAN -> "The actual value is greater than the given value."
            NULL -> null
        }

    val display: String?
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



    val path: String?
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
enum class ServiceRequestStatus {
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

    fun toCode(): String? {
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

    val system: String?
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


    val definition: String?
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


    val display: String?
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
enum class ServiceRequestIntent {
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

    fun toCode(): String? {
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

    val system: String?
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
    val definition: String?
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


    val display: String?
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
enum class ServiceRequestPriority {
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

    fun toCode(): String? {
        return when (this) {
            ROUTINE -> "routine"
            URGENT -> "urgent"
            ASAP -> "asap"
            STAT -> "stat"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            ROUTINE -> "http://hl7.org/fhir/request-priority"
            URGENT -> "http://hl7.org/fhir/request-priority"
            ASAP -> "http://hl7.org/fhir/request-priority"
            STAT -> "http://hl7.org/fhir/request-priority"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            ROUTINE -> "The request has normal priority."
            URGENT -> "The request should be actioned promptly - higher priority than routine."
            ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
            STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
            NULL -> null
        }


    val display: String?
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
enum class SpecimenStatus {
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

    fun toCode(): String? {
        return when (this) {
            AVAILABLE -> "available"
            UNAVAILABLE -> "unavailable"
            UNSATISFACTORY -> "unsatisfactory"
            ENTEREDINERROR -> "entered-in-error"
            NULL -> null
        }
    }

    val system: String?
        get() = when (this) {
            AVAILABLE -> "http://hl7.org/fhir/specimen-status"
            UNAVAILABLE -> "http://hl7.org/fhir/specimen-status"
            UNSATISFACTORY -> "http://hl7.org/fhir/specimen-status"
            ENTEREDINERROR -> "http://hl7.org/fhir/specimen-status"
            NULL -> null
        }


    val definition: String?
        get() = when (this) {
            AVAILABLE -> "The physical specimen is present and in good condition."
            UNAVAILABLE -> "There is no physical specimen because it is either lost, destroyed or consumed."
            UNSATISFACTORY -> "The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old."
            ENTEREDINERROR -> "The specimen was entered in error and therefore nullified."
            NULL -> null
        }

    val display: String?
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
enum class UnitsOfTime {
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

    fun toCode(): String? {
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

    val system: String?
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
    val definition: String?
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
    val display: String?
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
