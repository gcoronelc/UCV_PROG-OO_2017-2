
package Controlador;
import java.io.Serializable;
import java.util.ArrayList;
import Modelo.LLamadaModelo;
public class ArregloLLamada implements Serializable{
    private ArrayList <LLamadaModelo> ll;
    public ArregloLLamada(){
        ll=new ArrayList();
    }
    public int numeroLLamada(){
        return ll.size();
    }
     public LLamadaModelo getLLamada(int l){
        return ll.get(l);
    }
}
