package com.brh.reisewarnungaktuell.controller;

/**
 * Generisches Functional Interface als Callback
 * @param <T> Typ
 */
@FunctionalInterface
public interface Action<T> {
    void invoke( T response );
}
