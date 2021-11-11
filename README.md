# 🔥 fhir-kotlin

**Disclaimer: ALPHA-quality!**

The library provides 🔥 HL7 FHIR Resources converted to Kotlin `data class`-es, having the official [Java HAPI FHIR implementation](https://github.com/hapifhir/org.hl7.fhir.core) as a base reference. The aim is to be in-line with the HAPI implementation.


### FHIR versions

Currently, the implemented version is R4.

### Subset

The implementation is not complete, only a small subset of all the FHIR Resources are implemented. Gradually we'll add more, on a need-basis. Feel free to open an issue if a particular resource that you need is missing.


### Serialization

The data classes are prepared for [Kotlin reflectionless serialization](https://github.com/Kotlin/kotlinx.serialization). The definitions include `@Serializable` annotations.

### Known issues

- Java `BigDecimal` type was replaced with a lesser suitable alternative - Kotlin's `Double`, for the lack of a better alternative that supports serialization out of the box. The issue with `BigDecimal` is that it's not easily serializable to/from JSON, we couldn't find a suitable `BigDecimalSerializer`. If you happen to know a way, please open an issue.
- Enumerations still need refactoring: UPPERCASE to lowercase
- There are no tests implemented

### Copyright

The models preserve the copyright information from the reference HAPI FHIR library: 2011+, HL7, Inc.

Enjoy!