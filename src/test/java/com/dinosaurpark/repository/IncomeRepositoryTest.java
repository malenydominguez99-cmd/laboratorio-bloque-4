package com.dinosaurpark.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class IncomeRepositoryTest {

    @Test
    public void testSaveIncome() {

        IncomeRepository repo =
                new IncomeRepository();

        assertDoesNotThrow(() -> {
            repo.saveIncome(
                    "Boletos",
                    1000);
        });
    }
}
