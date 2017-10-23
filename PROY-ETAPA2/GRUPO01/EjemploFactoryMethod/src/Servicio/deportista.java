
package Servicio;

import Producto.Pelota;

public class deportista {
    String nombre;
    Pelota pelota;

    public deportista(String nombre) {
        this.nombre=nombre;
    }
    public String getSaludo(){
    return "Hola, soy "+getNombre()+ " y juego con la pelota"+ getPelota().getTipo()+ 
            " que pesa "+ getPelota().getPeso()+ " gramos ";
    }

    //getters and setters 
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelota getPelota() {
        return pelota;
    }

    public void setPelota(Pelota pelota) {
        this.pelota = pelota;
    }
    
    
}
