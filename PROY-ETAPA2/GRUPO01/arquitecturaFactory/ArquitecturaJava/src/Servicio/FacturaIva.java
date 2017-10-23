/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Servicio.Factura;

/**
 *
 * @author core i5
 */
public class FacturaIva extends Factura{

 @Override
 
 public double getImporteIva(){
 // TODO Auto-generated method stub
 return getImporte()*1.21;
 }

}

