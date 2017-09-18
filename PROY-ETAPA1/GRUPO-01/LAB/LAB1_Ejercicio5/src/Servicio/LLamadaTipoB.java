
package Servicio;
import Modelo.LLamadaModelo;

public class LLamadaTipoB {
    LLamadaModelo objLLama;
    public LLamadaModelo[] procesar(double costoXMin, double costoXLLama) {
       if (objLLama.getTipoLLamada().equals("Local")){
                costoXMin= 0.15; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular A")){
                costoXMin= 0.30; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular B")){
                costoXMin= 0.35; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular C")){
                costoXMin= 0.60; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
    return procesar(costoXMin, costoXLLama);
    }
}



