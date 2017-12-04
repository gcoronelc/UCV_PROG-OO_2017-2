/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;
import java.sql.Date;
/**
 *
 * @author CBrayan
 */
public class Ciclo {

    private String ciclo;
    private Date fechainicio;
    private Date fechafinal;

    public Ciclo(String codigo, Date fechainicio, Date fechafinal) {
        this.ciclo = codigo;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
    }


    public String getCodigo() {
        return ciclo;
    }

    public void setCodigo(String codigo) {
        this.ciclo = codigo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

}
