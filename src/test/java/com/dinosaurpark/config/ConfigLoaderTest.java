package com.dinosaurpark.config;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ConfigLoaderTest {

    @Test
    public void testGetInt() {

        ConfigLoader config =
                new ConfigLoader();

        int energy =
                config.getInt("initialEnergy");

        assertTrue(energy > 0);
    }
}
