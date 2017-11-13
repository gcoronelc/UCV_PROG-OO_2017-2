package pe.egcc.app12.prueba;

import java.sql.Connection;
import pe.egcc.app12.db.AccesoDB;
import pe.egcc.app12.model.Alumno;
import pe.egcc.app12.service.AppService;

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
          AppService appService = new AppService();
          Alumno bean =appService.registrarAlumno(alumno);
          
          // Reporte
          System.out.println("CODIGO: " + bean.getAlumno());
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
