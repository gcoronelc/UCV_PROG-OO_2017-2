package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Profesor;

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
            String sql = "select idprofesor, apeprofesor, nomprofesor, "
                    + "dirprofesor, telprofesor, emailprofesor "
                    + "from Profesor_View "
                    + "where idprofesor = ?";

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

    public Profesor registrarProfesor ( Profesor bean ){
      Connection cn = null;
      try {
        cn = AccesoDB.getConnection();
        cn.setAutoCommit(false);
        
        String sql = "update parametro set contador = contador + 1 "
                + "where Campo = 'IdProfesor'";
        PreparedStatement pstm = cn.prepareStatement(sql);
        int filas = pstm.executeUpdate();
        pstm.close();
        if( filas != 1 ){
          throw new SQLException("Error en la tabla de parametros.");
        }
        
        sql = "select contador from parametro where Campo = 'IdProfesor'";
        pstm = cn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if(!rs.next()){
          throw new SQLException("Error en la tabla de parametros.");
        }
        int cont = rs.getInt("contador");
        rs.close();
        pstm.close();
        
        String patron = "000";
        DecimalFormat decimalFormat = new DecimalFormat(patron);
        String codigo = "P" + decimalFormat.format(cont);
        
        sql = "insert into profesor(IdProfesor,ApeProfesor,NomProfesor,"
                + "DirProfesor,TelProfesor,EmailProfesor,clave) "
                + "values(?,?,?,?,?,?,?)";
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, codigo);
        pstm.setString(2, bean.getApellido());
        pstm.setString(3, bean.getNombre());
        pstm.setString(4, bean.getDireccion());
        pstm.setString(5, bean.getTelefono());
        pstm.setString(6, bean.getEmail());
        pstm.setString(7, bean.getClave());
        pstm.executeUpdate();
        pstm.close();
        
        bean.setId(codigo);
        cn.commit();
        
      } catch (SQLException e) {
        try {
          cn.rollback();
        } catch (Exception e1) {
        }
        throw new RuntimeException(e.getMessage());
      } catch (Exception e) {
        try {
          cn.rollback();
        } catch (Exception e1) {
        }
        throw new RuntimeException("Error en el proceso, intentelo de nuevo.");
      } finally{
        try {
          cn.close();
        } catch (Exception e) {
        }
      }
      return bean;
    }

}
