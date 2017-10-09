package pe.egcc.apppagos.model;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class PagoModel {

  //INPUT
  private int horasDia;
  private int dias;
  private double pagoHora;
  private int hijos;

  //OUTPUT
  private int horasTra;
  private double sueldo;
  private double asignacion;
  private double bono;
  private double ingresos;
  private double renta;
  private double neto;

  public PagoModel() {
  }

  public PagoModel(int horasDia, int dias, double pagoHora, int hijos) {
    this.horasDia = horasDia;
    this.dias = dias;
    this.pagoHora = pagoHora;
    this.hijos = hijos;
  }

  public int getHorasDia() {
    return horasDia;
  }

  public void setHorasDia(int horasDia) {
    this.horasDia = horasDia;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public int getHijos() {
    return hijos;
  }

  public void setHijos(int hijos) {
    this.hijos = hijos;
  }

  public int getHorasTra() {
    return horasTra;
  }

  public void setHorasTra(int horasTra) {
    this.horasTra = horasTra;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public double getAsignacion() {
    return asignacion;
  }

  public void setAsignacion(double asignacion) {
    this.asignacion = asignacion;
  }

  public double getBono() {
    return bono;
  }

  public void setBono(double bono) {
    this.bono = bono;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getRenta() {
    return renta;
  }

  public void setRenta(double renta) {
    this.renta = renta;
  }

  public double getNeto() {
    return neto;
  }

  public void setNeto(double neto) {
    this.neto = neto;
  }

}
