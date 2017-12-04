
package prueba;
import model.Tarifa;
import service.TarifaServive;

public class Prueba11 {
    public static void main(String[] args) {
    try {
          // Dato
          Tarifa tarifa = new Tarifa();
          tarifa.setId("F");
          tarifa.setHoras(40);
          tarifa.setDescripcion("Demo");
          tarifa.setPagoHora(230.00);
          tarifa.setPrecioVenta(30.00);
          
          // Proceso
          TarifaServive tarifaService=new TarifaServive();
          Tarifa bean = tarifaService.registrarTarifa(tarifa);
          
          // Reporte
          System.out.println("Registro De Tarifa Correctamente");
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
