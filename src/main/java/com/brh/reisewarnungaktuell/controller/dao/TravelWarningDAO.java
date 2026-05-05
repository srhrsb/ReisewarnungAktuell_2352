package com.brh.reisewarnungaktuell.controller.dao;

import com.brh.reisewarnungaktuell.controller.Action;
import com.brh.reisewarnungaktuell.model.TravelWarningPreview;
import com.brh.reisewarnungaktuell.model.TravelWarning;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Schnittstelle für den Zugriff auf Reisewarnungsdaten.
 * Bietet Methoden zum Laden von Vorschauen und detaillierten Warnungen.
 * 
 * @see OnlineDAO
 * @see OfflineDAO
 */
public interface TravelWarningDAO {

    /**
     * Fordert eine Liste aller Reisewarnung-Vorschauen an.
     * 
     * @param callback Callback mit der Liste der Vorschauen oder leer bei Fehler
     */
    void requestWarningPreviews( Action< ArrayList<TravelWarningPreview> > callback );

    /**
     * Fordert eine spezifische Reisewarnung anhand ihrer ID an.
     * 
     * @param id Eindeutige ID der Reisewarnung
     * @param callback Callback mit der gefundenen Warnung oder leer bei Fehler
     */
    void requestWarningById( String id, Action<TravelWarning> callback );

}
