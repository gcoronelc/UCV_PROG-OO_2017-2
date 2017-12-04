package pe.egcc.app12.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import pe.egcc.app12.db.AccesoDB;
import pe.egcc.app12.model.Alumno;

public class AlumnoService {


    public Alumno registrarAlumno( Alumno bean ){
      Connection cn = null;
      try {
        cn = AccesoDB.getConnection();
        cn.setAutoCommit(false);
        
        String sql = "update parametro set contador = contador + 1 "
                + "where Campo = 'IdAlumno'";
        PreparedStatement pstm = cn.prepareStatement(sql);
        int filas = pstm.executeUpdate();
        pstm.close();
        if( filas != 1 ){
          throw new SQLException("Error en la tabla de parametros.");
        }
        
        sql = "select contador from parametro where Campo = 'IdAlumno'";
        pstm = cn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if(!rs.next()){
          throw new SQLException("Error en la tabla de parametros.");
        }
        int cont = rs.getInt("contador");
        rs.close();
        pstm.close();
        
        String patron = "0000";
        DecimalFormat decimalFormat = new DecimalFormat(patron);
        String codigo = "A" + decimalFormat.format(cont);
        
        sql = "insert into alumno(IdAlumno,ApeAlumno,NomAlumno,"
                + "DirAlumno,TelAlumno,EmailAlumno,Clave) "
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
        
        bean.setAlumno(codigo);
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

  public List<Map<String, Object>> ConsultarAlumno(String IdAlumno) {
        List<Map<String, Object>> lista;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select IdAlumno, ApeAlumno, NomAlumno, DirAlumno, TelAlumno, "
                    + " EmailAlumno, Clave "
                    + " from dbo.Alumno "
                    + " where IdAlumno = ? "
                    + " order by IdAlumno ";
            System.out.println("SQL: " + sql);
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, IdAlumno);
            ResultSet rs = pstm.executeQuery();
            lista = JdbcUtil.rsToList(rs);
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
