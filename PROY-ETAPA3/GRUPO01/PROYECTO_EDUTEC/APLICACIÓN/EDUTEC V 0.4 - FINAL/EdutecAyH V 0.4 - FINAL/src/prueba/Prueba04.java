
package prueba;


import service.ProfesorService;

public class Prueba04 {
    public static void main(String[] args) {
        try {
          // Proceso
          ProfesorService service=new ProfesorService();
        
          // Reporte
          System.out.println(" "+ service.leerCodigoProfesor());
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}
