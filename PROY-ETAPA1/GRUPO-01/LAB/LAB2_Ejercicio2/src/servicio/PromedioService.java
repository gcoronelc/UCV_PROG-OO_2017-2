
package servicio;
import model.Item;
public class PromedioService {
    public PromedioService(){
        
    }
    public void promedioPractica(Item bean){
        //Variable 
        double promedio;
        
        //Proceso 
        promedio = (bean.getNotasPractica(0) + bean.getNotasPractica(1) + bean.getNotasPractica(2) + bean.getNotasPractica(3))/4;
        bean.setPromedioPractica(promedio);
    }
    public void promedioFinal(Item bean){
        //Variable
        double promedioFinal;
        
        //Proceso
        promedioFinal = (bean.getPromedioPractica()* 0.30)  + (bean.getExamenParcial()*0.30) + (bean.getExamenFinal()* 0.40);
        bean.setPromedioFinal(promedioFinal);
        
        
        
    }
}
