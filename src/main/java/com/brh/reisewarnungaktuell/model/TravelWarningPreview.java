package com.brh.reisewarnungaktuell.model;

/**
 * Repräsentiert eine kurze Vorschau einer Reisewarnung für Listenansichten.
 * 
 * @param id Eindeutige Identifikation der Reisewarnung
 * @param title Titel der Warnung
 * @param countryName Name des betroffenen Landes
 */
public record TravelWarningPreview(String id, String title, String countryName) {
}
