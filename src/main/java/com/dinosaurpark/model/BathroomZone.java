package com.dinosaurpark.model;

public class BathroomZone extends Zone {

    public BathroomZone() {
        super("Baños", 50);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println(
                "Zona: " + nombre +
                " | Capacidad: " + capacidad);
    }
}
