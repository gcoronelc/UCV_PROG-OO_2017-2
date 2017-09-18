
package controlador;
import java.io.Serializable;
import java.util.ArrayList;
import modelo.Libro;


public class ArregloLibros implements Serializable{
    private ArrayList <Libro> a;
    public ArregloLibros(){
        a=new ArrayList();
    }
    public void agregar(Libro nuevo){
        a.add(nuevo);
    }
    public Libro getLibro(int i){
        return a.get(i);
    }
    public void reemplaza (int i , Libro actualizado){
        a.set(i , actualizado);
    }
    public void elimina(int i){
        a.remove(i);
    }
    public void elimina(){
        for(int i=0;i<numeroLibros();i++)
            a.remove(0);
    }
    public int numeroLibros(){
        return a.size();
    }
    public int busca(String codigo){
        for(int i=0;i<numeroLibros();i++){
            if(codigo.equalsIgnoreCase(getLibro(i).getCodigo()))
                return i;
        }
        return -1;
    }
    
    
    
    
    
    
    
     }
