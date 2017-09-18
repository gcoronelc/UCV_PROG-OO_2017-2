
package Modelo;

public class EmpleadoModelo {
    String nombre;
    String ApePaterno;
    String ApeMaterno;
    String Area;
    int tiempoServicio;
    String condicion;
    double sueldoBase;
    double asignacionMovilidad;
    int numHijos;
    double descuentoAFP;
    double sueldoFinal;

    public EmpleadoModelo() {
    }

    public EmpleadoModelo(String nombre, String ApePaterno, String ApeMaterno, String Area, int tiempoServicio, String condicion, double sueldoBase, double asignacionMovilidad, int numHijos, double descuentoAFP, double sueldoFinal) {
        this.nombre = nombre;
        this.ApePaterno = ApePaterno;
        this.ApeMaterno = ApeMaterno;
        this.Area = Area;
        this.tiempoServicio = tiempoServicio;
        this.condicion = condicion;
        this.sueldoBase = sueldoBase;
        this.asignacionMovilidad = asignacionMovilidad;
        this.numHijos = numHijos;
        this.descuentoAFP = descuentoAFP;
        this.sueldoFinal = sueldoFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getAsignacionMovilidad() {
        return asignacionMovilidad;
    }

    public void setAsignacionMovilidad(double asignacionMovilidad) {
        this.asignacionMovilidad = asignacionMovilidad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoAFP(double descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public double getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }
    
    
}
