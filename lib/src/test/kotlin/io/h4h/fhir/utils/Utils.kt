package io.h4h.fhir.utils


import io.h4h.fhir.r4.base.Period
import kotlinx.datetime.*
import java.util.UUID
import kotlin.random.Random




fun randomUUID(): String = UUID.randomUUID().toString()


// ==========================================================================
// Date/Time helpers
// ==========================================================================

fun now(): Instant = Clock.System.now()


/**
 * Generates a period that contains the 'date' param. If 'date' is null, the current date is chosen
 */
fun periodThatIncludesDate(date: Instant = now()): Period {
    val minusDays = Random.nextInt(10, 30)
    val plusDays = Random.nextInt(10, 30)
    return Period(
        date.minus(minusDays, DateTimeUnit.DAY, TimeZone.currentSystemDefault()).toString(),
        date.plus(plusDays, DateTimeUnit.DAY, TimeZone.currentSystemDefault()).toString()
    )
}