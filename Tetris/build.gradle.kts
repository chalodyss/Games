/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

group   = "abitodyssey.tetris"
version = "1.0.0"

plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.tetris.Main"
    mainModule  = "tetris"
}

javafx {
    modules("javafx.controls", "javafx.graphics", "javafx.fxml")
}

tasks.withType<Jar> {
    archiveBaseName = "Tetris"

    manifest {
        attributes["Main-Class"] = "abitodyssey.tetris.Main"
    }
}
