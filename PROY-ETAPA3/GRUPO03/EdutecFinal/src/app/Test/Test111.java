/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Test;
import app.service.AlumnoService;
import app.service.MatriculaService;
import app.model.Universitario;
import app.model.Matricula;
/**
 *
 * @author CBrayan
 */
public class Test111 {
    public static void main(String[] args){

        try{
            Universitario alumno = new Universitario("No recuerdo :v","","","","","dsfdd","");
            AlumnoService service = new AlumnoService();
            Universitario bean = service.registrarEstudiantes(alumno);
            System.out.println("Código: " + bean.getCodigo());
            System.out.println("Clave: " + bean.getClave());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Matricula bean = new Matricula();
        bean.setCodigoprofesor(7936);
        bean.setCodigoalumno("A0056");

        MatriculaService service = new MatriculaService();
        service.registrarMatricula(bean);
        
    }
        
}
