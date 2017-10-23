/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appAlumno;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }

    /**
     * Test of calcularPromedio method, of class Alumno.
     */
    @Test
    public void testCalcularPromedio() {
        
        Alumno instance = new Alumno("001","Ricardo", 18.00 , 16.00);
        double resultado; // variable auxiliar
               resultado = instance.calcularPromedio();
        assertEquals((18+16)/2, resultado, 0.0);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Alumno.
     */ /*
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Alumno.
     */
   /* @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Alumno instance = new Alumno();
        instance.setCodigo(codigo);
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getNombre method, of class Alumno.
     */
    /*
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */ 
    /*
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Alumno instance = new Alumno();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotaParcial method, of class Alumno.
     */
    /*
    @Test
    public void testGetNotaParcial() {
        System.out.println("getNotaParcial");
        Alumno instance = new Alumno();
        double expResult = 0.0;
        double result = instance.getNotaParcial();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotaParcial method, of class Alumno.
     */
    /*
    @Test
    public void testSetNotaParcial() {
        System.out.println("setNotaParcial");
        double notaParcial = 0.0;
        Alumno instance = new Alumno();
        instance.setNotaParcial(notaParcial);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotaFinal method, of class Alumno.
     */
    /*
    @Test
    
    public void testGetNotaFinal() {
        System.out.println("getNotaFinal");
        Alumno instance = new Alumno();
        double expResult = 0.0;
        double result = instance.getNotaFinal();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotaFinal method, of class Alumno.
     */ /*
    @Test
    public void testSetNotaFinal() {
        System.out.println("setNotaFinal");
        double notaFinal = 0.0;
        Alumno instance = new Alumno();
        instance.setNotaFinal(notaFinal);
        fail("The test case is a prototype.");
    }
   */ 
}
