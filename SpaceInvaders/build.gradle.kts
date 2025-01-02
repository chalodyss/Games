/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

group   = "abitodyssey.spaceinvaders"
version = "1.0.0"

plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.spaceinvaders.Main"
    mainModule  = "spaceinvaders"
}

javafx {
    modules("javafx.controls", "javafx.graphics", "javafx.fxml")
}

sourceSets {
    main {
        resources.srcDir("src/main/resources/sprites/")
    }
}

tasks.withType<Jar> {
    archiveBaseName = "SpaceInvaders"

    manifest {
        attributes["Main-Class"] = "abitodyssey.spaceinvaders.Main"
    }
}
