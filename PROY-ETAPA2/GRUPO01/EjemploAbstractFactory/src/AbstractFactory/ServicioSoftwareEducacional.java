package AbstractFactory;

public class ServicioSoftwareEducacional implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del programa que deben realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Se ha fijado como fecha de entrega el día 25/03/2014.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar será proporcional a la cantidad de estudiantes que harán uso del software.");
    }

}
