/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Senara
 */
public class Item {

    //Variables
    private int cantidad;
    private double precio;
    private double costoTotal;
    
    //Constructores
    public Item(){}
    public Item(int cantidad, double precio){
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    //Metodos get and set
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
            
}
