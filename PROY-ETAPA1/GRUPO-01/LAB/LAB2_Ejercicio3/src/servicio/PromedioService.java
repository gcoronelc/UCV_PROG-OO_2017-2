
package servicio;
import model.Item;
public class PromedioService {
    public PromedioService(){
        
    }
    public void costoTotal(Item bean){
        //Variable
        double costoTotal;
        costoTotal = bean.getCantidad() * bean.getPrecio();
        bean.setCostoTotal(costoTotal);
    }
}
