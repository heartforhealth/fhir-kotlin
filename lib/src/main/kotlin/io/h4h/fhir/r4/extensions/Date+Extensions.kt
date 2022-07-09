package io.h4h.fhir.r4.extensions

import io.h4h.fhir.r4.base.DayOfWeek
import io.h4h.fhir.r4.base.Period
import kotlinx.datetime.*



// ==========================================================================
// Date/Time
// ==========================================================================

val defaultSystemTimezone = TimeZone.currentSystemDefault()


fun LocalDate.Companion.now(timeZone: TimeZone = defaultSystemTimezone)
    = Clock.System.todayIn(timeZone)


fun LocalDate.isToday(): Boolean = this.compareTo(LocalDate.now()) == 0


fun Instant.toLocalDate() = this.toLocalDateTime(defaultSystemTimezone).date


// ==========================================================================
// DayOfWeek
// ==========================================================================

val java.time.DayOfWeek.FHIRDayOfWeek: DayOfWeek
    get() = when (this) {
        java.time.DayOfWeek.MONDAY -> DayOfWeek.MON
        java.time.DayOfWeek.TUESDAY -> DayOfWeek.TUE
        java.time.DayOfWeek.WEDNESDAY -> DayOfWeek.WED
        java.time.DayOfWeek.THURSDAY -> DayOfWeek.THU
        java.time.DayOfWeek.FRIDAY -> DayOfWeek.FRI
        java.time.DayOfWeek.SATURDAY -> DayOfWeek.SAT
        java.time.DayOfWeek.SUNDAY -> DayOfWeek.SUN
    }

// ==========================================================================
// Period
// ==========================================================================

fun Period.contains(currentDate: LocalDate): Boolean {
    val start = start?.let { Instant.parse(it).toLocalDate() }
    val end = end?.let { Instant.parse(it).toLocalDate() }

    return when {
        (start != null && end != null) -> (currentDate >= start) && (currentDate <= end)
        (start != null) -> (currentDate >= start)
        (end != null) -> (currentDate <= end)
        else -> false
    }
}


fun Period.containsToday() = contains(
    currentDate = LocalDate.now()
)

