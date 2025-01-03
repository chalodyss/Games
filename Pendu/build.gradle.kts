/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

version = "1.0.0"
group   = "abitodyssey.pendu"

plugins {
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.pendu.Main"
    mainModule  = "pendu"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

tasks.withType<Jar> {
    archiveBaseName = "Pendu"

    manifest {
        attributes["Main-Class"] = "abitodyssey.pendu.Main"
    }
}
