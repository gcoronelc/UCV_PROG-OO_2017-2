package prueba;

import java.util.List;
import java.util.Map;
import service.AlumnoService;

public class Prueba13 {

    public static void main(String[] args) {
        try {
            // Dato
            String codigo = "A0005";
            // Proceso
            AlumnoService service = new AlumnoService();
            List<Map<String, Object>> lista = service.mostrarDatosAlumno(codigo);
            // Reporte
            for (Map<String, Object> r : lista) {
                String fila = "";
                fila += r.get("idalumno") + " - ";
                fila += r.get("apealumno") + " - ";
                fila += r.get("nomalumno") + " - ";
                fila += r.get("diralumno") + " - ";
                fila += r.get("telalumno") + " - ";
                fila += r.get("emailalumno");
                System.out.println(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

}
