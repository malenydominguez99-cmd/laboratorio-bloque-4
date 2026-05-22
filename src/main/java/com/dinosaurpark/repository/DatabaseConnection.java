package com.dinosaurpark.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static Connection connection;

    private static final String URL =
            "jdbc:mysql://localhost:3306/dinosaur_park";

    private static final String USER = "root";

    private static final String PASSWORD = "M@lenyy25";

    private DatabaseConnection() {
    }

    public static Connection getConnection() throws Exception {

        if (connection == null || connection.isClosed()) {

            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println(
                    "Conexion a base de datos establecida");
        }

        return connection;
    }
}