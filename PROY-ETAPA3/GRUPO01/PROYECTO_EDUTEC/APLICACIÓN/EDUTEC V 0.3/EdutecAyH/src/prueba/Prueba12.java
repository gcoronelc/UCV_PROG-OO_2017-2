package prueba;

import service.AlumnoService;

public class Prueba12 {

    public static void main(String[] args) {
        try {
            // Proceso
            AlumnoService service = new AlumnoService();

            // Reporte
            System.out.println(" " + service.leerCodigoAlumno());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
