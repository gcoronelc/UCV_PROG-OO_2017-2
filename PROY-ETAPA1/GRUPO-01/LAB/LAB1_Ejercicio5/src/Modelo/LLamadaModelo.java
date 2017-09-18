
package Modelo;

import java.io.Serializable;

public class LLamadaModelo implements Serializable{
    private String tipoPlan;
    private String tipoLLamada;
    private String horarioLLamada;
    private int minXLLamada;
    private double costoXMin;
    private double costoXLLama;

    public LLamadaModelo() {
    }

    public LLamadaModelo(String tipoPlan, String tipoLLamada, String horarioLLamada, int minXLLamada, double costoXMin, double costoXLLama) {
        this.tipoPlan = tipoPlan;
        this.tipoLLamada = tipoLLamada;
        this.horarioLLamada = horarioLLamada;
        this.minXLLamada = minXLLamada;
        this.costoXMin = costoXMin;
        this.costoXLLama = costoXLLama;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getTipoLLamada() {
        return tipoLLamada;
    }

    public void setTipoLLamada(String tipoLLamada) {
        this.tipoLLamada = tipoLLamada;
    }

    public String getHorarioLLamada() {
        return horarioLLamada;
    }

    public void setHorarioLLamada(String horarioLLamada) {
        this.horarioLLamada = horarioLLamada;
    }

    public double getMinXLLamada() {
        return minXLLamada;
    }

    public void setMinXLLamada(int minXLLamada) {
        this.minXLLamada = minXLLamada;
    }

    public double getCostoXMin() {
        return costoXMin;
    }

    public void setCostoXMin(double costoXMin) {
        this.costoXMin = costoXMin;
    }

    public double getCostoXLLama() {
        return costoXLLama;
    }

    public void setCostoXLLama(double costoXLLama) {
        this.costoXLLama = costoXLLama;
    }
    
    
}
