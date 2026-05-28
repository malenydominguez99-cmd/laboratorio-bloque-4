package com.dinosaurpark.monitor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class MonitorServiceTest {

    @Test
    public void testMostrarEstado() {

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

        MonitorService monitor =
                new MonitorService();

        assertDoesNotThrow(() -> {
            monitor.mostrarEstado(park, 1);
        });
    }
}
