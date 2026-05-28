package com.dinosaurpark.model;

public class Tourist {

    private String nombre;
    private boolean tieneBoleto;
    private Zone zonaActual;

    public Tourist(String nombre) {
        this.nombre = nombre;
        this.tieneBoleto = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneBoleto() {
        return tieneBoleto;
    }

    public Zone getZonaActual() {
        return zonaActual;
    }

    public void comprarBoleto() {

        this.tieneBoleto = true;

        System.out.println(
                nombre + " compró un boleto.");
    }

    public void entrarZona(Zone zona) {

        this.zonaActual = zona;

        System.out.println(
                nombre + " entró a la zona: "
                        + zona.getNombre());
    }
}
