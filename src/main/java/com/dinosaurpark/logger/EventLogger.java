package com.dinosaurpark.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EventLogger {

    private static final String FILE_NAME = "events.txt";

    public static void log(String message) {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(FILE_NAME, true))) {

            String logMessage =
                    "[" + LocalDateTime.now() + "] " + message;

            writer.write(logMessage);
            writer.newLine();

        } catch (IOException e) {

            System.out.println(
                    "Error escribiendo log: " + e.getMessage());
        }
    }
}
