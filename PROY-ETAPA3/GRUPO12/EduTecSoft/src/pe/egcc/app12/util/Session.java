package pe.egcc.app12.util;

import java.util.HashMap;
import java.util.Map;


public final class Session {

  private Session() {
  }
  
  private static Map<String,Object> datos;
  
  static {
    datos = new HashMap<>();
  }
  
  public static Object get(String key){
    return datos.get(key);
  }
  
  public static void put(String key, Object value){
    datos.put(key, value);
  }
  
}