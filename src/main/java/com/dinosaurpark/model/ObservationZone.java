package com.dinosaurpark.model;

public class ObservationZone extends Zone {

    public ObservationZone() {
        super("Recintos de Observación", 150);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println(
                "Zona: " + nombre +
                " | Capacidad: " + capacidad);
    }
}
