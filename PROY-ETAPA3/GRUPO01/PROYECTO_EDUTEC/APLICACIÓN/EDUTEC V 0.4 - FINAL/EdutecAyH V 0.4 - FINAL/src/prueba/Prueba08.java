/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.List;
import java.util.Map;
import model.Alumno;
import model.Profesor;
import service.AlumnoService;
import service.CursoService;
import service.ProfesorService;

public class Prueba08 {
    public static void main(String[] args) {
    try {

          // Dato
          Profesor profesor= new Profesor();
          profesor.setApellido("Demo");
          profesor.setNombre("Demo");
          profesor.setDireccion("Demo");
          profesor.setTelefono("Demo");
          profesor.setEmail("alfa");
          profesor.setClave("demo");
          // Proceso
          ProfesorService profesorService=new ProfesorService();
          Profesor bean =profesorService.registrarProfesor(profesor);
          
          // Reporte
          System.out.println("CODIGO: " + bean.getId());
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
