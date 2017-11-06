package pe.egcc.examenparcial.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.egcc.examenparcial.db.AccesoDB;

public class CursoService {

  public List<Map<String, Object>> conCursosProfesor(String ciclo) {
    List<Map<String, Object>> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();

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
    return lista;
  }

}
