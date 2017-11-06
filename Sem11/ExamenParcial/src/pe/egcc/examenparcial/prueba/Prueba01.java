package pe.egcc.examenparcial.prueba;

import java.sql.Connection;
import pe.egcc.examenparcial.db.AccesoDB;

public class Prueba01 {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexión ok.");
            cn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
