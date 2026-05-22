package com.dinosaurpark;

import java.util.ArrayList;
import java.util.List;

import com.dinosaurpark.config.ConfigLoader;
import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;
import com.dinosaurpark.repository.IncomeRepository;
import com.dinosaurpark.service.SimulationEngine;

public class Main {

    public static void main(String[] args) {

        IncomeRepository repo = new IncomeRepository();
        repo.saveIncome("Boletos", 1500);

        ConfigLoader config = new ConfigLoader();

        int energy = config.getInt("initialEnergy");
        int tourists = config.getInt("tourists");
        int dinosaurCount = config.getInt("dinosaurs");
        int cycles = config.getInt("cycles");

        List<Dinosaurio> dinosaurios = new ArrayList<>();

        for (int i = 1; i <= dinosaurCount; i++) {
            dinosaurios.add(new Dinosaurio(
                    "Dino" + i,
                    "Raptor",
                    5,
                    500,
                    true ));
        }

        Park park = new Park(dinosaurios, energy, tourists);

        SimulationEngine engine = new SimulationEngine(park,cycles);

        engine.run();
    }
}