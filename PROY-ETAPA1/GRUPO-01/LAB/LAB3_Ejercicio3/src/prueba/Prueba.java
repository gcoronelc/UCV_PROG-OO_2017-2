/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import model.Item;
import service.MatematicaService;
import service.McdService;
import service.McmService;
public class Prueba {
    
    public static void main(String[] args){
        //DATOS
        int numeros[] = {175, 354};
        Item bean = new Item(numeros);
        //PROCESOS
        
        MatematicaService objMatematica = new  McdService();
        MatematicaService objOperaciones= new  McmService();
        objMatematica.menor(bean);
        objOperaciones.mayor(bean);
        objMatematica.operacionesMatematicas(bean);
        objOperaciones.operacionesMatematicas(bean);
        
        //REPORTES
        System.out.println(bean.getMcd());
        System.out.println(bean.getMcm());
    }
    
}
