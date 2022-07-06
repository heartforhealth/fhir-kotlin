package io.h4h.fhir.utils

import com.github.jershell.kbson.Configuration
import com.github.jershell.kbson.KBson
import io.h4h.fhir.r4.base.Resource
import io.h4h.fhir.r4.base.DomainResource
import io.h4h.fhir.r4.resources.CarePlan
import io.h4h.fhir.r4.resources.Observation
import kotlinx.datetime.Instant
import kotlinx.serialization.KSerializer
import org.bson.BsonDateTime
import org.bson.BsonDocument
import org.bson.BsonInt64


// ==========================================================================
// Serialization
// ==========================================================================

class BsonConverter {
    companion object {
        // just don't encode null
        val kBson = KBson(configuration = Configuration(nonEncodeNull = true))
    }
}

/**
 * Make sure that we can serialize FHIR Resources to BSON
 * */
private fun <T : DomainResource> T.toBsonDocument(serializer: KSerializer<T>): BsonDocument {
    // model -> BsonDocument
    return BsonConverter.kBson.stringify(serializer = serializer, obj = this)
}

/**
 * Make sure that we can serialize CDS Objects to BSON
 * */
private fun <T : Resource> T.toBsonDocument(serializer: KSerializer<T>): BsonDocument {
    // model -> BsonDocument
    return BsonConverter.kBson.stringify(serializer = serializer, obj = this)
}


// ==========================================================================
// Deserialization
// ==========================================================================

/// initialize DomainResource
fun <T : DomainResource> BsonDocument.asDomainResource(serializer: KSerializer<T>): T
    = BsonConverter.kBson.parse(serializer, this)

/// initialize Resource
fun <T : Resource> BsonDocument.asResource(serializer: KSerializer<T>): T
    = BsonConverter.kBson.parse(serializer, this)


// ==========================================================================
// Observation
// ==========================================================================
private const val ObservationDateField = "effectiveDateTime"


/// before serialization
fun Observation.toBsonDocument(): BsonDocument {
    val document = toBsonDocument(Observation.serializer())

    /// if we have a String date set -> rewrite as ISODate
    document[ObservationDateField]?.let { value ->
        /// most usual case
        if (value.isString) {
            println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ isString")
            // convert to Instant
            val instant = Instant.parse(value.asString().value)
            // rewrite date field as ISODate
            document[ObservationDateField] = BsonDateTime(instant.toEpochMilliseconds())
        }
        /// edge case: date stored directly as long
        if (value.isInt64) {
            println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ isInt64")
            // convert to Instant
            val instant = Instant.fromEpochMilliseconds(value.asInt64().value)
            // rewrite date field as ISODate
            document[ObservationDateField] = BsonDateTime(instant.toEpochMilliseconds())
        }
    }

    return document
}

/// before deserialization
fun BsonDocument.preDeserialize(): BsonDocument {
    /// iof we have a DateTime field, rewrite it as the underlying type (Long)
    this[ObservationDateField]?.let { value ->
        if (value.isDateTime) {
            // rewrite date field as Long
            this[ObservationDateField] = BsonInt64(value.asDateTime().value)
        }
    }
    return this
}



// ==========================================================================
// CarePlan
// ==========================================================================

val CarePlan.patientId: String
    get() = subject?.identifier?.value
        ?: throw IllegalStateException("CarePlan $id doesn't have a valid Patient reference")

