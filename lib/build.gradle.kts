/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.3/userguide/building_java_projects.html
 */


group = "io.h4h"
version = "0.1.16"



plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.7.10"

    // Dokka is a documentation engine for Kotlin
    id("org.jetbrains.dokka") version "1.7.10"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    // Publish to Maven repository
    `maven-publish`

    // Kotlinx Serialization
    kotlin("plugin.serialization") version "1.7.10"
}



publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.h4h"
            artifactId = rootProject.name

            from(components["java"])
        }
    }

    repositories {
        // publish on GitHub Packages
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/heartforhealth/fhir-kotlin")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }

}



repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()

    // GCP Artifact Registry
    maven {
        url = uri("https://maven.pkg.github.com/heartforhealth/fhir-kotlin")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
        }
    }

}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // base definitions of FHIR data structures
    api("io.h4h:fhir-base-kotlin:0.1.5")

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-serialization-core-jvm
    api("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.4.0")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    // serialization
    testImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
    testImplementation("com.github.jershell:kbson:0.4.4")
    testImplementation("org.mongodb:bson:4.5.0")
}


tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
    // set jar base name
    archiveBaseName.set(rootProject.name)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
