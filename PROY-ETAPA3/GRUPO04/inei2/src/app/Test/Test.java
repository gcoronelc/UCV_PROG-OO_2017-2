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
import app.service.ProgCursosService;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 *
 * @author CBrayan
 */
public class Test {
    public static void main(String[] args){
        
        Connection cn;
        try{
            cn = AccessDB.getConnecction();
            System.out.println("Connection ok.");
            cn.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        
        
    }

    
    
}
