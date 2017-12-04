/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Tarifa;

/**
 *
 * @author Izabo Rosario
 */
public class TarifaServive {

    public Tarifa registrarTarifa(Tarifa bean) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            String sql = "insert into tarifa(IdTarifa,PrecioVenta,Descripcion,"
                    + "Horas,PagoHora) "
                    + "values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, bean.getId());
            pstm.setDouble(2, bean.getPrecioVenta());
            pstm.setString(3, bean.getDescripcion());
            pstm.setInt(4, bean.getHoras());
            pstm.setDouble(5, bean.getPagoHora());
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
        return bean;
    }
}
