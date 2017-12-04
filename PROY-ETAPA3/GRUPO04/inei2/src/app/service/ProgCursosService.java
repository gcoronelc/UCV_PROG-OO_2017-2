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
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import app.database.AccessDB;

/**
 *
 * @author CBrayan
 */
public class ProgCursosService {

    public List<String> leerCurso() {
        List<String> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select nombre  from v_curso";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("nombre"));
            }
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se puede ejecutarla consulta");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {

            }
        }
        return list;
    }

    public List<Map<String, Object>> cursosProgramados(String curso) {
        List<Map<String, Object>> lista;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from Cursos_Programados where curso = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, curso);
            ResultSet rs = pstm.executeQuery();
            lista = app.util.Lista.rsTolist(rs);
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

    public List<Map<String, Object>> cursosProgramadosCiclo(String ciclo) {
        List<Map<String, Object>> lista;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from Cursos_Programados where ciclo  like  ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ciclo);
            ResultSet rs = pstm.executeQuery();
            lista = app.util.Lista.rsTolist(rs);
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
