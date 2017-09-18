
package Servicio;

import Modelo.LLamadaModelo;


public class LLamadaTipoA {
    LLamadaModelo objLLama;
    public LLamadaModelo[] procesar(double costoXMin, double costoXLLama) {
       if (objLLama.getTipoLLamada().equals("Local")){
                costoXMin= 0.20; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular A")){
                costoXMin= 0.40; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular B")){
                costoXMin= 0.45; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
        else if (objLLama.getTipoLLamada().equals("Celular C")){
                costoXMin= 0.70; 
                costoXLLama= objLLama.getMinXLLamada()*costoXMin; 
                }
  
    
    return procesar(costoXMin, costoXLLama);
    }
     
}
