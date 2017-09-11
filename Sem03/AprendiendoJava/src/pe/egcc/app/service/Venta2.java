package pe.egcc.app.service;

public class Venta2 extends VentaAbstract{

    @Override
    public double calcular(double precio, int cant) {
        double total = precio * cant;
        if(cant > 6){
            total = total * 0.95;
        }
        return total;
    }
    
}
