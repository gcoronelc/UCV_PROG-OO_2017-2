package AbstractFactory;

public class WebsiteFactory implements ServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioWebsites();
    }

}
