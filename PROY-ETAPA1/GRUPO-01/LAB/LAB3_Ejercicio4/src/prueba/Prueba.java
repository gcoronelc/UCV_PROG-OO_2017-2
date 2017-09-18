/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import model.Item;
import service.DivisionService;
import service.OperadoresService;
import service.ProductoService;
import service.SumaService;
import service.RestaService;
public class Prueba {
    
    public static void main(String[] args){
        //DATOS
        int numeros[] = {5, 2};
        Item bean = new Item();
        bean.setNumeros(numeros);
        //PROCESOS
        
        OperadoresService objSuma = new  SumaService();
        OperadoresService objResta= new  RestaService();
        OperadoresService objProducto = new ProductoService();
        OperadoresService objDivision = new DivisionService();
        
        objSuma.operacionesMatematicas(bean);
        objResta.operacionesMatematicas(bean);
        objDivision.operacionesMatematicas(bean);
        objProducto.operacionesMatematicas(bean);
        
        //REPORTES
        System.out.println(bean.getSuma());
        System.out.println(bean.getResta());
        System.out.println(bean.getDivision());
        System.out.println(bean.getProducto());
    }
    
}
