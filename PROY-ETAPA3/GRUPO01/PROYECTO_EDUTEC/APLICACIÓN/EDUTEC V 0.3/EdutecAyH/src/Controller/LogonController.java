package Controller;

import model.Empleado;
import service.AppService;
import util.Session;


public class LogonController {
  
  public void validar(String codigo, String clave) {
      AppService appService = new AppService();
      Empleado bean = appService.validar(codigo, clave);
      Session.put("usuario", bean);
  }
  
}
