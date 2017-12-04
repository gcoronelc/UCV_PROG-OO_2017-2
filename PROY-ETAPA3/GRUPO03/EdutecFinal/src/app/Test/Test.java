/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Test;
import java.sql.Connection;
import app.database.AccessDB;
import java.util.List;
import java.util.Map;
import app.util.Lista;
import app.service.CursosProgService;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author CBrayan
 */
public class Test {
    /*public static void main(String[] args){
        CursosProgServis service = new CursosProgServis();
        Connection cn;
        try{
            cn = AccessDB.getConnecction();
            System.out.println("Connection ok.");
            cn.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        List<Map<String, Object>> list;
        list = service.cursosProgramados("PHP - Frameworks");
        
    }*/
    public static void main(String[] args) {
   
        Date año = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY");
        SimpleDateFormat formato = new SimpleDateFormat("MM");
        String year = formatoFecha.format(año);
        String day = formato.format(año);
        System.out.println(year+"-"+day);
    }
    
    
}
