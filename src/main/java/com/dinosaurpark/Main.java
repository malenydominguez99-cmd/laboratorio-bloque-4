package com.dinosaurpark;

import java.util.ArrayList;
import java.util.List;

import com.dinosaurpark.config.ConfigLoader;
import com.dinosaurpark.model.ArrivalZone;
import com.dinosaurpark.model.BathroomZone;
import com.dinosaurpark.model.CentralZone;
import com.dinosaurpark.model.Dinosaurio;
import com.dinosaurpark.model.EnergyPlantZone;
import com.dinosaurpark.model.ObservationZone;
import com.dinosaurpark.model.Park;
import com.dinosaurpark.model.Ticket;
import com.dinosaurpark.model.Tourist;
import com.dinosaurpark.repository.ExpenseRepository;
import com.dinosaurpark.repository.IncomeRepository;
import com.dinosaurpark.service.SimulationEngine;

public class Main {

    public static void main(String[] args) {

        IncomeRepository repo = new IncomeRepository();
        repo.saveIncome("Boletos", 1500);

        ExpenseRepository expenseRepo =
            new ExpenseRepository();

        expenseRepo.saveExpense(
            "Mantenimiento de cercas",
            500
        );

        ConfigLoader config = new ConfigLoader();

        int energy = config.getInt("initialEnergy");
        int tourists = config.getInt("tourists");
        int dinosaurCount = config.getInt("dinosaurs");
        int cycles = config.getInt("cycles");

        List<Dinosaurio> dinosaurios = new ArrayList<>();

        for (int i = 1; i <= dinosaurCount; i++) {
            dinosaurios.add(new Dinosaurio(
                    "Dino" + i,
                    "Raptor",
                    5,
                    500,
                    true ));
        }

        Park park = new Park(dinosaurios, energy, tourists);

        // ZONAS
ArrivalZone arrivalZone = new ArrivalZone();
CentralZone centralZone = new CentralZone();
BathroomZone bathroomZone = new BathroomZone();
EnergyPlantZone energyPlantZone = new EnergyPlantZone();
ObservationZone observationZone = new ObservationZone();

park.agregarZona(arrivalZone);
park.agregarZona(centralZone);
park.agregarZona(bathroomZone);
park.agregarZona(energyPlantZone);
park.agregarZona(observationZone);

// TURISTAS
Tourist tourist1 = new Tourist("Carlos");
Tourist tourist2 = new Tourist("Ana");

park.agregarTurista(tourist1);
park.agregarTurista(tourist2);

// BOLETOS
Ticket ticket1 = new Ticket(1, 500);
Ticket ticket2 = new Ticket(2, 500);

ticket1.mostrarTicket();
ticket2.mostrarTicket();

// COMPRA DE BOLETOS
tourist1.comprarBoleto();
tourist2.comprarBoleto();

// MOVIMIENTO EN EL PARQUE
tourist1.entrarZona(arrivalZone);
tourist2.entrarZona(observationZone);

        SimulationEngine engine = new SimulationEngine(park,cycles);

        engine.run();
    }
}