package org.example;

//clase energía eólica
public class EnerEolica extends EnergiaRenovables {

    public EnerEolica(String tipoEnergia, String pais, int year, double produccion, double consumo) {
        super(tipoEnergia, pais, year, produccion, consumo);
    }

    public void metodoConsumo(){
        System.out.println("Por 300 m/s" + super.getTipoEnergia() + " esta consumiendo" + super.getConsumo());
    }
}