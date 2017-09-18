
package service;
import model.Item;
public abstract class MatematicaService {
 //Constructor
 public MatematicaService(){}
 
 //Metodo herencia abstract
 public abstract void proceso(Item bean);
 
 public void tipoNumero(Item bean){
     //VAriable
     int numero = bean.getNumero(); 
     //Proceso
     numero = numero /2;
     numero = numero * 2;
     if(numero == bean.getNumero())
         bean.setTipo("NO");
     else
         bean.setTipo("SI");
 }
}
