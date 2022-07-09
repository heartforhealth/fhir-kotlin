package io.h4h.fhir.r4.base

import kotlinx.datetime.Month
import kotlinx.serialization.Serializable
import java.time.MonthDay
import java.time.temporal.ChronoField


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
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
 */
@Serializable
data class Timing(

    // ============================================================
    // Element requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Identifies specific times when the event occurs.
     */
    val event: List<String>? = null,

    /**
     * A set of rules that describe when the event is scheduled.
     */
    val repeat: TimingRepeatComponent? = null,

    /**
     * A code for the timing schedule (or just text in code.text). Some codes such as BID are ubiquitous, but many institutions define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the exception that .repeat.bounds still applies over the code (and is not contained in the code).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/timing-abbreviation")
     */
    val code: CodeableConcept? = null

) : Element


@Serializable
data class TimingRepeatComponent(

    // ============================================================
    // Element requirements
    // ============================================================
    override val id: String? = null,
    override var extension: MutableList<Extension>? = null,
    // ============================================================
    // ============================================================

    /**
     * Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule.
     */
    val boundsDuration: Quantity? = null,
    val boundsRange: Range? = null,
    val boundsPeriod: Period? = null,

    /**
     * A total count of the desired number of repetitions across the duration of the entire timing specification. If countMax is present, this element indicates the lower bound of the allowed range of count values.
     */
    val count: Int? = null,

    /**
     * If present, indicates that the count is a range - so to perform the action between [count] and [countMax] times.
     */
    val countMax: Int? = null,

    /**
     * How long this thing happens for when it happens. If durationMax is present, this element indicates the lower bound of the allowed range of the duration.
     */
    val duration: Double? = null,

    /**
     * If present, indicates that the duration is a range - so to perform the action between [duration] and [durationMax] time length.
     */
    val durationMax: Double? = null,

    /**
     * The units of time for the duration, in UCUM units.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/units-of-time")
     */
    val durationUnit: UnitsOfTime? = null,

    /**
     * The number of times to repeat the action within the specified period. If frequencyMax is present, this element indicates the lower bound of the allowed range of the frequency.
     */
    val frequency: Int? = null,

    /**
     * If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range.
     */
    val frequencyMax: Int? = null,

    /**
     * Indicates the duration of time over which repetitions are to occur; e.g. to express "3 times per day", 3 would be the frequency and "1 day" would be the period. If periodMax is present, this element indicates the lower bound of the allowed range of the period length.
     */
    val period: Double? = null,

    /**
     * If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as "do this once every 3-5 days.
     */
    val periodMax: Double? = null,

    /**
     * The units of time for the period in UCUM units.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/units-of-time")
     */
    val periodUnit: UnitsOfTime? = null,

    /**
     * If one or more days of week is provided, then the action happens only on the specified day(s).
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/days-of-week")
     */
    val dayOfWeek: List<DayOfWeek>? = null,

    /**
     * Specified time of day for action to take place.
     */
    val timeOfDay: List<String>? = null,

    /**
     * An approximate time period during the day, potentially linked to an event of daily living that indicates when the action should occur.
     * @Binding(valueSet = "http://hl7.org/fhir/ValueSet/event-timing")
     */
    //
    val `when`: List<EventTiming>? = null,

    /**
     * The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event.
     */
    val offset: Int? = null

) : Element




// ============================================================
// TimingRepeatComponent extensions
// ============================================================
private const val daysOfMonthExtension = "daysOfMonth"
private const val monthsOfYearExtension = "monthsOfYear"


var TimingRepeatComponent.daysOfMonth: List<Int>
    get() {
        return when (val value = extension?.getString(daysOfMonthExtension)) {
            null -> listOf()
            else -> value.split(",").map { it.toInt() }
        }
    }
    set(days) {
        // guard
        for (day in days) {
            // check if day is valid, if not it will throw
            ChronoField.DAY_OF_MONTH.checkValidValue(day.toLong())
        }
        // new extension
        val extension = Extension(url = daysOfMonthExtension, valueString = days.joinToString())
        // add the new extension
        upsert(extension)
    }



var TimingRepeatComponent.monthsOfYear: List<Month>
    get() {
        return when (val value = extension?.getString(monthsOfYearExtension)) {
            null -> listOf()
            else -> value.split(",").map { Month.valueOf(it) }
        }
    }
    set(months) {
        // new extension
        val extension = Extension(url = monthsOfYearExtension, valueString = months.joinToString())
        // add the new extension
        upsert(extension)
    }




// ==========================================================================
// TimingException
// ==========================================================================

class TimingException(message: String) : IllegalStateException(message)



// ==========================================================================
// Validation
// ==========================================================================

/**
 * When the event is to occur:
+ Rule: if there's a duration, there needs to be duration units
+ Rule: if there's a period, there needs to be period units
+ Rule: If there's a timeOfDay, there cannot be a when, or vice versa

+ TODO: Rule: duration SHALL be a non-negative value
+ TODO: Rule: period SHALL be a non-negative value
+ TODO: Rule: If there's a periodMax, there must be a period
+ TODO: Rule: If there's a durationMax, there must be a duration
+ TODO: Rule: If there's a countMax, there must be a count
+ TODO: Rule: If there's an offset, there must be a when (and not C, CM, CD, CV)
 */
fun Timing.validate() {
    // guard
    val repeat = this.repeat ?: return

    when {
        // Rule: if there's a duration, there needs to be duration units
        (repeat.duration != null && repeat.durationUnit == null)
        -> throw TimingException("Rule: if there's a duration, there needs to be duration units, and vice versa")
        // Rule: if there's a duration, there needs to be duration units
        (repeat.duration == null && repeat.durationUnit != null)
        -> throw TimingException("Rule: if there's a duration, there needs to be duration units, and vice versa")

        // Rule: if there's a period, there needs to be period units
        (repeat.period != null && repeat.periodUnit == null)
        -> throw TimingException("Rule: if there's a period, there needs to be period units, and vice versa")
        // Rule: if there's a period, there needs to be period units
        (repeat.period == null && repeat.periodUnit != null)
        -> throw TimingException("Rule: if there's a period, there needs to be period units, and vice versa")

        // Rule: If there's a timeOfDay, there cannot be a when, or vice versa
        (repeat.timeOfDay != null && repeat.`when` != null)
        -> throw TimingException("Rule: If there's a timeOfDay, there cannot be a when, or vice versa")

        // Assumption 1: frequency exists when there is some bound specified
        (repeat.frequency != null && repeat.period == null && repeat.boundsPeriod == null)
        -> throw TimingException("Assumption: frequency exists solely within some period/bounds")
    }

    // fields that are not implemented
    repeat.boundsDuration?.let { throw NotImplementedError("Timing 'boundsDuration' not implemented") }
    repeat.boundsRange?.let { throw NotImplementedError("Timing 'boundsRange' not implemented") }

    // TODO: parse this.code TimingAbbreviation
    code?.let { throw NotImplementedError("Timing 'code' (TimingAbbreviation) not implemented") }
}
