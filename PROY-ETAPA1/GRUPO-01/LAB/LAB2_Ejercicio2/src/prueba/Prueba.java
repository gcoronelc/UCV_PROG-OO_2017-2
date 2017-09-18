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
       Item objBean;
       double notas[] = {15.0,15.0,20.0,17.5};
       objBean = new Item(notas,15.0,12.5);
       
       PromedioService objPromedio = new PromedioService();
       //Proceso
       objPromedio.promedioPractica(objBean);
       objPromedio.promedioFinal(objBean);
       
       //Reporte
       System.out.println(objBean.getPromedioFinal());
       
    }
}
