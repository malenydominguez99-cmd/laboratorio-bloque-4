package com.dinosaurpark.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DinosaurioTest {

    @Test
    public void testActualizarEstado() {

        Dinosaurio dinosaurio =
                new Dinosaurio(
                        "Rex",
                        "T-Rex",
                        10,
                        5000,
                        true);

        dinosaurio.actualizarEstado();
        dinosaurio.actualizarEstado();
        dinosaurio.actualizarEstado();
        dinosaurio.actualizarEstado();

        assertEquals(
                "hambriento",
                dinosaurio.getEstado());
    }
}