package prueba;

import java.util.List;
import java.util.Map;
import service.CursoService;

//CONSULTA POR TARIFA

public class Prueba02 {

    public static void main(String[] args) {
        try {
            // Dato
            String tarifa = "C";
            // Proceso
            CursoService service = new CursoService();
            List<Map<String, Object>> lista = service.conCursosPorTarifa(tarifa);
            // Reporte
            for (Map<String, Object> r : lista) {
                String fila = "";
                fila += r.get("idcurso") + " - ";
                fila += r.get("idtarifa") + " - ";
                fila += r.get("nomtarifa") + " - ";
                fila += r.get("nomcurso") + " - ";
                fila += r.get("precioventa") + " - ";
                fila += r.get("horas") + " - ";
                fila += r.get("pagohora") + " - ";
                System.out.println(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

}
