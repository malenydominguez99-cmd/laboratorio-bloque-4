package com.dinosaurpark.model;

public class EnergyPlantZone extends Zone {

    public EnergyPlantZone() {
        super("Planta de Energía", 30);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println(
                "Zona: " + nombre +
                " | Capacidad: " + capacidad);
    }
}
