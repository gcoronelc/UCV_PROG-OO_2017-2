/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;


import Servicio.FactoriaFacturas;
import Servicio.Factura;


/**
 *
 * @author core i5
 */
public class Principal {
   
 
 public static void main(String[] args) {
 
 Factura f= FactoriaFacturas.getFactura("iva");
 f.setId(1);
 f.setImporte(150);
 System.out.println(f.getImporteIva());
 }
 
}

