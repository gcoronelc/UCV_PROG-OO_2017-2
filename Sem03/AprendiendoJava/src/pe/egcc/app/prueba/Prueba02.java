/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;

/**
 *
 * @author Docente
 */
public class Prueba02 {

    public static void main(String[] args) {
        
        // Caso 1
        Clase1 obj = new Clase1();
        System.out.println(obj.sumar(10, 5));
        
        // Caso 2
        obj = new Clase2();
        System.out.println(obj.sumar(10, 5));
        
    }

    
}
