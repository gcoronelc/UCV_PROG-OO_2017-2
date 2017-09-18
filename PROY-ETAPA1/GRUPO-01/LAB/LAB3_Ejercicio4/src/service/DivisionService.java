/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import model.Item;
public class DivisionService extends OperadoresService{
    
    @Override
    public void operacionesMatematicas(Item bean){
        double dividir=0.0;
        dividir =(double) bean.getNumeros(0) / bean.getNumeros(1);
        bean.setDivision(dividir);
    }

 
}
