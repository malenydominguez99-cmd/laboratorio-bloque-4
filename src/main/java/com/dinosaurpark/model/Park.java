package com.dinosaurpark.model;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Dinosaurio> dinosaurios;
    private List<Zone> zonas;
    private List<Tourist> turistas;

    private int energia;
    private int visitantes;

    public Park(List<Dinosaurio> dinosaurios,
                int energia,
                int visitantes) {

        this.dinosaurios = dinosaurios;
        this.energia = energia;
        this.visitantes = visitantes;

        this.zonas = new ArrayList<>();
        this.turistas = new ArrayList<>();
    }

    public List<Dinosaurio> getDinosaurios() {
        return dinosaurios;
    }

    public List<Zone> getZonas() {
        return zonas;
    }

    public List<Tourist> getTuristas() {
        return turistas;
    }

    public int getEnergia() {
        return energia;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void agregarDinosaurio(Dinosaurio dinosaurio) {
        dinosaurios.add(dinosaurio);
    }

    public void agregarZona(Zone zona) {

        zonas.add(zona);

        System.out.println(
                "Zona agregada: "
                        + zona.getNombre());
    }

    public void agregarTurista(Tourist turista) {

        turistas.add(turista);

        System.out.println(
                "Turista agregado: "
                        + turista.getNombre());
    }

    public void reducirEnergia(int cantidad) {

        this.energia -= cantidad;

        if (this.energia < 0) {
            this.energia = 0;
        }
    }

    public void aumentarVisitantes(int cantidad) {
        this.visitantes += cantidad;
    }
}