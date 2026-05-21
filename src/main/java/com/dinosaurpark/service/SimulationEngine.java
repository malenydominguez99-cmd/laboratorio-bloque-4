package com.dinosaurpark.service;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class SimulationEngine {

    private Park park;

    public SimulationEngine(Park park) {
        this.park = park;
    }

    public void run() {

        System.out.println("*****INICIANDO SIMULACION DEL PARQUE*****");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\n======================");
            System.out.println("CICLO " + i);
            System.out.println("======================");

            park.reducirEnergia(5);

            for (Dinosaurio d : park.getDinosaurios()) {

                d.actualizarEstado();

                System.out.println(
                        "Nombre: " + d.getNombre() +
                        " | Especie: " + d.getEspecie() +
                        " | Hambre: " + d.getNivelHambre() +
                        " | Estado: " + d.getEstado()
                );
            }

            System.out.println("\nEstado del parque:");
            System.out.println("Energia: " + park.getEnergia());
            System.out.println("Visitantes: " + park.getVisitantes());
            System.out.println("Cantidad de dinosaurios: " + park.getDinosaurios().size());
        }

        System.out.println("\nSIMULACION TERMINADA");
    }
}