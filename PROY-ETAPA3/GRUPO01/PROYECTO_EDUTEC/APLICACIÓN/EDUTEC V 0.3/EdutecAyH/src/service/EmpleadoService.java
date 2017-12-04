package service;

import db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import model.Empleado;

public class EmpleadoService {

    public Empleado registrarEmpleado(Empleado bean) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);

            String sql = "insert into Empleado(IdEmpleado,Clave,ApeEmpleado,NomEmpleado,Cargo,"
                    + "DirEmpleado,TelEmpleado,EmailEmpleado) "
                    + "values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, bean.getCodigo());
            pstm.setString(2, bean.getClave());
            pstm.setString(3, bean.getApellido());
            pstm.setString(4, bean.getNombre());
            pstm.setString(5, bean.getCargo());
            pstm.setString(6, bean.getDireccion());
            pstm.setString(7, bean.getTelefono());
            pstm.setString(8, bean.getEmail());
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
