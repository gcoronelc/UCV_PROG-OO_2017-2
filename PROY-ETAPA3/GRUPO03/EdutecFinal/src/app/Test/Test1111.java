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
public class Test1111 {
    public static void main(String[] args){

        Matricula bean = new Matricula();
        bean.setCodigoprofesor(7936);
        bean.setCodigoalumno("A0065");
        bean.setSubsanacion(0);

        MatriculaService service = new MatriculaService();
        service.registrarMatricula(bean);
        
    }
        
}
