package pe.egcc.app12.prueba;

import pe.egcc.app12.service.AppService;

public class Prueba03 {

    public static void main(String[] args) {
        try {

          // Proceso
          AppService appService = new AppService();
          String ciclo = appService.leerUltimoCiclo();
          
          // Reporte
          System.out.println("ULTIMO CICLO: " + ciclo);
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
