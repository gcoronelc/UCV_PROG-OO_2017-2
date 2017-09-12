package pe.egcc.app.service;

public class Venta1 extends VentaAbstract{

    @Override
    public double calcular(double precio, int cant) {
        return (precio * cant);
    }
    
}
