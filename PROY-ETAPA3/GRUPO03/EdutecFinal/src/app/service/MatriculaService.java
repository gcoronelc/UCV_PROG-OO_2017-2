/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import app.database.AccessDB;
import app.model.Matricula;
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
public class MatriculaService {

    public void registrarMatricula(Matricula bean) {
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            cn.setAutoCommit(false);
            PreparedStatement pstm;
            String sql = "insert into V_Matricula (codigoprofesor,codigoalumno,subsanacion) values (?,?,?)";
            pstm = cn.prepareStatement(sql);
            pstm.setInt(1, bean.getCodigoprofesor());
            pstm.setString(2, bean.getCodigoalumno());
            pstm.setDouble(3, bean.getSubsanacion());
            pstm.executeUpdate();
            pstm.close();
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
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        System.out.println("askdjfkalsdjf");

    }

    public List<Map<String, Object>> verMatricula(String codigo) {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from v_MostarMatricula where codigoalumno= ?";
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

    public List<Map<String, Object>> mostrarMatriculas() {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from v_MostarMatricula";
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
