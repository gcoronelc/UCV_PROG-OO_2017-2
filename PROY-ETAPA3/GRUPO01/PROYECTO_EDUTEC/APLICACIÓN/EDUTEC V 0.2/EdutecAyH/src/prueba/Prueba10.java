
package prueba;

import model.Empleado;
import service.EmpleadoService;

public class Prueba10 {
    public static void main(String[] args) {
    try {
          // Dato
          Empleado empleado= new Empleado();
          empleado.setCodigo("Demooo");
          empleado.setClave("Demo");
          empleado.setApellido("Demo");
          empleado.setNombre("Demo");
          empleado.setCargo("Demo");
          empleado.setDireccion("demo");
          empleado.setTelefono("demo");
          empleado.setEmail("demo");
          // Proceso
          EmpleadoService empleadoService=new EmpleadoService();
          Empleado bean =empleadoService.registrarEmpleado(empleado);
          
          // Reporte
          System.out.println("Registro De Empleado Correctamente");
          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
