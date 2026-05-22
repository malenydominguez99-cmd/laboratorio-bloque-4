package com.dinosaurpark.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dinosaur_park",
                "root",
                "M@lenyy25"
        );
    }
}