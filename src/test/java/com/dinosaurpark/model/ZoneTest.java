package com.dinosaurpark.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZoneTest {

    @Test
    public void testArrivalZoneNombre() {

        Zone zone =
                new ArrivalZone();

        assertEquals(
                "Lugar de Arribo",
                zone.getNombre());
    }

    @Test
    public void testCentralZoneNombre() {

        Zone zone =
                new CentralZone();

        assertEquals(
                "Recinto Central",
                zone.getNombre());
    }

    @Test
    public void testBathroomZoneNombre() {

        Zone zone =
                new BathroomZone();

        assertEquals(
                "Baños",
                zone.getNombre());
    }

    @Test
    public void testEnergyZoneNombre() {

        Zone zone =
                new EnergyPlantZone();

        assertEquals(
                "Planta de Energía",
                zone.getNombre());
    }

    @Test
    public void testObservationZoneNombre() {

        Zone zone =
                new ObservationZone();

        assertEquals(
                "Recintos de Observación",
                zone.getNombre());
    }
}
