/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module pong {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.pong;

    opens abitodyssey.pong to javafx.fxml;
}
