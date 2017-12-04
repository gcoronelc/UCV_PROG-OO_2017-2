package prueba;

import service.AppService;

//TRANSFERENCIA DE ULTIMO CICLO

public class Prueba07 {

   
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
