package Controller;

import model.Empleado;
import service.EmpleadoService;

public class EmpleadoController {

    private EmpleadoService empleadoService;

    public EmpleadoController() {
        empleadoService = new EmpleadoService();
    }

    public Empleado registrarEmpleado(Empleado bean) {
        return empleadoService.registrarEmpleado(bean);
    }

}
