package Controller;

import java.util.List;
import java.util.Map;
import service.CursoService;

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
