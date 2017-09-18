
package servicio;

import Modelo.LLamadaModelo;


public abstract class ComprobanteAbstract {
   public abstract LLamadaModelo[] procesarLLamada(double costoXMin, double costoXLLama);
   public double dosDecimales(double num){
       num*=100;
       num=Math.round(num);
       num/=100;
       return num;
   
   }
}
