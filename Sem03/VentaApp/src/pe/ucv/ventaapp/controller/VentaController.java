package pe.ucv.ventaapp.controller;

import pe.ucv.ventaapp.model.Item;
import pe.ucv.ventaapp.service.BoletaService;
import pe.ucv.ventaapp.service.CompAbstract;
import pe.ucv.ventaapp.service.FacturaService;

public class VentaController {

  public Item[] procesar(String tipo, double total) {
    CompAbstract comp;
    if( tipo.equals("Boleta")){
      comp = new BoletaService();
    } else {
      comp = new FacturaService();
    }
    return comp.procesarVenta(total);
  }
  
  
  
  
}
