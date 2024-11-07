package org.example;

public abstract class                     j {
    // definicion de parametros
    String tipoEnergia;
    String pais;
    int year;
    double produccion;
    double consumo;

    //construtor
    public EnergiaRenovables(String tipoEnergia,String pais, int year, double produccion, double consumo ){

        this.tipoEnergia = tipoEnergia;
        this.pais = pais;
        this.year= year;
        this.produccion = produccion;
        this.consumo= consumo;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    //metodo balance energetico
    public void balanceEnergetico(){
        double balaceEnerg= produccion-consumo;
        System.out.println("El balance Energetico de "+ tipoEnergia + " es " + balaceEnerg+ " Kw");
    }

}

}
