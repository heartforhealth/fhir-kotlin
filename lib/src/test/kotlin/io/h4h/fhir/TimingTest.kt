package io.h4h.fhir



import io.h4h.fhir.mocks.*
import io.h4h.fhir.r4.base.*
import kotlin.test.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import java.time.DateTimeException
import java.time.Month


class TimingTest : SerializerTest() {

    // ============================================================
    // TimingRepeatComponent extensions
    // ============================================================

    @Test fun daysOfMonthTest() {
        val timing = mondayThursdayAt8and20()

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
        val timing = mondayThursdayAt8and20()

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

}