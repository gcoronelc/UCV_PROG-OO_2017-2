package AbstractFactory;

public class ServicioWebsites implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("El personal encargado del desarrollo de sitios web ha aceptado el trabajo.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("El sitio web con Responsive Design será terminado a más tardar el día 26/04/2014.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar no incluye el pago por dominio y hosting.");
    }

}
