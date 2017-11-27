package pe.egcc.app12.controller;

import pe.egcc.app12.model.Alumno;
import pe.egcc.app12.service.AlumnoService;

public class AlumnoController {

  private AlumnoService alumnoService;

  public AlumnoController() {
    alumnoService = new AlumnoService();
  }
  
  
  public Alumno registrarAlumno( Alumno bean ){
    return alumnoService.registrarAlumno(bean);
  }
  
  
}
