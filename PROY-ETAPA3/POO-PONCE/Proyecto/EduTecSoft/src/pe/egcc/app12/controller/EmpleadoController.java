/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app12.controller;

import pe.egcc.app12.model.Empleado;
import pe.egcc.app12.service.EmpleadoService;

public class EmpleadoController {
    
    private EmpleadoService empleadoService;

    public EmpleadoController() {
        empleadoService = new EmpleadoService();
    }

    public Empleado registrarEmpleado(Empleado bean) {
        return empleadoService.registrarEmpleado(bean);
    }
}
