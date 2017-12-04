/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.Universitario;
import app.service.AlumnoService;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CBrayan
 */
public class AlumnoController {

    public List<Map<String, Object>> Alumnos(String codigo) {
        AlumnoService service = new AlumnoService();
        return service.Estudiantes(codigo);
    }

    public List<Map<String, Object>> Alumnos() {
        AlumnoService service = new AlumnoService();
        return service.Estudiantes();
    }
    public Universitario registarAlumno(Universitario bean){
        AlumnoService service = new AlumnoService();
        return service.registrarEstudiantes(bean);
    }
    
}
