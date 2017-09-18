
package model;
public class Item {
    //IMPUT
    private int numeros[]= new int[2];

      //OUTPUT
    private double suma;
    private double resta;
    private double producto;
    private double division;
    //CONSTRUCTORES
    
    public Item(){}
    
    //Metodos get and set
    
    public void setNumeros(int[] numeros){
        this.numeros = numeros;
    }
    public int getNumeros(int index){
        return numeros[index];
    }
    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getProducto() {
        return producto;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public double getDivision() {
        return division;
    }

  
    public void setDivision(double division) {
        this.division = division;
    }
    
    

  

    

}
