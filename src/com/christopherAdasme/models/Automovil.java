package com.christopherAdasme.models;

public class Automovil extends  Vehiculo{
    private int cantidad_puertas;
    private int cantidad_asientos;

    public Automovil(String matricula, int numero_ruedas, String marca, String motor, int cantidad_puertas, int cantidad_asientos) {
        super(matricula, numero_ruedas, marca, motor);
        this.cantidad_puertas = cantidad_puertas;
        this.cantidad_asientos = cantidad_asientos;
    }


    public int getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    public int getCantidad_asientos() {
        return cantidad_asientos;
    }

    public void setCantidad_asientos(int cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }
}
