package com.dinosaurpark;

import java.util.ArrayList;
import java.util.List;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;
import com.dinosaurpark.service.SimulationEngine;

public class Main {

    public static void main(String[] args) {

        List<Dinosaurio> dinosaurios = new ArrayList<>();

        dinosaurios.add(new Dinosaurio("Rex", "T-Rex", 10, 8000, true));
        dinosaurios.add(new Dinosaurio("Blue", "Velociraptor", 5, 300, true));

        Park park = new Park(dinosaurios, 100, 50);

        SimulationEngine engine = new SimulationEngine(park);

        engine.run();
    }
}