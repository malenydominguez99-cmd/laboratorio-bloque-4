package com.dinosaurpark.model;

public class Ticket {

    private int id;
    private double precio;

    public Ticket(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarTicket() {

        System.out.println(
                "Ticket #" + id +
                " | Precio: $" + precio);
    }
}
