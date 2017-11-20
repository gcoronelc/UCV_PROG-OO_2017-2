Connection cn = null;
try {
cn = AccesoDB.getConnection();
cn.setAutoCommit(false);

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