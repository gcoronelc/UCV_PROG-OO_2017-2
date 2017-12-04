/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

/**
 *
 * @author CBrayan
 */
public class Curso {

    private String codigo;
    private String tarifa;
    private String nombre;

    public Curso(String codigo, String tarifa, String nombre) {
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.nombre = nombre;
    }

    public Curso() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
