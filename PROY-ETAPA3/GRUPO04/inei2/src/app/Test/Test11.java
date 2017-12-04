/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Test;
import app.service.CicloService;
import app.model.Ciclo;
import java.sql.Date;
/**
 *
 * @author CBrayan
 */
public class Test11 {
    public static void main(String[] args){
        Date inicio ;
        Date fin;
        try{
            inicio = null;
            fin = null;
            Ciclo curso = new Ciclo("No recuerdo :v",inicio,fin);
            CicloService service = new CicloService();
            Ciclo bean = service.generarCiclo(curso);
            
            System.out.println("Código: " + bean.getCodigo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
}
