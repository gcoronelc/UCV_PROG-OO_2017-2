/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author core i5
 */
public class FacturaIvaReducido extends Factura {

 @Override
 public double getImporteIva() {
 // TODO Auto-generated method stub
 return getImporte()*1.07;
 }

 
}

