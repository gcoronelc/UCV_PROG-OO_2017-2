package pe.egcc.app12.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class EGCCUtil {

  private EGCCUtil() {
  }

  public static java.sql.Date utilDateToSqlDate(java.util.Date utilDate) {
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    return sqlDate;
  }
  
 public static List<Map<String, Object>> rsToList(ResultSet rs) throws SQLException {
    ResultSetMetaData md = rs.getMetaData();
    int columns = md.getColumnCount();
    List<Map<String, Object>> results = new ArrayList<>();
    while (rs.next()) {
      Map<String, Object> row = new HashMap<String, Object>();
      for (int i = 1; i <= columns; i++) {
        row.put(md.getColumnLabel(i).toLowerCase(), rs.getObject(i));
      }
      results.add(row);
    }
    return results;
  }
}
