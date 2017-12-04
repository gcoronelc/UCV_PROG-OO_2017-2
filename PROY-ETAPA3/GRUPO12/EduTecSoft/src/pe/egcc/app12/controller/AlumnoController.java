package pe.egcc.app12.controller;

import java.util.List;
import java.util.Map;
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

  public Alumno conCodigo( Alumno bean) {
    return alumnoService.conCodigo(bean);
   
}

    public List<Map<String, Object>> conCodigo(String alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}



  
 

