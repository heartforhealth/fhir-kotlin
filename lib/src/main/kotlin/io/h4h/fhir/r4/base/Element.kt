package io.h4h.fhir.r4.base


/**
 * Base definition for all elements in a resource.
 */
interface Element {

    /**
     * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
     */
    val id: String?

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     */
    var extension: MutableList<Extension>?
}


interface BackboneElement : Element {
    /**
     * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions. Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
     * */
    val modifierExtension: List<Extension>?
}


// ==========================================================================
// Add new Extension convenience method
// ==========================================================================

fun Element.upsert(
    extension: Extension,
    predicate: (Extension) -> Boolean = { it.url == extension.url }
) {
    // find existing
    when (val index = this.extension?.indexOfFirst(predicate)) {
        // initialize Extension
        null -> this.extension = mutableListOf(extension)
        // add new Extension
        -1 -> this.extension?.add(extension)
        // set new Extension
        else -> this.extension?.set(index, extension)
    }
}


// ==========================================================================
// Get Extension convenience method
// ==========================================================================

fun MutableList<Extension>.getString(url: String): String? =
    firstOrNull { it.url == url }?.valueString

