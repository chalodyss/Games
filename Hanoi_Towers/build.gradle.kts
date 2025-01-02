/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

group   = "abitodyssey.hanoitowers"
version = "1.0.0"

plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.hanoitowers.Main"
    mainModule  = "hanoitowers"
}

javafx {
    modules("javafx.graphics", "javafx.controls", "javafx.fxml")
}

tasks.withType<Jar> {
    archiveBaseName = "HanoiTowers"

    manifest {
        attributes["Main-Class"] = "abitodyssey.hanoitowers.Main"
    }
}
