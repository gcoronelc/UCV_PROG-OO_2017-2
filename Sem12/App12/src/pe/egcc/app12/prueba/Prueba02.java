package pe.egcc.app12.prueba;

import pe.egcc.app12.model.Alumno;
import pe.egcc.app12.service.AlumnoService;

public class Prueba02 {

    public static void main(String[] args) {
        try {

          // Dato
          Alumno alumno = new Alumno();
          alumno.setApellido("Demo");
          alumno.setNombre("Demo");
          alumno.setDireccion("Demo");
          alumno.setTelefono("Demo");
          alumno.setEmail("alfa");
          alumno.setClave("Demo");
          
          
          // Proceso
          AlumnoService appService = new AlumnoService();
          Alumno bean =appService.registrarAlumno(alumno);
          
          // Reporte
          System.out.println("CODIGO: " + bean.getAlumno());
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
