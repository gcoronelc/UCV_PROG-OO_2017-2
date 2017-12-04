/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import java.util.Map;
import service.CursoService;

/**
 *
 * @author Izabo Rosario
 */
public class CursoController {
    private CursoService cursoService;

  public CursoController() {
    cursoService = new CursoService();
  }

  public List<String> leerPeriodos() {
    return cursoService.leerPeriodos();
  }

  public List<String> leerCiclos(String periodo) {
    return cursoService.leerCiclos(periodo);
  }

  public List<Map<String, Object>> leerResumenCurso(String ciclo) {
    return cursoService.leerResumenCurso(ciclo);
  }
}
