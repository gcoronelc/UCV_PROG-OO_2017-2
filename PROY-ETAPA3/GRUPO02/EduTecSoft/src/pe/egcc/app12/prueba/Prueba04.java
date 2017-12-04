
package pe.egcc.app12.prueba;

import pe.egcc.app12.service.AppService;

public class Prueba04 {
    public static void main (String [] args){
        try{
            AppService appService = new AppService();
            String ultimoCiclo = appService.leerUltimoCiclo();
            String nuevoCiclo = appService.generarCiclo(ultimoCiclo);
            System.out.println("ULTIMO CICLO: " + ultimoCiclo);
            System.out.println("NUEVO CICLO: " + nuevoCiclo);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
