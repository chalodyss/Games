/*
 * Copyright © 2024 Charles Theetten
 * Tous droits réservés.
 */

module spaceinvaders {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.spaceinvaders;

    opens abitodyssey.spaceinvaders to javafx.fxml;
}
