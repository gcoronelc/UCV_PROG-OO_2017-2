package pe.egcc.examenparcial.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.examenparcial.db.AccesoDB;

public class CursoService {

  public List<Map<String, Object>> conCursosProfesor(String ciclo) {
    List<Map<String, Object>> lista;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select periodo, ciclo, cursoprog, curso, nomcurso, "
              + "horario, tarifa, nomtarifa, precio, pagohora, horas, "
              + "vacantes, matriculados, ingresos, pagoprofesor, "
              + "profesor, nomprofesor, activo "
              + "from V_CURSOS_PROFESOR "
              + "where ciclo= ? "
              + "order by curso ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, ciclo);
      ResultSet rs = pstm.executeQuery();
      lista = JdbcUtil.rsToList(rs);
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
    return lista;
  }

}
