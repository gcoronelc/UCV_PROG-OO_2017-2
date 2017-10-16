package pe.egcc.demojdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.demojdbc.db.AccesoDB;

public class CursoService {

    public List<Map<String, Object>> conCursosPorTarifa(String tarifa) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
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
    
    
    public List<String> leerPeriodos(){
      List<String> lista = new ArrayList<>();
      // Inicio de Proceso
      Connection cn = null;
      try {
        cn = AccesoDB.getConnection();
        String sql = "select distinct "
                + "left(idciclo,4) periodo "
                + "from ciclo order by 1 desc ";
        PreparedStatement pstm = cn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
          lista.add(rs.getString("periodo"));
        }
        rs.close();
        pstm.close();
      } catch (SQLException e) {
        throw new RuntimeException(e.getMessage());
      } catch (Exception e) {
        throw new RuntimeException("No se puede ejecutar la consulta");
      } finally{
        try {
          cn.close();
        } catch (Exception e) {
        }
      }
      // Fin de Proceso
      return lista;
    }
    
    
    
    public List<String> leerCiclos(String periodo){
      List<String> lista = new ArrayList<>();
      // Inicio de proceso
      Connection cn = null;
      try {
        cn = AccesoDB.getConnection();
        String sql = "select idciclo "
                + "from ciclo "
                + "where idciclo like concat(?,'%')";
        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setString(1, periodo);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
          lista.add(rs.getString("idciclo"));
        }
        rs.close();
        pstm.close();
      } catch (SQLException e) {
        throw new RuntimeException(e.getMessage());
      } catch (Exception e) {
        throw new RuntimeException("No se puede ejecutar la consulta");
      } finally{
        try {
          cn.close();
        } catch (Exception e) {
        }
      }
      // Fin de proceso
      return lista;
    }
    
}
