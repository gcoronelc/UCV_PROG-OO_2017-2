package AbstractFactory;

public class DesignFactory implements ServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesign();
    }

}
