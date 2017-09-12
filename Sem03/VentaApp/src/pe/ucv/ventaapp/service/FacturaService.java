package pe.ucv.ventaapp.service;

import pe.ucv.ventaapp.model.Item;

public class FacturaService extends CompAbstract{

  @Override
  public Item[] procesarVenta(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / 1.18;
    impuesto = total - consumo;
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Consumo", dosDec(consumo) ),
      new Item("Impuesto", dosDec(impuesto)),
      new Item("Total", dosDec(total)),
      new Item("Servicio", dosDec(servicio)),
      new Item("Total General", dosDec(totalGeneral))
    };
    // Retornar reporte
    return repo;
  }
  
}
