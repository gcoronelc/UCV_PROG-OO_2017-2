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
import java.sql.Date;
public class Matricula {

    private int codigoprofesor;
    private String codigoalumno;
    private String fechamatricula;
    private double examenparcial;
    private double examenfinal;
    private double promedio;
    private double subsanacion;
    private double exasubsanacion;

    public Matricula(int codigoprofesor, String codigomatricula, String fechamatricula, double examenparcial, double examenfinal, double promedio, double subsanacion, double exasubsanacion) {
        this.codigoprofesor = codigoprofesor;
        this.codigoalumno = codigomatricula;
        this.fechamatricula = fechamatricula;
        this.examenparcial = examenparcial;
        this.examenfinal = examenfinal;
        this.promedio = promedio;
        this.subsanacion = subsanacion;
        this.exasubsanacion = exasubsanacion;
    }
    public Matricula(){}

    public int getCodigoprofesor() {
        return codigoprofesor;
    }

    public void setCodigoprofesor(int codigoprofesor) {
        this.codigoprofesor = codigoprofesor;
    }

    public String getCodigoalumno() {
        return codigoalumno;
    }

    public void setCodigoalumno(String codigomatricula) {
        this.codigoalumno = codigomatricula;
    }

    public String getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(String fechamatricula) {
        this.fechamatricula = fechamatricula;
    }

    public double getExamenparcial() {
        return examenparcial;
    }

    public void setExamenparcial(double examenparcial) {
        this.examenparcial = examenparcial;
    }

    public double getExamenfinal() {
        return examenfinal;
    }

    public void setExamenfinal(double examenfinal) {
        this.examenfinal = examenfinal;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getSubsanacion() {
        return subsanacion;
    }

    public void setSubsanacion(double subsanacion) {
        this.subsanacion = subsanacion;
    }

    public double getExasubsanacion() {
        return exasubsanacion;
    }

    public void setExasubsanacion(double exasubsanacion) {
        this.exasubsanacion = exasubsanacion;
    }

}
