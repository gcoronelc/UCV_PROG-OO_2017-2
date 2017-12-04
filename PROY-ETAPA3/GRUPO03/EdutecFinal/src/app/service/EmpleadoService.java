/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import app.model.Empleado;
import app.database.AccessDB;

/**
 *
 * @author CBrayan
 */
public class EmpleadoService {
    public Empleado validar(String codigo, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccessDB.getConnecction();
      String sql = "select idempleado,apeempleado,nomempleado,"
              + "cargo,dirempleado,telempleado,emailempleado "
              + "from empleado where idempleado=? "
              + "and clave = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw new SQLException("Datos incorrectos.");
      }
      bean = new Empleado();
      bean.setCodigo(codigo);
      bean.setClave("NO SE");
      bean.setApellido(rs.getString("apeempleado"));
      bean.setNombre(rs.getString("nomempleado"));
      bean.setCargo(rs.getString("cargo"));
      bean.setDireccion(rs.getString("dirempleado"));
      bean.setTelefono(rs.getString("telempleado"));
      bean.setEmail(rs.getString("emailempleado"));
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
    return bean;
  }
}
