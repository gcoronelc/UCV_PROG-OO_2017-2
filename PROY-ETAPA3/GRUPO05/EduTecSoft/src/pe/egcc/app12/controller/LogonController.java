package pe.egcc.app12.controller;

import pe.egcc.app12.model.Empleado;
import pe.egcc.app12.service.AppService;
import pe.egcc.app12.util.Session;

public class LogonController {
  
  public void validar(String codigo, String clave) {
    AppService appService = new AppService();
    Empleado bean = appService.validar(codigo, clave);
    Session.put("usuario", bean);
  }
  
}
