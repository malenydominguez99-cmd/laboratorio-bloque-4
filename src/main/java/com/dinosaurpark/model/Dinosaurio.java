package com.dinosaurpark.model;

public class Dinosaurio {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean peligroso;

    private int nivelHambre;
    private String estado; // calmado, hambriento, agresivo

    public Dinosaurio(String nombre, String especie, int edad, double peso, boolean peligroso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.peligroso = peligroso;

        this.nivelHambre = 0;
        this.estado = "calmado";
    }

    public void actualizarEstado() {
        nivelHambre++;

        if (nivelHambre <= 3) {
            estado = "calmado";
        } else if (nivelHambre <= 6) {
            estado = "hambriento";
        } else {
            estado = "agresivo";
        }
    }

    public void alimentar() {
        nivelHambre = 0;
        estado = "calmado";
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

    public int getNivelHambre() {
        return nivelHambre;
    }

    public String getEstado() {
        return estado;
    }
    
    @Override
    public String toString() {
        return "Dinosaurio{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", peligroso=" + peligroso +
                ", nivelHambre=" + nivelHambre +
                ", estado='" + estado + '\'' +
                '}';
    }
}