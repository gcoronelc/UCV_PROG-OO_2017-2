/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import app.database.AccessDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class DocenteService {
    public List<Map<String, Object>> Docentes(String codigo) {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from V_Profesor where codigo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            list = app.util.Lista.rsTolist(rs);
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
        return list;
    }

    public List<Map<String, Object>> Docentes() {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from V_Profesor";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            list = app.util.Lista.rsTolist(rs);
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
        return list;
    }
}
