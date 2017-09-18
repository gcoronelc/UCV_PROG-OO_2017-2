/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Docente
 */
public class OperacionesServiceTest {
    
    public OperacionesServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Suma method, of class OperacionesService.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int num1 = 0;
        int num2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.Suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class OperacionesService.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int num1 = 0;
        int num2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.Resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class OperacionesService.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int num1 = 0;
        int num2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.Multiplicacion(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class OperacionesService.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int num1 = 0;
        int num2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.Division(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
