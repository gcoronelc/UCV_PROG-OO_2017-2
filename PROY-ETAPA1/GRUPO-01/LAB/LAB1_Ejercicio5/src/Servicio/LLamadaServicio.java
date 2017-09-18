
package Servicio;

import Modelo.LLamadaModelo;

public class LLamadaServicio {
    ComprobanteAbstract comp;
    public LLamadaModelo[] procesarTipo(String tipoPlan) {
        if(tipoPlan.equals("A")){
            comp = new LLamadaTipoA();
        }else if(tipoPlan.equals("B")){
            comp = new LLamadaTipoB();
        }
        return procesarTipo(tipoPlan);
    }
}

