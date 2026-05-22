package com.dinosaurpark.event;

import com.dinosaurpark.logger.EventLogger;
import com.dinosaurpark.model.Park;

public class BlackoutEvent implements Event {

    @Override
    public void execute(Park park) {

        System.out.println("EVENTO: Apagón masivo en el parque");

        EventLogger.log("Apagón masivo en el parque");
        
        park.reducirEnergia(30);

        System.out.println("La energía del parque disminuyó.");
        System.out.println("Energía restante: " + park.getEnergia());
    }
}