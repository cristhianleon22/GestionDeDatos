package org.example;

public abstract class EnergiaRenovable {
    String tipo;
    String pais;
    int anio;
    double produccion;
    double consumo;

    //contructor
    public EnergiaRenovable(String tipo, String pais, int anio, double produccion, double consumo) {
        this.tipo = tipo;
        this.pais = pais;
        this.anio = anio;
        this.produccion = produccion;
        this.consumo = consumo;
    }

    // getter and setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getProduccion() {
        return produccion;
    }

    public void setProduccion(double produccion) {
        this.produccion = produccion;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void calculaEficiencia() {
        //

    }
}
