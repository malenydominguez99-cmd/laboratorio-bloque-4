package com.dinosaurpark.event;

import com.dinosaurpark.model.Park;

public class StormEvent implements Event {

    @Override
    public void execute(Park park) {

        System.out.println("EVENTO: Tormenta torrencial");

        park.reducirEnergia(15);

        System.out.println("La tormenta afectó las instalaciones.");
        System.out.println("Energía restante: " + park.getEnergia());
    }
}