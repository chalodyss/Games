/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module morpion {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.morpion;

    opens abitodyssey.morpion to javafx.fxml;
}
