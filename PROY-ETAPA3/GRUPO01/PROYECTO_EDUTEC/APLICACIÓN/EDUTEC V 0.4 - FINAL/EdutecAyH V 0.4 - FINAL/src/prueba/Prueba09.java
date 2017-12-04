
package prueba;

import java.util.List;
import java.util.Map;
import service.ProfesorService;

public class Prueba09 {
    public static void main(String[] args) {
    try {
            // Dato
            String codigo = "P006";
            // Proceso
            ProfesorService service = new ProfesorService();
            List<Map<String, Object>> lista = service.mostrarDatosProfesor(codigo);
            // Reporte
            for (Map<String, Object> r : lista) {
                String fila = "";
                fila += r.get("idprofesor") + " - ";
                fila += r.get("apeprofesor") + " - ";
                fila += r.get("nomprofesor") + " - ";
                fila += r.get("dirprofesor") + " - ";
                fila += r.get("telprofesor") + " - ";
                fila += r.get("emailprofesor") + " - ";
                System.out.println(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }

}
