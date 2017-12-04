package prueba;

import java.util.List;
import java.util.Map;
import service.CursoService;

//CONSULTA CICLO VIEW

public class Prueba3{

    public static void main(String[] args) {
        try {
            // Dato
            String ciclo = "2012-02";
            // Proceso
            CursoService service = new CursoService();
            List<Map<String, Object>> lista = service.conCursosProfesor(ciclo);
            // Reporte
            for (Map<String, Object> r : lista) {
                String fila = "";
                fila += r.get("periodo") + " - ";
                fila += r.get("ciclo") + " - ";
                fila += r.get("cursoprog") + " - ";
                fila += r.get("curso") + " - ";
                fila += r.get("nomcurso") + " - ";
                fila += r.get("horario") + " - ";
                fila += r.get("tarifa") + " - ";
                fila += r.get("nomtarifa") + " - ";
                fila += r.get("precio") + " - ";
                fila += r.get("pagohora") + " - ";
                fila += r.get("horas") + " - ";
                fila += r.get("vacantes") + " - ";
                fila += r.get("matriculados") + " - ";
                fila += r.get("ingresos") + " - ";
                fila += r.get("pagoprofesor") + " - ";
                fila += r.get("profesor") + " - ";
                fila += r.get("nomprofesor") + " - ";
                fila += r.get("activo") + " - ";
                System.out.println(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

}
