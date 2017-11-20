package pe.egcc.app12.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.app12.db.AccesoDB;

public class AppService {

  public String leerUltimoCiclo() {
    String ciclo = "";
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select top 1 idciclo from ciclo "
              + "order by 1 desc";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      rs.next();
      ciclo = rs.getString("idciclo");
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se puede ejecutar la consulta");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return ciclo;
  }

  public String generarCiclo(String ultimoCiclo) {
    String nuevoCiclo = "";
    
    // Tarea para ustedes
    
    return nuevoCiclo;
  }
}
