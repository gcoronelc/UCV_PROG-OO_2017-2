/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Senara
 */
public class Item {
    //Variables
    private double[] notasPractica = new double[3];
    private double promedioPractica;
    private double examenParcial;
    private double examenFinal;
    private double promedioFinal;
    
    //Constructores
    public Item(){}
    public Item(double[] notasPractica, double examenParcial, double examenFinal){
        this.notasPractica = notasPractica;
        this.examenParcial = examenParcial;
        this.examenFinal = examenFinal;
    }
    
    //Metodos get and set
    public void setNotasPractica(double[] notasPractica){
        this.notasPractica = notasPractica;
    }
    public double getNotasPractica(int indice){
        return notasPractica[indice];
    }
    public void setPromedioPractica(double promedioPractica){
        this.promedioPractica = promedioPractica;
    }
    public double getPromedioPractica(){
        return promedioPractica;
    }
    
    public void setExamenParcial(double examenParcial){
        this.examenParcial = examenParcial;
    }
    public double getExamenParcial(){
        return examenParcial;
    }
    
    public void setExamenFinal(double examenFinal){
        this.examenFinal = examenFinal;
    }
    public double getExamenFinal(){
        return examenFinal;
    }
    
    public void setPromedioFinal(double promedioFinal){
        this.promedioFinal = promedioFinal;
    }
    public double getPromedioFinal(){
        return promedioFinal;
    }
            
}
