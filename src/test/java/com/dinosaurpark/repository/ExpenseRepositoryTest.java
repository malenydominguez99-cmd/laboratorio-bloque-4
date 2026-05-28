package com.dinosaurpark.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class ExpenseRepositoryTest {

    @Test
    public void testSaveExpense() {

        ExpenseRepository repo =
                new ExpenseRepository();

        assertDoesNotThrow(() -> {
            repo.saveExpense(
                    "Mantenimiento",
                    500);
        });
    }
}