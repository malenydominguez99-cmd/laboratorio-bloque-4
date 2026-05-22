package com.dinosaurpark.repository;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {

    private static Connection connection;

    private static String url;
    private static String user;
    private static String password;

    static {

        try {

            Properties props = new Properties();

            InputStream input =
                    DatabaseConnection.class
                            .getClassLoader()
                            .getResourceAsStream(
                                    "config.properties");

            props.load(input);

            url = props.getProperty("db.url");
            user = props.getProperty("db.user");
            password = props.getProperty("db.password");

        } catch (Exception e) {

            System.out.println(
                    "Error cargando configuracion DB: "
                            + e.getMessage());
        }
    }

    private DatabaseConnection() {
    }

    public static Connection getConnection()
            throws Exception {

        if (connection == null
                || connection.isClosed()) {

            connection =
                    DriverManager.getConnection(
                            url,
                            user,
                            password);

            System.out.println(
                    "Conexion a base de datos establecida");
        }

        return connection;
    }
}