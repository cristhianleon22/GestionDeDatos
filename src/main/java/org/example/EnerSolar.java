package org.example;

//clase energia solar
public class EnerSolar extends EnergiaRenovables {

    public EnerSolar(String tipoEnergia, String pais, int year, double produccion, double consumo) {
        super(tipoEnergia, pais, year, produccion, consumo);
    }

    public void metodoConsumo(){
        System.out.println("Por 300 m2 " + super.getTipoEnergia() + " esta consumiendo" + super.getConsumo());
    }


}