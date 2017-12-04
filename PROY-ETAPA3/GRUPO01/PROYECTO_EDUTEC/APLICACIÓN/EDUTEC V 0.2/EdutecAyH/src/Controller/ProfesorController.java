package Controller;

import model.Profesor;
import service.ProfesorService;

public class ProfesorController {

    private ProfesorService profesorService;

    public ProfesorController() {
        profesorService = new ProfesorService();
    }

    public Profesor registrarProfesor(Profesor bean) {
        return profesorService.registrarProfesor(bean);
    }

}
