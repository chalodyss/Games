/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

group   = "abitodyssey.snake"
version = "1.0.0"

plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.snake.Main"
    mainModule  = "snake"
}

javafx {
    modules("javafx.graphics", "javafx.controls", "javafx.fxml")
}

tasks.withType<Jar> {
    archiveBaseName = "Snake"

    manifest {
        attributes["Main-Class"] = "abitodyssey.snake.Main"
    }
}
