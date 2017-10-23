/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sal;
import Huesp.hues;
import Habi.Hab;
/**
 *
 * @author Senara
 */
public class slda {
    
    //Variables privadas
    private String nombre;
    private String apellido;
    private byte numeroHabitacion;
    private String tipoHabitacion;
    private String fechaRegistro;
    private String fechaSalida;
    private boolean estadoHabitacion;
    
    //Constructores
    public slda(hues datos, Hab date, String fechaSalida) {
        
        this.nombre = datos.getNombre();
        this.apellido = datos.getApellido();
        this.numeroHabitacion = date.getNumeroHabitacion();
        this.tipoHabitacion = date.getTipoHabitacion();
        this.fechaRegistro = date.getFechaRegistro();
        this.fechaSalida = fechaSalida;
        this.estadoHabitacion = date.isEstadoHabitacion();
    }
    
    public slda() {
    }
    
    //Metodos get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(byte numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
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

    public String getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    

    public boolean isEstadoHabitacion() {
        return estadoHabitacion;
}
    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }
}
