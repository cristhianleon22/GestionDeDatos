package org.example;

import java.net.StandardSocketOptions;

public abstract class Hidraulica extends EnergiaRenovable {
    double caudal;

    public Hidraulica(String tipo, String pais, int anio, double produccion, double consumo, double caudal) {
        super(tipo, pais, anio, produccion, consumo);
        this.caudal = caudal;
    }

    public double getCaudal() {
        return caudal;
    }

    public void setCaudal(double caudal) {
        this.caudal = caudal;
    }

    @Override
    public void calculaEficiencia(){
        System.out.println("Calcula eficiencia");
    };



}
