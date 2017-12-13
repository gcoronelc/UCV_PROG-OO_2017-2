
package pe.egcc.app12.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.app12.service.CursoService;

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
