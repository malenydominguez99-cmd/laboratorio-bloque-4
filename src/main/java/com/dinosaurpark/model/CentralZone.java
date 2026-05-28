package com.dinosaurpark.model;

public class CentralZone extends Zone {

    public CentralZone() {
        super("Recinto Central", 200);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println(
                "Zona: " + nombre +
                " | Capacidad: " + capacidad);
    }
}
