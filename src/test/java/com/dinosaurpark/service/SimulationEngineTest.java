package com.dinosaurpark.service;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class SimulationEngineTest {

    @Test
    public void testSimulationRun() {

        List<Dinosaurio> dinosaurios =
                new ArrayList<>();

        dinosaurios.add(
                new Dinosaurio(
                        "Blue",
                        "Raptor",
                        5,
                        300,
                        true));

        Park park =
                new Park(
                        dinosaurios,
                        100,
                        50);

        SimulationEngine engine =
                new SimulationEngine(
                        park,
                        2);

        assertDoesNotThrow(() -> {
            engine.run();
        });
    }
}
