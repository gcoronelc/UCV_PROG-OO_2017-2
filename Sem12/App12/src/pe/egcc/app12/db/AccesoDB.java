package pe.egcc.app12.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
public class AccesoDB {

  private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException {
    Connection cn = null;
    
    try {
      // Datos Oracle
      String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String url = "jdbc:sqlserver://localhost:1433;databaseName=edutec";
      String user = "eureka";
      String pass = "admin";
      // Cargar el driver a memoria
      Class.forName(driver).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
      throw e;
    } catch (ClassNotFoundException e) {
      throw new SQLException("ERROR, no se encuentra el driver.");
    } catch (Exception e) {
      throw new SQLException("ERROR, no se tiene acceso al servidor.");
    }
    return cn;
  }
  
}