
package prueba;
import model.Item;
import service.OperacionesService;
public class Prueba {
    public static void main(String[] args){
        //DATOS
        Item bean = new Item(12);
        //Proceso
        OperacionesService objOperaciones = new OperacionesService();
        objOperaciones.proceso(bean);
        objOperaciones.suma(bean);
        objOperaciones.tipoNumero(bean);
        
        //REPORTE
        System.out.println("Fantorial de " + bean.getNumero() + ": " + bean.getFactorial());
        System.out.println(bean.getNumero() + " es Primo:" + bean.getTipo());
        System.out.println("Suma de los n numeros: " + bean.getSuma());
    }
}
