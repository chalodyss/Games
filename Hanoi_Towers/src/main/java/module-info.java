/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module hanoitowers {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.hanoitowers;

    opens abitodyssey.hanoitowers to javafx.fxml;
}
