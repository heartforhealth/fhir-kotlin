package io.h4h.fhir.utils

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.util.*
import kotlin.random.Random



fun randomDate(): Date {
    // 3 months ago until now
    val startDate = Date.from(LocalDate.now().minusMonths(3).atStartOfDay(ZoneId.systemDefault()).toInstant())
    val endDate = Date()

    // random date
    val randomMillisSinceEpoch = Random.nextLong(from = startDate.time, until = endDate.time)
    return Date(randomMillisSinceEpoch)
}

fun randomUUID(): String = UUID.randomUUID().toString()


fun now(): Instant = Clock.System.now()