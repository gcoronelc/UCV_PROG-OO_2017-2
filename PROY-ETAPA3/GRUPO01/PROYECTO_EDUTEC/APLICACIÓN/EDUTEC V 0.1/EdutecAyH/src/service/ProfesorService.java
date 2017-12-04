package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfesorService {

    public List<String> leerCodigoProfesor() {
        List<String> lista = new ArrayList<>();
        // Inicio de Proceso
        Connection cn = null;
        try {
            cn = db.AccesoDB.getConnection();
            String sql = "select * from profesor "
                    + "select idprofesor from profesor ";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("idprofesor"));
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

    public List<Map<String, Object>> mostrarDatosProfesor(String codigo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            // Consulta
            String sql = "select idprofesor, apeprofesor, nomprofesor "
                    + "dirprofesor, telprofesor, emailprofesor "
                    + "from Profesor_View "
                    + "where idprofesor  = ?";

            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            // Convertir el rs en la lista
            while (rs.next()) {
                Map<String, Object> rec = new HashMap<>();
                rec.put("idprofesor", rs.getString("idprofesor"));
                rec.put("apeprofesor", rs.getString("apeprofesor"));
                rec.put("nomprofesor", rs.getString("nomprofesor"));
                rec.put("dirprofesor", rs.getString("dirprofesor"));
                rec.put("telprofesor", rs.getString("telprofesor"));
                rec.put("emailprofesor", rs.getString("emailprofesor"));

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

}
