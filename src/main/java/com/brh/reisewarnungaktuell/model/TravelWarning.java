package com.brh.reisewarnungaktuell.model;

/**
 * Repräsentiert eine Reisewarnung mit allen relevanten Informationen.
 * 
 * @param id Eindeutige Identifikation der Reisewarnung (z.B. Ländercode)
 * @param countryName Name des betroffenen Landes
 * @param title Titel/Kurzbeschreibung der Warnung
 * @param content Vollständiger Text der Reisewarnung als HTML-String
 */
public record TravelWarning(String id, String countryName, String title, String content) {
}
