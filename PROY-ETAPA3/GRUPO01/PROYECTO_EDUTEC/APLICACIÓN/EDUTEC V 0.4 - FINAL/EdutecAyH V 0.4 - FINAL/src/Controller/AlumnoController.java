package Controller;

import model.Alumno;
import service.AlumnoService;

public class AlumnoController {

    private AlumnoService alumnoService;

    public AlumnoController() {
        alumnoService = new AlumnoService();
    }

    public Alumno registrarAlumno(Alumno bean) {
        return alumnoService.registrarAlumno(bean);
    }

}

