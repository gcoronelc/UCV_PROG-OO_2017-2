package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.model.PagoModel;
import pe.egcc.pagoapp.service.PagoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    PagoModel bean = new PagoModel(6, 20, 130.0);
    
    // Proceso
    PagoService service = new PagoService();
    bean = service.procesarPago(bean);
    
    // Reporte
    System.out.println("INPUT");
    System.out.println("Horas X día: " + bean.getHorasDia());
    System.out.println("Días: " + bean.getDias());
    System.out.println("Pago X Hora: " + bean.getPagoHora());
    System.out.println("OUTPUT" );
    System.out.println("Ingresos: " + bean.getIngresos());
  }
  
}
