package com.dinosaurpark.repository;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    @Test
    public void testConnection() {

        assertDoesNotThrow(() -> {

            Connection connection =
                    DatabaseConnection.getConnection();

            assertNotNull(connection);
        });
    }
}