/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AccessDB {
    public static Connection getConnecction() throws SQLException {
        Connection cn = null;
        try{
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:50372;databaseName=edutec";
        String user = "eureka";
        String pass = "admin";
        Class.forName(driver).newInstance();
        cn = DriverManager.getConnection(url,user,pass);
        } catch(SQLException e){
            throw e;
        } catch(ClassNotFoundException e){
            throw new SQLException("ERROR, no se encuentra el Driver");
        } catch(Exception e){
            throw new SQLException("ERROR, no se tiene acceso al servidor");
        }
        
        return cn;
    }
}
