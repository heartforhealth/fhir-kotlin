package io.h4h.fhir.r4.base


/**
 * Base definition for all elements in a resource.
 */
interface Element {

    /**
     * Unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces.
     */
    var id: String?

    /**
     * May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
     */
    var extension: List<Extension>?
}