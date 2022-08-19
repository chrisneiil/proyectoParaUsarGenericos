package com.christopherAdasme.models;

public class Vehiculo {
    private String matricula;
    private int numero_ruedas;
    private String marca;
    private String motor;

    public Vehiculo(String matricula, int numero_ruedas, String marca, String motor) {
        this.matricula = matricula;
        this.numero_ruedas = numero_ruedas;
        this.marca = marca;
        this.motor = motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumero_ruedas() {
        return numero_ruedas;
    }

    public void setNumero_ruedas(int numero_ruedas) {
        this.numero_ruedas = numero_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
