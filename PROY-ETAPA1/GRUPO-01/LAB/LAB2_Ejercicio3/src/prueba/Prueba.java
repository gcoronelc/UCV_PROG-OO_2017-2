/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import servicio.PromedioService;
import model.Item;
public class Prueba {
    public static void main(String[] args) {
        //Datos
       Item bean;
       bean = new Item(3,250);
       
       PromedioService objTotal = new PromedioService();
       //Proceso
       objTotal.costoTotal(bean);
       
       //Reporte
       System.out.println(bean.getCostoTotal());
       
    }
}
