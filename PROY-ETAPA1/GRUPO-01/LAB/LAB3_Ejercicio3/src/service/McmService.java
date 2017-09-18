/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Item;

public  class McmService extends MatematicaService {

    @Override
    public void operacionesMatematicas(Item bean) {
        int[] numeros = {bean.getNumeros(0), bean.getNumeros(1)};
        int[] valores = new int[2];
        int mcm = 1;
        int mayor = bean.getMayor();
        int contador = 2;
        while (contador <= mayor) {
            valores[0] = numeros[0] / contador;
            valores[1] = numeros[1] / contador;
            if (valores[0] * contador == numeros[0] && valores[1] * contador == numeros[1]) {
                numeros[0] = valores[0];
                numeros[1] = valores[1];
                mayor = mayor / contador;
                mcm = mcm * contador;
                contador = 2;
            } else if (valores[0] * contador == numeros[0]) {
                if(numeros[0] ==mayor)
                    mayor = mayor /contador;
                numeros[0] = valores[0];
                mcm = mcm * contador;
                contador = 2;
            } else if (valores[1] * contador == numeros[1]) {
                if(numeros[1] ==mayor)
                    mayor = mayor /contador;
                numeros[1] = valores[1];
                mcm = mcm * contador;
                contador = 2;
            } else {
                contador++;
            }
        }
        bean.setMcm(mcm);
    }
}
