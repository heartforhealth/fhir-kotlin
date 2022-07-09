package io.h4h.fhir



import io.h4h.fhir.mocks.*
import io.h4h.fhir.r4.base.*
import io.h4h.fhir.r4.extensions.*
import kotlinx.datetime.Instant
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import java.time.DateTimeException
import java.time.Month
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue




class TimingTest : SerializerTest() {

    // ==========================================================================
    // TimingRepeatComponent extensions
    // ==========================================================================


    @Test fun daysOfMonthTest() {
        val timing = TimingMocks.mondayThursdayAt8and20()

        // should serialize/deserialize
        timing.repeat?.daysOfMonth = listOf(1, 2, 3, 4)
        timing.kotlinxSerializeDeserializeResource()

        // should change the existing extension
        timing.repeat?.daysOfMonth = listOf(31)
        timing.kotlinxSerializationTest()

        // should fail
        assertThrows<DateTimeException> { timing.repeat?.daysOfMonth = listOf(32) }
    }


    @Test fun extensionsTest() {
        val timing = TimingMocks.mondayThursdayAt8and20()

        // should serialize/deserialize
        timing.repeat?.daysOfMonth = listOf(1, 2, 3, 4)
        timing.repeat?.monthsOfYear = listOf(Month.APRIL, Month.JULY)
        timing.repeat?.daysOfMonth = listOf(8)
        timing.repeat?.monthsOfYear = listOf(Month.APRIL, Month.DECEMBER)
        timing.kotlinxSerializeDeserializeResource()
    }


    // ==========================================================================
    // validate()
    // ==========================================================================

    @Test
    fun `validate() passes when Timing contains both 'duration' and 'durationUnit'`() {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                duration = 10.0,
                durationUnit = UnitsOfTime.MO
            )
        )

        assertDoesNotThrow { timing.validate() }
    }

    @Test
    fun `validate() throws Exception when Timing contains only one of 'duration' or 'durationUnit'`() {
        val timingWithoutDuration = Timing(
            repeat = TimingRepeatComponent(
                durationUnit = UnitsOfTime.MO
            )
        )

        val timingWithoutDurationUnit = Timing(
            repeat = TimingRepeatComponent(
                duration = 10.0
            )
        )

        assertThrows<TimingException> { timingWithoutDuration.validate() }
        assertThrows<TimingException> { timingWithoutDurationUnit.validate() }
    }

    @Test
    fun `validate() passes when Timing contains both 'period' and 'periodUnit'`() {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                period = 1.0,
                periodUnit = UnitsOfTime.D
            )
        )

        assertDoesNotThrow { timing.validate() }
    }

    @Test
    fun `validate() throws Exception when Timing contains only one of 'period' or 'periodUnit'`() {
        val timingWithoutPeriod = Timing(
            repeat = TimingRepeatComponent(
                periodUnit = UnitsOfTime.MO
            )
        )

        val timingWithoutPeriodUnit = Timing(
            repeat = TimingRepeatComponent(
                period = 10.0
            )
        )

        assertThrows<TimingException> { timingWithoutPeriod.validate() }
        assertThrows<TimingException> { timingWithoutPeriodUnit.validate() }
    }

    @Test
    fun `validate() throws Exception when Timing contains both 'when' and 'timeOfDay'`() {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                `when` = listOf(EventTiming.AC),
                timeOfDay = listOf("MORN")
            )
        )

        assertThrows<TimingException> { timing.validate() }
    }

    @Test
    fun `validate() throws Exception when Timing contains 'frequency' but not 'period' or 'boundsPeriod'`() {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                frequency = 1
            )
        )

        assertThrows<TimingException> { timing.validate() }
    }

    @Test
    fun `validate() passes when Timing contains 'frequency' and also 'period' or 'boundsPeriod'`() {
        val timingWithPeriod = Timing(
            repeat = TimingRepeatComponent(
                period = 1.0,
                periodUnit = UnitsOfTime.D,
                frequency = 1
            )
        )

        val timingWithBoundsPeriod = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period("2022-07-06", "2022-08-30"),
                frequency = 1
            )
        )

        assertDoesNotThrow { timingWithPeriod.validate() }
        assertDoesNotThrow { timingWithBoundsPeriod.validate() }
    }



    // ==========================================================================
    // isToday()
    // ==========================================================================

    @Test
    fun `isToday() returns TRUE when Timing contains a list of fixed event dates and the currentDate is part of the list`() {
        val timing = TimingMocks.fixedEventDatesContainingToday()
        assertDoesNotThrow { timing.validate() }

        assertTrue(timing.isToday())
    }

    @Test
    fun `isToday() returns FALSE when Timing contains a list of fixed event dates and the currentDate is NOT part of the list`() {
        val timing = TimingMocks.fixedEventDatesWithoutToday()
        assertDoesNotThrow { timing.validate() }

        assertFalse(timing.isToday())
    }

    @Test
    fun `isToday() returns TRUE when Timing is '3 times per day' and currentDate is WITHIN BOUNDS`() {
        val timing = TimingMocks.threeTimesPerDay()
        assertDoesNotThrow { timing.validate() }

        assertTrue(timing.isToday())
    }

    @Test
    fun `includesDate() returns TRUE when Timing is 'MON, TUE at 10' and currentDate is either MON or TUE`() {
        val monday = Instant.parse("2022-07-04T05:00:00.287542Z")
        val tuesday = Instant.parse("2022-07-05T05:00:00.287542Z")

        val timing = TimingMocks.mondayTuesdayAt10(monday)
        assertDoesNotThrow { timing.validate() }

        assertTrue(timing.includesDate(monday.toLocalDate()))
        assertTrue(timing.includesDate(tuesday.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'MON, TUE at 10' and currentDate is not MON or TUE`() {
        val friday = Instant.parse("2022-07-08T05:00:00.287542Z")

        val timing = TimingMocks.mondayTuesdayAt10(friday)
        assertDoesNotThrow { timing.validate() }

        assertFalse(timing.includesDate(friday.toLocalDate()))
    }

    @Test
    fun `includesDate() returns TRUE when Timing is 'MON, TUE at 10 or 20' and currentDate is either MON or TUE`() {
        val monday = Instant.parse("2022-07-04T05:00:00.287542Z")
        val thursday = Instant.parse("2022-07-07T05:00:00.287542Z")

        val timing = TimingMocks.mondayThursdayAt8and20(monday)
        assertDoesNotThrow { timing.validate() }

        assertTrue(timing.includesDate(monday.toLocalDate()))
        assertTrue(timing.includesDate(thursday.toLocalDate()))
    }

    @Test
    fun `includesDate() returns TRUE when Timing is 'every 2 weeks' and currentDate is WITHIN BOUNDS and valid`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyTwoWeeks_threeEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstWeek = Instant.parse("2022-07-06T05:00:00.287542Z")
        val secondWeek = Instant.parse("2022-07-20T05:00:00.287542Z")

        assertTrue(timing.includesDate(firstWeek.toLocalDate()))
        assertTrue(timing.includesDate(secondWeek.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'every 2 weeks' and currentDate is WITHIN BOUNDS but NOT valid`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyTwoWeeks_threeEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstInvalidDate = Instant.parse("2022-07-13T05:00:00.287542Z")
        val secondInvalidDate = Instant.parse("2022-07-27T05:00:00.287542Z")

        assertFalse(timing.includesDate(firstInvalidDate.toLocalDate()))
        assertFalse(timing.includesDate(secondInvalidDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'every 2 weeks' and currentDate valid but OUTSIDE BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyTwoWeeks_threeEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val outsideBoundsDate = Instant.parse("2022-08-03T05:00:00.287542Z")
        assertFalse(timing.includesDate(outsideBoundsDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns TRUE when Timing is '3 times per Week MON, WED or FRI' and currentDate is either MON, WED or FRI and WITHIN BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.threeTimesPerWeek_oneEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val monday = Instant.parse("2022-07-11T05:00:00.287542Z")
        val wednesday = Instant.parse("2022-07-20T05:00:00.287542Z")

        assertTrue(timing.includesDate(monday.toLocalDate()))
        assertTrue(timing.includesDate(wednesday.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is '3 times per Week MON, WED or FRI' and currentDate is either MON, WED or FRI but OUTSIDE BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.threeTimesPerWeek_oneEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val dateOutsideBounds = Instant.parse("2022-07-29T05:00:00.287542Z")
        assertFalse(timing.includesDate(dateOutsideBounds.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is '3 times per Week MON, WED or FRI' and currentDate is WITHIN BOUNDS but not MON, WED or FRI`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.threeTimesPerWeek_oneEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val tuesday = Instant.parse("2022-07-12T05:00:00.287542Z")
        assertFalse(timing.includesDate(tuesday.toLocalDate()))
    }

    @Test
    fun `includesDate() returns TRUE when Timing is 'every 4 days' and currentDate is valid and WITHIN BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyFourDays_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstDate = Instant.parse("2022-07-10T05:00:00.287542Z")
        val secondDate = Instant.parse("2022-07-18T05:00:00.287542Z")

        assertTrue(timing.includesDate(firstDate.toLocalDate()))
        assertTrue(timing.includesDate(secondDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'every 4 days' and currentDate is WITHIN BOUNDS but NOT valid`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyFourDays_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstDate = Instant.parse("2022-07-07T05:00:00.287542Z")
        val secondDate = Instant.parse("2022-07-21T05:00:00.287542Z")

        assertFalse(timing.includesDate(firstDate.toLocalDate()))
        assertFalse(timing.includesDate(secondDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'every 4 days' and currentDate is valid but OUTSIDE BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyFourDays_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstDate = Instant.parse("2022-07-30T05:00:00.287542Z")
        val secondDate = Instant.parse("2022-08-03T05:00:00.287542Z")

        assertFalse(timing.includesDate(firstDate.toLocalDate()))
        assertFalse(timing.includesDate(secondDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns TRUE when Timing is 'every 7 hours' and currentDate is WITHIN BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everySevenHours_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val firstDate = Instant.parse("2022-07-24T05:00:00.287542Z")
        val secondDate = Instant.parse("2022-07-07T05:00:00.287542Z")

        assertTrue(timing.includesDate(firstDate.toLocalDate()))
        assertTrue(timing.includesDate(secondDate.toLocalDate()))
    }

    @Test
    fun `includesDate() returns FALSE when Timing is 'every 7 hours' and currentDate is OUTSIDE BOUNDS`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everySevenHours_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        val outsideBoundsDate = Instant.parse("2022-08-02T05:00:00.287542Z")
        assertFalse(timing.includesDate(outsideBoundsDate.toLocalDate()))
    }


    // ==========================================================================
    // getDailyFrequency()
    // ==========================================================================

    @Test
    fun `getDailyFrequency() returns 3 when Timing is '3 times per day'`() {
        val timing = TimingMocks.threeTimesPerDay()
        assertDoesNotThrow { timing.validate() }

        assertEquals(3, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 1 when Timing is 'MON, TUE at 10'`() {
        val timing = TimingMocks.mondayTuesdayAt10()
        assertDoesNotThrow { timing.validate() }

        assertEquals(1, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 2 when Timing is 'MON, TUE at 10 and 20'`() {
        val timing = TimingMocks.mondayThursdayAt8and20()
        assertDoesNotThrow { timing.validate() }

        assertEquals(2, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 1 when Timing is '3 times per Week MON, WED or FRI, 1 each time'`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.threeTimesPerWeek_oneEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        assertEquals(1, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 4 when Timing is '3 times per Week MON, WED or FRI, 4 each time'`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.threeTimesPerWeek_fourEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        assertEquals(4, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 3 when Timing is 'every 2 weeks, 2 each time'`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyTwoWeeks_threeEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        assertEquals(3, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 2 when Timing is 'every 4 days, 2 each time'`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everyFourDays_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        assertEquals(2, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 6 when Timing is 'every 7 hours, 2 each time'`() {
        val periodStart = "2022-07-06T05:00:00.287542Z"
        val periodEnd = "2022-07-27T05:00:00.287542Z"

        val timing = TimingMocks.everySevenHours_twoEachTime(periodStart, periodEnd)
        assertDoesNotThrow { timing.validate() }

        assertEquals(6, timing.getDailyFrequency())
    }

    @Test
    fun `getDailyFrequency() returns 1 when Timing contains a list of event dates and the currentDate is part of the list`() {
        val timing = TimingMocks.fixedEventDatesContainingToday()
        assertDoesNotThrow { timing.validate() }

        assertEquals(1, timing.getDailyFrequency())
    }

}