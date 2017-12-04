/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Test;
import app.service.CursoNuevoService;
import app.model.Curso;
/**
 *
 * @author CBrayan
 */
public class Test1 {
    public static void main(String[] args){
        try{
            Curso curso = new Curso("","C","carlos");
            CursoNuevoService service = new CursoNuevoService();
            Curso bean = service.registrarAlumno(curso);
            
            System.out.println("Código: " + bean.getCodigo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
}
