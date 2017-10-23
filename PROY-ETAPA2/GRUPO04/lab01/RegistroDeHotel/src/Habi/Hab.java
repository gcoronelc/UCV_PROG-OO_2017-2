/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habi;
public class Hab {
    //Datos de Entrada
    private byte numeroHabitacion;
    private boolean estadoHabitacion = false;
    private String tipoHabitacion;
    private String fechaRegistro;
    
    //Constructores
    public Hab() {
    }

    public Hab(byte numeroHabitacion, String tipoHabitacion, String fechaRegistro) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaRegistro = fechaRegistro;
    }
    
    //Metodos get and set
    public byte getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(byte numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isEstadoHabitacion() {
        return estadoHabitacion;
    }
    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
