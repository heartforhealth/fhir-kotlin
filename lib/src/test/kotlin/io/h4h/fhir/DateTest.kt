package io.h4h.fhir



import io.h4h.fhir.r4.base.Quantity
import io.h4h.fhir.utils.BsonConverter
import kotlinx.datetime.Instant
import org.bson.BsonDateTime
import org.bson.BsonDocument
import org.bson.BsonInt32
import org.bson.BsonString
import kotlin.test.Test



class DateTest {


    @Test
    fun test_parsing_ISO() {
        // val now = Clock.System.now()
        // println("Now: $now")``
        val dateString = "2022-05-18T09:36:38.629+02:00"

        println("instant:       $dateString")
        val parsedInstant = Instant.parse(dateString)
        println("parsedInstant: $parsedInstant")
    }


    @Test fun mongoDateTest() {
        // new date string
        val dateString = "2022-05-18T09:36:38.629+02:00"
        println("dateString: $dateString")
        // convert to Instant
        val instant = Instant.parse(dateString)

        // rewrite date field as ISODate
        val document = BsonDocument()
        document["date"] = BsonDateTime(instant.toEpochMilliseconds())

        println("document: $document")
    }


    @Test fun quantityTest() {
        // new BSON
        val document = BsonDocument()
        document["value"]  = BsonInt32(91)
        document["unit"]   = BsonString("kg")
        document["system"] = BsonString("http://unitsofmeasure.org")
        document["code"]   = BsonString("kg")

        // deserialize
        val quantity = BsonConverter.kBson.parse(Quantity.serializer(), document)
        println("Quantity: $quantity")
    }

}
