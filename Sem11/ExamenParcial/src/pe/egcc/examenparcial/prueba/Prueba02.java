
package pe.egcc.examenparcial.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.examenparcial.service.CursoService;


public class Prueba02 {
  
  public static void main(String[] args) {
    try {
      
      // Dato
      String ciclo = "2017-02";
      
      // Proceso
      CursoService cursoService = new CursoService();
      List<Map<String,Object>> lista = cursoService.conCursosProfesor(ciclo);
      
      // Reporte
      for (Map<String, Object> map : lista) {
        
        System.out.println(map.get("curso") + " - " + map.get("nomcurso") + " - " + map.get("matriculados"));
        
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
