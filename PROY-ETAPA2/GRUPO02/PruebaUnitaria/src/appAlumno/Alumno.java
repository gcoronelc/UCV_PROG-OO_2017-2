package appAlumno;

public class Alumno {

    private String codigo;
    private String nombre;
    private double notaParcial;
    private double notaFinal;

    public Alumno(String codigo, String nombre, double notaParcial, double notaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
    }

    public Alumno() {
    }

    public double calcularPromedio() {

        return (this.notaParcial + this.notaFinal) / 3;
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

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

}
