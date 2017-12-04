package util;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public final class EGCCUtil {

  private EGCCUtil() {
  }

  public static java.sql.Date utilDateToSqlDate(java.util.Date utilDate) {
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    return sqlDate;
  }

}
