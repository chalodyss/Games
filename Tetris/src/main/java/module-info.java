/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module tetris {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.tetris;

    opens abitodyssey.tetris to javafx.fxml;
}
