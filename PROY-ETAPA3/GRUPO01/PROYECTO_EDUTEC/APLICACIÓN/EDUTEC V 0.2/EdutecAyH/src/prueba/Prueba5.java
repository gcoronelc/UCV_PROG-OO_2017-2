package prueba;

import service.AppService;


public class Prueba5 {

    public static void main(String[] args) {
       try {

          // Proceso
           AppService appService = new AppService();
          String ultimoCiclo = appService.leerUltimoCiclo();
          String nuevoCiclo = appService.generarCiclo(ultimoCiclo);
          
          // Reporte
          System.out.println("ULTIMO CICLO: " + ultimoCiclo);
          System.out.println("NUEVO CICLO: " + nuevoCiclo);
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
