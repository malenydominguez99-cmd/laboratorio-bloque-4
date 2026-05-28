package com.dinosaurpark.model;

public class ArrivalZone extends Zone {

    public ArrivalZone() {
        super("Lugar de Arribo", 100);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println(
                "Zona: " + nombre +
                " | Capacidad: " + capacidad);
    }
}
