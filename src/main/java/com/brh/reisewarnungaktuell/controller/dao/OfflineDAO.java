package com.brh.reisewarnungaktuell.controller.dao;

import com.brh.reisewarnungaktuell.controller.Action;
import com.brh.reisewarnungaktuell.model.TravelWarningPreview;
import com.brh.reisewarnungaktuell.model.TravelWarning;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Lädt gecachte Reisewarnungsdaten aus offlineCache.json.
 * Wird bei fehlender Internetverbindung verwendet.
 * 
 * @see OnlineDAO
 * @see TravelWarningDAO
 */
public class OfflineDAO implements TravelWarningDAO{
    private static final Logger LOGGER = Logger.getLogger(OfflineDAO.class.getName());
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private static final String OFFLINE_CACHE_PATH = "offlineCache.json";

    /**
     * Lädt alle gecachten Reisewarnung-Vorschauen aus dem Offline-Cache.
     * 
     * @param callback Wird mit der Liste der Vorschauen oder leer aufgerufen
     */
    @Override
    public void requestWarningPreviews( Action< ArrayList<TravelWarningPreview> > callback){


    }

    /**
     * Sucht eine spezifische Reisewarnung anhand ihrer ID im Offline-Cache.
     * 
     * @param id Eindeutige ID der gesuchten Reisewarnung
     * @param callback Wird mit der gefundenen Warnung oder leer aufgerufen
     */
    @Override
    public void requestWarningById(String id, Action<TravelWarning> callback){


    }

    /**
     * Lädt die JSON-Daten aus der Offline-Cache-Datei.
     * 
     * @return Optional mit dem JSON-String, wenn die Datei existiert, ansonsten leer
     */
    private Optional<String> loadJsonFromOfflineCache(){

        throw new UnsupportedOperationException("Noch nicht implementiert");

    }
}
