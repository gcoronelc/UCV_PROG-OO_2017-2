package pe.egcc.app.prueba;

import pe.egcc.app.service.Venta1;
import pe.egcc.app.service.Venta2;
import pe.egcc.app.service.VentaAbstract;

public class Prueba03 {

    public static void main(String[] args) {
        VentaAbstract obj = new Venta2();
        System.out.println("Venta: " + obj.calcular(200, 8));
    }
    
}
