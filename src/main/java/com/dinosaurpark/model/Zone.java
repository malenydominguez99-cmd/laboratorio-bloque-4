package com.dinosaurpark.model;

public abstract class Zone {

    protected String nombre;
    protected int capacidad;

    public Zone(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public abstract void mostrarInformacion();
}
