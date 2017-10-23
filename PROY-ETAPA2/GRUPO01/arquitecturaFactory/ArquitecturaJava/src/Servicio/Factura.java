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
public abstract class Factura {
    private int id;
    private double importe;
    private double importeIva;

    public int getId() {
         return id;
    }
    public void setId(int id) {
         this.id = id;
    }
    public double getImporte() {
         return importe;
    }
    public void setImporte(double importe) {
         this.importe = importe;
    }

    public double getImporteIva() {
        return importeIva;
    }

    public void setImporteIva(double importeIva) {
        this.importeIva = importeIva;
    } 
  }
 


