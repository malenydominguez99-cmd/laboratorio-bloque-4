package com.dinosaurpark.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TouristTest {

    @Test
    public void testComprarBoleto() {

        Tourist tourist =
                new Tourist("Carlos");

        tourist.comprarBoleto();

        assertTrue(
                tourist.isTieneBoleto());
    }

    @Test
    public void testEntrarZona() {

        Tourist tourist =
                new Tourist("Ana");

        Zone zone =
                new ArrivalZone();

        tourist.entrarZona(zone);

        assertEquals(
                "Lugar de Arribo",
                tourist.getZonaActual()
                        .getNombre());
    }
}