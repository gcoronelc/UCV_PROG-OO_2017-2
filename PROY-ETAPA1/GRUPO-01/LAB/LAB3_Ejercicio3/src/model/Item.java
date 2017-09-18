
package model;
public class Item {
    //IMPUT
    private int numeros[]= new int[2];
    //OUTPUT
    private int mcd;
    private int mcm;
    private int mayor;
    private int menor;
    //CONSTRUCTORES
    public Item(int numeros[]){
        this.numeros = numeros;
    }
    public Item(){}
    
    //Metodos get and set
    
    public void setNumeros(int[] numeros){
        this.numeros = numeros;
    }
    public int getNumeros(int index){
        return numeros[index];
    }
    
    public void setMcd(int mcd){
        this.mcd = mcd;
    }
    public int getMcd(){
        return mcd;
    }
    
    public void setMcm(int mcm){
        this.mcm = mcm;
    }
    public int getMcm(){
        return mcm;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
    public int getMenor() {
        return menor;
    }
    
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
    public int getMayor() {
        return mayor;
    }

    

}
