package prueba;

import model.Alumno;
import service.AlumnoService;

//TRANSFERENCIA DE ALUMNO

public class Prueba06 {

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
