package org.example;

//clase energía hidráulica
public class EnegiaHidraulica extends EnergiaRenovables {

    public EnegiaHidraulica(String tipoEnergia, String pais, int year, double produccion, double consumo) {
        super(tipoEnergia, pais, year, produccion, consumo);
    }

    public void metodoConsumo(){
        System.out.println("Por 300 m3" + super.getTipoEnergia() + " esta consumiendo" + super.getConsumo());
    }

}
