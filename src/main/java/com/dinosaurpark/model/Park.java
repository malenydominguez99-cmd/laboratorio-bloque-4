package com.dinosaurpark.model;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Dinosaurio> dinosaurios;
    private int energia;
    private int visitantes;

    public Park(List<Dinosaurio> dinosaurios,
                int energia,
                int visitantes) {

        this.dinosaurios = dinosaurios;
        this.energia = energia;
        this.visitantes = visitantes;
    }

    public List<Dinosaurio> getDinosaurios() {
        return dinosaurios;
    }

    public int getEnergia() {
        return energia;
    }

    public int getVisitantes() {
        return visitantes;
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

    public void agregarDinosaurio(
            Dinosaurio dinosaurio
    ) {

        if (this.dinosaurios == null) {

            this.dinosaurios =
                    new ArrayList<>();
        }

        this.dinosaurios.add(dinosaurio);
    }
}