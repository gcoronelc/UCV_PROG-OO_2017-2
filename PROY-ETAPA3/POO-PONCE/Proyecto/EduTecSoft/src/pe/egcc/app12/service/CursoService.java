
package pe.egcc.app12.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.app12.db.AccesoDB;

/**
 *
 * @author Elida
 */
public class CursoService {
     public List<Map<String, Object>> conCursosPorTarifa(String tarifa) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = pe.egcc.app12.db.AccesoDB.getConnection();
            // Consulta
            String sql = "select c.IdCurso, t.IdTarifa, "
                    + "t.Descripcion nomtarifa, "
                    + "c.NomCurso, t.PrecioVenta, t.Horas, "
                    + "t.PagoHora "
                    + "from Tarifa t join Curso c "
                    + "on t.IdTarifa = c.IdTarifa  "
                    + "where t.IdTarifa = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, tarifa);
            ResultSet rs = pstm.executeQuery();
            // Convertir el rs en la lista
            while (rs.next()) {
                Map<String, Object> rec = new HashMap<>();
                rec.put("idcurso", rs.getString("idcurso"));
                rec.put("idtarifa", rs.getString("idtarifa"));
                rec.put("nomtarifa", rs.getString("nomtarifa"));
                rec.put("nomcurso", rs.getString("nomcurso"));
                rec.put("precioventa", rs.getDouble("precioventa"));
                rec.put("horas", rs.getInt("horas"));
                rec.put("pagohora", rs.getDouble("pagohora"));
                lista.add(rec);
            }
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

    public List<Map<String, Object>> leerResumenCurso(String ciclo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = pe.egcc.app12.db.AccesoDB.getConnection();
            // Consulta
            String sql = "select ciclo, curso, nomcurso, secciones, "
                    + "matriculados, ingresos, pagoprof, utilidad "
                    + "from V_RESUMEN_CURSO "
                    + "where ciclo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ciclo);
            ResultSet rs = pstm.executeQuery();
            // Convertir el rs en una lista
            while (rs.next()) {
                Map<String, Object> rec = new HashMap<>();
                rec.put("ciclo", rs.getString("ciclo"));
                rec.put("curso", rs.getString("curso"));
                rec.put("nomcurso", rs.getString("nomcurso"));
                rec.put("secciones", rs.getString("secciones"));
                rec.put("matriculados", rs.getDouble("matriculados"));
                rec.put("ingresos", rs.getInt("ingresos"));
                rec.put("pagoprof", rs.getDouble("pagoprof"));
                rec.put("utilidad", rs.getDouble("utilidad"));
                lista.add(rec);
            }
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

    public List<String> leerPeriodos() {
        List<String> lista = new ArrayList<>();
        // Inicio de Proceso
        Connection cn = null;
        try {
          cn = pe.egcc.app12.db.AccesoDB.getConnection();
            String sql = "select distinct "
                    + "left(idciclo,4) periodo "
                    + "from ciclo order by 1 desc ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("periodo"));
            }
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
        // Fin de Proceso
        return lista;
    }

    public List<String> leerCiclos(String periodo) {
        List<String> lista = new ArrayList<>();
        // Inicio de proceso
        Connection cn = null;
        try {
            cn = pe.egcc.app12.db.AccesoDB.getConnection();
            String sql = "select idciclo "
                    + "from ciclo "
                    + "where idciclo like concat(?,'%') "
                    + "order by 1 desc";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, periodo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("idciclo"));
            }
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
        // Fin de proceso
        return lista;
    }

    public List<Map<String, Object>> conCursosProfesor(String ciclo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            // Consulta
            String sql = "select periodo, ciclo, cursoprog, curso, nomcurso, horario, "
                    + "tarifa, nomtarifa, precio, pagohora, horas, vacantes, "
                    + "matriculados, ingresos, pagoprofesor, profesor, "
                    + "nomprofesor, activo "
                    + "from V_CURSOS_PROFESOR "
                    + "where ciclo  = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ciclo);
            ResultSet rs = pstm.executeQuery();
            // Convertir el rs en la lista
            while (rs.next()) {
                Map<String, Object> rec = new HashMap<>();
                rec.put("periodo", rs.getString("periodo"));
                rec.put("ciclo", rs.getString("ciclo"));
                rec.put("cursoprog", rs.getInt("cursoprog"));
                rec.put("curso", rs.getString("curso"));
                rec.put("nomcurso", rs.getString("nomcurso"));
                rec.put("horario", rs.getString("horario"));
                rec.put("tarifa", rs.getString("tarifa"));
                rec.put("nomtarifa", rs.getString("nomtarifa"));
                rec.put("precio", rs.getDouble("precio"));
                rec.put("pagohora", rs.getDouble("pagohora"));
                rec.put("horas", rs.getInt("horas"));
                rec.put("vacantes", rs.getInt("vacantes"));
                rec.put("matriculados", rs.getInt("matriculados"));
                rec.put("ingresos", rs.getDouble("ingresos"));
                rec.put("pagoprofesor", rs.getDouble("pagoprofesor"));
                rec.put("profesor", rs.getString("profesor"));
                rec.put("nomprofesor", rs.getString("nomprofesor"));
                rec.put("activo", rs.getInt("activo"));

                lista.add(rec);
            }
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


    public List<Map<String, Object>> conResumCurso(String ciclo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            // Consulta
            String sql = "select periodo, ciclo, idtarifa, nomtarifa, "
                    + "idcurso, nomcurso, horas, secciones, vacdisp, "
                    + "vactotal, matriculados, precio, pagohora, "
                    + "ingresos, pagoprof, utilidad "
                    + "from V_RESUMEN_CURSO "
                    + "where ciclo  = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ciclo);
            ResultSet rs = pstm.executeQuery();
            // Convertir el rs en la lista
            while (rs.next()) {
                Map<String, Object> rec = new HashMap<>();
                rec.put("periodo", rs.getString("periodo"));
                rec.put("ciclo", rs.getString("ciclo"));
                rec.put("idtarifa", rs.getString("idtarifa"));
                rec.put("idcurso", rs.getString("idcurso"));
                rec.put("nomcurso", rs.getString("nomcurso"));
                rec.put("horas", rs.getInt("horas"));
                rec.put("secciones", rs.getInt("secciones"));
                rec.put("vacdisp", rs.getInt("vacdisp"));
                rec.put("vactotal", rs.getInt("vactotal"));
                rec.put("matriculados", rs.getInt("matriculados"));
                rec.put("precio", rs.getDouble("precio"));
                rec.put("pagohora", rs.getDouble("pagohora"));
                rec.put("ingresos", rs.getDouble("ingresos"));
                rec.put("pagoprof", rs.getDouble("pagoprof"));
                rec.put("utilidad", rs.getDouble("utilidad"));
                lista.add(rec);
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
