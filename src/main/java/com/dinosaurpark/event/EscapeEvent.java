package com.dinosaurpark.event;

import java.util.Random;

import com.dinosaurpark.logger.EventLogger;
import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.Park;

public class EscapeEvent implements Event {

    @Override
    public void execute(Park park) {

        Random random = new Random();

        if (!park.getDinosaurios().isEmpty()) {

            int index = random.nextInt(park.getDinosaurios().size());
            Dinosaurio d = park.getDinosaurios().get(index);

            System.out.println("EVENTO: Escape de dinosaurio -> " + d.getNombre());
            
            EventLogger.log("Escape de dinosaurio: " + d.getNombre());

            if (d.isPeligroso()) {
                System.out.println("El dinosaurio es peligroso. Se genera alerta.");
            }
        }
    }
}