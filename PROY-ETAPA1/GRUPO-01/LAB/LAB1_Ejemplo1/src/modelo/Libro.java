
package modelo;
import java.io.Serializable;
import javax.swing.*;

public class Libro  implements Serializable{
    private String codigo;
    private String nombre;
    private String tipo;
    private String clases;
    private int anio;
    private int num_pag;
    private double costo;

    public Libro() { 
}
public Libro(String codigo, String nombre, String tipo, String clases, int num_pag, double costo, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.clases = clases;
        this.num_pag = num_pag;
        this.costo = costo;
        this.anio=anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
