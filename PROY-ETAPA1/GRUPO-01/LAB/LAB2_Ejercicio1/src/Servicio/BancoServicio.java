
package Servicio;

public class BancoServicio {
   public double obtenerImporte (double capitalInicial, double interesMes, int n){
       double importe;
       importe =capitalInicial*Math.pow(1+interesMes,n);
       return importe;
   }
}
