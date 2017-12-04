/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import java.util.List;
import java.util.Map;
import app.database.AccessDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import app.model.Alumno;
import java.util.Random;

/**
 *
 * @author CBrayan
 */
public class ServiceAlumnos {

    public List<Map<String, Object>> Alumnos(String codigo) {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from v_alumno where codigo = ?";
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

    public List<Map<String, Object>> Alumnos() {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from v_alumno";
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

    public Alumno registrarAlumno(Alumno bean) {
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            cn.setAutoCommit(false);
            String sql = "update Parametro set Contador = Contador + 1 where Campo = 'idalumno'";
            PreparedStatement pstm = cn.prepareStatement(sql);
            int filas = pstm.executeUpdate();
            pstm.close();
            if (filas != 1) {
                throw new SQLException("Error en la tabla de parametros");
            }
            String codigo = crearNuevoCodigoAlumno();
            String clave = crearNuevaClaveAlumno();
            System.out.println(codigo);
            sql = "insert into v_alumnor values(?,?,?,?,?,?,?)";
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            pstm.setString(2, bean.getApellido());
            pstm.setString(3, bean.getNombre());
            pstm.setString(4, bean.getDireccion());
            pstm.setString(5, bean.getTelefono());
            pstm.setString(6, bean.getEmail());
            pstm.setString(7, clave);

            pstm.executeUpdate();
            pstm.close();

            bean.setCodigo(codigo);
            bean.setClave(clave);
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

    public String ultimoCodigoAlumno() {
        String codigo = "";
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select top 1 codigo from v_alumnor "
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

    private String crearNuevoCodigoAlumno() {
        int codigo = Integer.parseInt(ultimoCodigoAlumno().substring(1, 5));
        int proceso;
        String codigoCurso;
        if (codigo < 1000) {
            proceso = codigo + 1;
            codigoCurso = "A00" + String.valueOf(proceso);
        } else {
            proceso = codigo + 1;
            codigoCurso = "A" + String.valueOf(proceso);
        }
        return codigoCurso;

    }

    public String crearNuevaClaveAlumno() {
        Random dato = new Random();
        String clave = "";
        for (int x = 0; x < 5; x++) {
            clave += (dato.nextInt(8) + 1);
        }
        return clave;
    }

}
