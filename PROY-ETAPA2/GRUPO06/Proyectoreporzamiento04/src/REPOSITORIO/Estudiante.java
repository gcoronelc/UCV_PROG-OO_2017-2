/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REPOSITORIO;
import javax.swing.*;

/**
 *
 * @author ALUMNO
 */
public class Estudiante {
    String codigo;
    String nombre;
    String apellido;
    public Estudiante(String codigo,String nombre,String apellido)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public void MostrarDatosPersonales()
    {
        JOptionPane.showMessageDialog(null,"Codigo:"+codigo+"\n"+
                                  "nombre:"+nombre+"\n"+                                  
                                     "apellido:"+apellido);
        
    }
            
}
