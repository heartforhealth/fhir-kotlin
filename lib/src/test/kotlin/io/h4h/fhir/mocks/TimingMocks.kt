package io.h4h.fhir.mocks

import io.h4h.fhir.r4.base.*
import io.h4h.fhir.utils.periodThatIncludesDate
import kotlinx.datetime.*
import java.time.Month


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
        periodStart: Instant,
        periodEnd: Instant
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 2.0,
            periodUnit = UnitsOfTime.WK,

            frequency = 3
        )
    )

    fun threeTimesPerWeek_oneEachTime(
        periodStart: Instant,
        periodEnd: Instant
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
        periodStart: Instant,
        periodEnd: Instant
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
        periodStart: Instant,
        periodEnd: Instant
    ) = Timing(
        repeat = TimingRepeatComponent(
            boundsPeriod = Period(periodStart, periodEnd),

            period = 4.0,
            periodUnit = UnitsOfTime.D,

            frequency = 2
        )
    )

    fun everySevenHours_twoEachTime(
        periodStart: Instant,
        periodEnd: Instant
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

    fun specificDaysEveryMonthAt10And20(
        periodStart: Instant,
        periodEnd: Instant
    ): Timing {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period(periodStart, periodEnd),

                // every month
                period = 1.0,
                periodUnit = UnitsOfTime.MO,

                // at 10:00 and 22:00
                timeOfDay = listOf("10:00", "20:00"),

                // 1 each time
                frequency = 1
            )
        )

        timing.repeat?.daysOfMonth = listOf(3, 10, 18)

        return timing
    }

    fun specificWeekMonthAndDayEveryMonth(
        periodStart: Instant,
        periodEnd: Instant
    ) : Timing {
        // every May, July, September, the second week of the month, on Wednesdays, at 10 and 20
        val timing = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period(periodStart, periodEnd),

                period = 1.0,
                periodUnit = UnitsOfTime.A,

                // on Wednesdays
                dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.WED),

                // at 10:00 and 22:00
                timeOfDay = listOf("10:00", "20:00"),

                // 1 each time
                frequency = 1
            )
        )

        timing.repeat?.monthsOfYear = listOf(Month.MAY, Month.JULY, Month.SEPTEMBER)

        // second week of each month:
        timing.repeat?.daysOfMonth = listOf(8, 9, 10, 11, 12, 13, 14)

        return timing
    }

    fun onlyTuesdaysFromBeginningOfEachMonth(
        periodStart: Instant,
        periodEnd: Instant
    ) : Timing {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period(periodStart, periodEnd),

                // each month
                period = 1.0,
                periodUnit = UnitsOfTime.MO,

                // every Tuesday
                dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.TUE),

                frequency = 1
            )
        )

        // first week of the month
        timing.repeat?.daysOfMonth = listOf(1, 2, 3, 4, 5, 6, 7)

        return timing
    }

    fun onlyTuesdaysFromFirstTwoWeeksOfEachMonth(
        periodStart: Instant,
        periodEnd: Instant
    ) : Timing {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period(periodStart, periodEnd),

                // each month
                period = 1.0,
                periodUnit = UnitsOfTime.MO,

                // every Tuesday
                dayOfWeek = listOf(io.h4h.fhir.r4.base.DayOfWeek.TUE),

                frequency = 1
            )
        )

        // first 2 weeks of the month
        timing.repeat?.daysOfMonth = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)

        return timing
    }

    fun first15DaysOfTheMonth(
        periodStart: Instant,
        periodEnd: Instant
    ): Timing {
        val timing = Timing(
            repeat = TimingRepeatComponent(
                boundsPeriod = Period(periodStart, periodEnd),

                // each month
                period = 1.0,
                periodUnit = UnitsOfTime.MO,

                frequency = 1
            )
        )

        // last 7 days
        timing.repeat?.daysOfMonth = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

        return timing
    }

}
