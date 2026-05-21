package com.dinosaurpark.service;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class SimulationEngine {

    private Park park;

    public SimulationEngine(Park park) {
        this.park = park;
    }

    public void run() {

        System.out.println("🦖 INICIANDO SIMULACIÓN DEL PARQUE 🦖");

        for (int step = 1; step <= 10; step++) {

            System.out.println("\n=== CICLO " + step + " ===");

            park.reducirEnergia(5);

            for (Dinosaurio d : park.getDinosaurios()) {
                d.aumentarHambre();
                System.out.println(d.getNombre() + " - estado: " + d.getEstado());
            }

            System.out.println("🔋 Energía: " + park.getEnergia());
            System.out.println("👥 Visitantes: " + park.getVisitantes());
        }

        System.out.println("\n🛑 SIMULACIÓN TERMINADA");
    }
}
