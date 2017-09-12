package pe.ucv.ventaapp.service;

import pe.ucv.ventaapp.model.Item;

public abstract class CompAbstract {
  
  public abstract Item[] procesarVenta(double total);
    
  public double dosDec( double num ){
    num *= 100;
    num = Math.round(num);
    num /= 100;
    return num;
  }
  
}
