package app.controller;

import app.model.Empleado;
import app.service.EmpleadoService;
import app.util.Session;


public class AccesoController {
  
  public void validar(String codigo, String clave) {
    EmpleadoService service = new EmpleadoService();
    Empleado bean = service.validar(codigo, clave);
    Session.put("usuario", bean);
  }
  
}
