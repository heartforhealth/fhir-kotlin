package io.h4h.fhir.mocks

import io.h4h.fhir.r4.base.Period
import io.h4h.fhir.r4.base.Timing
import io.h4h.fhir.r4.base.TimingRepeatComponent
import io.h4h.fhir.r4.base.UnitsOfTime
import io.h4h.fhir.utils.periodThatIncludesDate
import kotlinx.datetime.*




object TimingMocks {


    fun threeTimesPerDay() = Timing(
        repeat = TimingRepeatComponent(
            // limits
            boundsPeriod = periodThatIncludesDate(),

            // per 1 day
            period = 1.0,
            periodUnit = UnitsOfTime.D,

            // number of repetitions that should occur within a period
            frequency = 3
        )
    )

    fun mondayTuesdayAt10(currentDate: Instant = Clock.System.now()) = Timing(
        repeat = TimingRepeatComponent(
            // limits
            boundsPeriod = periodThatIncludesDate(currentDate),
            // days of the week
            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.MON, io.h4h.fhir.r4.base.DayOfWeek.TUE),
            // Time of day for action
            timeOfDay = listOf("10:00")
        )
    )


    fun mondayThursdayAt8and20(currentDate: Instant = Clock.System.now()) = Timing(
        repeat = TimingRepeatComponent(
            // limits
            boundsPeriod = periodThatIncludesDate(currentDate),
            // days of the week
            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.MON, io.h4h.fhir.r4.base.DayOfWeek.THU),
            // Time of day for action
            timeOfDay = listOf("08:00", "20:00")
        )
    )

    fun everyTwoWeeks_threeEachTime(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 2.0,
            periodUnit = UnitsOfTime.WK,

            frequency = 3
        )
    )

    fun threeTimesPerWeek_oneEachTime(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 1.0,
            periodUnit = UnitsOfTime.D,

            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.MON, io.h4h.fhir.r4.base.DayOfWeek.WED, io.h4h.fhir.r4.base.DayOfWeek.FRI),

            frequency = 1
        )
    )

    fun threeTimesPerWeek_fourEachTime(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 1.0,
            periodUnit = UnitsOfTime.D,

            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.MON, io.h4h.fhir.r4.base.DayOfWeek.WED, io.h4h.fhir.r4.base.DayOfWeek.FRI),

            frequency = 4
        )
    )

    fun everyFourDays_twoEachTime(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 4.0,
            periodUnit = UnitsOfTime.D,

            frequency = 2
        )
    )

    fun everySevenHours_twoEachTime(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 7.0,
            periodUnit = UnitsOfTime.H,

            frequency = 2
        )
    )

    fun fixedEventDatesContainingToday() = Timing(
        event = listOf(
            Clock.System.now().toString(),
            "2022-07-14T05:00:00.287542Z",
            "2022-07-22T05:00:00.287542Z"
        )
    )

    fun fixedEventDatesWithoutToday() = Timing(
        event = listOf(
            "2022-07-14T05:00:00.287542Z",
            "2022-07-22T05:00:00.287542Z"
        )
    )

    // TODO
    fun onlyTuesdaysFromBeginningOfEachMonth(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            // each month
            period = 1.0,
            periodUnit = UnitsOfTime.MO,

            // every Tuesday
            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.TUE),

            // just the first week Tuesday of the month
            count = 1,

            frequency = 1
        )
    )

    //TODO
    fun onlyTuesdaysFromFirstTwoWeeksOfEachMonth(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            // each month
            period = 1.0,
            periodUnit = UnitsOfTime.MO,

            // every Tuesday
            dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.TUE),

            // just the first two weeks Tuesdays of the month
            count = 2,

            frequency = 1
        )
    )

    // TODO
    fun firstTuesdayOfTheMonth(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(

        )
    )

    // TODO
    fun firstTuesdayAndFridayOfTheMonth(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(

        )
    )

    // TODO
    fun firstSevenDaysOfTheMonth(
        periodStart: String,
        periodEnd: String
    ) = Timing(
        repeat = TimingRepeatComponent(

        )
    )


}
