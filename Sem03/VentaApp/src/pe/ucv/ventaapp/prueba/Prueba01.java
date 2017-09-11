package pe.ucv.ventaapp.prueba;

import pe.ucv.ventaapp.model.Item;
import pe.ucv.ventaapp.service.CompAbstract;
import pe.ucv.ventaapp.service.FacturaService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    double total = 567.89;
    
    // Proceso
    CompAbstract comp = new FacturaService();
    Item[] repo = comp.procesarVenta(total);
    
    // Reporte
    for (Item item : repo) {
      System.out.println(item.getConcepto() 
              + " | " + item.getValor());
    }
    
  }
  
}
