package com.dinosaurpark.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    private Properties properties = new Properties();

    public ConfigLoader() {
        try {
            InputStream input = getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                System.out.println("ERROR: no se encontró config.properties");
                return;
            }

            properties.load(input);

        } catch (Exception e) {
            System.out.println("Error cargando config: " + e.getMessage());
        }
    }

    public int getInt(String key) {
        String value = properties.getProperty(key);

        if (value == null) {
            System.out.println("Falta clave: " + key);
            return 0;
        }

        return Integer.parseInt(value);
    }
}