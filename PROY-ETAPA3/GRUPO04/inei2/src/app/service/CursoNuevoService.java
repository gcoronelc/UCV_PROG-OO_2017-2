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
import java.util.ArrayList;
import java.util.List;
import app.model.Curso;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class CursoNuevoService {

    public List<String> leerTarifa() {
        List<String> list = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select codigo from V_Tarifa";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("codigo"));
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

    public Curso registrarAlumno(Curso bean) {
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            cn.setAutoCommit(false);

            String sql = "update parametro set contador = contador + 1 "
                    + "where Campo = 'IdCurso'";
            PreparedStatement pstm = cn.prepareStatement(sql);
            int filas = pstm.executeUpdate();
            pstm.close();
            if (filas != 1) {
                throw new SQLException("Error en la tabla de parametros.");
            }

            sql = "select contador from parametro where Campo = 'IdCurso'";
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (!rs.next()) {
                throw new SQLException("Error en la tabla de parametros.");
            }
            int cont = rs.getInt("contador");
            rs.close();
            pstm.close();

            String codigo = crearNuevoCodigoCurso();

            sql = "insert into V_Curso values(?,?,?)";

            pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            pstm.setString(2, bean.getTarifa());
            pstm.setString(3, bean.getNombre());

            pstm.executeUpdate();
            pstm.close();

            bean.setCodigo(codigo);
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
        return bean;
    }

    private String crearNuevoCodigoCurso() {
        int codigo = Integer.parseInt(ultimoCodigoCurso().substring(1, 4));
        int proceso;
        String codigoCurso;
        if (codigo < 100) {
            proceso = codigo + 1;
            codigoCurso = "C0" + String.valueOf(proceso);
        } else {
            proceso = codigo + 1;
            codigoCurso = "C" + String.valueOf(proceso);
        }

        return codigoCurso;

    }

    public String ultimoCodigoCurso() {
        String codigo = "";
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select top 1 codigo from v_curso "
                    + "order by 1 desc";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            codigo = rs.getString("codigo");
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
        return codigo;
    }

    public List<Map<String, Object>> cursos() {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from V_Curso";
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
