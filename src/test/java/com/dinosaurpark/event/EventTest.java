package com.dinosaurpark.event;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class EventTest {

    @Test
    public void testBlackoutEvent() {

        List<Dinosaurio> dinosaurios =
                new ArrayList<>();

        Park park =
                new Park(
                        dinosaurios,
                        100,
                        50);

        Event event =
                new BlackoutEvent();

        event.execute(park);

        assertTrue(
                park.getEnergia() < 100);
    }

    @Test
    public void testStormEvent() {

        List<Dinosaurio> dinosaurios =
                new ArrayList<>();

        Park park =
                new Park(
                        dinosaurios,
                        100,
                        50);

        Event event =
                new StormEvent();

        event.execute(park);

        assertTrue(
                park.getEnergia() < 100);
    }

    @Test
    public void testEscapeEvent() {

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

        Event event =
                new EscapeEvent();

        assertDoesNotThrow(() -> {
            event.execute(park);
        });
    }
}
