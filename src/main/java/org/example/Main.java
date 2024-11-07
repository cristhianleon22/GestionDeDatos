package tema.pkg2.energiarenovable;
import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {


    List<EnergiaRenovables> energias = new ArrayList<>();

    energias.add(new EnegiaHidraulica("hidraulica","Colombia", 2010, 80.0, 50.0));
    energias.add(new EnegiaHidraulica("hidraulica","Chile", 2015, 50.0, 20.0));
    energias.add(new EnerSolar("solar","Colombia", 2010, 70.0, 50.0));
    energias.add(new EnerSolar("solar","Chile", 2015, 60.0, 20.0));
    energias.add(new EnerEolica("eolica","Colombia", 210, 90.0, 50.0));
    energias.add(new EnerEolica("eolica","Chile", 2015, 40.0, 20.0));

    for(EnergiaRenovables energia:energias){

        System.out.println("Tipo de Energía :" + energia.getTipoEnergia());
        System.out.println("País :" + energia.getPais());
        System.out.println("Año :" + energia.getYear());
        System.out.println("Produccion :" + energia.getProduccion());
        System.out.println("Consumo" + energia.getConsumo());
        energia.balanceEnergetico();
        //energia.metodoConsumo();
        System.out.println("\n");


    }



}
}


}