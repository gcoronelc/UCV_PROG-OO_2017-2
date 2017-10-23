package AbstractFactory;

public class SoftwareFactory implements ServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftwareEducacional();
    }

}
