/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author CBrayan
 */
public class operaciones {

    public static void main(String[] args) {
        Random dato = new Random();
        String numero = "";
        for (int x = 0; x < 6; x++) {
            numero += (dato.nextInt(8) + 1);
        }
        System.out.println(numero);
    }

}
