/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Item;

public class OperacionesService extends MatematicaService {

    public OperacionesService() {
        super();
    }

    @Override
    public void proceso(Item bean) {
        //DATOS
        int producto = 1;
        //PROCESO
        for (int i = 1; i <= bean.getNumero(); i++) 
            producto = producto * i;
        //ENVIAR
        bean.setFactorial(producto);
    }
    public void suma(Item bean){
        //DATOS
        int suma = 0;
        //Proceso
        for (int i = 0; i <= bean.getNumero(); i++)
            suma = suma + i;
        //ENVIAR
        bean.setSuma(suma);
    }

}
