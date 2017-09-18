/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Item;

public class SumaService extends OperadoresService {

    public SumaService() {
        super();
    }

    @Override
    public void operacionesMatematicas(Item bean) {
        
        //Variable
        double suma;
        suma = bean.getNumeros(0) + bean.getNumeros(1);
        bean.setSuma(suma);
        
    }

}
