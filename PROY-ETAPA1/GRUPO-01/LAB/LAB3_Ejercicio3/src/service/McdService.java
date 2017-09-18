/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Item;

public class McdService extends MatematicaService {

    public McdService() {
        super();
    }

    @Override
    public void operacionesMatematicas(Item bean) {
        
        //Variable
        int numeros[] = {bean.getNumeros(0), bean.getNumeros(1)};
        int valores[] = new int[2];
        int mcd = 1;
        
        int menor = bean.getMenor();
        int contador = 2;
        //Proceso
        while (contador <= menor) {
            valores[0] = numeros[0] / contador;
            valores[1] = numeros[1] / contador;
            if (valores[0] * contador == numeros[0] && valores[1] * contador == numeros[1]) {
                numeros[0] = valores[0];
                numeros[1] = valores[1];
                menor = menor / contador;
                mcd = mcd * contador;
                contador = 2;
            }else{
            contador ++;}
            
        }
        bean.setMcd(mcd);
        
    }

}
