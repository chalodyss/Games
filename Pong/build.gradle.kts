/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

group   = "abitodyssey.pong"
version = "1.0.0"

plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.pong.Main"
    mainModule  = "pong"
}

javafx {
    modules("javafx.graphics", "javafx.controls", "javafx.fxml", "javafx.media")
}

tasks.withType<Jar> {
    archiveBaseName = "Pong"

    manifest {
        attributes["Main-Class"] = "abitodyssey.pong.Main"
    }
}
