
package Prueba;

import Servicio.deportista;
import CreadorConcreto.FactoryFutbolPelotas;
import CreadorConcreto.FactoryTenisPelotas;
import CreadorConcreto.FactoryBaloncestoPelotas;
import java.util.ArrayList;

    public class Prueba01 {
        public static void main(String[] args) {

            ArrayList<deportista> deportistas=new ArrayList<deportista>();

        //definicion del deportista
            deportista baloncestoDep = new deportista("Gasol");
            deportista futbolDep = new deportista("Messi");
            deportista tenisDep = new deportista("Nadal");

        //fabricas concretas
            baloncestoDep.setPelota(new FactoryBaloncestoPelotas().create());
            futbolDep.setPelota(new FactoryFutbolPelotas().create());
            tenisDep.setPelota(new FactoryTenisPelotas().create());

            deportistas.add(baloncestoDep);
            deportistas.add(futbolDep);
            deportistas.add(tenisDep);

            for (deportista dep : deportistas){
                dep.getPelota().setPeso((float) Math.random()*500);
                System.out.println(dep.getSaludo());
            }
        }
    }



