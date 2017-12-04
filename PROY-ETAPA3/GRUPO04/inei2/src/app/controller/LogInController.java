package app.controller;

import app.model.Empleado;
import app.service.ServiceEmpleado;
import app.util.Session;


public class LogInController {
  
  public void validar(String codigo, String clave) {
    ServiceEmpleado service = new ServiceEmpleado();
    Empleado bean = service.validar(codigo, clave);
    Session.put("usuario", bean);
  }
  
}
