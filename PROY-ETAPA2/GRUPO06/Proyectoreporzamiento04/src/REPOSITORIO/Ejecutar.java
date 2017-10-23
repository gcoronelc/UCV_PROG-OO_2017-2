/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPOSITORIO;

/**
 *
 * @author ALUMNO
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Ejecutar objEjecutar=new Ejecutar();
                objEjecutar.MenuOpciones();
    }
    
    public void MenuOpciones()
    {
        DOCENTE objDocente=new DOCENTE("001","Ivan","Petrlik");
                 objDocente.MostrarDatosPersonales();
                 
         Estudiante objEstudiante=new Estudiante("001","Ivan","Petrlik");
                 objEstudiante.MostrarDatosPersonales();
                 
         Empleado objEmpleado=new Empleado("001","Ivan","Petrlik");
                 objEmpleado.MostrarDatosPersonales();
    }
}
