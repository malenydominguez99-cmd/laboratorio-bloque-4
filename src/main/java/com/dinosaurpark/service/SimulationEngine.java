package com.dinosaurpark.service;

import java.util.Random;

import com.dinosaurpark.event.BlackoutEvent;
import com.dinosaurpark.event.EscapeEvent;
import com.dinosaurpark.event.Event;
import com.dinosaurpark.event.StormEvent;
import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;
import com.dinosaurpark.monitor.MonitorService;

public class SimulationEngine {

    private Park park;
    private int cycles;

    private MonitorService monitor = new MonitorService();

    public SimulationEngine(Park park, int cycles) {
        this.park = park;
        this.cycles = cycles;
    }

    public void run() {

        System.out.println("INICIANDO SIMULACION DEL PARQUE");

        Random random = new Random();

        for (int i = 1; i <= cycles; i++) {

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

            int eventChance = random.nextInt(100);

            if (eventChance < 20) {

                Event event = new EscapeEvent();
                event.execute(park);

            } else if (eventChance < 40) {

                Event event = new BlackoutEvent();
                event.execute(park);

            } else if (eventChance < 60) {

                Event event = new StormEvent();
                event.execute(park);
            }

            monitor.mostrarEstado(park, i);

            System.out.println("\nEstado del parque:");
            System.out.println("Energia: " + park.getEnergia());
            System.out.println("Visitantes: " + park.getVisitantes());
            System.out.println("Dinosaurios: " + park.getDinosaurios().size());
        }

        System.out.println("\nSIMULACION TERMINADA");
    }
}