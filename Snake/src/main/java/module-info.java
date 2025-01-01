/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module snake {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports abitodyssey.snake;

    opens abitodyssey.snake to javafx.fxml;
}
