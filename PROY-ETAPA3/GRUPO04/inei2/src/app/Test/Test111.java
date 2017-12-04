/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Test;
import app.service.ServiceAlumnos;
import app.service.ServiceMatricula;
import app.model.Alumno;
import app.model.Matricula;
/**
 *
 * @author CBrayan
 */
public class Test111 {
    public static void main(String[] args){

        try{
            Alumno alumno = new Alumno("No recuerdo :v","","","","","dsfdd","");
            ServiceAlumnos service = new ServiceAlumnos();
            Alumno bean = service.registrarAlumno(alumno);
            System.out.println("Código: " + bean.getCodigo());
            System.out.println("Clave: " + bean.getClave());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Matricula bean = new Matricula();
        bean.setCodigoprofesor(7936);
        bean.setCodigoalumno("A0056");

        ServiceMatricula service = new ServiceMatricula();
        service.registrarMatricula(bean);
        
    }
        
}
