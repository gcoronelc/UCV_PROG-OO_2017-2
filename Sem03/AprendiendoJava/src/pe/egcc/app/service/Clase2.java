/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.service;

/**
 *
 * @author Docente
 */
public class Clase2 extends Clase1{

    public Clase2() {
        super("Claudia");
        System.out.println("Estan listos?");
    }

    @Override
    public int sumar(int n1, int n2) {
        int s;
        s = (n1 + n2) * ( n1 - n2);
        return s;
    }
    
    
}
