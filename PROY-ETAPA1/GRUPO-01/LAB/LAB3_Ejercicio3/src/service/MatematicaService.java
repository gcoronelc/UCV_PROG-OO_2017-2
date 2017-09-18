
package service;
import model.Item;
public abstract class MatematicaService {
    public MatematicaService(){}
    public void menor(Item bean){
        if(bean.getNumeros(0) < bean.getNumeros(1))
            bean.setMenor(bean.getNumeros(0));
        else
            bean.setMenor(bean.getNumeros(1));
    }
    public void mayor(Item bean){
        if(bean.getNumeros(0) > bean.getNumeros(1))
            bean.setMayor(bean.getNumeros(0));
        else 
            bean.setMayor(bean.getNumeros(1));
    }
    public abstract void operacionesMatematicas(Item bean);
}
