package com.dinosaurpark.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IncomeRepository {

    public void saveIncome(String concept, double amount) {

        String sql =
                "INSERT INTO income (concept, amount) VALUES (?, ?)";

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, concept);
            stmt.setDouble(2, amount);

            stmt.executeUpdate();

            System.out.println(
                    "Ingreso guardado correctamente");

        } catch (Exception e) {

            System.out.println(
                    "Error guardando ingreso: "
                            + e.getMessage());
        }
    }
}
