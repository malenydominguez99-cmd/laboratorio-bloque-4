package com.dinosaurpark.monitor;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class MonitorService {

    public void mostrarEstado(Park park, int ciclo) {

        System.out.println("\n==============================");
        System.out.println("MONITOR DEL PARQUE - CICLO " + ciclo);
        System.out.println("==============================");

        System.out.println("Energia del parque: " + park.getEnergia());
        System.out.println("Visitantes activos: " + park.getVisitantes());
        System.out.println("Total de dinosaurios: " + park.getDinosaurios().size());

        System.out.println("\nDETALLE DE DINOSAURIOS:");

        for (Dinosaurio d : park.getDinosaurios()) {
            System.out.println(
                    "- " + d.getNombre() +
                    " | Especie: " + d.getEspecie() +
                    " | Hambre: " + d.getNivelHambre() +
                    " | Estado: " + d.getEstado()
            );
        }

        System.out.println("==============================\n");
    }
}
