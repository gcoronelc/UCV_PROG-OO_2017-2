/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPOSITORIO;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNO
 */
public class EjecutarTest {
    
    public EjecutarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Ejecutar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ejecutar.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MenuOpciones method, of class Ejecutar.
     */
    @Test
    public void testMenuOpciones() {
        System.out.println("MenuOpciones");
        Ejecutar instance = new Ejecutar();
        instance.MenuOpciones();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
