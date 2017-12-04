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
import app.database.AccessDB;
import app.model.Ciclo;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class CicloService {

    public Ciclo generarCiclo(Ciclo bean) {

        String nuevoCiclo = "";

        Connection cn = null;
        try {
            nuevoCiclo = crearCodigoNuevoCiclo(leerUltimoCiclo());
            cn = AccessDB.getConnecction();
            cn.setAutoCommit(false);
            String sql = "insert into v_ciclo values(?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nuevoCiclo);
            pstm.setDate(2, bean.getFechainicio());
            pstm.setDate(3, bean.getFechafinal());
            pstm.executeUpdate();
            pstm.close();
            bean.setCodigo(nuevoCiclo);
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

    public String leerUltimoCiclo() {
        String ciclo = "";
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select top 1 ciclo from v_ciclo "
                    + "order by 1 desc";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            ciclo = rs.getString("ciclo");
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
        return ciclo;
    }

    private String crearCodigoNuevoCiclo(String ultimoCiclo) {

        int anio = Integer.parseInt(ultimoCiclo.substring(0, 4));
        int mes = Integer.parseInt(ultimoCiclo.substring(5, 7));

        if (mes == 12) {
            anio++;
            mes = 1;
        } else {
            mes++;
        }

        String nuevoCiclo = anio + "-" + String.format("%02d", mes);

        return nuevoCiclo;

    }

    public List<Map<String, Object>> Ciclo() {
        List<Map<String, Object>> list;
        Connection cn = null;
        try {
            cn = AccessDB.getConnecction();
            String sql = "select all * from v_ciclo";
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
