package com.brh.reisewarnungaktuell.view;

import com.brh.reisewarnungaktuell.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Verwaltet den View-Management und das Laden von FXML-Views.
 * Ist verantwortlich für das Wechseln zwischen verschiedenen Ansichten
 * und den Zugriff auf die entsprechenden Controller.
 */
public class ViewManager {
    private static final Logger LOGGER = Logger.getLogger(ViewManager.class.getName());
    private static final double WINDOW_WIDTH = 720.0;
    private static final double WINDOW_HEIGHT = 400.0;

    private FXMLLoader currentLoader;

    /**
     * Zeigt eine View basierend auf dem ViewType an.
     * Lädt die entsprechende FXML-Datei und setzt sie als Szene im Hauptfenster.
     * 
     * @param type Der Typ der anzuzeigenden View (darf nicht null sein)
     * @throws IllegalArgumentException wenn type null ist
     * @throws RuntimeException wenn die FXML-Datei nicht geladen werden kann
     */
    public void showView(ViewType type) {

    }

    /**
     * Gibt den Controller der aktuell geladenen View zurück.
     * 
     * @return Ein Optional mit dem Controller der aktuellen View,
     * oder leer wenn keine View geladen ist
     */
    public Optional<Object> getCurrentViewController() {
       throw new UnsupportedOperationException("Noch nicht implementiert");

    }
}
