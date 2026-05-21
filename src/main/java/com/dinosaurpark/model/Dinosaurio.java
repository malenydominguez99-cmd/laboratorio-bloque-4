package com.dinosaurpark.model;

public class Dinosaurio {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean peligroso;

    public Dinosaurio(String nombre, String especie, int edad, double peso, boolean peligroso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.peligroso = peligroso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", peligroso=" + peligroso +
                '}';
    }
}