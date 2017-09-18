
package model;

public class Item {
    //IMPUT
    private int numero;
    //OUTPUT
    private String tipo;
    private int factorial;
    private int suma;
    
    //CONSTRUCTORES
    public Item(){}
    public Item(int numero){
        this.numero = numero;
    }
    
    //METODOS SET AND GET
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setSuma(int suma){
        this.suma = suma;
    }
    public int getSuma(){
        return suma;
    }
    
    public void setFactorial(int factorial){
        this.factorial = factorial;
    }
    public int getFactorial(){
        return factorial;
    }
}
