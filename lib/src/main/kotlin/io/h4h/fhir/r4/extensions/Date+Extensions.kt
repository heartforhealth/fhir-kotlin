package io.h4h.fhir.r4.extensions


import java.text.SimpleDateFormat
import java.util.*

// private const val DATE_FORMATER_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
private const val DATE_FORMATER_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"

/**
 * Default ISO8601 Date formatter
 */
private val defaultFormatter = SimpleDateFormat(DATE_FORMATER_ISO, Locale.getDefault())
    .apply { timeZone = TimeZone.getTimeZone("UTC") }


/**
 * create String from Date
 * @return ISO8601 string
 */
fun Date.toIsoString(timeZone: TimeZone? = null): String {
    defaultFormatter.timeZone = (timeZone ?: TimeZone.getTimeZone("UTC"))
    return defaultFormatter.format(this)
}


/**
 * create Date from String
 * @return date or null if not ISO8601 string
 */
fun String.parseDate(timeZone: TimeZone? = null): Date? {
    defaultFormatter.timeZone = (timeZone ?: TimeZone.getTimeZone("UTC"))
    return defaultFormatter.runCatching { parse(this@parseDate) }.getOrNull()
}
