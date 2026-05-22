package com.dinosaurpark.service;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ParkTest {

    @Test
    public void testAgregarDinosaurio() {

        Park park = new Park(
                new ArrayList<>(),
                100,
                50);

        Dinosaurio dinosaurio =
                new Dinosaurio(
                        "Blue",
                        "Raptor",
                        5,
                        300,
                        true);

        park.agregarDinosaurio(dinosaurio);

        assertEquals(
                1,
                park.getDinosaurios().size());
    }
}